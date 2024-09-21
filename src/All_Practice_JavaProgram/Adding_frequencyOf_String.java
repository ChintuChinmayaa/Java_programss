package All_Practice_JavaProgram;

public class Adding_frequencyOf_String {
public static void main(String[] args) {
	String str="ch22in45ma66ya";
	int sum=0;
	int num=0;
	for(int i=0;i<str.length();i++)	
	{
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9')
		{
			int n=ch-48;
			num=num*10+n;
		}
		else
		{
			sum=sum+num;
			num=0;
		}
	}
	System.out.println(sum+num);
}
}
