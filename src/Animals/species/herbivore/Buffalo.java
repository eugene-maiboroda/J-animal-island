package Animals.species.herbivore;

import Animals.Animal;
import Animals.Herbivore;

public class Buffalo extends Herbivore {
    public Buffalo () {
        setWeight(700.0);
        setMaxOnCell(10);
        setSpeed(3);
        setHungryPoints(100.0);
        setHealthPoints(100.0);
    }

    public Animal reproduce() {
        return new Buffalo();
    }
}
