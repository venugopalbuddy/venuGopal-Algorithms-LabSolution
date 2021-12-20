package com.lab2.question1;

import java.util.Scanner;

public class PayMoneyTransaction {
	
	private int n=0,totaltargets=0;
	private int arr[];
	private boolean status=false;
	Scanner sc= new Scanner(System.in);
	
	public void userInput() {
		System.out.println("Welcome to Pay Money.");
		System.out.println("Enter the size of transaction array");
		n = sc.nextInt();
		arr = new  int[n];
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		totaltargets=sc.nextInt();
		for (int i=0;i<totaltargets;i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			targetlogic(target);
		}
		
	}
	public void targetlogic(int target) {
		int sum=0;
		for (int i=0;i<n;i++) {
			 sum=sum+arr[i];
			 if(sum>=target) {
				System.out.println("Target achieved after "+(i+1)+ " transactions.");
				status=true;
				break;
			}
			
		}
		if (status==false) {
			System.out.println("Given target is not achieved.");
		}
		
	}
	

}
