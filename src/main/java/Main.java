import ru.netology.stats.StatsService;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = service.sumSales(sales);
        System.out.println("Сумма продаж: " + sum);

        long avg = service.averageSales(sales);
        System.out.println("Средняя сумма продаж: " + avg);

        int peakMonth = service.peakSalesMonth(sales);
        System.out.println("Пик продаж: " + peakMonth);

        int lowMonth = service.lowSalesMonth(sales);
        System.out.println("Минимум продаж: " + lowMonth);

        int belowAvgCount = service.belowAverageCount(sales);
        System.out.println("Количество месяцев ниже средней: " + belowAvgCount);

        int aboveAvgCount = service.aboveAverageCount(sales);
        System.out.println("Количество месяцев выше средней: " + aboveAvgCount);


    }
}



