package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @ParameterizedTest
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int [] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculate(value);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    void shouldCalculateAverage() {
        StatsService service = new StatsService():

        int [] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculate(average);

        assertEquals(expected, actual);

    }

}
