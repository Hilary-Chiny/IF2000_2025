package domain;

public class Person {
// Atributes 
private String name;
private String lastName;
private String id;
private String phone;
private int age;

public Person(String name, String lastName, String id, String phone, int age) {
    this.name = name;
    this.lastName = lastName;
    this.id = id;
    this.phone = phone;
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

@Override
public String toString() {
    return "Person [getName()=" + getName() + ", getLastName()=" + getLastName() + ", getId()=" + getId()
            + ", getPhone()=" + getPhone() + ", getAge()=" + getAge() + "]";
}

}