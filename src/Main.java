public class Main {
    public static void main(String[] args) {
        simpleClasses();
        staticClasses();
        localClasses();
    }

    public static void simpleClasses() {
        System.out.println("Simple classes");
        User user = new User("Username", "123");
        System.out.println("Первый способ");
        User.Query q = user.createQuery();
        System.out.println("Второй способ");
        User.Query q1 = user.new Query();
        q1.printToLog();
        System.out.println("Третий способ");
        User.Query q2 = new User("Username2", "456").new Query();
        q2.printToLog();
    }
    public static void staticClasses() {
        System.out.println("Static classes");
        System.out.println("Первый способ");
        UserSt user = new UserSt("Static username", "123");
        user.createQuerySt();
        System.out.println("Второй способ");
        UserSt.QuerySt q1 = new UserSt.QuerySt();
        q1.printToLog();
    }
    public static void localClasses() {
        System.out.println("Local classes");
        System.out.println("Первый способ");
        UserLocal user = new UserLocal("Static username", "123");
        user.crateQuery();
    }
}

