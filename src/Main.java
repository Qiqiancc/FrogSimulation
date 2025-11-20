public class Main {
    public static void main(String[] args) {
        FrogSimulation Froggy = new FrogSimulation(24, 5);
        System.out.println(Froggy.simulate());
        System.out.println(Froggy.runSimulations(400));
    }
}
