package forArray;

public class Maximum {
	public static void main(String[] args) {
		int[] nums = {10,20,30,50,75,110,40,80} ;
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i] >= max) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
	}

}
