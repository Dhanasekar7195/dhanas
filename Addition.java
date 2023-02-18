package forArray;

public class Addition {
	public static void main(String[] args) {
		int[] nums = {10,45,92,47,97,25,36};
		int a = 0;
		int b = 0;
		for(int i=0;i<nums.length;i++) {
			a=a+nums[i];
		}
		System.out.println(a);
//		for(int i=0;i<nums.length;i++) {
//			a = a+nums[i];
//			b = b+1;
//			}
		//System.out.println(a/b);
		
	}

}
