import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = s.nextInt();
        System.out.print("Enter the value of b: ");
        int b = s.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
