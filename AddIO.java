package com.addressbook;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class AddIO extends MainIO{
    public static void add_contact() throws IOException {

        File file1 = new File("C:/Users/HP/Desktop/BdzJAVA/AddressBook/src/main/java/com/addressbook/contacts.txt");// we get the file
        BufferedReader reader1 = new BufferedReader(new FileReader(file1)); // we get reader for the file

        OutputStreamWriter writer1 = new OutputStreamWriter(new FileOutputStream("C:/Users/HP/Desktop/BdzJAVA/AddressBook/src/main/java/com/addressbook/contacts.txt", true), "UTF-8");
        BufferedWriter writer = new BufferedWriter(writer1);

        Scanner input = new Scanner(System.in);
        boolean duplicate, valid;
        String currentLine1;
        String firstName = "";
        String lastName = "";
        String Email = "";
        String city = "";
        String state = "";
        String address = "";
        int phoneNumber = -1;
        int zipCode = -1;
        String str;
        System.out.println("Give First Name: ");
        firstName = input.nextLine();
        System.out.println("Give Last name: ");
        lastName = input.nextLine();
        do {           //check for valid input and i loop through the txt file again to check if input is duplicate
            duplicate = false;
            valid = true;
            System.out.println("Give Phone Number: ");
            try {
                phoneNumber = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                valid = false;
                System.out.println("Phone number must be number.");
            }
            while ((currentLine1 = reader1.readLine()) != null) {//check for duplicate
                String[] words1 = currentLine1.split(",");
                if (words1[2].equals(String.valueOf(phoneNumber))) {
                    duplicate = true;
                    System.out.println("Phone must be unique among the contacts.");
                }
            }
            reader1 = new BufferedReader(new FileReader(file1));
        } while (duplicate || !valid);

        do {
            duplicate = false;
            System.out.println("Give E-mail: ");
            Email = input.nextLine();
            while ((currentLine1 = reader1.readLine()) != null) {//check for duplicate
                String[] words1 = currentLine1.split(",");
                if (words1[4].equals(Email)) {
                    duplicate = true;
                    System.out.println("E-mail must be unique among the contacts.");
                }
            }
            reader1 = new BufferedReader(new FileReader(file1));
        } while (duplicate);
        System.out.println("Address: ");
        address = input.nextLine();

        System.out.println("Give City: ");
        city = input.nextLine();

        System.out.println("Give State: ");
        state = input.nextLine();
        System.out.println("Give Zip code: ");
        //zipCode = input.nextInt();
        do {
            valid = true;
            try {
                zipCode = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                System.out.println("Zip code must be a number.");
                valid = false;
            }
        } while (!valid);

        if(Objects.equals(firstName, "") || Objects.equals(lastName, "") || Objects.equals(Email, "")
                || Objects.equals(city, "") || Objects.equals(state, "") || Objects.equals(address, "")
                || phoneNumber == -1 || zipCode == -1) {
            System.out.println("You gave false inputs, adding new contact wasn't successful: ");
        }
        else{
            str = firstName + "," + lastName + "," + String.valueOf(phoneNumber) + "," + "," + Email + "," + address + "," + city + "," + "," + state + "," + String.valueOf(zipCode);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file1, true)));//with these code I add a line at the bottom of the file
            out.println(str);
            out.close();
        }
        //input.close();
        //writer1.close();
        writer.close();
        reader1.close();

    }
}
