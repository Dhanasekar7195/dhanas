package forArray;

public class NaturalNumbers {
	public static void main(String[] args) {
		int numbers [] = new int[5];
		numbers [0] = 10;
		numbers [1] = 33;
		numbers [2] = 87;
		numbers [3] = 98;
		numbers [4] = 23;
		for(int i=0;i<numbers.length;i++) {
			//System.out.println(numbers[i]) ;
		}
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.println(numbers[i]);
		}
		
	}

}
