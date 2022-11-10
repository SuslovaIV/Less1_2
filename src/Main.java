public class Main {
    public static void main(String[] args) {
       simpleClasses();
       staticClasses();
       localClasses();
       System.out.println("---Anonymous classes---");
       printTxt();
       cooking();
    }

    public static void simpleClasses() {
        System.out.println("---Simple classes---");
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
        System.out.println("---Static classes---");
        System.out.println("Первый способ");
        UserSt user = new UserSt("Static username", "123");
        user.createQuerySt();
        System.out.println("Второй способ");
        UserSt.QuerySt q1 = new UserSt.QuerySt();
        q1.printToLog();
    }
    public static void localClasses() {
        System.out.println("---Local classes---");
        System.out.println("Первый способ");
        UserLocal user = new UserLocal("Static username", "123");
        user.crateQuery();
    }
    public static void printTxt(){
        System.out.println("PRINT");
        Text txt = new Text();
        txt.print("123");
        Text txt2 = new Text(){
            public void print(String str){
                System.out.println("Переопределенный метод "+str);
            }
        };
        txt2.print("123");

    }
    public static void cooking(){
        System.out.println("COOKING");
        Food f = new Food();
        f.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Готовим " +str);
            }
        }, "борщ");

    }
}

