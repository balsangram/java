class A {
	public static int sum(int x, int y){
		return x + y ;
	}
	public static int sub(int x, int y){
		return x - y;
	}
	public static int multi(int x, int y){
		return x * y;
	}
	public static int div(int x, int y){
		return x / y;
	}
}
class test{
	public static void main(String[] arge){
		A a = new A();
		int val1 = a.sum(5,8);
		int val2 = a.sub(4,6);
		int val3 = a.multi(3,7);
		int val4 = a.div(8,2);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
	}
}