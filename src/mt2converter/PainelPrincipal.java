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

        degradePanel1 = new Utilitários.DegradePanel();
        jLabel6 = new javax.swing.JLabel();
        painelFecharEMinimizar = new javax.swing.JPanel();
        botMinimizar = new javax.swing.JButton();
        botFechar = new javax.swing.JButton();
        jButtonRedondo1 = new Utilitários.JButtonRedondo();
        jButtonRedondo3 = new Utilitários.JButtonRedondo();
        jButtonDiversos = new Utilitários.JButtonRedondo();
        jButtonAcabamentos = new Utilitários.JButtonRedondo();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelFecharEMinimizarLayout.setVerticalGroup(
            painelFecharEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFecharEMinimizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelFecharEMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonRedondo1.setBackground(new java.awt.Color(51, 51, 255));
        jButtonRedondo1.setText("MC");
        jButtonRedondo1.setFont(new java.awt.Font("Stencil", 0, 80)); // NOI18N
        jButtonRedondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondo1ActionPerformed(evt);
            }
        });

        jButtonRedondo3.setBackground(new java.awt.Color(51, 51, 255));
        jButtonRedondo3.setText("M2");
        jButtonRedondo3.setFont(new java.awt.Font("Stencil", 0, 80)); // NOI18N
        jButtonRedondo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRedondo3ActionPerformed(evt);
            }
        });

        jButtonDiversos.setBackground(new java.awt.Color(51, 51, 255));
        jButtonDiversos.setText("Diversos");
        jButtonDiversos.setFont(new java.awt.Font("Stencil", 0, 32)); // NOI18N
        jButtonDiversos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiversosActionPerformed(evt);
            }
        });

        jButtonAcabamentos.setBackground(new java.awt.Color(51, 51, 255));
        jButtonAcabamentos.setText("Acabamentos");
        jButtonAcabamentos.setFont(new java.awt.Font("Stencil", 0, 30)); // NOI18N
        jButtonAcabamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcabamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout degradePanel1Layout = new javax.swing.GroupLayout(degradePanel1);
        degradePanel1.setLayout(degradePanel1Layout);
        degradePanel1Layout.setHorizontalGroup(
            degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(degradePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(degradePanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelFecharEMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(degradePanel1Layout.createSequentialGroup()
                        .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRedondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAcabamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 629, Short.MAX_VALUE)
                        .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRedondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDiversos, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE))
        );
        degradePanel1Layout.setVerticalGroup(
            degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(degradePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelFecharEMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRedondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRedondo3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDiversos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAcabamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(degradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1241, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(degradePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(degradePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMinimizarActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_botMinimizarActionPerformed

    private void botFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botFecharActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        System.exit(0);
    }//GEN-LAST:event_botFecharActionPerformed

    private void jButtonRedondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondo1ActionPerformed
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelMC(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondo1ActionPerformed

    private void jButtonRedondo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRedondo3ActionPerformed
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelM2(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonRedondo3ActionPerformed

    private void jButtonAcabamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcabamentosActionPerformed
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelAcabamentos(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonAcabamentosActionPerformed

    private void jButtonDiversosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiversosActionPerformed
        Container container = this.getParent();
        container.removeAll();
        container.add(new PainelDiversos(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButtonDiversosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botFechar;
    public static javax.swing.JButton botMinimizar;
    private Utilitários.DegradePanel degradePanel1;
    private Utilitários.JButtonRedondo jButtonAcabamentos;
    private Utilitários.JButtonRedondo jButtonDiversos;
    private Utilitários.JButtonRedondo jButtonRedondo1;
    private Utilitários.JButtonRedondo jButtonRedondo3;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel painelFecharEMinimizar;
    // End of variables declaration//GEN-END:variables

}
