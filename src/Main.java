import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Практика на уроке
        System.out.println("Практика на уроке");
        //int [] weights = new int[12];
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        //System.out.println(weights[13]);
        int january = 0;
        System.out.println(weights[january]);
        //for (int i = 0; i < 12; i++) {
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        //Задача 1
        System.out.println("Задача 1");
        //Объявите три массива:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива:
        // с помощью ключевого слова или сразу заполненный элементами.

        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] fraction = {1.57, 7.654, 9.986};

        int[] distence = new int[5];

        distence[0] = 10;
        distence[1] = 20;
        int s = distence[1];
        distence[2] = 30;
        distence[3] = 40;
        distence[4] = 50;

        //Задача 2
        System.out.println("Задача 2");
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
        System.out.println(fraction[0] + ", " + fraction[1] + ", " + fraction[2]);
        for (int i = 0; i < distence.length; i++) {
            System.out.print(distence[i]);
            if (i != distence.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        // распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
        // а с последнего. Элементы должны быть распечатаны через запятую,
        // при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
              System.out.println(" ");
        for (int i = fraction.length - 1; i >= 0; i--) {
            System.out.print(fraction[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
              System.out.println(" ");
        for (int i = distence.length - 1; i >= 0; i--) {
                System.out.print(distence[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
        System.out.println(" ");
        //Задача 4
        System.out.println("Задача 4");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными .
        for (int i = 0; i < number.length; i++) {
            if (number[i] %2 != 0) {
                number[i]+=1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}