package Memento;

public class ContactMemento {
    private final String contactStatus;

    public ContactMemento(String contactStatus) {
        this.contactStatus = contactStatus;
    }

    public String getStatus() {
        return contactStatus;
    }
}
