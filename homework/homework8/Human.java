package homework.homework8;

public class Human implements Athletes{
     private  double maxJumpDistance;
     private  double maxRunDistance;
     private Barrier barrier;
     private Wall wall;
     private TrackRun trackRun;
     private String name;
     private Genus genus;

     public Human(String name,double maxJumpDistance, double maxRunDistance ) {
         this.name = name;
         this.maxJumpDistance = maxJumpDistance;
         this.maxRunDistance = maxRunDistance;
         this.genus = Genus.HUMAN;
     }

     public void sportsProcess() {
         sportsProcess();
     }
     public boolean sportsProcess(Wall wall) {
         double distance = wall.overcome();
         if (maxJumpDistance == 0 || distance > maxJumpDistance ) {
             System.out.printf("%s %s не может перепрыгнуть стену высотой %.2f м.\n", genus.getGenus(), name, distance);
             return false;
         } else
             System.out.printf("%s %s успешно перепрыгнул стену высотой %.2f м.\n", genus.getGenus(), name,  distance);
         return true;
     }
     public boolean sportsProcess(TrackRun trackRun) {
         double distance = trackRun.overcome();
         if (maxRunDistance == 0 || distance > maxRunDistance ) {
             System.out.printf("%s %s не проходит беговую дорожку  %.0f м.\n",genus.getGenus(), name, distance);
             return false;
         } else
             System.out.printf("%s %s Успешно проходит беговую дорожку  %.0f м.\n",genus.getGenus(), name, distance);
         return true;
     }

}
    //private double height;
    //private double length;
    //private Jumping jumping;
    /*
     private double PutDistance(Jumping jumping) {
         return height;
     }
     private double PutDistance(TrackRun trackRun) {
         return length;
     }
     /
      */
     /*
     public void sportsProcess(int length) {
         if (maxRunDistance == 0 || height > maxRunDistance ) {
             System.out.printf("%s не смог пробежать %d м.\n", name, maxRunDistance);
         } else
             System.out.printf("%s Успешно пробежал %d м. \n", name, length);
     }*/

 /*
     public void sportsProcess(double height) {
         if (maxJumpDistance == 0 || height > maxJumpDistance ) {
             System.out.printf("%s не смог прыгнуть на заявленную высоту %.2f м. \n", name, maxJumpDistance);
         } else
             System.out.printf("%s успешно смог прыгнуть на заявленную высот %.2f м. \n",name, height);
     }*/