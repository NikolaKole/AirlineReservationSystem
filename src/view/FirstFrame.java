package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FirstFrame extends javax.swing.JFrame {

    public FirstFrame() {
        initComponents();
        prikaziDatum();
        prikaziVreme();
    }
    public void prikaziVreme() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss aa");
                vreme_prikaz_lb.setText(s.format(d));
            }
        }).start();
    }

    public void prikaziDatum() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        datum_prikaz_lb.setText(s.format(d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PocetniPanel = new javax.swing.JPanel();
        tekst_lb = new javax.swing.JLabel();
        registrujtese_btn = new javax.swing.JButton();
        ulogujte_se_btn = new javax.swing.JButton();
        slika_lb = new javax.swing.JLabel();
        vreme_lb = new javax.swing.JLabel();
        vreme_prikaz_lb = new javax.swing.JLabel();
        datum_prikaz_lb = new javax.swing.JLabel();
        datum_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKACIJA ZA REZERVACIJU KARATA");

        PocetniPanel.setPreferredSize(new java.awt.Dimension(1400,749));//1175 629
        PocetniPanel.setLayout(null);

        tekst_lb.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        tekst_lb.setText("REZERVACIJA KARATA");
        vreme_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        datum_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vreme_prikaz_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        datum_prikaz_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vreme_lb.setText("Vreme");
        datum_lb.setText("Datum");
        PocetniPanel.add(tekst_lb);
        tekst_lb.setBounds(50, 0, 400, 63);
        vreme_lb.setBounds(50, 670, 100, 50);
        datum_lb.setBounds(1200, 670, 100, 50);
        vreme_prikaz_lb.setBounds(50, 700, 300, 50);
        datum_prikaz_lb.setBounds(1200, 700, 300, 50);
        this.add(vreme_lb);
        this.add(vreme_prikaz_lb);
        this.add(datum_lb);
        this.add(datum_prikaz_lb);
        registrujtese_btn.setBackground(java.awt.Color.cyan);
        registrujtese_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        registrujtese_btn.setText("REGISTRUJTE SE");

        PocetniPanel.add(registrujtese_btn);
        registrujtese_btn.setBounds(410, 110, 230, 40);

        ulogujte_se_btn.setBackground(java.awt.Color.cyan);
        ulogujte_se_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ulogujte_se_btn.setText("ULOGUJTE SE");
        PocetniPanel.add(ulogujte_se_btn);
        ulogujte_se_btn.setBounds(650, 110, 230, 40);

        slika_lb.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\AirlineReservationSystem\\slike\\avion1.PNG")); // NOI18N
        PocetniPanel.add(slika_lb);
        slika_lb.setBounds(0, 0, 1400, 749);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PocetniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PocetniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        this.setSize(1400,749);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        pack();
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JPanel PocetniPanel;
    private javax.swing.JButton registrujtese_btn;
    private javax.swing.JLabel slika_lb;
    private javax.swing.JLabel tekst_lb;
    private javax.swing.JLabel vreme_lb;
    private javax.swing.JLabel vreme_prikaz_lb;
    private javax.swing.JLabel datum_lb;
    private javax.swing.JLabel datum_prikaz_lb;
    private javax.swing.JButton ulogujte_se_btn;
    // End of variables declaration                 

    public JButton getRegistrujtese_btn() {
        return registrujtese_btn;
    }

    public JButton getUlogujte_se_btn() {
        return ulogujte_se_btn;
    }

    public JPanel getPocetniPanel() {
        return PocetniPanel;
    }
    
    
}
