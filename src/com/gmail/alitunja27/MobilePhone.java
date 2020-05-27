package com.gmail.alitunja27;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void printList(){
        for(int i=0;i<contactsArrayList.size();i++){
            System.out.println(contactsArrayList.get(i).getName() + " Phone: " + contactsArrayList.get(i).getPhone());
        }
    }

    public void addContact(String name, String phoneNumber){
        if(findContact(name)>0){
            System.out.println(name + " already exists");
        } else {
            contactsArrayList.add(new Contacts(name, phoneNumber));
            System.out.println(name + " was successfully added!");
        }
    }

    public void updateContact(String name){
        boolean checker = true;
        if(findContact(name)<0){
            System.out.println(name + " was not found");
        } else {
            System.out.println("Please enter the new name: ");
            while(checker) {
                String newName = scanner.nextLine();
                if (findContact(newName) < 0) {
                    System.out.println("Please enter the phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    contactsArrayList.set(findContact(name), new Contacts(newName, newPhoneNumber));
                    System.out.println(newName + " was successfully updated!");
                    checker=false;
                } else {
                    System.out.println(newName + " already exist. Please select another name: ");
                }
            }
        }
    }

    public void deleteContact(String name){
        if(findContact(name)<0){
            System.out.println(name + " was not found");
        } else {
            contactsArrayList.remove(findContact(name));
            System.out.println(name + " was successfully removed!");
        }
    }

    private int findContact(String name){
        for(int i=0;i<contactsArrayList.size();i++){
            if(contactsArrayList.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public void printFindContact(String name){
        if(findContact(name)<0){
            System.out.println("Your contact does not exist.");
        } else {
            System.out.println("The phone number for " + name + " is: " + contactsArrayList.get(findContact(name)).getPhone());
        }
    }
}
