public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords(); checkSumSign(); printColor(); compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println(" Orange \n Banana \n Apple");
    }
    public static void checkSumSign() {
        int a = -113;
        int b = 27;
        int summ = a + b;
        if (summ >= 0) {
            System.out.println("Summ is positive!");
        } else {
            System.out.println("Summ is negative.");
        }
    }
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 101) {
            System.out.println("Green");
        }
        if (value > 1) {
            System.out.println("Yellow");
        }
    }
    public static void compareNumbers() {
        int a = 40;
        int b = 40;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}
