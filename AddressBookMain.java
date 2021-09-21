package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to  Address Book program.");

        AddressBook addressBook = new AddressBook();
        boolean flag = true;
        while (flag){
            System.out.println("1.Add Contact");
            System.out.println("2.Exit");
            System.out.println("Enter Choice: ");

            int option = scan.nextInt();
            switch (option)
            {
                case 1:
                    addressBook.addContactDetails();
                    break;
                case 2:
                    flag = false;
                    break;
            }
        }
    }
}
