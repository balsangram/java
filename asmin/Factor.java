class Factor{
	
	void factor(int n){

		for (int i =1; i<= n; i++){
			if(n % i == 0){
				System.out.print(i+"\t");
			}
		}
		
	}
	
	public static void main(String [] args){
		Factor p = new Factor();
		p.factor(6);
	}
	
}