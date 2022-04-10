
package com.company;

public class Information {
private String name, address ,education,username,password;
private String age,phonenumber;

    public  String getName() {

        return name;
    }

    public Information setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Information setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Information setPassword(String password) {
        this.password = password;
        return this;

    }

    public String getAge() {
        return age;
    }

    public Information setAge(String age) {
        this.age = age;
        return this;

    }

    public String getEducation() {
        return education;
    }

    public Information setEducation(String education) {
        this.education = education;
        return this;

    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Information setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;

    }

    public String getAddress() {
        return address;
    }

    public Information setAddress(String address) {
        this.address = address;
        return this;

    }
    public void person(String name, String username, String password,
                       String age, String education, String phonenumber, String address){
        this.name=name;
        this.username=username;
        this.password=password;
        this.age=age;
        this.education=education;
        this.phonenumber=phonenumber;
        this.address=address;
    }
}
