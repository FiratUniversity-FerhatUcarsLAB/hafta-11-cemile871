public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: test methods
        String day = "Sunday";
        String month = "July";
        int date = 14;
        int year = 2016;

        printAmerican (day, date, month, year);
        printEuropean (day, date, month, year); 

        System.out.println("Amerikan Formatı:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println();
        System.out.println("Avrupa Formatı:");
        System.out.println(date + " " + month + " " + year + ", " + day);
 
            
    }
}
