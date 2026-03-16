import java.util.HashMap;
import java.util.Map;

class UC8 {

    static String star = "*";
    static String space = " ";

    static Map<Character, String[]> patternMap = new HashMap<>();


    // Function to load patterns
    static void loadPatterns() {

        patternMap.put('O', new String[]{
                String.join("", star, star, star, star, star),
                String.join("", star, space, space, space, star),
                String.join("", star, space, space, space, star),
                String.join("", star, space, space, space, star),
                String.join("", star, star, star, star, star)
        });

        patternMap.put('P', new String[]{
                String.join("", star, star, star, star, space),
                String.join("", star, space, space, star, space),
                String.join("", star, star, star, star, space),
                String.join("", star, space, space, space, space),
                String.join("", star, space, space, space, space)
        });

        patternMap.put('S', new String[]{
                String.join("", star, star, star, star, star),
                String.join("", star, space, space, space, space),
                String.join("", star, star, star, star, star),
                String.join("", space, space, space, space, star),
                String.join("", star, star, star, star, star)
        });
    }


    // Function to render banner
    static void renderBanner(String word) {

        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }


    public static void main(String[] args) {

        loadPatterns();

        renderBanner("OOPS");
    }
}