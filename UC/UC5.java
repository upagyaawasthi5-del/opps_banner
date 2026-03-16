public class UC5 {

    public static void main(String[] args) {

        String a = "*";
        String s = " ";

        String[] banner = {
                String.join("", a, a, a, a, a),
                String.join("", a, s, s, s, a),
                String.join("", a, s, s, s, a),
                String.join("", a, s, s, s, a),
                String.join("", a, a, a, a, a)
        };

        for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }
    }
}