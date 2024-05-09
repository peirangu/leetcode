public class Main {
    public static void main(String[] args) {
        int [] plants = {2,2,1};
        System.out.println(minimumRefill(plants,2,2));
    }
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int total = 0;
        int leftA = capacityA;
        int leftB = capacityB;
        for (int i = 0; i < plants.length / 2; i++) {
            if (leftA < plants[i]) {
                leftA = capacityA;
                total++;
            }
            leftA = leftA - plants[i];
            if (leftB < plants[plants.length - 1 - i]) {
                leftB = capacityB;
                total++;
            }
            leftB = leftB - plants[plants.length - 1 - i];
        }
        if (plants.length % 2 == 1) {
            if (!(Math.max(leftA, leftB) >= plants[plants.length / 2])) {
                total++;
            }
        }
        return total;
    }
}