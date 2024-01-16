package mt2converter;

import java.awt.BorderLayout;
import java.awt.Container;

public class PainelPrincipal extends javax.swing.JPanel {

    public PainelPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new keeptoo.KGradientPanel();
        jButtonM2 = new javax.swing.JButton();
        jButtonMC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        painelPrincipal.setkEndColor(new java.awt.Color(204, 0, 0));
        painelPrincipal.setkGradientFocus(1500);
        painelPrincipal.setkStartColor(new java.awt.Color(0, 0, 250));
        painelPrincipal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                painelPrincipalComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                painelPrincipalComponentRemoved(evt);
            }
        });

        jButtonM2.setBackground(new java.awt.Color(51, 153, 255));
        jButtonM2.setFont(new java.awt.Font("Calibri", 0, 80)); // NOI18N
        jButtonM2.setForeground(new java.awt.Color(0, 0, 0));
        jButtonM2.setText("M\n2");
        jButtonM2.setBorder(null);
        jButtonM2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonM2.setFocusable(false);
        jButtonM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonM2ActionPerformed(evt);
            }
        });

        jButtonMC.setBackground(new java.awt.Color(255, 51, 51));
        jButtonMC.setFont(new java.awt.Font("Calibri", 0, 80)); // NOI18N
        jButtonMC.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMC.setText("MC");
        jButtonMC.setBorder(null);
        jButtonMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMC.setFocusable(false);
        jButtonMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMCActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButtonM2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                .addComponent(jButtonMC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1442, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonM2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
            .addComponent(jButtonMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonM2ActionPerformed
        painelPrincipal.setVisible(false);
        Container container = this.getParent();      
        container.removeAll();
        container.add(new PainelM2(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonM2ActionPerformed

    private void jButtonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMCActionPerformed
        painelPrincipal.setVisible(false);
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelMC(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonMCActionPerformed

    private void painelPrincipalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_painelPrincipalComponentAdded

    }//GEN-LAST:event_painelPrincipalComponentAdded

    private void painelPrincipalComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_painelPrincipalComponentRemoved
       
    }//GEN-LAST:event_painelPrincipalComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonM2;
    private javax.swing.JButton jButtonMC;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
