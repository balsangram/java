//import java.util.*;
class loop 
{
	public static void main(String[] args){
		int n = 5;
		int v = 1;
		for(int i = 1; i <= n; i++ ){
			
			if(i % 2 != 0){
				for(int j = 1; j <= i; j++){
				System.out.print(v+ " ");
				v++;
			}
			}
			
			else{
				//int j = 1;
				//int x = i + v -j;
				for(int j = 1; j <= i; j++){
				System.out.print(v+ " ");
				v++;
				
			}
			}
			System.out.println();
		}
	}
}