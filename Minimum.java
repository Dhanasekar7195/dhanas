package forArray;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = {10,20,30,50,75,110,40,80} ;
		int min = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i] <= min) {
				min = nums[i];
			}
		}
		System.out.println(min);
		
	}

}
