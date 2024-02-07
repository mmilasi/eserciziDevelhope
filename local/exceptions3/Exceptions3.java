package local.exceptions3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exceptions3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            ifDividesBy0(y);
        } catch (ArithmeticException | IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean ifDividesBy0(int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Non puoi dividere per \"0\"");
        }
        return true;
    }
}
