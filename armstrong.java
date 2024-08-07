class armstrong
{
	public static void main(String [] args)
	{
		int n = 154;
		int sum = 0;
		while(n> 0){
			int p = n% 10;
			int val = 1;
			//System.out.println(p + "p");
			for( int i = 1; i <= p; i++ ){
				val=val*i;
				//System.out.println(i+ ""+ val);
			}
			 sum = sum + val;
			n/=10;
		}
		System.out.println(sum);
	}
}