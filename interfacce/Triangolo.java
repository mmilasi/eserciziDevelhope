package interfacce;

class Triangolo implements Forma{
    @Override
    public void calcolareArea() {
        System.out.println("L'area del triangolo si calcola moltiplicando la base per altezza diviso 2.");
    }
}
