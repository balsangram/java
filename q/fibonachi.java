import java.util.Scanner;

class fibonachi{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		for (int i = 1;i<= n; i++){
			System.out.println(num1);
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
    }
}
