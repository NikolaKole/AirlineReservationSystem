/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author Nikola
 */
public class PaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel1
     */
    public PaymentPanel() {
        initComponents();
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tekst_lb = new javax.swing.JLabel();
        ime_lb = new javax.swing.JLabel();
        prezime_lb = new javax.swing.JLabel();
        broj_kartice_lb = new javax.swing.JLabel();
        tip_kartice_lb = new javax.swing.JLabel();
        mesec_lb = new javax.swing.JLabel();
        godina_lb = new javax.swing.JLabel();
        cvv_lb = new javax.swing.JLabel();
        email_lb = new javax.swing.JLabel();
        ime_tf = new javax.swing.JTextField();
        prezime_tf = new javax.swing.JTextField();
        broj_kartice_tf = new javax.swing.JTextField("XXXX-XXXX-XXXX-XXXX");
        tip_kartice_tf = new javax.swing.JTextField();
        mesec_tf = new javax.swing.JTextField("XX");
        godina_tf = new javax.swing.JTextField("XXXX");
        cvv_tf = new javax.swing.JTextField("XXX");
        email_tf = new javax.swing.JTextField();
        plati_btn = new javax.swing.JButton();
        otkazi_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLetovi = new javax.swing.JTable();
        korisnik_lb = new javax.swing.JLabel();
        slika_lb = new javax.swing.JLabel();
        broj_pasosa_lb = new javax.swing.JLabel();
        broj_pasosa_tf = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1400, 749));

        tekst_lb.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        tekst_lb.setText("PLACANJE");

        ime_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ime_lb.setText("Ime");

        prezime_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        prezime_lb.setText("Prezime");

        broj_kartice_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        broj_kartice_lb.setText("Broj kartice");
        broj_kartice_lb.setToolTipText("");

        tip_kartice_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        tip_kartice_lb.setText("Tip kartice");

        mesec_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        mesec_lb.setText("Mesec");

        godina_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        godina_lb.setText("Godina");

        cvv_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cvv_lb.setText("CVV");

        email_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        email_lb.setText("Email");

        plati_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        plati_btn.setText("PLATI");

        otkazi_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        otkazi_btn.setText("OTKAZI");
        otkazi_btn.setToolTipText("");

        tabelaLetovi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Broj leta", "Avio kompanija", "Od grada", "Do grada", "Datum", "Vreme", "Cena karte", "Klasa"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                true, true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLetovi);

        korisnik_lb.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N

        slika_lb.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\AirlineReservationSystem\\slike\\placanje.png")); // NOI18N

        broj_pasosa_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        broj_pasosa_lb.setText("Broj pasosa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prezime_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ime_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(broj_pasosa_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(broj_pasosa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(prezime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(tip_kartice_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(broj_kartice_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(mesec_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(godina_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cvv_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(plati_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(otkazi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tip_kartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mesec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(godina_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cvv_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(broj_kartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(77, 77, 77)
                                                                .addComponent(slika_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(49, 49, 49))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(korisnik_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225)
                                .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(korisnik_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(ime_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(ime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(prezime_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(prezime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 22, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 2, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(email_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(broj_pasosa_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(broj_pasosa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(1, 1, 1))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(broj_kartice_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(broj_kartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(27, 27, 27)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(tip_kartice_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(tip_kartice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(38, 38, 38)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mesec_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(mesec_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(godina_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(godina_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cvv_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cvv_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(slika_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(plati_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(otkazi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
        );

        setSize(1400, 749);
        setLocation(10, 0);
        setVisible(true);
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JLabel broj_kartice_lb;
    private javax.swing.JTextField broj_kartice_tf;
    private javax.swing.JLabel broj_pasosa_lb;
    private javax.swing.JTextField broj_pasosa_tf;
    private javax.swing.JLabel cvv_lb;
    private javax.swing.JTextField cvv_tf;
    private javax.swing.JLabel email_lb;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel godina_lb;
    private javax.swing.JTextField godina_tf;
    private javax.swing.JLabel ime_lb;
    private javax.swing.JTextField ime_tf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel korisnik_lb;
    private javax.swing.JLabel mesec_lb;
    private javax.swing.JTextField mesec_tf;
    private javax.swing.JButton otkazi_btn;
    private javax.swing.JButton plati_btn;
    private javax.swing.JLabel prezime_lb;
    private javax.swing.JTextField prezime_tf;
    private javax.swing.JLabel slika_lb;
    private javax.swing.JTable tabelaLetovi;
    private javax.swing.JLabel tekst_lb;
    private javax.swing.JLabel tip_kartice_lb;
    private javax.swing.JTextField tip_kartice_tf;
    // End of variables declaration                

    public JTextField getBroj_kartice_tf() {
        return broj_kartice_tf;
    }

    public JTextField getBroj_pasosa_tf() {
        return broj_pasosa_tf;
    }

    public JTextField getCvv_tf() {
        return cvv_tf;
    }

    public JTextField getEmail_tf() {
        return email_tf;
    }

    public JTextField getGodina_tf() {
        return godina_tf;
    }

    public JTextField getMesec_tf() {
        return mesec_tf;
    }

    public JButton getOtkazi_btn() {
        return otkazi_btn;
    }

    public JButton getPlati_btn() {
        return plati_btn;
    }

    public JTextField getTip_kartice_tf() {
        return tip_kartice_tf;
    }

    public void setEmail_tf(JTextField email_tf) {
        this.email_tf = email_tf;
    }

    public void setIme_tf(JTextField ime_tf) {
        this.ime_tf = ime_tf;
    }

    public void setPrezime_tf(JTextField prezime_tf) {
        this.prezime_tf = prezime_tf;
    }

    public JTextField getIme_tf() {
        return ime_tf;
    }

    public JTextField getPrezime_tf() {
        return prezime_tf;
    }

    public JTable getTabelaLetovi() {
        return tabelaLetovi;
    }

}
