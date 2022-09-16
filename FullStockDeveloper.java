public class FullStockDeveloper{

    String programmerName = "Ignacio Rosales Yurag";
    int age = 23;

    public void showAnswer(){
        System.out.println("Details of the future developer inherited by another student.");
    }

    public static void main(String[] aguy){
        studentsDetail sd1 = new studentsDetail("Ignacio Yurag", "VOVO mag ML", 23);
        studentsDetail sd2 = new studentsDetail("Kent James Sumayan", "mas-VOVO mag ML", 21);
        studentsDetail sd3 = new studentsDetail("Cint Savilla", "Ubod ng ka-VOVO-han mag ML", 21);

        studentsPerformance sp = new studentsPerformance();

        System.out.println("This is a simple program of OOP \n");
        System.out.println("My name is: "+ sd1.studentName + ", " + "ako ay isang "+ sd1.studenTalent + ", "+"kahit ako ay: " + sd1.studentAge + " taong gulang na. Oki...\n");
        System.out.println("My groupmate name is: "+ sd2.studentName + ", " + "ako ay isang "+ sd2.studenTalent + ", "+"kahit ako ay: " + sd2.studentAge + " taong gulang na. Oki...\n");
        System.out.println("My groupmamte name is: "+ sd3.studentName + ", " + "ako ay isang "+ sd3.studenTalent + ", "+"kahit ako ay: " + sd3.studentAge + " taong gulang na. Oki...\n");
        System.out.println("Our quote is \"Honesty is the best policy!\"\n");
        
        sp.check();

        //inheritance ni siya
        FullStockDeveloper mc = new FullStockDeveloper();
        mc.showAnswer();
        

        Programmer p = new Programmer();
        p.showDetails();

    }
}
    class studentsPerformance{
        void check(){
        System.out.println("responsible, I mean we are!");
}

}