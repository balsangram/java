import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int rev =0;
		int count = 1;
		while( n > 0 ){
			int num = n % 10;
			rev = (rev * 10)+ num ;
			n= n/10;
			
		}
		System.out.print(rev);
		
    }
}
