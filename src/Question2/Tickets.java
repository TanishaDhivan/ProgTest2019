/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author dhiva
 */
public abstract class Tickets implements iTickets {
    public String customerName;
    public String movieTitle;
    public int customerAge;
    public double priceOfMovie; 

    public Tickets(String customerName, String movieTitle, int customerAge, double priceOfMovie) {
        this.customerName = customerName;
        this.movieTitle = movieTitle;
        this.customerAge = customerAge;
        this.priceOfMovie = priceOfMovie;
    }
    
    

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public double getPriceOfMovie() {
        return priceOfMovie;
    }
    
    
    
}


