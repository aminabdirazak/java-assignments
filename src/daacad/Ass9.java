package daacad;
public class Ass9 {
    public Ass9(){
        System.out.println("X \t Y \t Z \n-----------------------------");
        for(int x=1; x>=0; x--){
            for(int y=1; y>=0; y--){
                for(int z=1; z>=0; z--)
                    System.out.println(x+" \t "+y+" \t "+z);
            }
        }
    }
}
