package ThinkingInJava;

/**
 * Created by Vladimir on 31.12.2017.
 */
public class Chapter4 {
    public static void main(String[] args) {
        //fibonacci(5);
        //simpleNumbers(20);
        vampireNumbers(1001, 9999);


    }


    /*
    18. (3)
        Напишите программу, использующую два вложенных цикла for и оператор остатка % для поиска и вывода простых чисел
        (то есть целых чисел, не делящихся нацело ни на какое другое число, кроме себя и 1).
    */

    public static void simpleNumbers(int num) {

        for (int i = 1; i < num; i++) {
            for (int d = 1; d <= i; d++) {
                if (i % d == 0) {
                    if (d != 1 && d != i) {
                        break;
                    }
                    if (d == i) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

    /*
    23 (4) Числа Фибоначчи. Числами Фибоначчи называется числовая последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34 и т.д.,
        в которой каждое число, начиная с третьего, яволяется суммой двух предыдущих. Напишите метод, который получает
        целочисленный аргумент и выводит казанное количество чисел Фибоначчи.
     */

    public static void fibonacci(int f) {
        int previousFib = 1;
        int currentFib = 1;
        int nextFib;
        int i = 1;
        System.out.print(currentFib + ", ");
        while (i <= f) {
            System.out.print(currentFib + ", ");
            nextFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = nextFib;
            i++;
        }

    }

    /*
    24. Вампирами называются числа, состоящие из четного количества цифр и полученные перемножением пары чисел,
        каждое из которых содержит половину цифр результата. Цифры берутся из исходного числа в произвольном порядке,
        завершающие нули недопустимы. Примеры:
        1) 1261 = 21 * 60;
        2) 1827 = 21 * 87;
        3) 2187 = 27 * 81.
        Напишите программу, которая находит всех "вампиров", состоящих из 4 цифр.
     */
    public static void vampireNumbers (int min, int max) {
        for (int i = min; i <= max; i++) {
            printIfVampiricNumber(i);
        }

    }

    public static int multiply (int a, int b, int c, int d) {
        return ((10 * a + b) * (10 * c + d));
    }
    /*
    Вынесение в отдельный метод определения, является ли число "вампиром".
    Если является, то вывести само число, и его разбиение на множители.
     */
    public static void printIfVampiricNumber (int i) {
        int i1, i2, i3, i4;                 //1st, 2nd, 3rd , 4th digits.
        i1 = i / 1000;
        i2 = (i / 100) % 10;
        i3 = (i / 10) % 10;
        i4 = i % 10;
        if  (multiply(i1,i2,i3,i4) == i) {
            vampNumToString(i, i1, i2, i3, i4);
        } else if (multiply(i1,i2,i4,i3) == i){
            vampNumToString(i, i1, i2, i4, i3);
        } else if (multiply(i2,i1,i3,i4) == i) {
            vampNumToString(i,i2,i1,i3,i4 );
        } else if (multiply(i2,i1,i4,i3) == i) {
            vampNumToString(i, i2,i1,i4,i3 );

        } else if (multiply(i1,i3,i2,i4) == i){
            vampNumToString(i,i1,i3,i2,i4 );
        } else if (multiply(i1,i3,i4,i2) == i){
            vampNumToString(i, i1,i3,i4,i2 );
        } else if (multiply(i3,i1,i2,i4) == i){
            vampNumToString(i, i3,i1,i2,i4);
        } else if (multiply(i3,i1,i4,i2) == i){
            vampNumToString(i, i3,i1,i4,i2);

        } else if (multiply(i1,i4,i2,i3) == i){
            vampNumToString(i,i1,i4,i2,i3);
        } else if (multiply(i1,i4,i3,i2) == i){
            vampNumToString(i, i1,i4,i3,i2);
        } else if (multiply(i4,i1,i2,i3) == i){
            vampNumToString(i,i4,i1,i2,i3);
        } else if (multiply(i4,i1,i3,i2) == i) {
            vampNumToString(i, i4, i1, i3, i2);
            }
        }
    public static void vampNumToString(int i, int a, int b, int c, int d){
        System.out.println(i + " = " + (10 * a + b ) + " * " + (10 * c + d));
    }

}
