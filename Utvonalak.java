public class Utvonalak {

    static int legrovidebb(int[] tomb) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
                index = i;
            }
        }

        return index;
    }

}
