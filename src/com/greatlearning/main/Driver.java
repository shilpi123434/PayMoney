package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.transaction.PayMoney;

public class Driver {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter size of transaction");
		int size= sc. nextInt();
		int[]arr= new int [size];
		System.out.println("Enter values of array");
		for(int i= 0; i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter total number of targets achieved");
		int n= sc.nextInt();
		PayMoney pm= new PayMoney();
		while(n>0) {
			System.out.println("Enter values of target");
			int target= sc.nextInt();
			pm.check( arr, target);
			n--;
			
		}
		sc.close();
		
	}

}
