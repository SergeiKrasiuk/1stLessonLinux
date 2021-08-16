import java.util.Arrays;

public class ThirdHomeWork {

    public static void main(String[] args) {

        System.out.println("Task 1");
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Arrays.toString(array));


        System.out.println("Task 2");
        int[] secondArray = new int[100];

        System.out.println(Arrays.toString(secondArray));
        fillArrayWithSequence(secondArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Task 3");
        int[] thirdArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println(Arrays.toString(thirdArray));
        doubleNumbersLessThanSixIn(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

        System.out.println("Task 4");

        int[][] square = new int[10][10];
        System.out.println("With zeroes");
        printSquare(square);

        fillDiagonalsWithOnes(square);
        System.out.println("With ones.");
        printSquare(square);


        System.out.println("Task 5");
        int initialValue = 10;
        int size = 5;

        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));


        System.out.println("Task 6");

        int[] minMaxArray = { 1, 2, 7, 4, 0 };
        System.out.println(Arrays.toString(minMaxArray));

        printMinAndMax(minMaxArray);

        System.out.println("Task 7");

        int[] sumsArray = { 1, 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(sumsArray));
        boolean isBalanced = hasBalance(sumsArray);
        System.out.println("Are the sums of the right and left parts equal anywhere? " + isBalanced);


        System.out.println("Task 8");

        int[] rightShiftArray = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(rightShiftArray));
        shiftArray(rightShiftArray, 3);
        System.out.println(Arrays.toString(rightShiftArray));


        int[] leftShiftArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(leftShiftArray));
        shiftArray(leftShiftArray, -5);
        System.out.println(Arrays.toString(leftShiftArray));
    }

    public static void printSquare(int[][] inputSquare)
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
    }
 }



    public static void changeZeroesAndOnes(int[] inputArray)
    {

        for (int i = 0; i < inputArray.length; i++)
        {

            inputArray[i] = 1 - inputArray[i];
        }
    }


    public static void fillArrayWithSequence(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i + 1);
        }
    }


    static void doubleNumbersLessThanSixIn(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
        {

            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }


    public static void fillDiagonalsWithOnes(int[][] square)
    {

        for (int i = 0; i < square.length; i++)
        {

            square[i][i] = 1;


            square[i][square[i].length - 1 - i] = 1;
        }
    }



    public static int[] getNewArrayWith(int initialValue, int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = initialValue;
        }
        return result;
    }


    public static void printMinAndMax(int[] inputArray)
    {
        int min = inputArray[0];
        int max = inputArray[0];


        for (int i = 1; i < inputArray.length; i++)
        {
            if (min > inputArray[i])
            {
                min = inputArray[i];
            }

            if (max < inputArray[i])
            {
                max = inputArray[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }


    public static boolean hasBalance(int[] inputArray)
    {
        int leftSum = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            leftSum += inputArray[i];

            int rightSum = 0;
            for (int j = (i + 1); j < inputArray.length; j++)
            {
                rightSum += inputArray[j];
            }

            if (leftSum == rightSum)
            {
                return true;
            }
        }

        return false;
    }


    public static void shiftArray(int[] array, int shift)
    {
        if (shift < 0)
        {
            for (int i = 0; i > shift; i--)
            {
                leftShift(array);
            }
        }
        else
        {
            for (int i = 0; i < shift; i++)
            {
                rightShift(array);
            }
        }
    }

    public static void rightShift(int[] inputArray)
    {
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[inputArray.length - j] = inputArray[inputArray.length - j - 1];
        }

        inputArray[1] = buffer;
    }

    public static void leftShift(int[] inputArray)
    {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];

        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[j - 1] = inputArray[j];
        }

        inputArray[inputArray.length - 2] = buffer;
    }
}

