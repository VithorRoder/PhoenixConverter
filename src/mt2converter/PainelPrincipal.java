package mt2converter;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PainelPrincipal extends javax.swing.JPanel {

    public PainelPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonM2 = new javax.swing.JButton();
        jButtonMC = new javax.swing.JButton();
        painelFecharEMinimizar = new javax.swing.JPanel();
        botMinimizar = new javax.swing.JButton();
        botFechar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        painelPrincipal.setkEndColor(new java.awt.Color(204, 0, 0));
        painelPrincipal.setkGradientFocus(1500);
        painelPrincipal.setkStartColor(new java.awt.Color(0, 0, 250));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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

        jButtonMC.setBackground(new java.awt.Color(255, 51, 153));
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

        painelFecharEMinimizar.setOpaque(false);

        botMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        botMinimizar.setText("-");
        botMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMinimizarActionPerformed(evt);
            }
        });

        botFechar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        botFechar.setText("X");
        botFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFecharEMinimizarLayout = new javax.swing.GroupLayout(painelFecharEMinimizar);
        painelFecharEMinimizar.setLayout(painelFecharEMinimizarLayout);
        painelFecharEMinimizarLayout.setHorizontalGroup(
            painelFecharEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFecharEMinimizarLayout.createSequentialGroup()
                .addComponent(botMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelFecharEMinimizarLayout.setVerticalGroup(
            painelFecharEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFecharEMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelFecharEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botMinimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButtonM2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                .addComponent(jButtonMC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(painelFecharEMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonM2, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jButtonMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFecharEMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
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
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelM2(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonM2ActionPerformed

    private void jButtonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMCActionPerformed
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelMC(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonMCActionPerformed

    private void botMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMinimizarActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_botMinimizarActionPerformed

    private void botFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        System.exit(0);
    }//GEN-LAST:event_botFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botFechar;
    public static javax.swing.JButton botMinimizar;
    private javax.swing.JButton jButtonM2;
    private javax.swing.JButton jButtonMC;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel painelFecharEMinimizar;
    private keeptoo.KGradientPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables

}
