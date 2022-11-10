public class UserLocal {
    private final String login;
    private final String password;

    public UserLocal(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void crateQuery() {
        class QueryLocal {
            void printToLog() {
                System.out.println("Пользователь "+login+" с паролем "+password+" отправил запрос");
            }
        }
        QueryLocal query = new QueryLocal();
        query.printToLog();
    }
}
