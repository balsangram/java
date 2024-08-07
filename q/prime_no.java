import java.util.Scanner;

class prime_no{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 0;
		Boolean flag = true;
		if (n <2) flag = false;
		for(int i = 2; i < n ; i++){
			if(n % i == 0){
				flag = false;
			}
		}
		if( flag == true){
			System.out.println(n+ " is a prim no ");
		} else{
			System.out.println(n+ " is not a prime no ");
		}
		
		
    }
}
