import java.util.Scanner;

class decimal_to_binary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		String bin = "";
		while( n > 0 ){
			int num = n% 2;
			bin = num + bin;
			n /= 2;
		}
		System.out.println(bin);
    }
}
