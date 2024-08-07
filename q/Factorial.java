import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 1;
		while( n > 0 ){
			sum = sum * n ;
			n--;
		}
		System.out.println(sum);
    }
}
