package Animals.species.carnivore;

import Animals.Animal;
import Animals.Carnivore;

public class Fox extends Carnivore {
    public Fox() {
        setWeight(8.0);
        setMaxOnCell(30);
        setSpeed(2);
        setHungryPoints(2.0);
        setHealthPoints(2.0);
    }

    public Animal reproduce() {
        return new Fox();
    }
}
