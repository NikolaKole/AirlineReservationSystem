/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Nikola
 */
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int flight_id;
    private String flight_number, airline,from_city,to_city,date,time,ticket_price,class_flight;

    public Flight() {
    }

    public Flight(String flight_number, String airline, String from_city, String to_city, String date, String time, String ticket_price, String class_flight) {
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

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTicket_price(String ticket_price) {
        this.ticket_price = ticket_price;
    }

    public void setClass_flight(String class_flight) {
        this.class_flight = class_flight;
    }

    @Override
    public String toString() {
        return "Flight{" + "flight_id=" + flight_id + ", flight_number=" + flight_number + ", airline=" + airline + ", from_city=" + from_city + ", to_city=" + to_city + ", date=" + date + ", time=" + time + ", ticket_price=" + ticket_price + ", class_flight=" + class_flight + '}';
    }
    
    
    
}
