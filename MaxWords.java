package forArray;

public class MaxWords {
	public static void main(String[] args) {
		String [] words = {"dhanas","arun","ajith","gowtam","karthi","gowri"};
		//String max = words[0];
		//for(int i=0;i<words.length;i++) {
			//if(words[i].length()>=max.length()) {
				//max = words[i];
				
			//}
		//}
		//System.out.println(max);
		String min = words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<min.length()) {
				min = words[i];
			}
		}
		System.out.println(min);
		
	}

}
