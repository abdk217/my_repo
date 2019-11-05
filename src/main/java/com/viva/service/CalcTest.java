package com.viva.service;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalcTest {
	
	@Test
	public void addTest1(){
		assertEquals(3,App.add(1,2));
	}
	
	@Test
	public void subTest1(){
		assertEquals(-1,App.sub(1,2));
	}
	
	@Test
	public void mulTest1(){
		assertEquals(2,App.mul(1,2));
	}
	
	@Test
	public void divTest1(){
		assertEquals(0.5,App.div(1,2),0.02);
	}
	
	@Test
	public void addTest2(){
		assertEquals(3,App.add(1,2));
	}
	
	@Test
	public void subTest2(){
		assertEquals(-1,App.sub(1,2));
	}
	
	@Test
	public void mulTest2(){
		assertEquals(2,App.mul(1,2));
	}
	
	@Test
	public void divTest2(){
		assertEquals(0.5,App.div(1,2),0.02);
	}
	@Test
	public void addTest3(){
		assertEquals(3,App.add(1,2));
	}
	
	@Test
	public void subTest3(){
		assertEquals(-1,App.sub(1,2));
	}
	
	@Test
	public void mulTest3(){
		assertEquals(2,App.mul(1,2));
	}
	
	@Test
	public void divTest3(){
		assertEquals(0.5,App.div(1,2),0.02);
	}
	@Test
	public void addTest4(){
		assertEquals(3,App.add(1,2));
	}
	
	@Test
	public void subTest4(){
		assertEquals(-1,App.sub(1,2));
	}
	
	@Test
	public void mulTest4(){
		assertEquals(2,App.mul(1,2));
	}
	
	@Test
	public void divTest4(){
		assertEquals(0.5,App.div(1,2),0.02);
	}
	
	
}
