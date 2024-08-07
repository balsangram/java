class A implements Runnable{
	public void run(){
		for(int i = 0;i<=10;i++){
			System.out.println("ASMIN  : "+i);
		}
	}
}
class Main{
	public static void main (String [] args){
		A a = new A();
		
		Thread t = new Thread(a);
		
		t.start();
		t.setPriority(7);
		for(int j = 0;j<=10;j++){
			System.out.println("CHINMAY  : "+j);
		}
	}
}