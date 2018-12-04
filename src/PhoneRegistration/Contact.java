package PhoneRegistration;

public class Contact implements Comparable<Contact>{

    String contactType;
    String phoneNumber;

    public Contact(String contactType, String phoneNumber) {
        this.contactType = contactType;
        this.phoneNumber = phoneNumber;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public  void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactType='" + contactType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact contact) {
        return this.getContactType().compareTo(contact.getContactType());
    }
}
