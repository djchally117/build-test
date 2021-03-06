package com.chally.build;

import java.util.Date;
import java.util.ResourceBundle;

/**
 * Just a simple utility class to do something.
 * 
 * @author dchally
 *
 */
public class Util {
	private Util() {
	}

	public static String getString() {
		return "Hello World";
	}

	public static Character getCharacter() {
		return 'I';
	}

	public static Byte getByte() {
		return 123;
	}

	public static Short getShort() {
		return 1234;
	}

	public static Integer getInteger() {
		return 123456;
	}

	public static Long getLong() {
		return 123456789L;
	}

	public static Float getFloat() {
		return 23.45f;
	}

	public static Double getDouble() {
		return 123.456;
	}

	public static Boolean getBoolean() {
		return true;
	}

	public static Date getDate() {
		return new Date();
	}

	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("test");
		String version = resource.getString("version");
		System.out.println(version);
	}
}
