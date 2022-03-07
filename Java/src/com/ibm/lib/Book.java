package com.ibm.lib;
/**
 * This class represents bookbank
 * @author Myself Arup Bhattacharjee
 * @version 1.0
 */
public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	/* this is to return the status of the program*/
	public void status() {
		if(mbr==null)
		System.out.println(title+" is not issued to any member");
		else
			System.out.println(title+" is issued to "+mbr.getName());
	}
	public void issueBook(Member m) throws BookException {
		if(mbr!=null)
		System.out.println(title+" is issued to "+mbr.getName());	
		else if(m.getBook()!=null)
			throw new BookException(m.getName()+" had already issued a book");
			//System.out.println(m.getName()+ " had already issued a book");
		else {
			mbr=m;
			m.setBook(this);
			System.out.println("book issued.");}
		}
	public void returnBook(Member m) throws BookException {
		if(mbr==null)
			throw new BookException(title+"is not issued");
			//System.out.println(title+" is not issued");
		else if(m.getBook()==null)
			throw new BookException(m.getName()+"had never issued a book");
			//System.out.println(m.getName()+ " had never issued a book");
		else if(!m.getBook().getTitle().equals(title))
			throw new BookException(m.getName()+"has not issued"+title);
			//System.out.println(m.getName()+" has not issued "+ title);
		else if(!m.getName().equals(mbr.getName()))
			throw new BookException(title+"was not issed to "+m.getName());
			//System.out.println(title+ " was not issued to "+m.getName());
		else {
			m.setBook(null);
			mbr=null;
			System.out.println("Book returned.");
		}
	}
	}
	

