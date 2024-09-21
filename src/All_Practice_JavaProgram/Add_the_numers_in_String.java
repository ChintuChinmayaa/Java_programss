package All_Practice_JavaProgram;

public class Add_the_numers_in_String {
public static void main(String[] args) {
	
	//input=cb24df2n24b6
	//output=2+4+2+2+4+6=20
	String str="cb24df2n24b6";
	int sum=0;
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9')
		{
			int n=ch-48;
			 sum=sum+n;
		}
	
	}
	System.out.println(sum);
	
	
}
}
