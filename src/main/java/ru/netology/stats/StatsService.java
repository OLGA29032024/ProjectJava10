package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessAverageSales(long[] sales) {
        int count = 0;
        long avarage = averageSales(sales);
        for (long sale : sales) {
            if (sale < avarage) {
                count++;
            }
        }
        return count;
    }

    public int moreAverageSales(long[] sales) {
        int count = 0;
        long avarage = averageSales(sales);
        for (long sale : sales) {
            if (sale > avarage) {
                count++;
            }
        }
        return count;
    }
}
