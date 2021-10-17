package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AfterLogInFrame extends javax.swing.JFrame {

    public AfterLogInFrame() {
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

        NakonPrijavljivanjaPanel = new javax.swing.JPanel();
        informacije_o_letu_btn = new javax.swing.JButton();
        dodaj_let_btn = new javax.swing.JButton();
        uplate_btn = new javax.swing.JButton();
        vrati_se_btn = new javax.swing.JButton();
        slika_lb = new javax.swing.JLabel();
        vreme_lb = new javax.swing.JLabel();
        vreme_prikaz_lb = new javax.swing.JLabel();
        datum_prikaz_lb = new javax.swing.JLabel();
        datum_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLIKACIJA ZA REZERVACIJU KARATA");

        NakonPrijavljivanjaPanel.setPreferredSize(new java.awt.Dimension(1400, 749));//1175 629
        NakonPrijavljivanjaPanel.setLayout(null);

        vreme_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        datum_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        vreme_prikaz_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        datum_prikaz_lb.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        vreme_lb.setForeground(Color.red);
        vreme_lb.setText("Vreme");

        datum_lb.setForeground(Color.red);
        datum_lb.setText("Datum");
        vreme_lb.setBounds(50, 670, 100, 50);
        datum_lb.setBounds(1200, 670, 100, 50);
        vreme_prikaz_lb.setBounds(50, 700, 300, 50);
        vreme_prikaz_lb.setForeground(Color.red);

        datum_prikaz_lb.setBounds(1200, 700, 300, 50);
        datum_prikaz_lb.setForeground(Color.red);
        this.add(vreme_lb);
        this.add(vreme_prikaz_lb);
        this.add(datum_lb);
        this.add(datum_prikaz_lb);

        uplate_btn.setBackground(java.awt.Color.BLUE);
        uplate_btn.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        uplate_btn.setText("UPLATE");
        NakonPrijavljivanjaPanel.add(uplate_btn);
        uplate_btn.setBounds(490, 0, 270, 30);

        vrati_se_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        vrati_se_btn.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\AirlineReservationSystem\\slike\\vratise.png")); // NOI18N
        vrati_se_btn.setToolTipText("");
        NakonPrijavljivanjaPanel.add(vrati_se_btn);
        vrati_se_btn.setBounds(780, 0, 270, 30);
        
        
        informacije_o_letu_btn.setBackground(java.awt.Color.BLUE);
        informacije_o_letu_btn.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        informacije_o_letu_btn.setText("INFORMACIJE O LETU");
        NakonPrijavljivanjaPanel.add(informacije_o_letu_btn);
        informacije_o_letu_btn.setBounds(0, 0, 270, 30);

        dodaj_let_btn.setBackground(java.awt.Color.BLUE);
        dodaj_let_btn.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        dodaj_let_btn.setText("DODAJ LET");
        NakonPrijavljivanjaPanel.add(dodaj_let_btn);
        dodaj_let_btn.setBounds(280, 0, 200, 30);

        slika_lb.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\ZavrsniProjekat\\slike\\avion3.PNG")); // NOI18N
        NakonPrijavljivanjaPanel.add(slika_lb);
        slika_lb.setBounds(0, 0, 1400, 749);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NakonPrijavljivanjaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NakonPrijavljivanjaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        this.setSize(1400, 749);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        pack();
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JPanel NakonPrijavljivanjaPanel;
    private javax.swing.JButton informacije_o_letu_btn;
    private javax.swing.JLabel slika_lb;
    private javax.swing.JLabel vreme_lb;
    private javax.swing.JLabel vreme_prikaz_lb;
    private javax.swing.JLabel datum_lb;
    private javax.swing.JLabel datum_prikaz_lb;
    private javax.swing.JButton dodaj_let_btn;
    private javax.swing.JButton uplate_btn;
    private javax.swing.JButton vrati_se_btn;
    // End of variables declaration                 

    public JPanel getNakonPrijavljivanjaPanel() {
        return NakonPrijavljivanjaPanel;
    }

    public JButton getInformacije_o_letu_btn() {
        return informacije_o_letu_btn;
    }

    public JButton getDodaj_let_btn() {
        return dodaj_let_btn;
    }

    public JButton getUplate_btn() {
        return uplate_btn;
    }

    public JButton getVrati_se_btn() {
        return vrati_se_btn;
    }

    
}
