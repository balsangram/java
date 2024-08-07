import java.util.Scanner;

class perfect{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 0;
		for(int i = 1; i < n ; i++){
			if(n % i == 0){
				sum += i;
			}
			
		}
		if( n == sum){
			System.out.println(n+ " is a perfect no ");
		} else{
			System.out.println(n+ " is not a perfect no ");
		}
		
		
    }
}
