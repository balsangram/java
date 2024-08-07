class a{
	//int t = 9;
	//nums [] = {2,7,11,15};
}
class twosum{
	public static void main(String []args){
		int t = 9;
	    int []nums = {0,2,7,11,15};
		int L = nums.length;
		
		for(int i = 0; i< L;i++){
			for(int j = i+1; j < L ;j++){
			if(nums[i] + nums[j] == t){
				return {i,j};
			}
			}
		}

	}
}