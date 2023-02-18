package forArray;

public class Sentences {
	public static void main(String[]args) {
		String sentence = "RamKumar_385@Gmail.Com";
		char[] letters = sentence.toCharArray();
		int uc = 0;
		int lc = 0;
		int nc = 0;
		int sc = 0;
		for(int i=0;i<letters.length;i++) {
			if(letters[i]>='A'&&letters[i]<='Z') {
				uc++;
			}
			else if(letters[i]>='a'&&letters[i]<='z') {
				lc++;
			}
			else if(letters[i]>='0'&&letters[i]<='9') {
				nc++;
			}
			else {
				sc++;
			}
			}
		System.out.println(uc+","+lc+","+nc+","+sc);

	
		
	}

}
