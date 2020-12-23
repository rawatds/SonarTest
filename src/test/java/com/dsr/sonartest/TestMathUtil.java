package com.dsr.sonartest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMathUtil {

	MathUtil mathUtil;

	@Test
	public void testSum() {
		assertEquals(8, MathUtil.sum(2, 6));
	}

	@Test
	public void testDiff() {
		assertEquals(10, MathUtil.diff(25, 15));
	}

	@Test
	public void testMult() {
		assertEquals(10, MathUtil.mult(2, 5));
	}

	@Test
	public void testDiv() {
		assertEquals(1, MathUtil.div(25, 15));
	}

}
