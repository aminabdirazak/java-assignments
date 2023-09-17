package daacad;
import java.util.Scanner;
public class Ass2 {
    Scanner kb=new Scanner(System.in);
    public Ass2(){
        System.out.println("Enter number: ");
        int n=kb.nextInt();
        for(int i=n; i>0; i-=1){
            System.out.println("jibaarka "+i+" waa: "+i*i);
        }
    }
}
