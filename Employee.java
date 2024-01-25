public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int personneId;
    private String phone;
    private String address;
    private String mail;

    public static class Builder {
        // required
        private final String firstName;
        private final String lastName;
        private final int age;
        private final int personneId;

        // optional
        private String phone;
        private String address;
        private String mail;

        public Builder(String firstName, String lastName, int age, int personneId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personneId = personneId;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    private Employee(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        personneId = builder.personneId;
        mail = builder.mail;
        phone = builder.phone;
        address = builder.address;
    }

    public static void main(String[] args) {
        Employee e = new Employee.Builder("Akhmim", "Abdelilah", 21, 1)
                .setAddress("Casa").setMail("a@com").setPhone("06").build();

        System.out.println(e);
        System.out.println( e.personneId+e.firstName + e.lastName+ e.age+ e.address + e.phone+ e.mail);
        System.out.println(e.toString());

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
