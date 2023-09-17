package daacad;
public class Ass10 {
    public Ass10(){
         System.out.println("X \t Y \t Z \t Z'<==>(x+y') \n-----------------------------");
        for(int x=1; x>=0; x--){
            for(int y=1; y>=0; y--){
                for(int z=1; z>=0; z--){
                    int zz=z==1?0:1;
                    int yy=y==1?0:1;
                    int r=x+yy>1?1:x+yy;
                    int result=r==zz?1:0;
                    System.out.println(x+" \t "+y+" \t "+z+" \t "+result);
                }
            }
        }
    }
}
