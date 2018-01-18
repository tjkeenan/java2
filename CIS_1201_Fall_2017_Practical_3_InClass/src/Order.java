
import java.util.Scanner;

/**
 * Order class will be used to maintain the tickets sales information for the
 * performance hall.
 *
 * @author CIS
 * @since 2016-12-12
 */
public class Order {

    private String name;   //Name of person making the order
    private int numberOfTickets;  //How many tickets they are buying
    private boolean haveHollPassIndicator;    //Are they a student
    private int hollPassNumber;
    private int percentAdjustment;   //Adjustment percent based on ordering details (student, senior, number of tickets)
    private double regularCost;   //Cost of their order based on number of tickets 
    private double cost;   //Cost of their order based on number of tickets and other ordering details

    public static final double PRICE_BASE = 10.0;   //Cost of an individual ticket

    Scanner input = new Scanner(System.in);

    public void processOrder() {
        System.out.println("Enter name:");
        name = input.nextLine();

        System.out.println("Enter number of tickets:");
        numberOfTickets = Integer.parseInt(input.nextLine());

        System.out.println("Do you have a HollPass (yes/no)?");
        //if they entered yes than this boolean will be true, else it will be false
        haveHollPassIndicator = input.nextLine().equalsIgnoreCase("yes");

        //determine regular cost
        regularCost = PRICE_BASE * numberOfTickets;

        if (haveHollPassIndicator) {
            //prompt for HollPass until a valid number is entered (hollPassNumber is true)
            System.out.println("Enter HollPass Number");
            hollPassNumber = Integer.parseInt(input.nextLine());

            while (!HollPass.validate(hollPassNumber)) {
                System.out.println("Invalid HollPass Number, please re-enter");
                hollPassNumber = Integer.parseInt(input.nextLine());
            }

            percentAdjustment = 10;
        }

        //Add group discount
        if (numberOfTickets >= 20) {

            percentAdjustment += 15;

        } else if (numberOfTickets >= 10) {

            percentAdjustment += 10;
        }

        cost = ((double) regularCost * (1 - (double)percentAdjustment / 100));
    }

    //this method calls the toString
    public void display() {

        System.out.println(this.toString());
    }

    @Override
    public String toString() {

        return "\n\nThank-you for your order" + System.lineSeparator()
                + "Name: " + name + System.lineSeparator()
                + "Number of tickets: " + numberOfTickets + System.lineSeparator()
                + "Regular Cost: " + regularCost + System.lineSeparator()
                + "Discount: " + percentAdjustment + "%" + System.lineSeparator()
                + "Cost: $" + cost + System.lineSeparator();

    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getCost() {
        return cost;
    }

}
