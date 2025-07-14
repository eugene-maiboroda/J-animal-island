package animals.species.carnivore;

import animals.Animal;
import animals.Carnivore;

public class Boa extends Carnivore {

    public Boa() {
        setWeight(15.0);
        setMaxOnCell(30);
        setSpeed(1);
        setHungryPoints(3.0);
        setHealthPoints(3.0);
    }

    public Animal reproduce() {
        return new Boa();
    }
}
