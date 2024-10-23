package uebung1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	@Test
	public void test() {
		String[] palindromes = {
				"Rentner",
				"Lagerregal",
				"Anna",
				"Otto"
		};
		
		String[] nonPalindromes = {
				"Rentier",
				"Alter",
				"Sosse"
		};
		
		for(var palindrome: palindromes) {
			assertTrue(Palindrome.isPalindrome(palindrome));
		}
		
		for(var nonPalindrome: nonPalindromes) {
			assertFalse(Palindrome.isPalindrome(nonPalindrome));
		}
	}
}
