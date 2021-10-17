/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import base.DBQuery;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Flight;
import model.User;
import model.Payment;
import model.Reservations;
import view.AddFlightPanel;
import view.InformationAboutFlightPanel;
import view.InformationAboutFlightPanel1;
import view.AfterLogInFrame;
import view.PaymentPanel;
import view.FirstFrame;
import view.SingInPanel;
import view.RegistrationPanel;
import view.PaymentsPanel;

/**
 *
 * @author Nikola
 */

public class Controller {

    private FirstFrame firstFrame;
    private RegistrationPanel registrationPanel;
    private SingInPanel singInPanel;
    private AfterLogInFrame afterLoginFrame;
    private InformationAboutFlightPanel panelInf;
    private InformationAboutFlightPanel1 panelInf1;
    private AddFlightPanel addFlightPanel;
    private PaymentPanel paymentPanel;
    private PaymentsPanel paymentsPanel;

    public Controller(FirstFrame okvir) {
        this.firstFrame = okvir;
        dodajSlusacRegistracija();
        dodajSlusacPrijavljivanje();
    }

    private void validacijaUnosa(RegistrationPanel panel) {
        panel.getIme_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                super.keyReleased(ke);
                panel.getIme_tf().setBackground(Color.white);

                Pattern p = Pattern.compile("^[a-zA-Z]+$");
                Matcher m = p.matcher(panel.getIme_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Niste dobro uneli ime, moze da sadrzi samo slova!");
                    panel.getIme_tf().setText("");
                }

            }

        }
        );

        panel.getPrezime_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                panel.getPrezime_tf().setBackground(Color.white);

                Pattern p = Pattern.compile("^[a-zA-Z]+$");
                Matcher m = p.matcher(panel.getPrezime_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Niste dobro uneli prezime, moze da sadrzi samo slova!");
                    panel.getPrezime_tf().setText("");
                }

            }
        }
        );

        panel.getEmail_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                panel.getEmail_tf().setBackground(Color.white);

                Pattern p = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-@]+$");//
                Matcher m = p.matcher(panel.getEmail_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Vas e-mail moze da sadrazi slova,brojeve i karaktere");
                    panel.getEmail_tf().setText("");
                }

            }
        }
        );
        panel.getKorisnicko_ime_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                panel.getKorisnicko_ime_tf().setBackground(Color.white);
            }
        }
        );

        panel.getLozinka_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                panel.getLozinka_tf().setBackground(Color.white);
            }
        }
        );

    }

    private void validacijaUnosa(AddFlightPanel dodajLetPanel) {
        dodajLetPanel.getDatum_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                dodajLetPanel.getDatum_tf().setBackground(Color.white);
            }
        }
        );

        dodajLetPanel.getVreme_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                dodajLetPanel.getVreme_tf().setBackground(Color.white);
            }
        }
        );

        dodajLetPanel.getCena_karte_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                dodajLetPanel.getCena_karte_tf().setBackground(Color.white);
            }
        }
        );

    }

    public void validacijaUnosa(PaymentPanel placanje) {
        placanje.getBroj_kartice_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getBroj_kartice_tf().setBackground(Color.white);

            }
        }
        );

        placanje.getMesec_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getMesec_tf().setBackground(Color.white);
            }
        }
        );

        placanje.getCvv_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getCvv_tf().setBackground(Color.white);
            }
        }
        );

        placanje.getGodina_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getGodina_tf().setBackground(Color.white);
            }
        }
        );

        placanje.getTip_kartice_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getTip_kartice_tf().setBackground(Color.white);
                Pattern p = Pattern.compile("^[a-zA-Z]+$");
                Matcher m = p.matcher(placanje.getTip_kartice_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Niste dobro uneli tip kartice, moze sadrzati samo slova");
                    placanje.getTip_kartice_tf().setText("");
                }

            }
        }
        );

        placanje.getIme_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getIme_tf().setBackground(Color.white);
                Pattern p = Pattern.compile("^[a-zA-Z]+$");
                Matcher m = p.matcher(placanje.getIme_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Niste dobro uneli ime, moze da sadrzi samo slova!");
                    placanje.getIme_tf().setText("");
                }
            }

        }
        );

        placanje.getPrezime_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getPrezime_tf().setBackground(Color.white);
                Pattern p = Pattern.compile("^[a-zA-Z]+$");
                Matcher m = p.matcher(placanje.getPrezime_tf().getText());

                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Niste dobro uneli prezime, moze da sadrzi samo slova!");
                    placanje.getPrezime_tf().setText("");
                }
            }

        }
        );

        placanje.getEmail_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getEmail_tf().setBackground(Color.white);
                Pattern p = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-@]+$");
                Matcher m = p.matcher(placanje.getEmail_tf().getText());
                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Vas email moze sadrzati slova, brojeve i specificne karaktere ");
                    placanje.getEmail_tf().setText("");
                }
            }
        }
        );

        placanje.getBroj_pasosa_tf().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                placanje.getBroj_pasosa_tf().setBackground(Color.white);
                Pattern p = Pattern.compile("^[0-9]+$");
                Matcher m = p.matcher(placanje.getBroj_pasosa_tf().getText());
                if (!m.matches()) {
                    JOptionPane.showMessageDialog(null, "Moze da sadrzi samo broj");
                    placanje.getBroj_pasosa_tf().setText("");
                }
            }
        }
        );

    }

    private void dodajSlusacRegistracija() {
        firstFrame.getRegistrujtese_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                // System.out.println("desio se klik na reg bt");
                firstFrame.getPocetniPanel().setVisible(false);
                registrationPanel = new RegistrationPanel();
                validacijaUnosa(registrationPanel);
                firstFrame.add(registrationPanel);
                dodajSlusacRegistrujSe(registrationPanel);

            }
        }
        );

    }

    private void dodajSlusacRegistrujSe(RegistrationPanel panel) {

        panel.getRegistruj_se_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {

                if (panel.getIme_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje");
                    panel.getIme_tf().setBackground(Color.red);

                } else if (panel.getPrezime_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje");
                    panel.getPrezime_tf().setBackground(Color.red);

                } else if (panel.getEmail_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje");
                    panel.getEmail_tf().setBackground(Color.red);

                } else if (panel.getKorisnicko_ime_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje");
                    panel.getKorisnicko_ime_tf().setBackground(Color.red);

                } else if (panel.getLozinka_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje");
                    panel.getLozinka_tf().setBackground(Color.red);
                } else {
                    try {
                        User u = new User(panel.getIme_tf().getText(), panel.getPrezime_tf().getText(), panel.getEmail_tf().getText(), panel.getKorisnicko_ime_tf().getText(), panel.getLozinka_tf().getText());
                        DBQuery.addUser(u);
                        JOptionPane.showMessageDialog(null, "uspesno registrovan korisnik");
                        panel.setVisible(false);
                        firstFrame.getPocetniPanel().setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        );
    }

    private void dodajSlusacPrijavljivanje() {
        firstFrame.getUlogujte_se_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // System.out.println("desio se klik na log bt");
                firstFrame.getPocetniPanel().setVisible(false);
                singInPanel = new SingInPanel();
                firstFrame.add(singInPanel);
                dodajSlusacPrijaviSe(singInPanel);
            }

        }
        );

    }

    private void dodajSlusacPrijaviSe(SingInPanel prijavljivanje_panel) {
        prijavljivanje_panel.getUloguj_se_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                //  System.out.println("Desio se klik na logujse bt");
                String korisnickoIme = prijavljivanje_panel.getKorisnicko_ime_tf().getText();
                String sifra = prijavljivanje_panel.getSifra_pf().getText();
                User u = new User();
                u.setUsername(korisnickoIme);
                u.setPassword(sifra);

                if (prijavljivanje_panel.getKorisnicko_ime_tf().getText().trim().isEmpty() && prijavljivanje_panel.getSifra_pf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazna polja");
                } else if (prijavljivanje_panel.getKorisnicko_ime_tf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje korisnicko ime");
                } else if (prijavljivanje_panel.getSifra_pf().getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "prazno polje za lozinku");

                } else {
                    try {
                        boolean ok = DBQuery.checkUser(u);

                        if (ok) {
                            if (korisnickoIme.equals("admin") && sifra.equals("admin")) {
                                JOptionPane.showMessageDialog(null, "Uspesno ste se ulogovali kao administrator!");
                                firstFrame.dispose();
                                afterLoginFrame = new AfterLogInFrame();
                                dodajSlusacDodajLet(afterLoginFrame);
                                dodajSlusacInformacijeOLetu(afterLoginFrame);
                                dodajSlusacUplate(afterLoginFrame);
                                dodajSlusacVratiSeOkvir1(afterLoginFrame);

                            } else {
                                JOptionPane.showMessageDialog(firstFrame, "Uspesno ste se ulogovali!");
                                prijavljivanje_panel.setVisible(false);
                                panelInf = new InformationAboutFlightPanel();
                                User user = DBQuery.loadUser(korisnickoIme);
                                ArrayList<Flight> flights = DBQuery.loadFlight();
                                panelInf.getKorisnik_lb().setText("Korisnik : " + user.getName() + " " + user.getLast_name());
                                prikaziLetove(flights);
                                firstFrame.add(panelInf);
                                dodajSlusacTabela(panelInf);
                                dodajSlusacRezervisi(panelInf);
                                dodajSlusacPonisti(panelInf);

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Greska, probajte ponovo!");
                            prijavljivanje_panel.getKorisnicko_ime_tf().setText("");
                            prijavljivanje_panel.getSifra_pf().setText("");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        );
    }

    private void dodajSlusacDodajLet(AfterLogInFrame okvir1) {
        okvir1.getDodaj_let_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                okvir1.getNakonPrijavljivanjaPanel().setVisible(false);
                addFlightPanel = new AddFlightPanel();
                okvir1.add(addFlightPanel);
                validacijaUnosa(addFlightPanel);
                dodajSlusacSacuvaj(addFlightPanel);
                dodajSlusacPonisti(addFlightPanel);
            }

        }
        );

    }

    private void dodajSlusacInformacijeOLetu(AfterLogInFrame okvir1) {
        okvir1.getInformacije_o_letu_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                okvir1.getNakonPrijavljivanjaPanel().setVisible(false);
                panelInf1 = new InformationAboutFlightPanel1();
                ArrayList<Flight> flights = DBQuery.loadFlight();
                prikaziLetove1(flights);
                okvir1.add(panelInf1);
                dodajSlusacTabela1(panelInf1);
                dodajSlusacAzurirajLet(panelInf1);
                dodajSlusacPonisti(panelInf1);
            }

        }
        );

    }

    private void dodajSlusacUplate(AfterLogInFrame nakonPrijavljivanjaOkvir) {
        nakonPrijavljivanjaOkvir.getUplate_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                nakonPrijavljivanjaOkvir.getNakonPrijavljivanjaPanel().setVisible(false);
                paymentsPanel = new PaymentsPanel();
                ArrayList<Payment> payments = DBQuery.paymentList();
                prikaziUplate(payments);
                nakonPrijavljivanjaOkvir.add(paymentsPanel);
                dodajSlusacVratiSe(paymentsPanel);
            }

        }
        );
    }

    private void dodajSlusacVratiSe(PaymentsPanel uplatePanel) {
        uplatePanel.getVrati_se_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                uplatePanel.setVisible(false);
                afterLoginFrame.getNakonPrijavljivanjaPanel().setVisible(true);

            }

        }
        );
    }

    private void dodajSlusacVratiSeOkvir1(AfterLogInFrame nakonPrijavljivanjaOkvir) {
        nakonPrijavljivanjaOkvir.getVrati_se_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                nakonPrijavljivanjaOkvir.setVisible(false);//getNakonPrijavljivanjaPanel()
                firstFrame.setVisible(true);

            }

        }
        );
    }

    private void dodajSlusacPonisti(InformationAboutFlightPanel1 panelInf1) {
        panelInf1.getPonisti_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                panelInf1.setVisible(false);
                afterLoginFrame.getNakonPrijavljivanjaPanel().setVisible(true);
            }

        }
        );
    }

    private void dodajSlusacPonisti(AddFlightPanel dodajLetPanel) {
        dodajLetPanel.getPonisti_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // System.out.println("Desio se klik na sac baton");
                dodajLetPanel.setVisible(false);
                afterLoginFrame.getNakonPrijavljivanjaPanel().setVisible(true);

            }
        }
        );
    }

    private void dodajSlusacSacuvaj(AddFlightPanel dodajLetPanel) {

        dodajLetPanel.getSacuvaj_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // System.out.println("Desio se klik na sac baton");
                try {
                    Flight flight = new Flight(dodajLetPanel.getBr_leta_tf().getText(), dodajLetPanel.getAvio_komp_tf().getText(), dodajLetPanel.getOd_grada_tf().getText(), dodajLetPanel.getDo_grada_tf().getText(), dodajLetPanel.getDatum_tf().getText(), dodajLetPanel.getVreme_tf().getText(), dodajLetPanel.getCena_karte_tf().getText(), dodajLetPanel.getKlasa_tf().getText());
                    DBQuery.addFlight(flight);
                    dodajLetPanel.setVisible(false);
                    afterLoginFrame.getNakonPrijavljivanjaPanel().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        );
    }

    private void dodajSlusacAzurirajLet(InformationAboutFlightPanel1 panelInf1) {
        panelInf1.getAzuriraj_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                //System.out.println("desio se klik na azuriraj but");
                Flight f = new Flight(panelInf1.getBr_leta_tf().getText(), panelInf1.getAvio_komp_tf().getText(), panelInf1.getOd_grada_tf().getText(), panelInf1.getDo_grada_tf().getText(), panelInf1.getDatum_tf().getText(), panelInf1.getVreme_tf().getText(), panelInf1.getCena_karte_tf().getText(), panelInf1.getKlasa_tf().getText());
                DBQuery.updateFlight(f);
                dodajSlusacTabela2(panelInf1);
            }

        });

    }

    private void dodajSlusacRezervisi(InformationAboutFlightPanel panelInf) {
        panelInf.getRezervisi_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    Reservations reservation = new Reservations(panelInf.getBr_leta_tf().getText(), panelInf.getAvio_komp_tf().getText(), panelInf.getOd_grada_tf().getText(), panelInf.getDo_grada_tf().getText(), panelInf.getDatum_tf().getText(), panelInf.getVreme_tf().getText(), panelInf.getCena_karte_tf().getText(), panelInf.getKlasa_tf().getText());
                    DBQuery.addReservation(reservation);
                    panelInf.setVisible(false);
                    paymentPanel = new PaymentPanel();
                    validacijaUnosa(paymentPanel);
                    ArrayList<Reservations> reservations = DBQuery.loadReservations();
                    prikaziLetovePlacanje(reservations);
                    firstFrame.add(paymentPanel);
                    dodajSlusacUplati(paymentPanel);
                    dodajSlusacOtkazi(paymentPanel);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
        );

    }

    private void dodajSlusacPonisti(InformationAboutFlightPanel panelInf) {
        panelInf.getPonisti_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                panelInf.setVisible(false);
                firstFrame.getPocetniPanel().setVisible(true);
            }

        }
        );
    }

    private void dodajSlusacUplati(PaymentPanel placanjePanel) {
        placanjePanel.getPlati_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int odgovor = JOptionPane.showConfirmDialog(placanjePanel, "Da li sigurno zelite da izvrsite uplatu?", "Potvrdi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (odgovor == JOptionPane.YES_OPTION) {
                    if (placanjePanel.getIme_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getIme_tf().setBackground(Color.red);

                    } else if (placanjePanel.getPrezime_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getPrezime_tf().setBackground(Color.red);

                    } else if (placanjePanel.getEmail_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getEmail_tf().setBackground(Color.red);

                    } else if (placanjePanel.getBroj_pasosa_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getBroj_pasosa_tf().setBackground(Color.red);

                    } else if (placanjePanel.getBroj_kartice_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getBroj_kartice_tf().setBackground(Color.red);
                    } else if (placanjePanel.getMesec_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getMesec_tf().setBackground(Color.red);
                    } else if (placanjePanel.getGodina_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getGodina_tf().setBackground(Color.red);
                    } else if (placanjePanel.getCvv_tf().getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "prazno polje");
                        placanjePanel.getCvv_tf().setBackground(Color.red);
                    } else {
                        try {
                            Payment payment = new Payment(placanjePanel.getIme_tf().getText(), placanjePanel.getPrezime_tf().getText(), placanjePanel.getEmail_tf().getText(), placanjePanel.getBroj_pasosa_tf().getText(), placanjePanel.getBroj_kartice_tf().getText(), placanjePanel.getTip_kartice_tf().getText(), placanjePanel.getMesec_tf().getText(), placanjePanel.getGodina_tf().getText(), placanjePanel.getCvv_tf().getText());
                            DBQuery.addPayment(payment);
                            JOptionPane.showMessageDialog(null, "Uspesno ste uplatili Vas let!");
                            placanjePanel.setVisible(false);
                            firstFrame.getPocetniPanel().setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                }
            }

        }
        );

    }

    private void dodajSlusacOtkazi(PaymentPanel placanjePanel) {
        placanjePanel.getOtkazi_btn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                placanjePanel.setVisible(false);
                firstFrame.getPocetniPanel().setVisible(true);
            }

        }
        );

    }

    private void prikaziLetove(ArrayList<Flight> flights) {
        DefaultTableModel model = (DefaultTableModel) panelInf.getTabelaLetovi().getModel();
        for (int i = 0; i < flights.size(); i++) {
            String flightNum = flights.get(i).getFlight_number();
            String airline = flights.get(i).getAirline();
            String fromCity = flights.get(i).getFrom_city();
            String toCity = flights.get(i).getTo_city();
            String date = flights.get(i).getDate();
            String time = flights.get(i).getTime();
            String ticketPrice = flights.get(i).getTicket_price();
            String classFlight = flights.get(i).getClass_flight();
            Object[] row = {flightNum, airline, fromCity, toCity, date, time, ticketPrice, classFlight};
            model.addRow(row);

        }
    }

    private void dodajSlusacTabela(InformationAboutFlightPanel panelInf) {
        panelInf.getTabelaLetovi().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int i = panelInf.getTabelaLetovi().getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) panelInf.getTabelaLetovi().getModel();
                panelInf.getBr_leta_tf().setText(model.getValueAt(i, 0).toString());
                panelInf.getAvio_komp_tf().setText(model.getValueAt(i, 1).toString());
                panelInf.getOd_grada_tf().setText(model.getValueAt(i, 2).toString());
                panelInf.getDo_grada_tf().setText(model.getValueAt(i, 3).toString());
                panelInf.getDatum_tf().setText(model.getValueAt(i, 4).toString());
                panelInf.getVreme_tf().setText(model.getValueAt(i, 5).toString());
                panelInf.getCena_karte_tf().setText(model.getValueAt(i, 6).toString());
                panelInf.getKlasa_tf().setText(model.getValueAt(i, 7).toString());
            }

        });

    }

    private void prikaziLetove1(ArrayList<Flight> flights) {
        DefaultTableModel model = (DefaultTableModel) panelInf1.getTabelaLetovi().getModel();
        for (int i = 0; i < flights.size(); i++) {
            String flightNum = flights.get(i).getFlight_number();
            String airline = flights.get(i).getAirline();
            String fromCity = flights.get(i).getFrom_city();
            String toCity = flights.get(i).getTo_city();
            String date = flights.get(i).getDate();
            String time = flights.get(i).getTime();
            String ticketPrice = flights.get(i).getTicket_price();
            String classFlight = flights.get(i).getClass_flight();
            Object[] row = {flightNum, airline, fromCity, toCity, date, time, ticketPrice, classFlight};
            model.addRow(row);

        }
    }

    private void dodajSlusacTabela1(InformationAboutFlightPanel1 panelInf1) {
        panelInf1.getTabelaLetovi().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                int i = panelInf1.getTabelaLetovi().getSelectedRow();

                DefaultTableModel model = (DefaultTableModel) panelInf1.getTabelaLetovi().getModel();
                panelInf1.getBr_leta_tf().setText(model.getValueAt(i, 0).toString());
                panelInf1.getAvio_komp_tf().setText(model.getValueAt(i, 1).toString());
                panelInf1.getOd_grada_tf().setText(model.getValueAt(i, 2).toString());
                panelInf1.getDo_grada_tf().setText(model.getValueAt(i, 3).toString());
                panelInf1.getDatum_tf().setText(model.getValueAt(i, 4).toString());
                panelInf1.getVreme_tf().setText(model.getValueAt(i, 5).toString());
                panelInf1.getCena_karte_tf().setText(model.getValueAt(i, 6).toString());
                panelInf1.getKlasa_tf().setText(model.getValueAt(i, 7).toString());
            }

        });

    }

    private void dodajSlusacTabela2(InformationAboutFlightPanel1 panelInf1) {

        int i = panelInf1.getTabelaLetovi().getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) panelInf1.getTabelaLetovi().getModel();
        model.setValueAt(panelInf1.getBr_leta_tf().getText(), i, 0);
        model.setValueAt(panelInf1.getAvio_komp_tf().getText(), i, 1);
        model.setValueAt(panelInf1.getOd_grada_tf().getText(), i, 2);
        model.setValueAt(panelInf1.getDo_grada_tf().getText(), i, 3);
        model.setValueAt(panelInf1.getDatum_tf().getText(), i, 4);
        model.setValueAt(panelInf1.getVreme_tf().getText(), i, 5);
        model.setValueAt(panelInf1.getCena_karte_tf().getText(), i, 6);
        model.setValueAt(panelInf1.getKlasa_tf().getText(), i, 7);
    }

    private void prikaziLetovePlacanje(ArrayList<Reservations> reservations) {
        DefaultTableModel model = (DefaultTableModel) paymentPanel.getTabelaLetovi().getModel();
        for (int i = 0; i < reservations.size(); i++) {
            String flightNum = reservations.get(i).getFlight_number();
            String airline = reservations.get(i).getAirline();
            String fromCity = reservations.get(i).getFrom_city();
            String toCity = reservations.get(i).getTo_city();
            String date = reservations.get(i).getDate();
            String time = reservations.get(i).getTime();
            String ticketPrice = reservations.get(i).getTicket_price();
            String classFlight = reservations.get(i).getClass_flight();
            Object[] row = {flightNum, airline, fromCity, toCity, date, time, ticketPrice, classFlight};
            model.addRow(row);

        }
    }

    private void prikaziUplate(ArrayList<Payment> payments) {
        DefaultTableModel model = (DefaultTableModel) paymentsPanel.getTabelaLetovi().getModel();
        for (int i = 0; i < payments.size(); i++) {
            String name = payments.get(i).getName();
            String lastName = payments.get(i).getLast_name();
            String email = payments.get(i).getEmail();
            String passportNumber = payments.get(i).getPassport_number();
            String cardNumber = payments.get(i).getCard_number();
            String cardType = payments.get(i).getCard_type();
            String month = payments.get(i).getMonth();
            String year = payments.get(i).getYear();
            String cvv = payments.get(i).getCvv();
            Object[] row = {name, lastName, email, passportNumber, cardNumber, cardType, month, year, cvv};
            model.addRow(row);

        }
    }

}
