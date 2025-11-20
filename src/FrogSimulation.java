public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance() {
        return (int) (Math.random() * 101 - 50);
    }
    public boolean simulate() {
        return maxHops * hopDistance() > goalDistance;
    }
    public double runSimulations(int num) {
        int successes = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                successes++;
            }
        }
        return (double) successes / num;
    }
}