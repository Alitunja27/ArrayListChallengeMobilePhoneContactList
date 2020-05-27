package com.gmail.alitunja27;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean option = true;
        printActions();
        while (option){
            System.out.println("\nEnter action (type 7 to show available actions):");
            int optionSelected = scanner.nextInt();
            scanner.nextLine();

            switch (optionSelected){
                case 1:
                    option = false;
                    break;
                case 2:
                    mobilePhone.printList();
                    break;
                case 3:
                    System.out.println("Please enter the name: ");
                    String name = scanner.nextLine();
                    System.out.println("Please enter the phone number: ");
                    String phoneNumber = scanner.nextLine();
                    addContact(name,phoneNumber);
                    break;
                case 4:
                    System.out.println("Which contact do you want to update: ");
                    name = scanner.nextLine();
                    updateContact(name);
                    break;
                case 5:
                    System.out.println("Which contact do you want to delete: ");
                    name = scanner.nextLine();
                    deleteContact(name);
                    break;
                case 6:
                    System.out.println("Which contact do you want to find: ");
                    name = scanner.nextLine();
                    findContact(name);
                    break;
                case 7:
                    printActions();
            }
        }
    }
    public static void printActions(){
        System.out.println("Available actions: ");
        System.out.println("Please select an option: " +
                "\n 1) Quit" +
                "\n 2) Print list of contacts" +
                "\n 3) Add new contact" +
                "\n 4) Update existing contact" +
                "\n 5) Remove contact" +
                "\n 6) Search contact" +
                "\n Choose your option: ");
    }
    public static void addContact(String name, String phoneNumber){
        mobilePhone.addContact(name,phoneNumber);
    }
    public static void updateContact(String name){
        mobilePhone.updateContact(name);
    }
    public static void deleteContact(String name){
        mobilePhone.deleteContact(name);
    }
    public static void findContact(String name){
        mobilePhone.printFindContact(name);
    }
}
