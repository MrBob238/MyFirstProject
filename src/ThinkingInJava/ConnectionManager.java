package ThinkingInJava;

public class ConnectionManager {

    public static void main(String[] args) {
        try {
            Connection connect1 = Connection.makeConnection();
            System.out.println(connect1.getCOUNT());
            Connection connect2 = Connection.makeConnection();
            Connection connect3 = Connection.makeConnection();
            System.out.println(connect1.getCOUNT());    //Это не копипаст, именно connect1.getCOUNT()
            Connection connect4 = Connection.makeConnection();
            Connection connect5 = Connection.makeConnection();
            System.out.println(connect5.equals(null));
            Connection connect6 = Connection.makeConnection();
        }
        catch (NullPointerException n){
            System.out.println("Создано слишком много объктов Connection");
        }

    }
}

class Connection {
    private static int COUNT = 0;
    private static int MAX_COUNT = 5; //Максимальное количество объектов данного класса.
    private Connection(){
        COUNT++;
    }
    public static Connection makeConnection(){
        if (COUNT < MAX_COUNT) {
            return new Connection();
        }
        else return null;
    }
    public int getCOUNT(){
        return COUNT;
    }
}
