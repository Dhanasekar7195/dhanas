package forArray;

public class Average {
	public static void main(String[] args) {
		int[] values = {10,20,50,80,100,200,95};
		int total = 0;
		double count = 0;
		for(int i=0;i<values.length;i++) {
			total = total+values[i];
			count = count+1;
		}
		System.out.println(total/count);
		}
	}