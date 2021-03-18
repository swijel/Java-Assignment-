package com.example;

import java.util.*;
public class prob2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your budget : ");
		int b= sc.nextInt();
		int x=0;
		List<String>name=new ArrayList<String>();
		name.add("Product name");
		List<String>quantity=new ArrayList<String>();
		quantity.add("Quantity");
		List<Integer>pri=new ArrayList<Integer>();
		pri.add(0);
		
		do{
		System.out.println("1.Add an item");
		System.out.println("2.Exit");
		System.out.print("Enter your choice : ");
		
		int c= sc.nextInt();
		System.out.println();
		switch(c) {
			case 1: System.out.print("Enter product name : ");
					sc.nextLine();
					String prod=sc.nextLine();
					name.add(prod);
					
					System.out.print("Enter quantity : ");
					String quan=sc.nextLine();
					quantity.add(quan);
					
					System.out.print("Enter Price : ");
					int price= sc.nextInt();
					pri.add(price);
					
					System.out.println();
					b=b-price;
					if(b<0) {
						System.out.println("Can't buy the product ### (because budget left is "+b);
						System.out.println();
					}
					else {
						System.out.println("Amount left : "+b);
						System.out.println();
					}
				break;
			case 2: System.out.println("EXIT");
					for(int i=1; i<pri.size(); i++) {
						if(b==pri.get(i))
								System.out.println("Amount left can buy you " + name.get(i));
					}
					x=2;
				break;
			default: System.out.println("Enter a valid choice i.e. ");
		}
		}while(x!=2);
		
		System.out.println("GROCERY LIST is: ");
		for(int i=0; i<pri.size(); i++) {
			if(i==0)
			System.out.println("Product name   Quantity   Price");
			else {
				System.out.printf("%-15s%-11s%d \n",name.get(i),quantity.get(i),pri.get(i));
				
			}
		}
		
		sc.close();

	}

}