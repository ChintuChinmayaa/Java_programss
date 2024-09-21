package All_Practice_JavaProgram;
//Interface XYZ
interface XYZ {
 void m1();
}

//Interface ABC
interface ABC {
 void m1();
}

//Child class implementing both interfaces
public class Child implements XYZ, ABC {
 
 // Implementing the method m1() from both interfaces
 public void m1() {
     System.out.println("m1 from Child");
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Creating an instance of Child and assigning it to XYZ and ABC types
     XYZ c = new Child();
     c.m1();  // Calls m1() from Child

     ABC d = new Child();
     c.m1();  // Calls m1() from Child
 }
}


