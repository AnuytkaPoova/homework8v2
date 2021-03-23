package homework.homework8;

public class Wall implements Barrier {

     private double height;

     public Wall(double height) {
         this.height = height;
     }


     public double overcomeParameters(){
        return height;
    }

     @Override
    public boolean overcome(Athletes athletes) {
         if (athletes.maxJumpHeight() >= height) {
             return true;
         }
         return  false;
     }


}
