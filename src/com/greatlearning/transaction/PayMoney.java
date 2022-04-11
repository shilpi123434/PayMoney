package com.greatlearning.transaction;

public class PayMoney {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void check(int[] arr, int target) {
		
		long sum=0;
		int i =0;
		while( i<arr.length) {
			sum=sum+arr[i];
			if(sum>=target) {
				System.out.println("Targets achieved after"+(i+1)+"transactions");
				break;
				
			}
			i++;
			if(i==arr.length&& target>sum) {
				System.out.println("Given target is not achieved");
			}
		}
		// TODO Auto-generated method stub
		
	}

	
}
