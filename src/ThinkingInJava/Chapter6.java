package ThinkingInJava;

/**
 * Created by Vladimir on 13.01.2018.
 */
public class Chapter6 {

    /*
    8(4). По образцу примера Lunch.java создайте класс с именем ConnectionManager, который управляет
        фиксированным массивом объектов Connection. Программист-клиент не должен  напрямую создавать объекты Connection,
        а может получать их только с помощью статического метода вклассе ConnectionManager. Когда запас объетов у класса
        ConnectionManager будет исчерпан, он должен вернуть ссылку null. Протестируйте классы в методе main().
     */

    public static void main(String[] args) {
        Connection connect1 = Connection.makeConnection();
        System.out.println(connect1.getCOUNT());
    }
}
