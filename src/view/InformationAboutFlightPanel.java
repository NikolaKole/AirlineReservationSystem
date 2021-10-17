/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author Nikola
 */
public class InformationAboutFlightPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel1
     */

    public InformationAboutFlightPanel() {
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
        br_leta_lb = new javax.swing.JLabel();
        avio_kom_lb = new javax.swing.JLabel();
        od_grada_lb = new javax.swing.JLabel();
        do_grada_lb = new javax.swing.JLabel();
        datum_lb = new javax.swing.JLabel();
        vreme_lb = new javax.swing.JLabel();
        cena_karte_lb = new javax.swing.JLabel();
        klasa_lb = new javax.swing.JLabel();
        br_leta_tf = new javax.swing.JTextField();
        avio_komp_tf = new javax.swing.JTextField();
        od_grada_tf = new javax.swing.JTextField();
        do_grada_tf = new javax.swing.JTextField();
        datum_tf = new javax.swing.JTextField();
        vreme_tf = new javax.swing.JTextField();
        cena_karte_tf = new javax.swing.JTextField();
        klasa_tf = new javax.swing.JTextField();
        rezervisi_btn = new javax.swing.JButton();
        ponisti_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLetovi = new javax.swing.JTable();
        korisnik_lb = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1400, 749));

        tekst_lb.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        tekst_lb.setText("INFORMACIJE O LETU");

        br_leta_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        br_leta_lb.setText("Broj Leta");

        avio_kom_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        avio_kom_lb.setText("Avio Kompanija");

        od_grada_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        od_grada_lb.setText("Od Grada");
        od_grada_lb.setToolTipText("");

        do_grada_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        do_grada_lb.setText("Do Grada");

        datum_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        datum_lb.setText("Datum");

        vreme_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        vreme_lb.setText("Vreme");

        cena_karte_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cena_karte_lb.setText("Cena karte");

        klasa_lb.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        klasa_lb.setText("Klasa");

        rezervisi_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rezervisi_btn.setText("REZERVISI");

        ponisti_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ponisti_btn.setText("PONISTI");
        ponisti_btn.setToolTipText("");

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
        tabelaLetovi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        
        jScrollPane1.setViewportView(tabelaLetovi);

        korisnik_lb.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(rezervisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(ponisti_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(od_grada_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(datum_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vreme_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cena_karte_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(klasa_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(do_grada_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(avio_kom_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(br_leta_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(do_grada_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(od_grada_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(avio_komp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(br_leta_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vreme_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cena_karte_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(klasa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addComponent(jScrollPane1)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(korisnik_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(532, 532, 532))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(korisnik_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(br_leta_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(br_leta_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(avio_kom_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(avio_komp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(od_grada_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(od_grada_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(do_grada_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(do_grada_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(datum_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(datum_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(vreme_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vreme_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cena_karte_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cena_karte_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(klasa_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(klasa_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(rezervisi_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ponisti_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
        );

        setSize(1400,749);
        setLocation(10,0);
        setVisible(true);
    }// </editor-fold>                        


    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel avio_kom_lb;
    private javax.swing.JTextField avio_komp_tf;
    private javax.swing.JLabel br_leta_lb;
    private javax.swing.JTextField br_leta_tf;
    private javax.swing.JLabel cena_karte_lb;
    private javax.swing.JTextField cena_karte_tf;
    private javax.swing.JLabel datum_lb;
    private javax.swing.JTextField datum_tf;
    private javax.swing.JLabel do_grada_lb;
    private javax.swing.JTextField do_grada_tf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLetovi;
    private javax.swing.JTextField klasa_tf;
    private javax.swing.JLabel klasa_lb;
    private javax.swing.JLabel korisnik_lb;
    private javax.swing.JLabel od_grada_lb;
    private javax.swing.JTextField od_grada_tf;
    private javax.swing.JButton ponisti_btn;
    private javax.swing.JButton rezervisi_btn;
    private javax.swing.JLabel tekst_lb;
    private javax.swing.JLabel vreme_lb;
    private javax.swing.JTextField vreme_tf;
    // End of variables declaration             

    public JLabel getKorisnik_lb() {
        return korisnik_lb;
        
        
    }

    public JTextField getAvio_komp_tf() {
        return avio_komp_tf;
    }

    public JTextField getBr_leta_tf() {
        return br_leta_tf;
    }

    public JTextField getCena_karte_tf() {
        return cena_karte_tf;
    }

    public JTextField getDatum_tf() {
        return datum_tf;
    }

    public JTextField getDo_grada_tf() {
        return do_grada_tf;
    }

    public JTextField getKlasa_tf() {
        return klasa_tf;
    }

    public JTextField getOd_grada_tf() {
        return od_grada_tf;
    }

    public JButton getPonisti_btn() {
        return ponisti_btn;
    }

    public JButton getRezervisi_btn() {
        return rezervisi_btn;
    }

    public JTextField getVreme_tf() {
        return vreme_tf;
    }

    public JTable getTabelaLetovi() {
        return tabelaLetovi;
    }

    public void setTabelaLetovi(JTable tabelaLetovi) {
        this.tabelaLetovi = tabelaLetovi;
    }
    
    
    
}
