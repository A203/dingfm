package com.geminno;

public class Demo2 {
	public static void main(String[] args){
		int num=0;
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.print(i+"\n");
				continue;
			}
			num++;
		}
		System.out.print("num:"+num);
	}
}
