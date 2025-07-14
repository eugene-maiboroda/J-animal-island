**Island Life Simulator** is a multithreaded life simulation on a 2D island grid (100x20 cells). The ecosystem includes predators and herbivores with customizable behaviors such as eating, moving, reproducing, and dying from hunger. Each animal type extends a base abstract class `Animal`, allowing polymorphic behavior and method overrides.

This project helped solidify understanding of Java core, thread-safe design, and object interaction modeling in simulations.

### Description

The island is represented as a 2D grid of `Cell` objects. Each cell can contain plants and various animals (predators and herbivores). Animals can:

- eat (plants or other animals based on probabilities),
- move (to neighboring cells),
- reproduce (if a pair is present),
- die (from hunger or being eaten).

The simulation runs in real time using multithreading, and prints out statistics at configurable intervals.

### Technologies Used

- Java 17
- Object-Oriented Programming
- Multithreading (ScheduledExecutorService, ExecutorService)
- Java Collections Framework
- Console output for simulation stats

### Project Structure

- `Main` — entry point
- `island` — game field logic, controller, and game engine
- `animals` — base `Animal` class and specific species
- `enums` — types, settings, directions
- `GameSettings` — configurable parameters

---

### Simulation Parameters (in `GameSettings.java`)

You can configure:

- island width and height
- initial animal populations
- max number per cell
- hunger level per species
- movement speed
- tick duration
- termination condition

---

### How to Run

1. Clone the repository
2. Open in IntelliJ IDEA or any IDE with Java 17+ support
3. Run `Main.java`
4. Observe console output of island state over time

---

### Output Example

Every simulation tick prints:

- Total count of each animal type
- Number of plants
- Dead/alive statistics

```java
*** Day 25-th ***

🐗 - 26
🐻 - 194
🐛 - 22
🐐 - 52
🐎 - 67
🐍 - 31
🌱 - 91
🐑 - 95
🐇 - 13
🦆 - 66
🦌 - 82
🦊 - 43
🦅 - 93
🐃 - 100
🐁 - 111
```

---

### How to control simulation speed

If you want to adjust the speed of the console output and synchronize it with the simulation pace (days advancing), modify the following two places in your code:

### `GameSettings.java`, change the delay between ticks:

```java
public static final int STAT_PERIOD = 100; // milliseconds
```

This value controls how frequently statistics are printed to the console and (optionally) how often the life cycle progresses.

---

### `Game.java`, make sure both statistics and life cycle use the same delay:

```java
executorService.scheduleWithFixedDelay(
    this.controller.getStats().createShowStatsTask(),
    100L,
    GameSettings.STAT_PERIOD,
    TimeUnit.MILLISECONDS
);

executorService.scheduleWithFixedDelay(
    this.controller.createLifeCycleTask(),
    100L,
    GameSettings.STAT_PERIOD, // synced with STAT_PERIOD
    TimeUnit.MILLISECONDS
);
```

This ensures that simulation days increase at the same pace as stats are printed — preventing situations where the day jumps from 1 to 39 while the console appears "slow".

If you only slow down the `STAT_PERIOD` but leave life cycle delay at 100ms — days will continue to increase rapidly, while stats lag visually.
