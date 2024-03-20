package me.alex4386.gachon.sw14462.day06;

public class GradeStatistics extends IntegerStatistics {

    int aCount = 0;
    int bCount = 0;
    int cCount = 0;
    int dCount = 0;
    int fCount = 0;

    public GradeStatistics() {
        total = 0;
        count = 0;
    }

    @Override
    public boolean add(int value) throws IllegalArgumentException {
        if (value > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }

        boolean isValid = super.add(value);
        if (isValid) {
            switch (value / 10) {
                case 10:
                case 9:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }
        }
        return false;
    }

    public int getACount() {
        return aCount;
    }

    public int getBCount() {
        return bCount;
    }

    public int getCCount() {
        return cCount;
    }

    public int getDCount() {
        return dCount;
    }

    public int getFCount() {
        return fCount;
    }
}
