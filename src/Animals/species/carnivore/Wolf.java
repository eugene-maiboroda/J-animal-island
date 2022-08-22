package Animals.species.carnivore;

import Animals.Animal;
import Animals.Carnivore;

public class Wolf extends Carnivore {

    public Wolf() {
        setWeight(50.0);
        setMaxOnCell(30);
        setSpeed(3);
        setHungryPoints(8.0);
        setHealthPoints(8.0);
    }

    public
    Animal reproduce() {
        return new Wolf();
    }
}
