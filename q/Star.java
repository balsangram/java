class Star
{
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i =1; i <= n; i++){
			print_space(n-i);
			print_stars(2*i -1);
			System.out.println();
		}
	}
	static void print_space(int n){
		for(int i = 1; i <= n; i++){
			System.out.print(" ");
		}
	}
	static void print_stars(int n){
		for(int i =1 ; i <= n; i++){
			System.out.print("*");
		}
	}
}
