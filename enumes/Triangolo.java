package enumes;

public class Triangolo extends Forma {
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        super(TipodiForma.TRIANGOLARE);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area = 0.5 * base * altezza;
        System.out.println("L'area del triangolo: " + area);
    }
}
