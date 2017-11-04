package com.test;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");

		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		int currentMAx = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (currentMAx<arr[i]) {
				currentMAx = arr[i];
				
			}
		}
		System.out.println("max: "+currentMAx);
	//	return currentMAx;

	}

}
