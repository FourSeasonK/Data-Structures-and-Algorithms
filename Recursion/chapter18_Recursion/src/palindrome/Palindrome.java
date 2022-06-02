package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Is moon a palindrome? "
		+ isPalindrome("moon"));
		System.out.println("Is noon a palindrome? "
		+ isPalindrome("noon"));
		System.out.println("Is a a palindrome? " + isPalindrome("a"));
		System.out.println("Is aba a palindrome? " +
		isPalindrome("aba"));
		System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
	}
	
	// It is not efficient because it creates a new string for every recursive call. => solution: RecursivePalindrome Class
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) // Base case: 문자가 하나일때 
			return true;
		else if (s.charAt(0) != s.charAt(s.length()-1)) // Base case: 첫 문자와 끝 문자가 다를 때
			 return false;
		else
			 return isPalindrome(s.substring(1, s.length()-1)); //string.substring(start, end)
	}
}
