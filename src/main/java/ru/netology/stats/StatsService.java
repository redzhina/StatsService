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
        long sum = 0; // начинаем с нуля
        long average = 0;
        for (long value : values) {
            sum += value;
            average = sum / 12;
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




