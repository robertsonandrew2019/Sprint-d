public class Main {

    public static double totalWork = 1590;

    public static void main(String[] args) {
        capacityCalc(8,3);
        capacityCalc(9,3);
        capacityCalc(10,3);
        capacityCalc(11,3);
        capacityCalc(8,4);
        capacityCalc(8,5);
        capacityCalc(8,6);
    }

    public static void capacityCalc(int devs, int weeks){
        double capacity40 = (totalWork / (double)(devs * weeks * 40)) * 100;
        System.out.printf("With %d devs working for a %d week sprint, for 40 hrs/wk, we would be at %f%% of capacity \n", devs, weeks, capacity40);

        double capacity35 = (totalWork / (double)(devs * weeks * 35)) * 100;
        System.out.printf("With %d devs working for a %d week sprint, for 35 hrs/wk, we would be at %f%% of capacity \n", devs, weeks, capacity35);

        double capacity30 = (totalWork / (double)(devs * weeks * 30)) * 100;
        System.out.printf("With %d devs working for a %d week sprint, for 30 hrs/wk, we would be at %f%% of capacity \n\n", devs, weeks, capacity30);
    }
}
