///*
//*/
//import java.lang.*;
//public class Array {
//	public static void main(String args[])
//	{
//		//1.Find maximum value in an array of integers.
//		int arr[] = {11,21,3,45,88,6,78,99,12,66};
//		int max = arr[0];
//		for(int i = 0; i <arr.length; i++)
//		{
//			if(arr[i] > max)
//			{
//				max = arr[i];
//			}
//		}
//		System.out.println("Max "+max);
//		
//		//2.Find minimum value in an array of integers.
//		int arr1[] = {11,21,3,45,88,6,78,99,12,66};
//		int min = arr[0];
//		for(int i = 0; i <arr.length; i++)
//		{
//			if(arr[i] < min)
//			{
//				min = arr[i];
//			}
//		}
//		System.out.println("Min "+min);
//		
//		//3.Find sum of values of an array of integers.
//		//4.Find average of values of an array of integers.
//		int arr2[] = {11,21,3,45,88,6,78,99,12,66};
//		int sum = 0;
//		for(int i = 0; i <arr.length; i++)
//		{
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum "+sum);
//		System.out.println("Avg "+(sum/arr.length));
//		
//		//5.Given an array of integers of size 10, find out whether number 6 is either at start or end position of the array. Print message "Number 6 is found at start/end of the array" if it is found at required location, otherwise print message "Sorry"
//		if(arr[0] == 6 || arr[9] == 6)
//		{
//			System.out.println("Number 6 is found at start/end of the array");
//		}
//		else
//		{
//			System.out.println("Sorry");
//		}
//		
//		//7.Take an array of size 6, assign values to the array. Reverse this array and reverse array should be a different one.
//		int forward[] = {11,21,3,44,5,56};
//		int reverse[] = new int[6];
//		int cnt = 6;
//
//		for(int i = 0; i < 6; i++)
//		{
//			reverse[i] = forward[--cnt];
//		}
//		
//		System.out.println("Forward:");
//		for(int i = 0; i < 6; i++)
//			System.out.print(forward[i]+" ");
//		
//		System.out.println("\nReverse:");
//		for(int i = 0; i < 6; i++)
//			System.out.print(reverse[i]+" ");
//
//		System.out.println();
//		//8.Take two arrays of integers, find out maximum number from both the arrays. Also find out minimum number among both the arrays.
//		int a[] = {1,23,4,5,66,67};
//		int b[] = {61,23,44,55,99,65};
//		int maximum = a[0];
//
//		for(int i = 0; i < 6; i++)
//		{
//			if(a[i] > maximum)
//				maximum = a[i];
//		}
//		for(int i = 0; i < 6; i++)
//		{
//			if(b[i] > maximum)
//				maximum = b[i];
//		}
//		System.out.println("Maximum "+maximum);
//		
//		//9.Take an array of strings, report if adjacent values of array are same.
//		int[] temp = {1,23,4,4,66,67};
//		for(int i = 0; i < 6; i++)
//		{
//			int prev = temp[i];
//			int next = temp[++i];
//			if(prev == next)
//				System.out.println("pair is same");
//			else
//				System.out.println("pair is not same");
//		}
//		
//		String[] iArray = {"1","22","1","2","3","33","4","5"};
//		//10.Take an array of integers of strings, print values from only even positions, means print values from position 2, 4, 6 etc
//		System.out.println("Values at even positions");
//		for(int i = 0; i < 8; i+=2)
//		{
//			System.out.print(iArray[i]+" ");
//		}
//	}
//}
