package uebung1;

public class Palindrome {
	public static boolean isPalindrome(String word) {
		return new StringBuilder(word.toLowerCase())
				.reverse()
				.toString()
				.equals(word.toLowerCase());
	}
}
