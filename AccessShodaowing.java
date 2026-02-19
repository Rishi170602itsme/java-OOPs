import java.util.Scanner;

public class AccessShodaowing {
    class soul{
        Scanner world = new Scanner(System.in);
        private class Heart {
            public void mind(){

              System.out.println("Worlds noise" + world );
            }
        } 
    }
        public static void main(String[] args) {
           
        System.out.println("speak world");
          soul mine = new soul();
        String say = mine.world.nextLine();// becaue the world scanner object is inside a soul name class hence go through the soul object(mine), that you created
      
        mine.Heart Myheart = new Heart();
        Myheart.mind();

        }
    
    
}

