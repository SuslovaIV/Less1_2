public class UserSt {
   private static String login;
   private static String password;

   static class QuerySt{
        public void printToLog(){
            System.out.println("Пользователь "+login+" с паролем "+password+" отправил запрос");
        }
    }

    public UserSt(String log, String pas){
        login = log;
        password = pas;
    }

    public void createQuerySt(){
        QuerySt query = new QuerySt();
        query.printToLog();
   }

}
