import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача1");
        int[] value = new int[3];
        value[0] = 1;
        int oneValue = value[0];
        value[1] = 2;
        int twoValue = value[1];
        System.out.println(oneValue);
        System.out.println(twoValue);

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] spring = new int[6];
        spring[0] = 2;
        spring[1] = 3;
        int springApril = spring[1];
        spring[2] = 4;
        // System.out.println(spring [0] + springApril + spring [2]);
        System.out.println(spring[0]);
        System.out.println(springApril);
        System.out.println(spring[2]);
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] value = {1, 2, 3};
        for (int i = 0; i < value.length; i++) {
            if (i == value.length - 1) {
                System.out.println(value[i]);
                break;
            }
            System.out.print(value[i] + ", ");
        }

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        int[] spring = {1, 2, 3, 4, 5, 6};
        for(int i =0; i < spring.length; i++) {
            if (i == spring.length - 1) {
                System.out.println(spring[i]);
                break;
            }
            System.out.print(spring[i] + ", ");
        }
    }

        public static void task3() {
            System.out.println("Задача3");
            int[] value = {1, 2, 3};
            for (int i = value.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(value[i]);
                    break;
                }
                System.out.print(value[i] + ", ");
            }

            double[] numbers = {1.57, 7.654, 9.986};
            for (int i = numbers.length - 1; i >= 0; i--) {
                if ( i == 0) {
                    System.out.println(numbers[i]);
                    break;
                }
                System.out.print(numbers[i] + ", ");
            }

            int[] spring = {1, 2, 3, 4, 5, 6};
            for (int i = spring.length - 1; i >= 0; i--) {
                if (i == 0) {
                        System.out.println(spring[i]);
                        break;
                    }
                    System.out.print(spring[i] + ", ");
                }
        }

        public static void task4() {
            System.out.println("Задача4");
            int[] value = {1, 2, 3};
             for (int i = 0; i < value.length + 1; i++) {
               if (value[i]%2 != 0) {
                   value[i] += 1;
               }
             }
             System.out.println(Arrays.toString(value));
           }
        }
