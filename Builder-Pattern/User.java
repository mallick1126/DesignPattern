
/*********** Builder Design Pattern. **********/

public class User {

    private final int id;
    private final String name;
    private final String phoneNumber;
    private final int age;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }

    public static class Builder {
        private int id;
        private String name;
        private String phoneNumber;
        private int age;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Builder [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + "]";
        }

    }
}