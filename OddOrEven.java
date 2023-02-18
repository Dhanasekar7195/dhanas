package forArray;

public class OddOrEven {
	public static void main(String[] args) {
		int [] nums = {-25,-36,39,88,115,-1};
		for(int i=0;i<nums.length;i++) {
		if(nums[i]%2==0) {
			System.out.println(nums[i] +" is even");
		}
		else {
			System.out.println(nums[i] +" is odd");
		}
	}
}
}
