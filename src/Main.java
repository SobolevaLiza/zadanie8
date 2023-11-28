import Memento.*;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact(new ContactMemento(""));

        contact.add("2-56-56-56");
        contact.save();
        System.out.println(contact.getPresent());

        contact.add("2-33-33-33");
        contact.save();
        System.out.println(contact.getPresent());

        contact.restore();
        System.out.println(contact.getPresent());
    }
}
