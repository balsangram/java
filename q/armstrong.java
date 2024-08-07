import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
		int sum = 0;
		int count=0;
		int num = n;
		int value = 1;
		int result = 0;
		int nt = n;
		while( n > 0 ){
			count++;
			n/=10;
		}
		while(num > 0){
			int nums = num % 10;
				for(int i = 1; i <= count ; i++){
					value = value* nums;
				}
			result += value;
			System.out.println(result);
			num = num / 10;
		}
		if(result == nt){
			System.out.println("value is armstrong");
		}else{
			System.out.println(result+ "value is not armstrong" + nt);
		}
		
    }
}
