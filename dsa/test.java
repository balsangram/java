import java.util.Scanner;
class test{
	public static void main(String []args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n = s.nextInt();
		
		System.out.println("============================================================");
		//to verifay given no is automorfic or not
		int a_count =0;
		int sqr = n * n;
		int a_into = 1;
		int values = n;
		int res = n;
		while(n>0){
			int num = n % 10;
			a_count++;
			n= n/10;
		} 	
		System.out.println("a_count : " + a_count);
		
		System.out.println("sqr value is : " +sqr);
		int v_into = 0;
		while( values > 0){
			int all_values = values % 10;
			v_into =v_into + ( all_values * a_into);			
			values = values / 10;
			a_count--;
			a_into = a_into * 10;
		}
		System.out.println(v_into+ " GGG " + res);
		if(v_into == res){
			System.out.println(" value is automorfic");
		} 
		else{
			System.out.println(" value is not automorfic");
		}
		
		System.out.println("============================================================");
		
		//to verifay given no is perfect or not
		int prtfext = 0;
			for ( int i = 1 ; i < n; i++){
				//System.out.println(i);
				if ( n % i == 0){
					prtfext = prtfext + i;
				}
					//System.out.println(prtfext+ "p");
			}
		
		if( n == prtfext) {
			System.out.println("perfect");
		}
		else{
			System.out.println(" not a perfect");
		}
		
		System.out.println("============================================================");
		
		//to add all digit of a given num
		int all = 0;
		while (n > 0){
			int num = n % 10;
			all = all + num;
			n = n /10;
		}
		System.out.println ("sum of " + n + " no is : " + all);
		
		System.out.println("============================================================");
		//to display factorial for a given num
		int v = n;
		int factorial = 1;
		for(int i = 1; i <=v; i++){
			factorial = factorial * i;
		}
		System.out.println(n+ " factorial is : " +factorial);
		
		System.out.println("============================================================");
		//to add sum of 1 no to n natural no 
		System.out.print(" a : ");
		int a = s.nextInt();
		System.out.print(" b : ");
		int b = s.nextInt();
		int sum = 0;
		
		for (int i = a; i <= b ; i++){
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		System.out.println("============================================================");
		
		System.out.println("============================================================");
		
		//armstrong num
		
		//int sum = 0;
		int count = 0;
		int into = 0;
		while(n > 0){
			int num = n % 10;
			count++;
			n = n / 10;
		}
		System.out.println(count);
		while (n > 0){
			int num = n % 10;
		for(int i = 1; i <= count ; i++){
			into = num * num;
		}
		sum = sum + into;
		n = n/10;
		}
		
		System.out.println(sum);
	}
}