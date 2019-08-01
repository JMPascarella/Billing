import javax.swing.JOptionPane;

/**
 * Billing
 */
public class Billing {

    public static void main(String[] args) {
        
        double pricePerBook = 20.25;
        int orderQuantity = 15;
        double couponAmount = 17.25;
        displayOrder(pricePerBook);
        displayOrder(pricePerBook, orderQuantity);
        displayOrder(pricePerBook, orderQuantity, couponAmount);
    }

    public static void displayOrder(double price) {

        int orderQuantity = 1;
        double couponAmount = 0;
        double amountDue = price * 1.08;

        JOptionPane.showMessageDialog(null, "The order was for $" + price + " per book, for a total of "+ orderQuantity + " book(s), with a coupon worth $" + couponAmount + ", for a total amount due of $"+ amountDue + ".");
    }
    public static void displayOrder(double price, int quantity) {

        double couponAmount = 0;
        double amountDue = price * quantity * 1.08;

        JOptionPane.showMessageDialog(null, "The order was for $" + price + " per book, for a total of "+ quantity + " book(s), with a coupon worth $" + couponAmount + ", for a total amount due of $"+ amountDue + ".");
    }
    public static void displayOrder(double price, int quantity, double coupon) {

        double amountDue = (quantity * price - coupon) * 1.08;

        JOptionPane.showMessageDialog(null, "The order was for $" + price + " per book, for a total of "+ quantity + " book(s), with a coupon worth $" + coupon + ", for a total amount due of $"+ amountDue + ".");
    }
}