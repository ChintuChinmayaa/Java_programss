package all_Programs;

public class FactorialNumber {
public static void main(String[] args) {
	int number=8;
	long factorial= 1;
	System.out.print(number + "! = ");
    for (int i = number; i >= 1; i--) 
	{
		factorial=factorial*i;
		System.out.print(i);
		if(i!=1)
		{
			System.out.print("*");
		}
	}
	System.out.print(" = "+factorial);
}

}
