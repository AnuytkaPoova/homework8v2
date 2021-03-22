package homework.homework8;

public class Cat implements Athletes{
    private  double maxJumpDistance;
    private  double maxRunDistance;
    private Barrier barrier;
    private Wall wall;
    private TrackRun trackRun;
    private String name;
    private Genus genus;

    public Cat(String name,double maxJumpDistance, double maxRunDistance ) {
        this.name = name;
        this.maxJumpDistance = maxJumpDistance;
        this.maxRunDistance = maxRunDistance;
        this.genus = Genus.CAT;
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
