package Animals;

public abstract class Carnivore extends Animal {
    private int x;
    private int y;
    private double weight;

    public boolean eat(Entity foodEntity) {
        boolean isEating = FoodMatrix.isEaten(this, foodEntity);

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
