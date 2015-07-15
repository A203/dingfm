package com.geminno;

import java.util.Scanner;

public class Demo1 {


	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	int score=scanner.nextInt();
	if(score>=90)
	{
		System.out.print("等级为A");
		
	}
	else
		System.out.print("等级不是A");
		
	}
}
