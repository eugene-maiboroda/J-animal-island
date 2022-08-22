package Animals.species.carnivore;

import Animals.Animal;
import Animals.Carnivore;

public class Eagle extends Carnivore {
    public Eagle() {
        setWeight(6.0);
        setMaxOnCell(20);
        setSpeed(3);
        setHungryPoints(1.0);
        setHealthPoints(1.0);
    }

    public Animal reproduce() {
        return new Eagle();
    }
}
