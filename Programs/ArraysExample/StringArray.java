public class StringArray
{
    public static void main(final String[] args) {
        final String[] names = getNames();
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i].charAt(0));
            }

        }
    }

    public static String[] getNames() {
        final String[] names = new String[6];
        names[0] = "Anushka";
        names[1] = "Silky";
        names[2] = "Farhin";
        names[3] = "Pragati";
        names[4] = "Ruchi";

        return names;

    }
}
