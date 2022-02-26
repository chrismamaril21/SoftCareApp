package com.example.softcareapplicationproject;

public class Patient {

    private String name;
    private String email;
    private String age;
    private String phone;
    private String weight;
    private String height;
    private String temperature;

    public Patient(String name,String email,String age,String phone,String weight,String height,String temperature)
    {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.weight = weight;
        this.height = height;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
