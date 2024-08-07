class PerfectNo{
	
	void factor(int n){
		int sum = 0;
		int v= 2 * n;
		for (int i =1; i<= n; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		if(sum == v){
			System.out.println("perfectno");
		}else{
			System.out.println("not a perfectno");
		}
	}
	
	public static void main(String [] args){
		PerfectNo p = new PerfectNo();
		p.factor(61);
	}
	
}