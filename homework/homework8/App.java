package homework.homework8;


public class App {

    public static boolean checkBarrier(Athletes athletes, Barrier barrier){
        if(barrier instanceof Wall){
            if (!athletes.jump(barrier)) {
                System.out.println(("Дальше не может проходить препятствия"));
                return false;
            }
        } else {
            if (!athletes.run(barrier)) {
                System.out.println(("Дальше не может проходить препятствия"));
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Athletes athletes[] = {new Human("Alex", 1.5, 1500),
                new Robot("Model2020", 0, 100),
                new Robot("Model2021", 0, 0),
                new Cat("Barsic", 3, 300)
        };
        Barrier barrier[] = {new Wall(1.2),
                new TrackRun(500),
                new Wall(1.3),
                new TrackRun(1000)
        };

        for (int i = 0; i < athletes.length; i++) {
            for (int j = 0; j < barrier.length; j++) {
                if (!checkBarrier(athletes[i], barrier[j]))
                    break;
            }
        }

    }
}

