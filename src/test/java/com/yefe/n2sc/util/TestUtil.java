package com.yefe.n2sc.util;

public class TestUtil {

	private static int count = (int) (System.currentTimeMillis() % 10000);

	public static String getString() {
		return "String_" + increaseCount();
	}

	private static int increaseCount() {
		count++;
		return count;
	}

	public static int getInteger() {
		return count;
	}

	public static int getRandom(int range) {
		return (int) (Math.random() * range) + 1;
	}

}
