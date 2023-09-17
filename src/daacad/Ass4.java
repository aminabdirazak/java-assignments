package daacad;
public class Ass4 {
    public Ass4(){
        for(int a=1; a<=10; a++){
            if(a==1 || a==10){
                    for(int b=10; b>0; b--){
                        System.out.print(b+" \t");
                    }
                    System.out.println("");
            }// end of if
            else
                System.out.println(a);
        }// end of outer loop
    }
}
