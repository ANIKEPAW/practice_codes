package com.lab2;

public class REverseArray {
	
		static void reverse(int a[], int n) {
			int i,j,k;
			for(i=0;i<n/2;i++) {
				k=a[i];
				a[i]=a[n-i-1];
				a[n-i-1]=k;
				
			}
			System.out.println("Reversed array is:\n");
			for(j=0;j<n;j++) {
				System.out.println(a[j]);
				
			}
		}
		public static void main(String[] args) {
			int[] arr= {10,20,30,40,50};
			reverse(arr,arr.length);
		}

	}



