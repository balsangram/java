import java.util.Scanner;

class add{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 0;
		while( n > 0 ){
			int num = n % 10;
			sum = sum + num ;
			n = n / 10;
		}
		System.out.println(sum);
    }
}
