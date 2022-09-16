import java.util.*;
public class display {
    public static void main(String[] args){
        Scanner calcu = new Scanner(System.in);

        System.out.println("This is a simple calculation using inheritance!");
        System.out.println("Enter the first num: ");
        int fnum = calcu.nextInt();
        System.out.println("Enter the second num: ");
        int snum = calcu.nextInt();



        addition add = new addition();
        subtraction sub = new subtraction();
        multiplication mul = new multiplication();
        division div = new division();
        add.result(fnum, snum);
        System.out.println("\n");
        sub.result(fnum, snum);
        System.out.println("\n");
        mul.result(fnum, snum);
        System.out.println("\n");
        div.result(fnum, snum);

    }
    
}