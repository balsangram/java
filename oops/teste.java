class A{
	int m1(){
		byte b = 5;
		return b;
	}
}
public class teste {
	public static void main(String[] args){
		A a = new A();
		int val = a.m1();
		System.out.println(val);
	}
}