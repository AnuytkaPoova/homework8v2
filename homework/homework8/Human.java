package homework.homework8;

public class Human implements Athletes {

    private double maxJumpHeight;
    private double maxRunDistance;
    private String name;
    private Genus genus;


    public Human(String name, double maxJumpHeight, double maxRunDistance) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.genus = Genus.HUMAN;

    }

    public double maxJumpHeight(){
        return maxJumpHeight;
    }
    public double maxRunDistance() {
        return maxRunDistance;
   }


    public boolean run(Barrier barrier) {
        if (barrier.overcome(this)) {
            System.out.printf("%s %s Успешно проходит беговую дорожку  %.1f м.\n",genus.getGenus(), name, barrier.overcomeParameters());
            return true;
        }
        System.out.printf("%s %s не может пробежать беговую дорожку %.1f м.\n", genus.getGenus(), name, barrier.overcomeParameters());
            return false;
    }

    public boolean jump(Barrier barrier) {
        if (barrier.overcome(this )){
            System.out.printf("%s %s Успешно перепрыгнул стену высотой %.1f м.\n", genus.getGenus(), name, barrier.overcomeParameters());
            return true;
        }

        System.out.printf("%s %s не может перепрыгнуть стену высотой %.1f м.\n", genus.getGenus(), name, barrier.overcomeParameters());
            return false;
    }


}
