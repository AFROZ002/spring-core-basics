package AutoWiringWithJavaBasedConfiguration;


import org.springframework.beans.factory.annotation.Autowired;

public  class Student {
    private  String  name;
    private  int  age;
    @Autowired
    private  Address  address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    public  void displayInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Address: " + address);
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }


}