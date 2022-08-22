package Animals.species.herbivore;

import Animals.Animal;
import Animals.Herbivore;

public class Horse extends Herbivore {
    public Horse() {
        setWeight(400.0);
        setMaxOnCell(20);
        setSpeed(4);
        setHungryPoints(60.0);
        setHealthPoints(60.0);
    }

    public Animal reproduce() {
        return new Horse();
    }
}
