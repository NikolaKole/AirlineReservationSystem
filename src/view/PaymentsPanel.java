/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import javax.swing.JButton;
import javax.swing.JTable;


/**
 *
 * @author Nikola
 */
public class PaymentsPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel1
     */
    public PaymentsPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tekst_lb = new javax.swing.JLabel();
        vrati_se_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLetovi = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1400, 749));

        tekst_lb.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        tekst_lb.setText("UPLATE");

        vrati_se_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        vrati_se_btn.setIcon(new javax.swing.ImageIcon("D:\\NetBeansProjects\\AirlineReservationSystem\\slike\\vratise.png")); // NOI18N
        vrati_se_btn.setToolTipText("");

        tabelaLetovi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Ime", "Prezime", "Email", "Broj pasosa", "Broj kartice", "Tip kartice", "Mesec", "Godina", "CVV"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                true, true, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaLetovi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(611, 611, 611)
                                .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(208, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(vrati_se_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tekst_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(vrati_se_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(402, Short.MAX_VALUE))
        );
        setSize(1400, 749);
        setLocation(10, 0);
        setVisible(true);
    }// </editor-fold>                      

    public JButton getVrati_se_btn() {
        return vrati_se_btn;
    }

    public JTable getTabelaLetovi() {
        return tabelaLetovi;
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLetovi;
    private javax.swing.JLabel tekst_lb;
    private javax.swing.JButton vrati_se_btn;
    // End of variables declaration                   
}
