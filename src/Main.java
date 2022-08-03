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
        int deliveryDistance = 300;
        calculationDeliveryDays(deliveryDistance);

    }

    public static void isALeap(int year) { // Metod k zadache 1
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " yavlyaetsa visokosnym");
        } else {
            System.out.println(year + " ne yavlyaetsa visokosnym");

        }
    }

    public static void getClientOSAndYear(int name, int currentYear) { // Metod k zadache 2
        if (name == 0 && currentYear == LocalDate.now().getYear()) {
            System.out.println("Ustanovite obichnuyu versiyu dlya IOS");
        } else if (name == 0 && currentYear != LocalDate.now().getYear()) {
            System.out.println("Ustanovite lite versiyu dlya Ios");
        } else if (name == 1 && currentYear == LocalDate.now().getYear()) {
            System.out.println("Ustanovite obichnuyu versiyu dlya Android");
        } else if (name == 1 && currentYear != LocalDate.now().getYear()) {
            System.out.println("Ustanovite lite versiyu dlya Android");
        } else {
            System.out.println("Vvedite correktnuyu OS");
        }
    }



    public static void calculationDeliveryDays(int distance) { // Metod k zadache 3
        int deliveryDay = 1;
        if (distance < 20) {
            System.out.println("Srok dostavki dney : " + deliveryDay);
        } else if (distance < 60) {
            deliveryDay += 1;
            System.out.println("Srok dostavki dney : " + deliveryDay);
        } else if (distance < 100) {
            deliveryDay += 2;
            System.out.println("Srok dostavki dney : " + deliveryDay);
        } else {
            System.out.println("Dostavka ne osushestvlyaetsya");
        }
    }

}
