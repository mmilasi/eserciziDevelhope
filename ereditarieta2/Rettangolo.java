package ereditarieta2;

public class Rettangolo extends Forma {
    private int lato1;
    private int lato2;

    public Rettangolo(int lato1, int lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    @Override
    public void calcolaArea() {
        double area = lato1 * lato2;
        System.out.println("L'area del rettangolo: " + area);
    }
}
