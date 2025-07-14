package animals.species.herbivore;

import animals.Animal;
import animals.Herbivore;

public class Deer extends Herbivore {
    public Deer() {
        setWeight(300.0);
        setMaxOnCell(20);
        setSpeed(4);
        setHungryPoints(50.0);
        setHealthPoints(50.0);
    }

    public Animal reproduce() {
        return new Deer();
    }
}
