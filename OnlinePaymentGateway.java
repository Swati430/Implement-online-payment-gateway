import java.util.Scanner;


class Customer {
    String customerName;
    int accountNumber;
    double balance;

    // Constructor
    Customer(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void displayCustomer() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: ₹" + balance);
    }
}


class PaymentGateway {
    double paymentAmount;


    PaymentGateway(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    void processPayment(Customer c) {
        System.out.println("\nProcessing Payment...");

        if (paymentAmount <= c.balance) {
            c.balance = c.balance - paymentAmount;

            System.out.println("Payment Successful!");
            System.out.println("Paid Amount: ₹" + paymentAmount);
            System.out.println("Remaining Balance: ₹" + c.balance);
            System.out.println("Transaction Confirmed.");
        } else {
            System.out.println("Payment Failed!");
            System.out.println("Insufficient Balance.");
        }
    }
}


public class OnlinePaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Available Balance: ");
        double balance = sc.nextDouble();

        Customer customer = new Customer(name, accNo, balance);

        customer.displayCustomer();

        System.out.print("\nEnter Payment Amount: ");
        double amount = sc.nextDouble();

        PaymentGateway payment = new PaymentGateway(amount);

        payment.processPayment(customer);

        sc.close();
    }
}