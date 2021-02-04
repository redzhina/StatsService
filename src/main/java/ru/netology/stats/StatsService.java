package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] values) {
        long sum = 0; // начинаем с нуля
        for (long value : values) {
            sum += value;
        }
        return sum;
    }

    public long average(long[] values) {
        long average = calculateSum(values) / 12;
        return average;
    }

    public long findMax(long[] values) {
        long max = 0;
        long maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= max) {
                max = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public long findMin(long[] values) {
        long min = values[0];
        long minIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    

    public long findBelowAverage(long[] values) {
        long belowAverage = 0;
        for (long value : values) {
            if (value < average(values)) {
                belowAverage += 1;
            }
        }
        return belowAverage;
    }

    public long findOverAverage(long[] values) {
        long overAverage = 0;
        for (long value : values) {
            if (value > average(values)) {
                overAverage += 1;
            }
        }
        return overAverage;
    }
}




