package homework.homework8;

public class TrackRun implements Barrier {

    private double distance;

    public TrackRun(int distance) {
        this.distance = distance;
    }

    public double overcomeParameters(){
        return distance;
    }
    @Override
    public boolean overcome(Athletes athletes) {
        if (athletes.maxRunDistance() >= distance) {
            return true;
        }
        return  false;
    }


}
