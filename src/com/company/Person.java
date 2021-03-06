package com.company;

public class Person {
    protected String name;
    protected String address;
    protected String cnp;
    protected Integer age;

    public Person(String name, String address, String cnp, Integer age) {
        this.name = name;
        this.address = address;
        this.cnp = cnp;
        this.age = age;
    }

    public String toCSV(){
        return name + "," + address + "," + cnp + "," + age.toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cnp='" + cnp + '\'' +
                ", age=" + age +
                '}';
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
