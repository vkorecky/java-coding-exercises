package org.korecky.interview.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NonRepeatingCharacterTest {

	@Test
	void nonRepeating() {
		assertEquals('c', NonRepeatingCharacter.nonRepeating("abcab")); // should return 'c'
		assertEquals(null, NonRepeatingCharacter.nonRepeating("abab")); // should return null
		assertEquals('c', NonRepeatingCharacter.nonRepeating("aabbbc")); // should return 'c'
		assertEquals('d', NonRepeatingCharacter.nonRepeating("aabbdbc")); // should return 'd'
	}
}