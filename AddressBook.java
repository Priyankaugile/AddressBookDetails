package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
   public ArrayList<ContactDetails> contactList  = new ArrayList<>();

   public ArrayList<ContactDetails> getContactList (ContactDetails contactdetails){
       contactList.add(contactdetails);
       return contactList;
   }

    public ArrayList<ContactDetails> contactList(ContactDetails contactdetails) {
        return null;
    }
}
