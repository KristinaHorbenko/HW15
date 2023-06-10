import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void printThreeWords () {
        ArrayList<String> words = new ArrayList<>();
        words.add("Orange");
        words.add("Banana");
        words.add("Apple");
        for (String word : words) {
            System.out.println(word);
        }

    }

    public static void checkSumSign () {
        System.out.println("Ведіть число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Ведіть число: ");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сума чисел позитивна: " + sum);
        }
        else {
            System.out.println( "Сума чисел негативна!");
        }
    }

    public static void printColor () {
        int value = 13;

            if (value <= 0 ) {
                System.out.println("Червоний");
            }
            else if (value >= 100) {
                System.out.println("Жовтий");
            }
            else {
                System.out.println("Зелений");
            }


        }

    public static void  compareNumbers() {
        int a = 5;
        int b = 13;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }
    public static void compareNumbers1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(3);
       int sum = 0;
       for (int number : numbers) {
           sum += number;
       }
        boolean result = sum >= 10 && sum <= 20;
        System.out.println(result);
    }

       public static void number() {
           int number = -17;
           if (number >= 0) {
               System.out.println(number + " це додатнє число");

           } else {
               System.out.println(number + " це від’ємне число");
           }
       }

       public static void number1() {
           int number = 6;
           boolean result1 = number < 0 ;
           System.out.println(result1);


       }

       public static void printString () {
        String text = "Hello world";
        int count = 2;

        for(int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static boolean leapYear() {
        System.out.println("Ведіть рік: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " цей рік є високосним");
            return true;
        } else if (year % 100 == 0) {
            System.out.println(year + " цей рік не є високосним");
            return false;
        } else if (year % 4 == 0) {
            System.out.println(year + " цей рік є високосним");
            return true;
        } else {
            System.out.println(year + " цей рік не є високосним");
            return false;
        }
    }
}




