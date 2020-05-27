package com.gmail.alitunja27;

public class Contacts {

    private String name;
    private String phone;

    public Contacts(){
    }

    public Contacts(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
