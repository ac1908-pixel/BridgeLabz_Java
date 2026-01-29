package corePrograms.strings.level2;

/*
 Program to find shortest and longest words
*/
class ShortLongWord {

    // method to find shortest & longest
    public static int[] findShortLong(String[][] data) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIdx = i;
            }
            if (len > max) {
                max = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }
}

