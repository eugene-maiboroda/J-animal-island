package Animals;

public abstract class Herbivore extends Animal {
    public boolean eat(Entity foodEntity) {
        boolean isEating = FoodMatrix.isEaten((this), foodEntity);

        if (isEating) {

            if (foodEntity.getWeight() >= this.getHungryPoints()) {
                this.setHealthPoints(this.getHungryPoints());
            } else {
                double hungerAfterEating = this.getHealthPoints() + foodEntity.getWeight();
                this.setHealthPoints(hungerAfterEating);
            }

            return true;

        } else {
            return false;
        }
    }
}

