public class Main {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        boolean singleResult = sim.simulate();
        System.out.println(singleResult);
        int numRuns = 400;
        double proportion = sim.runSimulations(numRuns);
        System.out.println(proportion);
    }
}

