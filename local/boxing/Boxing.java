package local.boxing;

public class Boxing {
    public static void main(String[] args) {
        stampaSomma(2,6);
        stampaChar('A');
        stampaInteger(8,9);
        stampaCharacter('B');

        int primNum = 5;
        Integer objNum = primNum;
        double primDouble = 3.14;
        Double doubleObj = primDouble;
        char primChar = 'A';
        Character charObj = primChar;

        int unboxedInt = objNum;
        double unboxedDouble = doubleObj;
        char unboxedChar = charObj;

        System.out.println("Unboxed elements:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Char: " + unboxedChar);

    }

    public static void stampaSomma(int a, int b) {
        System.out.println(a+b);
    }
    public static void stampaChar(char a) {
        System.out.println(a);
    }
    public static void stampaInteger(Integer a, Integer b) {
        System.out.println(a+b);
    }
    public static void stampaCharacter(Character a) {
        System.out.println(a);
    }

}
