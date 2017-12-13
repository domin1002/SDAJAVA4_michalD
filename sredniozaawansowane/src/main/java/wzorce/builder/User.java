package wzorce.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String adress;
    private int phone;


    //PRYWATNY KONSTRUKTOR!
    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.adress = userBuilder.adress;
        this.phone = userBuilder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                '}';
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String adress;
        private int phone;

        public UserBuilder(String firstName) {
            this.firstName = firstName;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = (age);
            return this;
        }

        public UserBuilder adress(String adress) {
            this.adress = adress;
            return this;
        }

        public UserBuilder phone (int phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }


}
