package animals.species.herbivore;

import animals.Animal;
import animals.Herbivore;

public class Goat extends Herbivore {
    public Goat() {
        setWeight(60.0);
        setMaxOnCell(140);
        setSpeed(3);
        setHungryPoints(10.0);
        setHealthPoints(10.0);
    }

    public Animal reproduce() {
        return new Goat();
    }
}
