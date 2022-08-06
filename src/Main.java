import java.util.*;

public class Main {
    private static final int MAXIMUM_NUMBER_OF_TICKETS = 4;

    public static void main(String[] args) {
        Person person;

        // Генерим список клиентов и раздаем билеты
        List<Person> clients = generateClients();

        Queue<Person> queueForTheRide = new LinkedList<>(clients);

        while (!queueForTheRide.isEmpty()) {
            person = queueForTheRide.poll();
            person.decrementNumberOfTickets();
            System.out.printf("%s %s прокатился на аттракционе (dbg>> %d Tickets left)\n",
                    person.getName(), person.getSurName(), person.getNumberOfTickets());
            if (person.getNumberOfTickets() > 0) {
                queueForTheRide.offer(person);
            }
        }
    }

    static List<Person> generateClients() {
        var random = new Random();
        Person[] clients = new Person[]{
                new Person("Владимир", "Соловьев"),
                new Person("Моника", "Левински"),
                new Person("Напрудил", "Поддиванный"),
                new Person("Холодрыг", "Лопоухий"),
                new Person("Некропетух", "Гавайский")
        };
        // Раздаем билетики
        for (Person person : clients) {
            person.setNumberOfTickets(random.nextInt(MAXIMUM_NUMBER_OF_TICKETS) + 1);
        }
        return Arrays.asList(clients);
    }
}
