package forArray;

public class Practice {
	public static void main(String[] args) {
		int[] nums = {75,37,94,45,38,39};
		int min = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i] <= min) {
				min = nums[i];
			}
		}
		System.out.println(min);
	}
}
