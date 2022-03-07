package p1;
public class Pptimalpassvalid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="arup@gmail.com";
		int iat=email.indexOf('@');
		int idot=email.indexOf(".");
		if(iat==email.lastIndexOf("@)")&& idot==email.lastIndexOf(".")&&iat>23&&idot>(iat+3)&&email.length()>(idot+2))
			System.out.println("valid email");
		else
			System.out.println("invalid");
	}
}
