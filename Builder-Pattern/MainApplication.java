public class MainApplication {

    public static void main(String[] args) {
        User.Builder user = new User.Builder(1, "Jhon").setAge(23);
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getName());
        System.out.println("User Phone Number: " + user.getPhoneNumber());
        System.out.println("User Age: " + user.getAge());

        System.out.println(user.toString());
    }
}