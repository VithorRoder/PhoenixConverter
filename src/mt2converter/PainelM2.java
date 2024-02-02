package mt2converter;

import java.awt.BorderLayout;
import java.awt.Container;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class PainelM2 extends javax.swing.JPanel {

    private final NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    private double valorTotalFinal;
    private double valorMinimoFinal;

    public PainelM2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMt2 = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMedida = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabelValorMinimo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPorcentagem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBoxProdutos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSegmento = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1360, 700));
        setMinimumSize(new java.awt.Dimension(1360, 700));
        setPreferredSize(new java.awt.Dimension(1360, 700));

        jPanel1.setBackground(new java.awt.Color(27, 45, 126));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/PhoenixTransp89.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton4.setText("Voltar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("M2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Valor do mt2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantidade");

        jTextFieldMt2.setBorder(null);
        jTextFieldMt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMt2FocusGained(evt);
            }
        });

        jTextFieldQuantidade.setBorder(null);
        jTextFieldQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldQuantidadeFocusGained(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Medidas (LxA cm)");

        jTextFieldMedida.setBorder(null);
        jTextFieldMedida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMedidaFocusGained(evt);
            }
        });

        jButton1.setText("Valor Custo");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Custo");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(70, 73, 75));
        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setBorder(null);
        jTextFieldTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton2.setText("Limpar Campos");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabelValorMinimo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabelValorMinimo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValorMinimo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("% de Venda");

        jTextFieldPorcentagem.setBorder(null);
        jTextFieldPorcentagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPorcentagemFocusGained(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Venda");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(70, 73, 75));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jComboBoxProdutos.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxProdutos.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxProdutos.setToolTipText("");
        jComboBoxProdutos.setFocusable(false);
        jComboBoxProdutos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxProdutosItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Materiais:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Segmento:");

        jComboBoxSegmento.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxSegmento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxSegmento.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSegmento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lonas", "Adesivos", "Banner", "WindBanner" }));
        jComboBoxSegmento.setSelectedIndex(-1);
        jComboBoxSegmento.setFocusable(false);
        jComboBoxSegmento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSegmentoItemStateChanged(evt);
            }
        });
        jComboBoxSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSegmentoActionPerformed(evt);
            }
        });

        jButton3.setText("Valor Venda");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSegmento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBoxSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldMt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(179, 179, 179)
                                        .addComponent(jTextFieldMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMt2FocusGained
        jTextFieldTotal.setText("");
        jTextField2.setText("");
        jLabelValorMinimo.setText("");
    }//GEN-LAST:event_jTextFieldMt2FocusGained

    private void jTextFieldQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeFocusGained
        jTextFieldTotal.setText("");
        jTextField2.setText("");
        jLabelValorMinimo.setText("");
    }//GEN-LAST:event_jTextFieldQuantidadeFocusGained

    private void jTextFieldMedidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMedidaFocusGained
        jTextFieldTotal.setText("");
        jTextField2.setText("");
        jLabelValorMinimo.setText("");
    }//GEN-LAST:event_jTextFieldMedidaFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ("Valor do mt2".equals(jLabel2.getText())) {
            calcularValorTotalMT2();
        } else {
            calcularValorTotalUnitario();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldPorcentagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPorcentagemFocusGained
        jTextField2.setText("");
    }//GEN-LAST:event_jTextFieldPorcentagemFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextFieldTotal.getText() != null && !jTextFieldTotal.getText().isEmpty()) {
            if ("Valor do mt2".equals(jLabel2.getText())) {
                CalculaValorVenda();
            } else if ("Valor Unitário".equals(jLabel2.getText())) {
                CalculaValorVendaUnitario();
            } else {
                JOptionPane.showMessageDialog(this, "Tipo de produto não reconhecido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Valor inválido no campo total custo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxProdutosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxProdutosItemStateChanged
        ifSegmento();
    }//GEN-LAST:event_jComboBoxProdutosItemStateChanged

    private void jComboBoxSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSegmentoActionPerformed
        updateProdutos();
    }//GEN-LAST:event_jComboBoxSegmentoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Container container = this.getParent();
        container.remove(this);
        container.add(new PainelPrincipal(), BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBoxSegmentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSegmentoItemStateChanged
        clearAll3();
    }//GEN-LAST:event_jComboBoxSegmentoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxProdutos;
    private javax.swing.JComboBox<String> jComboBoxSegmento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelValorMinimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldMedida;
    private javax.swing.JTextField jTextFieldMt2;
    private javax.swing.JTextField jTextFieldPorcentagem;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    private boolean validarMedidas(String medidas) {
        String[] valores = medidas.split("x");

        return valores.length == 2;
    }

    private void calcularValorTotalMT2() {
        try {
            double valorMetroQuadrado = Double.parseDouble(jTextFieldMt2.getText().replace(",", "."));

            // Verifica se o campo de quantidade não está vazio e não é negativo ou zero
            if (!jTextFieldQuantidade.getText().isEmpty()) {
                int quantidade = Integer.parseInt(jTextFieldQuantidade.getText());

                // Verifica se a quantidade é maior que zero
                if (quantidade > 0) {
                    String medidas = jTextFieldMedida.getText();

                    // Valida se as medidas estão no formato correto (LxA)
                    if (validarMedidas(medidas)) {
                        String[] dimensoes = medidas.split("x");
                        double largura = Double.parseDouble(dimensoes[0]);
                        double altura = Double.parseDouble(dimensoes[1]);
                        double areaTotalCM2 = largura * altura;

                        // Convertendo a área para metros quadrados
                        double areaTotalM2 = areaTotalCM2 / 10000.0;

                        // Corrigindo a fórmula para considerar a área em metros quadrados
                        double valorTotal = valorMetroQuadrado * areaTotalM2 * quantidade;
                        valorTotalFinal = valorMetroQuadrado * areaTotalM2 * quantidade;
                        valorMinimoFinal = valorMetroQuadrado;
                        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

                        // Definindo o valor total sem formatação
                        if (valorMetroQuadrado >= valorTotal) {
                            jTextFieldTotal.setText(formatoMoeda.format(valorMetroQuadrado));
                            jLabelValorMinimo.setText("Valor Mínimo");
                        } else {
                            jTextFieldTotal.setText(formatoMoeda.format(valorTotal));
                            jLabelValorMinimo.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Formato de medidas inválido. Insira no formato LxA.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "A quantidade deve ser um valor positivo maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, insira um valor para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos em todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularValorTotalUnitario() {
        try {
            double valorUnitario = Double.parseDouble(jTextFieldMt2.getText().replace(",", "."));

            // Verifica se o campo de quantidade não está vazio e não é negativo ou zero
            if (!jTextFieldQuantidade.getText().isEmpty()) {
                int quantidade = Integer.parseInt(jTextFieldQuantidade.getText());

                // Verifica se a quantidade é maior que zero
                if (quantidade > 0) {
                    double valorTotal = valorUnitario * quantidade;
                    jTextFieldTotal.setText(formatoMoeda.format(valorTotal));
                } else {
                    JOptionPane.showMessageDialog(this, "A quantidade deve ser um valor positivo maior que zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, insira um valor para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos em todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double calcularValorTotalVenda(double valorTotal, double porcentagem) {
        return valorTotal + (valorTotal * (porcentagem / 100));
    }

    private void CalculaValorVenda() {
        try {
            double valorTotal = valorTotalFinal;
            double valorMinimo = valorMinimoFinal;

            if (jLabelValorMinimo.getText() != null && !jLabelValorMinimo.getText().isEmpty()) {
                // Use o valor mínimo se estiver disponível
                double porcentagem = Double.parseDouble(jTextFieldPorcentagem.getText().replace(",", "."));

                // Verifica se a porcentagem está entre 50 e 100
                if (porcentagem >= 50 && porcentagem <= 100) {
                    double valorTotalVenda = calcularValorTotalVenda(valorMinimo, porcentagem);
                    jTextField2.setText(formatoMoeda.format(valorTotalVenda));
                } else {
                    JOptionPane.showMessageDialog(this, "Você deve digitar a porcentagem com valores entre 50 e 100!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                // Usa o valor total se o valor mínimo não estiver disponível
                double porcentagem = Double.parseDouble(jTextFieldPorcentagem.getText().replace(",", "."));

                // Verifica se a porcentagem está entre 50 e 100
                if (porcentagem >= 50 && porcentagem <= 100) {
                    double valorTotalVenda = calcularValorTotalVenda(valorTotal, porcentagem);
                    jTextField2.setText(formatoMoeda.format(valorTotalVenda));
                } else {
                    JOptionPane.showMessageDialog(this, "Você deve digitar a porcentagem com valores entre 50 e 100!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CalculaValorVendaUnitario() {
        try {
            double valorUnitario = Double.parseDouble(jTextFieldMt2.getText().replace(",", "."));
            int quantidade = Integer.parseInt(jTextFieldQuantidade.getText());

            // Verifica se a porcentagem está entre 50 e 100
            double porcentagem = Double.parseDouble(jTextFieldPorcentagem.getText().replace(",", "."));
            if (porcentagem >= 50 && porcentagem <= 100) {
                double valorTotalVenda = calcularValorTotalVenda(valorUnitario * quantidade, porcentagem);
                jTextField2.setText(formatoMoeda.format(valorTotalVenda));
            } else {
                JOptionPane.showMessageDialog(this, "Você deve digitar a porcentagem com valores entre 50 e 100!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearAll() {
        jTextFieldMt2.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldMedida.setText("");
        jTextFieldTotal.setText("");
        jTextFieldPorcentagem.setText("");
        jLabelValorMinimo.setText("");
        jTextField2.setText("");
        jComboBoxProdutos.setSelectedItem(null);
        jComboBoxSegmento.setSelectedItem(null);
        jTextFieldMt2.setEditable(true);
        jComboBoxProdutos.removeAllItems();
    }

    private void clearAll2() {
        jTextFieldMt2.setEditable(false);
        jTextFieldTotal.setText("");
        jLabelValorMinimo.setText("");
        jTextField2.setText("");
    }

    private void clearAll3() {
        if ("3 mts (Padrão)".equals(jTextFieldMedida.getText()) && !jTextFieldMedida.isEditable() && "Valor Unitário".equals(jLabel2.getText())) {
            jTextFieldMedida.setEditable(true);
            jTextFieldMedida.setText("");
            jLabel2.setText("Valor do mt2");
        }
    }

    private void itemComboBoxValuesLonas() {
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();
        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,50");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,50");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - BackLigth -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("33,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - BackLigth -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("36,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Ortofônica Sanet -  Impressão Solvente - 4/0 - 260g":
                    jTextFieldMt2.setText("50,00");
                    clearAll2();
                    break;
                case "Lona c Bainha e ilhós - Ortofônica Sanet -  Impressão UV - 4/0 - 260g":
                    jTextFieldMt2.setText("50,00");
                    clearAll2();
                    break;
                case "Lona c Bainha + Corda + ilhós - Brilho -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Lona c Bainha + Corda + ilhós - Fosco -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Lona c Bainha + Corda + ilhós - Brilho -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("37,00");
                    clearAll2();
                    break;
                case "Lona c Bainha + Corda + ilhós - Fosco -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("37,00");
                    clearAll2();
                    break;
                case "Lona Frente e Verso Acoplada + Bainha e ilhós - Brilho -  Impressão Solvente - 4/4 - 440g":
                    jTextFieldMt2.setText("67,01");
                    clearAll2();
                    break;
                case "Lona Frente e Verso Acoplada + Bainha e ilhós - Fosco -  Impressão Solvente - 4/4 - 440g":
                    jTextFieldMt2.setText("67,01");
                    clearAll2();
                    break;
                case "Lona Frente e Verso Acoplada + Bainha e ilhós - Brilho -  Impressão UV - 4/4 - 440g":
                    jTextFieldMt2.setText("67,01");
                    clearAll2();
                    break;
                case "Lona Frente e Verso Acoplada + Bainha e ilhós - Fosco -  Impressão UV - 4/4 - 440g":
                    jTextFieldMt2.setText("67,01");
                    clearAll2();
                    break;

            }
        }
    }

    private void itemComboBoxValuesAdesivos() {
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();
        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "Adesivo - Brilho -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Adesivo - Brilho -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Adesivo - Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("43,00");
                    clearAll2();
                    break;
                case "Adesivo - Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("43,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("37,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("50,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("52,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("37,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("50,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("52,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - PF":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - MicroPerfurado -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - Jateado -  Impressão Solvente - 4/0 - GF":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Adesivo - Jateado -  Impressão Solvente - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo - Brilho -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Adesivo - Brilho -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("43,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Adesivo - Fosco -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("43,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("38,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Brilho -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("53,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("38,00");
                    clearAll2();
                    break;
                case "Adesivo - Blackout Fosco -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("53,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("33,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Brilho -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("33,00");
                    clearAll2();
                    break;
                case "Adesivo - Transparente Fosco -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo - MicroPerfurado -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("42,00");
                    clearAll2();
                    break;
                case "Adesivo - Jateado -  Impressão UV - 4/0 - GF":
                    jTextFieldMt2.setText("40,00");
                    clearAll2();
                    break;
                case "Adesivo - Jateado -  Impressão UV - 4/0 - GF + Recorte Especial":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;

                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case "Adesivo + Branco - Transparente Brilho - Impressão UV - 5/0":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo + Branco - Transparente Fosco - Impressão UV - 5/0":
                    jTextFieldMt2.setText("45,00");
                    clearAll2();
                    break;
                case "Adesivo + Branco - Transparente Brilho - Impressão UV - 5/0 + Recorte Especial":
                    jTextFieldMt2.setText("57,00");
                    clearAll2();
                    break;
                case "Adesivo + Branco - Transparente Fosco - Impressão UV - 5/0 + Recorte Especial":
                    jTextFieldMt2.setText("57,00");
                    clearAll2();
                    break;
                case "Adesivo + Branco - Jateado - Impressão UV - 5/0 + Recorte Especial":
                    jTextFieldMt2.setText("90,00");
                    clearAll2();
                    break;

                default:
                    jTextFieldMt2.setText("");
                    jTextFieldMt2.setEditable(true);
                    break;
            }
        }
    }

    private void itemComboBoxValuesBanner() {
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();
        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                ///// Solvente ////////////////////////////////////////////////////////////
                case "Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 380g":
                    jTextFieldMt2.setText("28,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 440g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                ///// UV //////////////////////////////////////////////////////////////////////////////
                case "Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 280g":
                    jTextFieldMt2.setText("29,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 380g":
                    jTextFieldMt2.setText("31,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 440g":
                    jTextFieldMt2.setText("34,00");
                    clearAll2();
                    break;
                ///// Látex //////////////////////////////////////////////////////////////////////////////
                case "Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 280g":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 440g":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 280g":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 440g":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 280g":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 440g":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 280g":
                    jTextFieldMt2.setText("30,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 380g":
                    jTextFieldMt2.setText("32,00");
                    clearAll2();
                    break;
                case "Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 440g":
                    jTextFieldMt2.setText("35,00");
                    clearAll2();
                    break;
                default:
                    jTextFieldMt2.setText("");
                    jTextFieldMt2.setEditable(true);
                    break;
            }
        }
    }

    private void itemComboBoxValuesWindBanner() {

        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();
        if (itemSelecionado != null) {
            jTextFieldMedida.setEditable(false);
            jTextFieldMedida.setText("3 mts (Padrão)");
            jLabel2.setText("Valor Unitário");
            switch (itemSelecionado.toString()) {
                case "WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Faca":
                    jTextFieldMt2.setText("225,00");
                    clearAll2();
                    break;
                case "WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Gota":
                    jTextFieldMt2.setText("225,00");
                    clearAll2();
                    break;
                case "WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Pena":
                    jTextFieldMt2.setText("225,00");
                    clearAll2();
                    break;
                case "WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Vela":
                    jTextFieldMt2.setText("225,00");
                    clearAll2();
                    break;
                case "WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Faca":
                    jTextFieldMt2.setText("100,00");
                    clearAll2();
                    break;
                case "WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Gota":
                    jTextFieldMt2.setText("100,01");
                    clearAll2();
                    break;
                case "WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Pena":
                    jTextFieldMt2.setText("100,01");
                    clearAll2();
                    break;
                case "WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Vela":
                    jTextFieldMt2.setText("100,01");
                    clearAll2();
                    break;
                default:
                    jTextFieldMt2.setText("");
                    jTextFieldMt2.setEditable(true);
                    break;
            }
        }
    }

    private void updateProdutos() {
        Object selectedSegment = jComboBoxSegmento.getSelectedItem();

        // Verifica se o item selecionado não é nulo
        if (selectedSegment != null) {
            String segmentoSelecionado = selectedSegment.toString();
            jComboBoxProdutos.removeAllItems();

            switch (segmentoSelecionado) {
                case "Lonas":
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Brilho -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Fosca -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - BackLigth -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - BackLigth -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Ortofônica Sanet -  Impressão Solvente - 4/0 - 260g");
                    jComboBoxProdutos.addItem("Lona c Bainha e ilhós - Ortofônica Sanet -  Impressão UV - 4/0 - 260g");
                    jComboBoxProdutos.addItem("Lona c Bainha + Corda + ilhós - Brilho -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha + Corda + ilhós - Fosco -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha + Corda + ilhós - Brilho -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona c Bainha + Corda + ilhós - Fosco -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Lona Frente e Verso Acoplada + Bainha e ilhós - Brilho -  Impressão Solvente - 4/4 - 440g");
                    jComboBoxProdutos.addItem("Lona Frente e Verso Acoplada + Bainha e ilhós - Fosco -  Impressão Solvente - 4/4 - 440g");
                    jComboBoxProdutos.addItem("Lona Frente e Verso Acoplada + Bainha e ilhós - Brilho -  Impressão UV - 4/4 - 440g");
                    jComboBoxProdutos.addItem("Lona Frente e Verso Acoplada + Bainha e ilhós - Fosco -  Impressão UV - 4/4 - 440g");
                    // Adicione outros produtos para o segmento M2 conforme necessário
                    break;
                case "Adesivos":
                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - PF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão Solvente - 4/0 - PF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - MicroPerfurado -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Jateado -  Impressão Solvente - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Jateado -  Impressão Solvente - 4/0 - GF + Recorte Especial");

                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Brilho -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Fosco -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Brilho -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Blackout Fosco -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Brilho -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Transparente Fosco -  Impressão UV - 4/0 - GF + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo - MicroPerfurado -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Jateado -  Impressão UV - 4/0 - GF");
                    jComboBoxProdutos.addItem("Adesivo - Jateado -  Impressão UV - 4/0 - GF + Recorte Especial");

                    jComboBoxProdutos.addItem("Adesivo + Branco - Transparente Brilho - Impressão UV - 5/0");
                    jComboBoxProdutos.addItem("Adesivo + Branco - Transparente Fosco - Impressão UV - 5/0");
                    jComboBoxProdutos.addItem("Adesivo + Branco - Transparente Brilho - Impressão UV - 5/0 + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo + Branco - Transparente Fosco - Impressão UV - 5/0 + Recorte Especial");
                    jComboBoxProdutos.addItem("Adesivo + Branco - Jateado - Impressão UV - 5/0 + Recorte Especial");
                    // Adicione outros produtos para o segmento MC conforme necessário
                    break;
                case "Banner":
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Solvente - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Solvente - 4/0 - 440g");

                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão UV - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão UV - 4/0 - 440g");

                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Fosco -  Impressão Látex - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Brilho -  Impressão Látex - 4/0 - 440g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 380g");
                    jComboBoxProdutos.addItem("Banner Faixa + Tubetes nas Laterais - Fosco -  Impressão Látex - 4/0 - 440g");
                    // Adicione outros casos para segmentos adicionais, se aplicável
                    break;
                case "WindBanner":
                    jComboBoxProdutos.addItem("WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Faca");//225
                    jComboBoxProdutos.addItem("WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Gota");//225
                    jComboBoxProdutos.addItem("WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Pena");//225
                    jComboBoxProdutos.addItem("WindBanner Base + Haste - 3mts + Costura - Sublimação - Tecido Oxford - Formato Vela");//225
                    jComboBoxProdutos.addItem("WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Faca");//100
                    jComboBoxProdutos.addItem("WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Gota");//100,01
                    jComboBoxProdutos.addItem("WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Pena");//100,01
                    jComboBoxProdutos.addItem("WindBanner Base Somente Tecido - 3mts + Costura - Sublimação - Tecido Oxford - Formato Vela");//100,01
                    // Adicione outros casos para segmentos adicionais, se aplicável
                    break;
                default:
            }
        }
    }

    private void ifSegmento() {
        if (jComboBoxSegmento.getSelectedItem() == "Lonas") {
            itemComboBoxValuesLonas();
        } else if (jComboBoxSegmento.getSelectedItem() == "Adesivos") {
            itemComboBoxValuesAdesivos();
        } else if (jComboBoxSegmento.getSelectedItem() == "Banner") {
            itemComboBoxValuesBanner();
        } else if (jComboBoxSegmento.getSelectedItem() == "WindBanner") {
            itemComboBoxValuesWindBanner();
        }
    }

}
