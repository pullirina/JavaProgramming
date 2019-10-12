//import java.util.Scanner;
//
///*
// Operators:
// In a school, marks are graded in this way. 
// In a school, there are three subjects for which exams were conducted. 
// Subjects are Maths, English and Spanish. When a student gets more than 50 marks in both Maths, and 
// more than 50 in either of languages, then the students gets Grade A. 
// When a student gets more than 40 and less or equal to 50 in Maths, then the student gets Grade B. 
// Write a program to handle this logic.
// */
//
//public class Operators {
//	public static void main(String[] args) {
//		char grade='_';
//		System.out.println("Enter marks of students:");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Maths:");
//		int maths = sc.nextInt();
//		
//		System.out.println("English:");
//		int english = sc.nextInt();
//		
//		System.out.println("Spanish:");
//		int spanish = sc.nextInt();
//		
//		if(maths > 50)
//		{
//			if(spanish > 50 || english > 50)
//			{
//				grade = 'A';
//			}
//		}
//		else if(maths > 40 || maths <= 50)
//		{
//			grade = 'B';
//		}
//		else
//		{
//			grade = 'C';
//		}
//		System.out.println(grade);
//	}
//}
