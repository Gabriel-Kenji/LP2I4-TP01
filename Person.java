public class Person {
    //GABRIEL KENJI UTIYAMA CB3012069
     name;
    String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
