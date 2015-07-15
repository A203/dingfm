package com.geminno1;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] ags){
		Scanner input=new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈:");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
				for(int j1=1;j1<=i*2-1;j1++){
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
