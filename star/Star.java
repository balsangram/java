class Star{
public static void main (String [] args){
	int n = 5;
	int sp = 4;
	int st = 1;
	for(int i= 1; i <= n; i++){
		for(int j = 1; j <= sp; j++){
			System.out.print("");
			sp--;
		}
		for(int j = 1; j <= st; j++){
			System.out.print("*");
			st++;
		}
		
		System.out.println();
	}
}
}