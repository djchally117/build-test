package com.chally.build.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.chally.build.Util;

public class TestUtil {

//	@Test
//	public void testString() {
//		assertNotNull(Util.getString());
//	}
//	
//	@Test
//	public void testCharacter() {
//		assertNotNull(Util.getCharacter());
//	}
//	
//	@Test
//	public void testByte() {
//		assertNotNull(Util.getByte());
//	}
	
	@Test
	public void testShort() {
		assertNotNull(Util.getShort());
	}
	
	@Test
	public void testInteger() {
		assertNotNull(Util.getInteger());
	}
	
	@Test
	public void testLong() {
		assertNotNull(Util.getLong());
	}
	
	@Test
	public void testFloat() {
		assertNotNull(Util.getFloat());
	}
	
	@Test
	public void testDouble() {
		assertNotNull(Util.getDouble());
	}
	
	@Test
	public void testBoolean() {
		assertNotNull(Util.getBoolean());
	}
	
	@Test
	public void testDate() {
		assertNotNull(Util.getDate());
	}
}
