package enumes;

public class Main {
    public static void main (String[] args) {
        Triangolo triangolo = new Triangolo(5, 8);
        Rettangolo rettangolo = new Rettangolo(4, 6);

        triangolo.calcolaArea();
        rettangolo.calcolaArea();
    }
}
