import java.util.Scanner;

class binary_to_decimal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();//10011
		int sum = 0;
		int val = 0;
		int power=1;
		while( n > 0 ){
			int num = n % 10;
			val = num * power;
			sum = sum + val;
			power = power*2;
			n /= 10;
		}
		System.out.println(sum);
    }
}
