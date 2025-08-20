package pl.coderslab.injection;

public class MainLogger {
    public static void main(String[] args) {

//        DatabaseLogger dblog = new DatabaseLogger();
//        dblog.log("message number 1");
//
//        FileLogger filelog = new FileLogger();
//        filelog.log("message number 1");

        User user = new User("Ula", new DatabaseLogger());
        user.logIn();

        User user2 = new User("Bob", new FileLogger());
        user2.logIn();




    }
}
