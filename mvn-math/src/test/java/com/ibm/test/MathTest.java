package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class MathTest {
	private static Maths m;
	
	@BeforeAll
	public static void setup() {
		m=new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(15,m.add(10, 5));
	}
	
	@Test
	public void testSub() {
		assertEquals(5,m.sub(10, 5));
	}
	
	@Test
	public void testDiv() {
		assertEquals(4, m.div(8, 2));
	}
	
	@Test
	public void testDiv1() {
		assertThrows(ArithmeticException.class,()->m.div(2,0));
	}
	@Test
	public void square() {
		assertEquals(25,m.square(5));
	}
	@Test
	public void testIncorrectSquare() {
		assertNotEquals(10, m.square(3));
	}
}
