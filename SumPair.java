package com.jspiders.arrays_dsa;

import java.util.Scanner;

public class SumPair 
{
	static void sumPair(int arr[])
	{
		int sum=6;
//		boolean b[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++)
		{
//			if(b[i]==false)
//			{
			     for(int j=i+1;j<arr.length;j++)
			    {
				   if(arr[i]+arr[j] == sum)
				   {
					    System.out.println(arr[i] + " "+arr[j]);
//					    b[j]=true;
				    }
//			}
		}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n = sc.nextInt();
		int[] arr = new int[n];
//		int max=0;
//		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		sumPair(arr);
		
	}
}