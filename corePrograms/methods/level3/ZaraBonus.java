package corePrograms.methods.level3;

/*
 Program to calculate Zara bonus
*/
class ZaraBonus {

    public static double[][] generateData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = Math.random() * 90000 + 10000;
            data[i][1] = Math.random() * 10;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double rate = data[i][1] > 5 ? 0.05 : 0.02;
            result[i][0] = data[i][0] + data[i][0] * rate;
            result[i][1] = data[i][0] * rate;
        }
        return result;
    }
}

