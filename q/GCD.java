import java.util.Scanner;

class GCD{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = s.nextInt();
		 System.out.print("Enter the value of b: ");
        int b = s.nextInt();
		int n = a < b ? a:b;

		while( true){
			if(a % n == 0 && b % n == 0)break;
			n--;
		}
		System.out.println(n);
    }
}
