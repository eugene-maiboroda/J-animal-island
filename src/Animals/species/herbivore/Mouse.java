package Animals.species.herbivore;

import Animals.Animal;
import Animals.Herbivore;

public class Mouse extends Herbivore {

        public Mouse() {
            setWeight(0.05);
            setMaxOnCell(500);
            setSpeed(1);
            setHungryPoints(0.01);
            setHealthPoints(0.01);
        }

        public Animal reproduce() {
            return new Mouse();
        }
}
