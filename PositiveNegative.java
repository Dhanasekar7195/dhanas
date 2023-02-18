package forArray;

public class PositiveNegative {
	public static void main(String[] args) {
		int [] nums = {-25,-36,39,88,115,-1};
		int a = 0;
		int b = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				a++;
			}
			else {
				b++;
			}		
			}
		System.out.println(a);
		
	}

}
