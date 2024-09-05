import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkAndPrintLeapYear(2000);
        System.out.println();
        checkAndPrintDeviceType(1,1988);
        System.out.println();
        int days = calculateDeleveryDays(101);
        System.out.printf("Потребуется дней: %s", days);
        if ()
    }

    public static void checkAndPrintLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s год - високосный год", year);
        } else {
            System.out.printf("%s год - невисокосный год", year);
        }
    }
    public static void checkAndPrintDeviceType (int type , int year) {
     int currentYear = LocalDate.now().getYear();
        if (type == 0 && year == currentYear) {
            System.out.printf("Установите версию приложения для iOS по ссылке");
        } else if (type == 0 && year < currentYear) {
            System.out.printf("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year == currentYear) {
            System.out.printf("Установите версию приложения для Android по ссылке");
        } else if (type == 1 && year < currentYear) {
            System.out.printf("Установите облегченную версию приложения для Android по ссылке");

        }
    }
    public static int calculateDeleveryDays (int distance) {
        int days;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        return days;
    }

    }

