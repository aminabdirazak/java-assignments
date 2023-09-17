package daacad;
public class Ass5 {
    public Ass5(){
        for (int i =1; i <=10; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(i%3==0?"-":"*");
            }// end of inner
            System.out.println("");
        }// end of outer
    }
}
