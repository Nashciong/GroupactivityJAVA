class Programmer extends FullStockDeveloper{
    void showDetails(){
    String course = "Certificate of Computer technology";
    String definejava = "Learning Java is fun if ganahan!";    
    
    System.out.println("My name as a future programmer is: "+ programmerName + "\n");
    System.out.println("My age is: "+ age + "\n");
    System.out.println("My course is: "+ course + "\n");
    System.out.println("I can define java as: "+ definejava + "\n");
    }
    

}
public class studentsDetail extends Programmer{

    //variables below for constructors
    String studentName;
    int studentAge;
    String studenTalent;
    
    //Constructor
    studentsDetail( String name, String talent, int age){
        this.studenTalent = talent;
        this.studentName = name;
        this.studentAge = age;
    }

}
