package local.nullability;

public class Nullability {
    public static void main(String[] args) {

        Integer a = 20;
        Integer b = 10;
        try {
            int result = division(a, b);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            a = null;
            b = 5;
            int result = division(a, b);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }



    }

    public static int division(Integer a, Integer b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException("Value is null!");
        }
        return a/b;
    }
}

