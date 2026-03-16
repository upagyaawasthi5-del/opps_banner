public class UC6 {

    static String star = "*";
    static String space = " ";

    // Method for O
    static String[] getO() {
        return new String[]{
                String.join("", star, star, star, star, star),
                String.join("", star, space, space, space, star),
                String.join("", star, space, space, space, star),
                String.join("", star, space, space, space, star),
                String.join("", star, star, star, star, star)
        };
    }

    // Method for P
    static String[] getP() {
        return new String[]{
                String.join("", star, star, star, star, space),
                String.join("", star, space, space, star, space),
                String.join("", star, star, star, star, space),
                String.join("", star, space, space, space, space),
                String.join("", star, space, space, space, space)
        };
    }

    // Method for S
    static String[] getS() {
        return new String[]{
                String.join("", star, star, star, star, star),
                String.join("", star, space, space, space, space),
                String.join("", star, star, star, star, star),
                String.join("", space, space, space, space, star),
                String.join("", star, star, star, star, star)
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + "  " +
                    O[i] + "  " +
                    P[i] + "  " +
                    S[i]
            );
        }
    }
}