/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author dhiva
 */
public class TicketSales extends Tickets {

    public TicketSales(String customerName, String movieTitle, int customerAge, double priceOfMovie) {
        super(customerName, movieTitle, customerAge, priceOfMovie);
    }

    @Override
    public void printTickets() {
        double discount = 0;
        double price = getPriceOfMovie();
        
        // Apply 10% discount if age >= 65
        if (getCustomerAge() >= 65) {
            discount = price * 0.10;
        }
        
        double total = price - discount; 
        
        System.out.println("\nCUSTOMER: " + getCustomerName());
        System.out.println("MOVIE: " + getMovieTitle());
        System.out.println("COST: R" + price);
        System.out.println("DISCOUNT: R" + discount);
        System.out.println("TOTAL: R" + total);
    }
    
    
    
}
