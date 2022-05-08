package ProjAedLp2;

public class Person {
    public Person() {
        this.idNumber = idNumber;
        this.name = name;
        this.address = address;
    }



    public Person(String name) {
        this.name = name;
        this.idNumber = "N/A";
        this.address = "N/A";
    }

    private String idNumber;
    private String name;
    private String address;

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static void main(String[] args) {
        Person teste = new Person("Tiago");
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +

                '}';
    }
}