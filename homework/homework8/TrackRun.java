package homework.homework8;

public class TrackRun implements Barrier {
    private double distance;

    public TrackRun(int distance) {
        this.distance = distance;
    }

    @Override
    public double overcome() {
        return distance;
    }
}
