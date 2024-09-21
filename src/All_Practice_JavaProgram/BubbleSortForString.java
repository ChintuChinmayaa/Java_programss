package All_Practice_JavaProgram;

public class BubbleSortForString {
public static void main(String[] args) {
	String[] str= {"chinmaya","tulu","dalwin","subu","smruti"};
	String temp;
	for(int i=0;i<str.length;i++)
	{
		int flag=0;
		for(int j=0;j<str.length-1-i;j++)
		{
			if(str[j].compareTo(str[j+1])>1)
			{
				temp= str[j];
				 str[j]= str[j+1];
				 str[j+1]=temp;
				 flag=1;
				 
			}
		}
		if(flag==0)
		{
			break;
		}
		
	}
	for(int i=0;i<str.length;i++)
		
	{
		System.out.println(str[i]+" ");
	}
}
}
