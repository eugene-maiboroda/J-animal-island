package animals.species.carnivore;

import animals.Animal;
import animals.Carnivore;

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
