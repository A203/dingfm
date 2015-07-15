package ¶àÌ¬;

public abstract class Fruit {
}
class Apple extends Fruit{
	public String toString(){
		return "Æ»¹û";
	}
}
	class Mango extends Fruit{
		public String toString(){
			return "Ã¢¹û";
		}
	}
	 class Juicer{
		public void juice(Fruit fruit){
			System.out.println("Õ¥"+fruit+"Ö­");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Juicer j=new Juicer();
Fruit fruit= new Mango();     //new Apple();
j.juice(fruit);
	}
	}

