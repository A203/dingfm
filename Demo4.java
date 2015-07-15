package com.geminnocn;

public class Demo4 {
	
	public static void main(String[] ags){
	
		for(int num=2;num<=50;num++){
			boolean flag=true;
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
		if(flag){
			System.out.print(num+"\t");
		}
	}
	}
}
