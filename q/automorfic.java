import java.util.Scanner;

class automorfic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int v = n;
		int square = n * n;
		int sum = 0;
		int count = 0;
		int values = 0;
		int multi = 1;
		while(n > 0) {
			n/=10;
			count ++;
		}
		System.out.println(count);
		for(int i = 1; i <= count; i++){
			int num = square % 10;
			sum = sum + (num * multi);
			multi *=10;
			square /=10;
		}
		if( v == sum){
			System.out.println(v+ " is a automorfic no " );
		} else{
			System.out.println(v+ " is not a automorfic no "+ sum);
		}
		
		
    }
}
