package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void testAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvg = 15;
        int actualAvg = service.averageSales(sales);
        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    void testPeakSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 6;
        int actualMaxMonth = service.peakSalesMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    void testLowSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.lowSalesMonth(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    void testBelowAverageCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.belowAverageCount(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    void testAboveAverageCount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.aboveAverageCount(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
