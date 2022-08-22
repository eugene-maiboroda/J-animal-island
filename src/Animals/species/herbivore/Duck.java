package Animals.species.herbivore;

import Animals.Animal;
import Animals.Herbivore;

public class Duck extends Herbivore {
    public Duck() {
        setWeight(1.0);
        setMaxOnCell(200);
        setSpeed(4);
        setHungryPoints(0.15);
        setHealthPoints(0.15);
    }

    public Animal reproduce() {
        return new Duck();
    }
}
