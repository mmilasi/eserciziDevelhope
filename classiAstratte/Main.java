package classiAstratte;

public class Main {
    public static void main (String[] args) {
        Triangolo triangolo = new Triangolo(5, 6);
        System.out.println("L'area del triangolo è " + triangolo.calcolaArea()  + " cm2.");
        Rettangolo rettangolo = new Rettangolo(3, 7);
        System.out.println("L'area del rettangolo è " + rettangolo.calcolaArea() + " cm2.");
    }
}
