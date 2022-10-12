import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task4();
    }


    public static void task1() {
        // ## 2 задача
        // Объявите три массива:
        // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new

        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;

        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        double[] doubleArray = {1.57, 7.654, 9.986};

        //3.Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int number[] = {10, 20, 100, 525, 1, 78, 59};

    }

    public static void task2() {
        // ## 2 задача
        //
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        //1.

        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        for (int i = 0; i < 2; i++) {
            System.out.print(integerArray[i] + ", ");
        }
        System.out.println(integerArray[2]);

        //2.

        double[] doubleArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < 2; i++) {
            System.out.print(doubleArray[i] + ", ");
        }
        System.out.println(doubleArray[2]);


        //3.

        int number[] = {10, 20, 100, 525, 1, 78, 59};
        for (int i = 0; i < 6; i++) {
            System.out.print(number[i] + ", ");
        }
        System.out.println(number[6]);


    }

    public static void task3() {
        //## 3 задача
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        //1.
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        for (int i = integerArray.length - 1; i >= 1; i--) {
            System.out.print(integerArray[i] + " ,");
        }
        System.out.println(integerArray[0]);

        //2.
        double[] doubleArray = {1.57, 7.654, 9.986};
        for (int i = doubleArray.length - 1; i >= 1; i--) {
            System.out.print(doubleArray[i] + " ,");
        }
        System.out.println(doubleArray[0]);

        //3.

        int number[] = {10, 20, 100, 525, 1, 78, 59};
        for (int i = number.length - 1; i >= 1; i--) {

            System.out.print(number[i] + " ,");
        }
        System.out.println(number[0]);


    }

    public static void task4() {
        // ### 4 задача
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).

        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (integerArray[i] % 2 == 1) {
                System.out.print(integerArray[i] + 1 + "  ");
            }

        }

    }
}