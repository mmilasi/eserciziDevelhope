package enumes;

public class Rettangolo extends Forma {
    private int lato1;
    private int lato2;

    public Rettangolo(int base, int altezza) {
        super(TipodiForma.RETTANGOLARE);
        this.lato1 = base;
        this.lato2 = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = lato1 * lato2;
        System.out.println("L'area del triangolo: " + area);
    }
}