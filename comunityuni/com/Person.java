package comunityuni.com;

public class Person {
    protected String ID;
    protected String Name;
    protected int Age;
    protected String Address;

    public Person()
    {}

    public Person(String ID, String name, int age, String address) {
        this.ID = ID;
        Name = name;
        Age = age;
        Address = address;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
