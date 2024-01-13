package enumes;

enum TipodiForma {
    TRIANGOLARE,
    RETTANGOLARE
}

abstract class Forma {
    private TipodiForma tipo;
    public Forma(TipodiForma tipo) {
        this.tipo = tipo;
    }

    public abstract void calcolaArea();
}