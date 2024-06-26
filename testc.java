class A {
	void m1(int i){
		System.out.println("m1() Parameter Value:" + i);
	}
}
public class testc {
	public static void main(String[] arge){
		A a = new A();
		byte b = 10;
		a.m1(b);
		short s = 20;
		a.m1(s);
		int i = 30;
		a.m1(i);
		char c = 'a';
		a.m1(c);
	}
}