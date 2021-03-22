package homework.homework8;

public class Wall implements Barrier {
     private double distance;

     public Wall(double distance) {
         this.distance = distance;
     }

     @Override
    public double overcome() {
            return distance;
     }
}
