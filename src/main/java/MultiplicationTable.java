public class MultiplicationTable {
    public static void main(String[] args) {
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                int c = a * b;
                if (c <= 9)
                {
                    System.out.print(" ");
                }
                System.out.print(c + "  ");


            }
            System.out.println(" ");
        }


    }
}

