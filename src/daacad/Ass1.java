package daacad;
import java.util.Scanner;
public class Ass1 {
    Scanner kb=new Scanner(System.in);
    public Ass1(){
        System.out.println("Enter Start: ");
        int s=kb.nextInt();
        System.out.println("Enter End: ");
        int e=kb.nextInt();
        for (int i = s; i <=e; i++) {
            System.out.print(i+",");
        }
    }
}
