import java.util.Scanner;

public class RemoveToMakePalindrome {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//int q = in.nextInt();
		//System.out.println(q);
		while (in.hasNext()) {
			String s = in.next();
			 int result =palindromeIndex(s);
			 System.out.println(result);
		}
	
	}
	
	static int palindromeIndex(String s) {
		int palindromeIndex = -1;
		int length = s.length();
		for (int i=0; i<=length/2; i++) {
			if (s.charAt(i)!=s.charAt(length-1-i))
			{
				if(i+1<length) {
					boolean isRightPalindrome = isValidPalindrome(s.substring(i+1, length -1));
					if (isRightPalindrome) {
						return i;
					}
					return length-i-1;
				}
			}
		}
		return 0;
	}
	
	static boolean isValidPalindrome(String s1) {
		int len = s1.length();
		for(int i=0; i<len/2; i++) {
			if (s1.charAt(i)!=s1.charAt(len-1-i))
				return false;
		}
		return true;
	}

}
