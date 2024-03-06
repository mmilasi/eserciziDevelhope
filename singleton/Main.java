package singleton;

public class Main {
    public static void main(String[] args) {
        User user = User.getUser();
        System.out.println(user);
        User user1 = User.getUser();
        user.setName("Marija");
        user.setSurname("Milasinovic");
        user.setAge(33);
        System.out.println(user1);
    }
}