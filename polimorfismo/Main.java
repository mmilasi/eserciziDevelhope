package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(2, 5);
        rettangolo1.calcolaArea();
        Triangolo triangolo1 = new Triangolo(4, 6);
        triangolo1.calcolaArea();

    }
}
