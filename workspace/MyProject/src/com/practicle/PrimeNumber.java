package com.practicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num;
		
		System.out.println("Press 0 to exit ");

		do{
		System.out.print("Enter no. check whethere it is Prime or not: ");
		num = Integer.parseInt(br.readLine());
		int i=2;
		
		for(i=2; i<num;i++)
		{
			
			if(num%i==0){
				System.out.println("Number is not prime");
				break;
		}
				
			}
		if (i == (num) || num==1)
		{
			System.out.println("Number is prime");
		}
		if (num<0)
		{
			System.out.println("Enter positive Number");
		}
		
		
		}while(num!=0);
	}

}
