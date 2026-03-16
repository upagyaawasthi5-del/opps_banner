class UC7 {

    static String star = "*";
    static String space = " ";

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap O =
                new CharacterPatternMap('O', new String[]{
                        String.join("", star, star, star, star, star),
                        String.join("", star, space, space, space, star),
                        String.join("", star, space, space, space, star),
                        String.join("", star, space, space, space, star),
                        String.join("", star, star, star, star, star)
                });

        CharacterPatternMap P =
                new CharacterPatternMap('P', new String[]{
                        String.join("", star, star, star, star, space),
                        String.join("", star, space, space, star, space),
                        String.join("", star, star, star, star, space),
                        String.join("", star, space, space, space, space),
                        String.join("", star, space, space, space, space)
                });

        CharacterPatternMap S =
                new CharacterPatternMap('S', new String[]{
                        String.join("", star, star, star, star, star),
                        String.join("", star, space, space, space, space),
                        String.join("", star, star, star, star, star),
                        String.join("", space, space, space, space, star),
                        String.join("", star, star, star, star, star)
                });

        CharacterPatternMap[] word = {O, O, P, S};

        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap c : word) {
                line.append(c.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}