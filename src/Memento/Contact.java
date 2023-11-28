package Memento;


public class Contact {
    private StringBuilder contact;
    private ContactMemento contactMemento;

    public void save() {
        this.contactMemento = new ContactMemento(contact.toString());
    }

    public void add(String text) {
        contact.append(text);
    }

    public void restore() {
        this.contact = new StringBuilder(contactMemento.getStatus());
    }

    public String getPresent() {
        return contactMemento.getStatus();
    }

    public Contact(ContactMemento contactMemento) {
        this.contact = new StringBuilder();
        this.contactMemento = contactMemento;
    }
}
