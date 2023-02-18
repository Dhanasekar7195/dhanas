package forArray;

public class StringArray {
	public static void main(String[] args) {
		String[] name = {"ajithkumar","gowtham","arun","gowri","dhanasekar","karthi"};
		int a = 0;
		int b = 0;
		for(int i=0;i<name.length;i++) {
			if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")) {
				a++;
			}
			if(name[i].contains("o")||name[i].contains("u")||name[i].contains("s")) {
				b++;
			}
		}
		
			System.out.println(a+","+b);
			
		}
		
		
	}


