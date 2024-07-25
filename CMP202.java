public class CMP202 {
    public static void main(String[] args) {}
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 20;
        height = 165;
        name = "micheal";
        name.length();
        password = "User@8742";
        if (password.contains("8745") || password.contains("User")) {
            System.out.println("Password is not strong enough");
        }
    }
}