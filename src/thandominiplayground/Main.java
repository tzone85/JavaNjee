package thandominiplayground;

public class Main {
    public static void main(String [] args){
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 3.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 4.0));
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 5.0));
//
        for(int i = 2; i  <= 8; i++){
            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}
