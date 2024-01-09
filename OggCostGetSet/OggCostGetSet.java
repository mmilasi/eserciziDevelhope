package OggCostGetSet;

public class OggCostGetSet {
    public static void main(String[] args) {
        Studente student1 = new Studente(1, "Marija", "Milasinovic");
        System.out.println(student1.toString());

        student1.setID(2);
        student1.setName("Paolo");
        student1.setSurname("Conti");

        System.out.println(student1.toString());

        student1.setID(3);
        student1.setName("Pasquale");
        student1.setSurname("Cavallo");

        System.out.println(student1.toString());

    }
}