package homework.homework8;


public class App {
    public static void main(String[] args) {

        Athletes athletes[] = {new Human("Alex", 1.5, 1500),
                new Robot("Model2020", 0, 100),
                new Robot("Model2021", 0, 0),
                new Cat("Barsic", 3, 300)
        };
        Barrier barrier[] = {new Wall(1.2),
                new TrackRun(500),
                new Wall(2),
                new TrackRun(1000)
        };


        for (int i = 0; i < athletes.length; i++) {
            for (int j = 0; j < barrier.length; j++) {

                if (athletes[i].getClass().equals(Human.class)) {
                    if (barrier[j].getClass().equals(Wall.class)) {
                        if(!((Human) athletes[i]).sportsProcess((Wall) barrier[j]))
                           break;
                    } else if (!((Human) athletes[i]).sportsProcess((TrackRun) barrier[j]))
                           break;

                } else if (athletes[i].getClass().equals(Robot.class)) {
                    if (barrier[j].getClass().equals(Wall.class)) {
                        if (!((Robot) athletes[i]).sportsProcess((Wall) barrier[j]))
                            break;
                    } else if(!((Robot) athletes[i]).sportsProcess((TrackRun) barrier[j]))
                            break;

                }else if (athletes[i].getClass().equals(Cat.class)) {
                    if(barrier[j].getClass().equals(Wall.class)) {
                        if(!((Cat) athletes[i]).sportsProcess((Wall) barrier[j]))
                            break;
                    } else if(!((Cat) athletes[i]).sportsProcess((TrackRun) barrier[j]))
                            break;
                }
            }
        }

    }
}
