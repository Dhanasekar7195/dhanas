package forArray;

public class Sample5 {
	public static void main(String[] args) {
		String a = "dhanasekar*subramanian";
		char[] b = a.toCharArray();
		
		for(int i=0;i<b.length;i++) {
			if(b[i]>='a'&&b[i]<='z') {
		System.out.print(b[i]);
			}
		}
	}
}



		
	


