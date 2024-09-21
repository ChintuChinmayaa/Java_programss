package all_Programs;


public class practice {

	
	String name;
	int id;
	double fees;
	practice(String name)
	{
		this.name=name;
		
	
	}
	practice(String name, int id, double fees)
	{
		this.name=name;
		this.id=id;
		this.fees=fees;
	}
	public void coldetails()
	{
		System.out.println("the name of the student is"+name);
		System.out.println("the id of the student is "+id);
		System.out.println("the fees of the student is "+fees);
	}
	public static void main(String[] args) {
		practice p = new practice("chinmaya",655,90.5);
		p.coldetails();
	}
	}


