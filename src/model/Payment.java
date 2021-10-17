/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Nikola
 */
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int payment_id;

    private String name, last_name;
    @Column(unique = true)
    private String email, passport_number, card_number, card_type;
    @Column(length = 2)
    private String month;
    @Column(length = 4)
    private String year;
    @Column(length = 3)
    private String cvv;


    public Payment() {
    }

    public Payment(String name, String last_name, String email, String passport_number, String card_number, String card_type, String month, String year, String cvv) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.passport_number = passport_number;
        this.card_number = card_number;
        this.card_type = card_type;
        this.month = month;
        this.year = year;
        this.cvv = cvv;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public String getCard_number() {
        return card_number;
    }

    public String getCard_type() {
        return card_type;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getCvv() {
        return cvv;
    }

}
