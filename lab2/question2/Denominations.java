package com.lab2.question2;

import java.util.Scanner;

public class Denominations {
	private int arr[];
	private int n=0;
	Scanner sc= new Scanner(System.in);
			
	public void userInput() {
		System.out.println("Enter the size of currency denominations .");
		n = sc.nextInt();
		arr = new  int[n];
		System.out.println("Enter the currency denominations value.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
	    int amount= sc.nextInt();
	    bubsort();
	    paymentApproach(amount);
}
	public void bubsort() {
			for (int i=arr.length;i>0;i--) {
				for(int j=0,k=j+1;k<arr.length;j++,k++) {
					if (arr[k]>arr[j]) {
						int temp=arr[k];
						arr[k]=arr[j];
						arr[j]=temp;
					}
				}	
				
			}
		
		if (arr.length<=0) {
			System.out.println("No elements are present.");
		}
		
	}
	public void paymentApproach(int amount) {
		int counter[]=new int[n];
		for (int i=0;i<n;i++) {
			if(amount>=arr[i]) {
				counter[i]=amount/arr[i];
				amount=amount-counter[i]*arr[i];
			}
		}
		if(amount>0) {
			System.out.println("Exact Amount can't be given with the highest denomination.");
		}
		else {
			System.out.println("Your Payment Approach is :");
			for (int i =0;i<n;i++){
				if(counter[i]!=0) {
					System.out.println(arr[i]+" : "+counter[i]);
				}
			}
		}
	}
}
	