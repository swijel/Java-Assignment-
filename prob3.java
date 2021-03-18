package com.example;

import java.util.*;
 
class prob3
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner (System.in);
      System.out.println("Enter the number of rows");
      int n= sc.nextInt();
      int A=64;
 	for(int i=1;i<=n;i++){
 	for(int j=1;j<=n-i;j++){
 	 
 	  	System.out.print(" ");
 	  	}
 	for(int k=1;k<=i;k++){
 	  
 	  	A=A+1;
 	  	System.out.print((char)(A));}
 	System.out.println();
 }
 
 }
}