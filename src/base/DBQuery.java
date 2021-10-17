/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.ArrayList;
import model.Flight;
import model.Payment;
import model.Reservations;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nikola
 */
public class DBQuery {

    public static void addUser(User u) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "insert into User (name,last_name,email,username,password) select name,last_name,email,username,password from User ";
        Query query = sesija.createQuery(upit);
        sesija.save(u);
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }

    }

    public static boolean checkUser(User u) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "from User where username= :username and password =:password";
        Query query = sesija.createQuery(upit);
        query.setParameter("username", u.getUsername());
        query.setParameter("password", u.getPassword());
        User user = (User) query.uniqueResult();
        if (user != null) {
            return true;
        }
        return false;
    }

    public static User loadUser(String username) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();

        sesija.beginTransaction();

        String upit = "from User where username= :username";
        Query query = sesija.createQuery(upit);
        query.setParameter("username", username);

        User user = (User) query.uniqueResult();
        //System.out.println(proizvodi);

        sesija.getTransaction().commit();

        if (sesija.isOpen()) {
            sesija.close();
        }
        return user;
    }

    public static void addReservation(Reservations reservations) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "insert into Reservations (flight_number, airline, from_city, to_city, date, time, ticket_price, class_flight) select flight_number, airline, from_city, to_city, date, time, ticket_price, class_flight from Reservations";
        Query query = sesija.createQuery(upit);
        sesija.save(reservations);
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
    }

    public static void addFlight(Flight flight) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "insert into Flight (flight_number, airline, from_city, to_city, date, time, ticket_price, class_flight) select flight_number, airline, from_city, to_city, date, time, ticket_price, class_flight from Flight";
        Query query = sesija.createQuery(upit);
        sesija.save(flight);
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
    }

    public static void addPayment(Payment payment) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "insert into Payment(name, last_name, email, passport_number, card_number, card_type, month, year, cvv) select name, last_name, email, passport_number, card_number, card_type, month, year, cvv from Payment";
        Query query = sesija.createQuery(upit);
        sesija.save(payment);
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
    }

    public static ArrayList<Flight> loadFlight() {
        ArrayList<Flight> flights = new ArrayList<>();
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "from Flight";
        Query query = sesija.createQuery(upit);
        flights = (ArrayList<Flight>) query.list();
        //System.out.println(flights);  
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
        return flights;
    }

    public static ArrayList<Reservations> loadReservations() {
        ArrayList<Reservations> reservations = new ArrayList<>();
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "from Reservations";
        Query query = sesija.createQuery(upit);
        reservations = (ArrayList<Reservations>) query.list();
        //System.out.println(reservations);      
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
        return reservations;
    }

    public static ArrayList<Payment> paymentList() {
        ArrayList<Payment> payments = new ArrayList<>();
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "from Payment";
        Query query = sesija.createQuery(upit);
        payments = (ArrayList<Payment>) query.list();
        // System.out.println(payments);     
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
        return payments;
    }

    public static void updateFlight(Flight flight) {
        Session sesija = HibernateUtil.getSessionFactory().openSession();
        sesija.beginTransaction();
        String upit = "update Flight set airline=:airline, from_city=:from_city, to_city=:to_city, date=:date, time=:time, ticket_price=:ticket_price, class_flight=:class_flight where flight_number=:flight_number";
        Query query = sesija.createQuery(upit);

        query.setParameter("flight_number", flight.getFlight_number());
        query.setParameter("airline", flight.getAirline());
        query.setParameter("from_city", flight.getFrom_city());
        query.setParameter("to_city", flight.getTo_city());
        query.setParameter("date", flight.getDate());
        query.setParameter("time", flight.getTime());
        query.setParameter("ticket_price", flight.getTicket_price());
        query.setParameter("class_flight", flight.getClass_flight());

        query.executeUpdate();
        sesija.getTransaction().commit();
        if (sesija.isOpen()) {
            sesija.close();
        }
    }

}
