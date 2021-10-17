
package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SingInPanel extends javax.swing.JPanel {

    public SingInPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tekst_lb = new javax.swing.JLabel();
        slika_lb = new javax.swing.JLabel();
        sifra_lb = new javax.swing.JLabel();
        korisnicko_ime_lb = new javax.swing.JLabel();
        sifra_pf = new javax.swing.JPasswordField();
        korisnicko_ime_tf = new javax.swing.JTextField();
        uloguj_se_btn = new javax.swing.JButton();


        tekst_lb.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        tekst_lb.setText("KORISNIK");

        slika_lb.setIcon(new javax.swing.ImageIcon("D:\\NetBeans\\ZavrsniProjekat\\slike\\korisnik2.png")); // NOI18N

        sifra_lb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sifra_lb.setText("Sifra");

        korisnicko_ime_lb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        korisnicko_ime_lb.setText("Korisnicko ime");

        uloguj_se_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        uloguj_se_btn.setText("ULOGUJ SE ");
        uloguj_se_btn.setActionCommand("");

               javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(korisnicko_ime_lb)
                    .addComponent(sifra_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uloguj_se_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifra_pf, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(korisnicko_ime_tf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(slika_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(korisnicko_ime_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(korisnicko_ime_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifra_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifra_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(uloguj_se_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(slika_lb))))
        );

        setSize(1000, 600);
        setLocation(100, 10);
        setVisible(true);
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel korisnicko_ime_lb;
    private javax.swing.JTextField korisnicko_ime_tf;
    private javax.swing.JLabel sifra_lb;
    private javax.swing.JPasswordField sifra_pf;
    private javax.swing.JLabel slika_lb;
    private javax.swing.JLabel tekst_lb;
    private javax.swing.JButton uloguj_se_btn;
    // End of variables declaration               

    public JButton getUloguj_se_btn() {
        return uloguj_se_btn;
    }

    public JTextField getKorisnicko_ime_tf() {
        return korisnicko_ime_tf;
    }

    public JPasswordField getSifra_pf() {
        return sifra_pf;
    }

    
}
