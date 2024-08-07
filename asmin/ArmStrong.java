class ArmStrong{
	
	void count(int n){
	int count= 0;
		while (n > 0){
			count++;
			n /= 10;
		}
		//return count;
	}
	void fact(int n ,int count ){
			int x = n;
		int sum = 0;
		while(x > 0){
			int vnum = 1;
			int num = x % 10;

			
			sum = sum + vnum;
			x /= 10;
		}
		System.out.println(sum);
	}
	void power (int count, int num){
		for(int i = 1; i <= count ;i++){
				vnum= vnum * num;
			}
			//return vnum;
	}
	
	public static void main(String [] args){
		int n = 153;
		//int v = n;
		ArmStrong a = new ArmStrong();
		a.count(n);
		a.fact(n);
		
	
	}
	
}