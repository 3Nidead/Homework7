public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int requiredSum = 2459000;
        int deposit = 15000;
        double percent = (double) 1 / 100;
        int sum = 0;
        int month = 1;
        while (sum <= requiredSum) {
            month++;
            sum += sum * percent;
            sum += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        int birthratePerThousand = 17;
        int deathRatePerThousand = 8;
        for (int year = 1; year <= 10; year++) {
            population += (birthratePerThousand - deathRatePerThousand) * population / 1000;
            System.out.println("Год " + year + " ,численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        percent = (double) 7 / 100;
        requiredSum = 12_000_000;
        sum = deposit;
        month = 0;
        while (sum < requiredSum) {
            month++;
            sum += sum * percent;
            System.out.println("Месяц" + month + " ,сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("Задача 5");
        sum = deposit;
        month = 0;
        while (sum < requiredSum) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + " ,сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 6");
        sum = deposit;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            month++;
            sum += sum * percent;
            if (month % 6 == 0) {
                System.out.println("Месяц" + month + " ,сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int currentYear = 2024;
        int firstYear = currentYear - 200;
        int lastYear = currentYear + 100;
        int period = 79;
        int startPeriod = 0;
        for (int year = startPeriod; year <= lastYear; year += period) {
            if (year >= firstYear) {
                System.out.println(year);
            }
        }


    }
}