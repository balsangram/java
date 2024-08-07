import java.util.Scanner;
class Strong{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 0;
		int v = n;
		while( n > 0 ){
			int num = n% 10;
			int fact = 1;
			for(int i = 1; i <= num; i++ ){
				fact = fact * i;
			}
			sum = sum+ fact;
			n /= 10;
		}
		if(sum == v){
			System.out.println(v + " is a strong no");
		} else{
			System.out.println(v + " not a strong no");
		}
		
    }
}
