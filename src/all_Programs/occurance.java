package all_Programs;

public class occurance {
	public static void main(String[] args) {
		String str = "chinmayaaaaa";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==i) {
				int count=0;
			
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(j)== ch) {
					count++;
				}
			}
			System.out.println("the occurance of charcter is ==>" + ch + ":- " + count);

		}

	}
	}
}
