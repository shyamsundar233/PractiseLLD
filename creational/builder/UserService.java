package creational.builder;

public class UserService {
    public static void main(String[] args) {
        User user = new User.Builder()
                    .id(1L)
                    .name("Shyam")
                    .email("shyam@gmail.com")
                    .enabled(1)
                    .build();
        System.out.println("User Created: " + user.toString());
    }
}
