package all_Programs;

public class PalindromeString {
public static void main(String[] args) {
	String str="131";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		 rev=rev+str.charAt(i);
	}
	if(str.equals(rev))
	{
		System.out.println("it is a palindrome ");
	}
	else
	{
		System.out.println("it is not a palindrome");
	}
	
		
	
}
}

