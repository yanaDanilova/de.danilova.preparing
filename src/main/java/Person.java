public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;



    public Person(PersonBuilder personBuilder){
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.middleName = personBuilder.middleName;
        this.country = personBuilder.country;
        this.address= personBuilder.address;
        this.phone= personBuilder.phone;
        this.age = personBuilder.age;
        this.gender = personBuilder.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return " fistName: "+
                firstName +"\n lastName: "+
                lastName + "\n middleName: "+
                middleName + "\n country: "+
                country + "\n address: "+
                address + "\n phone: "+
                phone +"\n age: "+
                age + "\n gender: "+
                gender;
    }

    static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;


        public PersonBuilder buildFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder buildLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder buildMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder buildCountry(String country){
            this.country = country;
            return this;
        }


        public PersonBuilder buildAddress(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder buildPhone(String phone){
            this.phone = phone;
            return this;
        }

        public PersonBuilder buildAge(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder buildGender(String gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);

        }

    }
}
