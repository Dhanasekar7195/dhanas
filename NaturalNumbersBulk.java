package forArray;

public class NaturalNumbersBulk {
	public static void main(String[] args) {
		int [] numbers = {10,20,65,37,20};
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}
		for(int i=0;i<numbers.length/2;i++) {
			//System.out.println(numbers[i]);
		}
		for(int i=numbers.length-1;i>numbers.length/2;i--) {
			//System.out.println(numbers[i]);
		}
		
	}

}
