
import java.util.Scanner;

/**
 * This is the main class for the performance hall application. It will control
 * the program execution.
 *
 * @author CIS
 * @since 2016-12-12
 */
public class PerformancHallMain {

    public static final String MENU = "Florence Simmons Hall Ticket Office Application"
            + "\n1) Make an order for tickets"
            + "\n2) Show summary"
            + "\n0) Exit";

    private static double totalSales;     //static attribute holds total sales amount from all orders
    private static int numberOfSeatsSold; //static attribute to hold the number of seats available for purchase
    private static int userChoice;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Order order;

        do {

            System.out.println(MENU);
            userChoice = Integer.parseInt(input.nextLine());

            if (userChoice != 0) {

                switch (userChoice) {
                    case 1:
                        order = new Order();
                        order.processOrder();
                        order.display();
                        numberOfSeatsSold += order.getNumberOfTickets();
                        totalSales += order.getCost();
                        break;
                    case 2:
                        showSummary();
                        break;

                    default:
                        System.out.println("Invalid Entry");
                }
            }

        } while (userChoice != 0);
    }
        public static void showSummary(){
        
            String output = "Summary\n"
                    + "Total Sales: $" + totalSales + "\n"
                    + "tickets Sold: " + numberOfSeatsSold + "\n"
                    + "Average Cost: $" + (totalSales/numberOfSeatsSold) + System.lineSeparator();
            System.out.println(output);
        }
    }

