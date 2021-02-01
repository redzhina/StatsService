package ru.netology.stats;

public class StatsService {
//    public long calculate(int[] monthlyValue) {
//        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        int month = 0;
////        int[] values;
//        for (int valueAgain : values) {
//            month = month + 1;
//            // TODO: дальше работаете с value, зная, что номер месяца хранится в month
//        }
//    }

    public long calculateSum(long[] values) {
        long sum = 0; // начинаем с нуля
        for (long value : values) {
            sum += value;
        }
        return sum;
    }

    public long calculateAverage(long[] values) {
        long average = 0;
        for (long value : values) {
            average = (average + value) / 12;
        }
        return average;
    }

    public long findMax(long[] values) {
        long currentMax = values[0];
        for (long value : values) {
            if (currentMax < value) {
                currentMax = value;
            }
        }
        return currentMax;
    }

    public long findMin(long[] values) {
        long currentMin = values[0];
        for (long value : values) {
            if (currentMin > value) {
                currentMin = value;
            }
        }
        return currentMin;
    }

    public long calculateBelowAverage(long[] values) {
        long average = 0;
        for (long value : values) {
            average = (average + value) / 12;
            long belowAverage = values[0];
            if (belowAverage < average) {
                average += 1;
            }
        }
        return average;
    }

    public long calculateOverAverage(long[] values) {
        long average = 0;
        for (long value : values) {
            average = (average + value) / 12;
            long overAverage = values[0];
            if (overAverage > average) {
                average += 1;
            }
        }
    }
}





