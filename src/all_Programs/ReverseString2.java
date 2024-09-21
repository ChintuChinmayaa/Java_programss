package all_Programs;

public class ReverseString2 {
public static void main(String[] args) {
	String str="mohapatra";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	
}
}
