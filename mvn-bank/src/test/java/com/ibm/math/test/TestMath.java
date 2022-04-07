package com.ibm.math.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMath {
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
public void testSubs() {
	assertEquals(10,m.subs(20, 10));
}
@Test
public void testDiv() {
	assertEquals(20,m.div(100, 5));
}
@Test
public void testZeroDiv() {
	assertThrows(ArithmeticException.class,()->m.div(2,0));
}
@Test
public void testSquare() {
	assertEquals(36,m.square(6));
}
@Test
public void testIncorrectSquare() {
	assertNotEquals(10, m.square(3));
}
}
