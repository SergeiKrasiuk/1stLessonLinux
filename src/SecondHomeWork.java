public class SecondHomeWork {
    public static void main(String[] args) {
        System.out.println("Task one");
        int a = 4;
        int b = 5;
        System.out.println(isSumIn10to20(a, b));

        System.out.println("Task two");
        positiveOrNegative(3);

        System.out.println("Task three");
        System.out.println(isPositive(4));

        System.out.println("Task four");
        print("Where is my brains?", 3);

        System.out.println("Task five");
        System.out.println(leapYear(2021));
    }

    public static boolean isSumIn10to20(int cold, int hot) {
        int sum = cold + hot;
        return 10 < sum && sum <= 20;
        }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Number Positive!");
        } else {
            System.out.println("Number is Negative!");
        }
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
