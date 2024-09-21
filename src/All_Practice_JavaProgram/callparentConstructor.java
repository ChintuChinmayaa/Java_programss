package All_Practice_JavaProgram;

import java.util.LinkedHashSet;

public class callparentConstructor {
	public static void main(String[] args) {
		String s="Testyantra";
		String s1=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		for(char ch1:set)
		{
			int count=0;
			
		
		for(int j=0;j<s1.length();j++)
		{
			if(ch1==s1.charAt(j))
			{
				count++;
			}
			
		}
		System.out.println("the occurance of each charater is "+s1+ "-->" +ch1+"-->"+count);
	}
	}
}
