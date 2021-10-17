/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Nikola
 */

@Entity
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flight_id;
    private String flight_number, airline, from_city, to_city, date, time, ticket_price, class_flight;
    

    public Reservations() {
    }

    public Reservations(String flight_number, String airline, String from_city, String to_city, String date, String time, String ticket_price, String class_flight) {
        this.flight_number = flight_number;
        this.airline = airline;
        this.from_city = from_city;
        this.to_city = to_city;
        this.date = date;
        this.time = time;
        this.ticket_price = ticket_price;
        this.class_flight = class_flight;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public String getAirline() {
        return airline;
    }

    public String getFrom_city() {
        return from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTicket_price() {
        return ticket_price;
    }

    public String getClass_flight() {
        return class_flight;
    }
    
    
}
