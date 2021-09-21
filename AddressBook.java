package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner scan = new Scanner(System.in);

    public ArrayList<ContactDetails> contactList  = new ArrayList<>();

   public ArrayList<ContactDetails> contactList(ContactDetails contactdetails) {
        contactList.add(contactdetails);
        return contactList;
    }
    public void addContactDetails(){
        System.out.println("Welcome to  Address Book program.");

        AddressBook addressBook = new AddressBook();
        System.out.println("Enter the First Name: ");
        String firstName = scan.next();
        System.out.println("Enter the Last Name: ");
        String lastName = scan.next();
        System.out.println("Enter your Address: ");
        String address = scan.next();
        System.out.println("Enter your city: ");
        String city = scan.next();
        System.out.println("Enter your state : ");
        String state = scan.next();
        System.out.println("Enter email id: ");
        String email = scan.next();
        System.out.println(" Enter phone number: ");
        String phoneNumber = scan.next();
        System.out.println("Enter zip: ");
        String zip = scan.next();

        ContactDetails contactDetails = new ContactDetails(firstName,lastName,address,city,state,email,phoneNumber,zip);
        contactDetails.add(contactDetails);
    }
}
