///*
//
// */
//import java.lang.String;
//public class StringEx {
//
//	public static void main(java.lang.String[] args) {
//		// TODO Auto-generated method stub
//		//1.Declare a string and reverse the characters of the string.
//
//		String name = "Ananya"; //string literal
//		
//		//String name = new String("Fremont"); //string object on heap
//		String reverse = "";
//		for(int i = (name.length()-1); i >= 0; i--)
//		{
//			reverse = reverse + name.charAt(i);
//		}
//		System.out.println(reverse);
//		
//		//2.Write a program to check whether a string is a palindrome or not. Example: LIRIL, Madam are palindromes (a word is called a palindrome if the value is same as original string when it is reversed)
//		String city = new String("wakaw"); //"Fremont"
//		String rev = "";
//		for(int i = (city.length()-1); i >= 0; i--)
//		{
//			rev = rev + city.charAt(i);
//		}
//		
//		if(rev.equals(city))
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not palindrome");
//		
//		//3.Write a method (and a program) to remove a particular character. For example, your method call should look like removeCharacter(String str, Char removeChar)
//		String s = StringEx.removeChar("amith", 'i');
//		System.out.println(s);
//	}
//	static String removeChar(String str, char removeChar)
//	{
//		String newString = new String("");
//		for(int i=0; i <= (str.length()-1); i++)
//		{
//			if(str.charAt(i) != removeChar)
//				newString = newString + str.charAt(i);
//		}
//		return newString;
//	}
//}
