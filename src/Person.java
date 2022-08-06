public class Person {
    private final String name;
    private final String surName;
    private int numberOfTickets;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
        this.numberOfTickets = 0;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void decrementNumberOfTickets() {
        if (numberOfTickets > 0) {
            numberOfTickets--;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
