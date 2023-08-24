package pl.globallogic.exercises;

public class ex44MobilePhone {

    private String myNumber;
    private ex44Contacts[] myContacts;

    public ex44MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ex44Contacts[0];
    }

    public boolean addNewContact(ex44Contacts contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        ex44Contacts[] newContacts = new ex44Contacts[myContacts.length + 1];
        System.arraycopy(myContacts, 0, newContacts, 0, myContacts.length);
        newContacts[newContacts.length - 1] = contact;
        myContacts = newContacts;
        return true;
    }

    public boolean updateContact(ex44Contacts oldContact, ex44Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        myContacts[foundPosition] = newContact;
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(ex44Contacts contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        ex44Contacts[] newContacts = new ex44Contacts[myContacts.length - 1];
        System.arraycopy(myContacts, 0, newContacts, 0, foundPosition);
        System.arraycopy(myContacts, foundPosition + 1, newContacts, foundPosition, myContacts.length - foundPosition - 1);
        myContacts = newContacts;
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(ex44Contacts contact) {
        for(int i = 0; i < myContacts.length; i++) {
            if(myContacts[i].getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.length; i++) {
            if(myContacts[i].getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public ex44Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return myContacts[position];
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.length; i++) {
            System.out.println((i+1) + ". " + myContacts[i].getName() + " -> " + myContacts[i].getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        ex44MobilePhone mobilePhone = new ex44MobilePhone("123456789");
        mobilePhone.printContacts();
        ex44Contacts newContact = ex44Contacts.createContact("Tom", "123456789");
        mobilePhone.addNewContact(newContact);
        mobilePhone.printContacts();
        mobilePhone.addNewContact(ex44Contacts.createContact("Tim", "987654321"));
        mobilePhone.addNewContact(ex44Contacts.createContact("Sam", "123123123"));
        mobilePhone.printContacts();
        mobilePhone.updateContact(newContact, ex44Contacts.createContact("Tommy", "111111111"));
        mobilePhone.printContacts();
        mobilePhone.removeContact(newContact);
        mobilePhone.printContacts();
        mobilePhone.removeContact(ex44Contacts.createContact("Someone", "123456789"));
    }

}
