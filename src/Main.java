import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Zadacha 1
        int year = 2025;
        isALeap(year);

        //Zadacha 2
        int osName = 0;
        int currentYear = 2021;
        getClientOSAndYear(osName, currentYear);

        //Zadacha 3
        int deliveryDistance = 95;
        calculationDeliveryDays(deliveryDistance);

    }

    public static void isALeap(int year) { // Metod k zadache 1
        if (year % 4 == 0) {
            System.out.println(year + " yavlyaetsa visokosnym");
        } else {
            System.out.println(year + " ne yavlyaetsa visokosnym");

        }
    }

    public static void getClientOSAndYear(int name, int currentYear) { // Metod k zadache 2
        if (currentYear == LocalDate.now().getYear()) {
            System.out.print("Ustanovite obichnuyu versiyu");
        } else {
            System.out.print("Ustanovite lite versiyu");
        }
        if (name == 0) {
            System.out.println(" dlya IOS");;
        } else {
            System.out.println(" dlya Androin");
        }
    }


    public static void calculationDeliveryDays(int distance) { // Metod k zadache 3
        int deliveryDay = 1;
        if (distance < 20) {
            System.out.println("Srok dostavki dney : " + deliveryDay);
        } else if (distance >= 20) {
            deliveryDay += 1;
            System.out.println("Srok dostavki dney : " + deliveryDay);
        } else if (distance >= 60) {
            deliveryDay += 2;
            System.out.println("Srok dostavki dney : " + deliveryDay);
        }
    }

}
