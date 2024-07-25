public class User {
    String username = "Ebubechukwu" ;
    String password = "67890" ;
    String login() {
        if (username.equals("Ebubechukwu") && password.equals("67890")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User John = new User() ;
        System.out.println(John.login()) ;
    }
}
