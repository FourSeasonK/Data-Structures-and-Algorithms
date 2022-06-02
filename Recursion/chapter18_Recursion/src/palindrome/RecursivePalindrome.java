package palindrome;

public class RecursivePalindrome {

	public static void main(String[] args) {
		System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
		System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
		System.out.println("Is a a palindrome? " + isPalindrome("a"));
		System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
		System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
	}
	
	//To avoid creating new strings, 
	//you can use the low and high indices to indicate the range of the substring.
	public static boolean isPalindrome(String s) { 
		//checks whether a string is a palindrome
		return isPalindrome(s, 0, s.length()-1);
		 }
		
	private static boolean isPalindrome(String s, int low, int high) { 
		//checks whether a substring s(low..high) is a palindrome
		if (high <= low) // Base case
			return true;
		else if (s.charAt(low) != s.charAt(high)) // Base case
			return false;
		else
			return isPalindrome(s, low + 1, high-1);
	}
}
