package org.korecky.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneAwayStringsTest {

	@Test
	void isOneAway() {
		assertTrue(OneAwayStrings.isOneAway("abcde", "abcd"));  // should return true
		assertTrue(OneAwayStrings.isOneAway("abde", "abcde"));  // should return true
		assertTrue(OneAwayStrings.isOneAway("a", "a"));  // should return true
		assertTrue(OneAwayStrings.isOneAway("abcdef", "abqdef"));  // should return true
		assertTrue(OneAwayStrings.isOneAway("abcdef", "abccef"));  // should return true
		assertTrue(OneAwayStrings.isOneAway("abcdef", "abcde"));  // should return true
		assertFalse(OneAwayStrings.isOneAway("aaa", "abc"));  // should return false
		assertFalse(OneAwayStrings.isOneAway("abcde", "abc"));  // should return false
		assertFalse(OneAwayStrings.isOneAway("abc", "abcde"));  // should return false
		assertFalse(OneAwayStrings.isOneAway("abc", "bcc"));  // should return false
	}
}