package com.geminno1;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] ags){
		Scanner input=new Scanner(System.in);
		System.out.println("«Î ‰»Î––∫≈:");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
