import java.util.Scanner;

public class IT24102967Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerCount = 5;
        double discountRate =  0.05;

        
        for (int i = 1; i <= customerCount; i++) {
            System.out.println("Customer " + i);
            
        
            System.out.print("Enter total bill amount: ");
            double totalBill = scanner.nextDouble();
            
        
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = scanner.next().charAt(0);
            
            double discount = 0;
            double amountToPay = totalBill;
            
        
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * discountRate;
                amountToPay = totalBill - discount;
                System.out.println("Discount is:"+ discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
            } else {
                System.out.println("Payment Mode is Not Valid");
                continue; 
            }
            
    
            System.out.println("Amount to be paid:"+ amountToPay);
            System.out.println();  
        }
        
        scanner.close();
    }
}
