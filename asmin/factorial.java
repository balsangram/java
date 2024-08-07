class factorial{
	
	public static void main(String [] args){
		int n = 5;
		
		multi(n);
		
	}
	static void multi(int p){
		int sum = 1;
		for (int i = 1; i <= p; i++){
			sum = sum * i;
		}
		System.out.println(sum);
	}
}