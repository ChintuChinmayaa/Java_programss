package all_Programs;

public class AddCharecterAndSumAlltheNumber {
public static void main(String[] args) {
	String str="Ch24in43Ma54ya";
	int num=0;
	String result="";
	for(int i=0;i<str.length();i++)
	{
		char ch =str.charAt(i);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
result=result+ch;
			
		}
		else if(ch>='0' && ch<='9')
		{
			int n=ch-48;
			num=num+n;
		}
	}
	System.out.println("the addtion of the charcter is "+result.toLowerCase());
	System.out.println("the addition of the number is "+num);
	
}
}
