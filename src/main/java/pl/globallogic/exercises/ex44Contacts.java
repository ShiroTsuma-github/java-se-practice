package pl.globallogic.exercises;

public class ex44Contacts {

        private final String name;
        private final String phoneNumber;

        public ex44Contacts(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public static ex44Contacts createContact(String name, String phoneNumber) {
            return new ex44Contacts(name, phoneNumber);
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
}
