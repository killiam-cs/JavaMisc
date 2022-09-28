public class JavaMisc {

    int z = 3; // scope

    int[][] someNumbers;

    public static void main(String[] args) {
        JavaMisc j = new JavaMisc();
        j.loop();
//        j.arrays();
    }

    public JavaMisc() {
        int z = 10;
//        System.out.println(z);
//        System.out.println(this.z);
    }

    public void loop() {
        for (int z = 42; z < 50; z++) {
            if (z % 2 == 1) {
//                break;
                continue;
            }
            System.out.println(z);
        } // end of loop
        System.out.println("the loop is over");
//        System.out.println(z);
    }

    public void arrays() {
        System.out.println("we are in the arrays method");
        someNumbers = new int[][] { {17, 31, 46} };
        System.out.println(someNumbers.length);
        int x = someNumbers[0][1];
        System.out.println(x);
    }
}
