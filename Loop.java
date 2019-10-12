//import java.util.Scanner;
//
//public class Loop {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//1.Write a program to print integers from 1 to 10.
//		for(int i=1; i <= 10; i++)
//		{
//			System.out.print(i+" ");
//		}
//		//2.Write a program to determine whether it is a even or odd number.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to test even or odd:");
//		int number = sc.nextInt();
//		
//		if(number%2 == 0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
//		
//		//3.Write a program to print Multiplication Table of a given number.
//		System.out.println("Enter a number to get multiplication table:");
//		int mult = sc.nextInt();
//		for(int i = 1; i <=10; i++)
//		{
//			System.out.print(i*mult+" ");
//		}
//		
//		//4.Nested For Loop: Print a Pyramid of a number.
//		
//		//5.Find a number in a collection of number (run a loop from 1 to x integers) using for loop, if condition to check the matching number, and use boolean variable like found to print a message where the number is found or not.
//		System.out.println("Enter a number to to search:");
//		int search = sc.nextInt();
//		boolean flag = false;
//		for(int i = 0; i < 100; i++)
//		{
//			if(search == i)
//			{
//				flag = true;
//				break;
//			}
//		}
//		if(flag == true)
//			System.out.println("Found");
//		else
//			System.out.println("Not Found");
//	}
//
//}
