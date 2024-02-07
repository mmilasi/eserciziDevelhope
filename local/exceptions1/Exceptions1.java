package local.exceptions1;

    public class Exceptions1 {

        public static void main(String[] args) {
            try {
                int x = 8;
                int min = 10;
                int max = 20;

                if (isInRange(x, min, max)) {
                    System.out.println("Il numero è nel range.");
                } else {
                    System.out.println("Il numero non è nel range.");
                }
            } catch (Exception e) {
                System.out.println("Eccezione: " + e.getMessage());
            }
        }

        public static boolean isInRange(int x, int min, int max) throws Exception {
            if (x < min || x > max) {
                throw new Exception("Il numero non è nel range specificato.");
            }
            return true;
        }


    }

