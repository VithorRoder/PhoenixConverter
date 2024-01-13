package mt2converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class PainelMC extends javax.swing.JPanel {

    private double valorAcabamentoM = 0.0;

    public PainelMC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPhoenix = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelValorMinimo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPorcentagem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldVenda = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBoxProdutos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSegmento = new javax.swing.JComboBox<>();
        jComboBoxQuantidade = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jComboBoxAcabamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1360, 700));
        setMinimumSize(new java.awt.Dimension(1360, 700));
        setPreferredSize(new java.awt.Dimension(1360, 700));

        jPanel1.setBackground(new java.awt.Color(82, 82, 82));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabelPhoenix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhoenix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        jLabelPhoenix.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phoenix Gráfica Converter MC");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantidade");

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Developed By Vithor Roder");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
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

        jTextFieldVenda.setEditable(false);
        jTextFieldVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldVenda.setBorder(null);
        jTextFieldVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton3.setText("Valor Venda");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
        jComboBoxSegmento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Visita 250g", "Cartão Verniz Localizado 300g", "Panfletos 70g", "Panfletos 90g", "Panfletos 115g", "Panfletos 150g", "Revistas", "Pastas", "Ventarolas", "Calendários" }));
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

        jComboBoxQuantidade.setBorder(null);
        jComboBoxQuantidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxQuantidadeItemStateChanged(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBoxAcabamento.setBorder(null);
        jComboBoxAcabamento.setFocusable(false);
        jComboBoxAcabamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAcabamentoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Acabamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSegmento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(509, 509, 509)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelPhoenix, javax.swing.GroupLayout.DEFAULT_SIZE, 1355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAcabamento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(620, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelPhoenix, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valores();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.phoenixgrafica.com"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jTextFieldPorcentagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPorcentagemFocusGained
        jTextFieldVenda.setText("");
    }//GEN-LAST:event_jTextFieldPorcentagemFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double resultado = calcularValorFinal();
        if (resultado != 0.0) {
            jTextFieldVenda.setText(String.format("%.2f", resultado));
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

    private void jComboBoxQuantidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxQuantidadeItemStateChanged
        clearAll2();
    }//GEN-LAST:event_jComboBoxQuantidadeItemStateChanged

    private void jComboBoxAcabamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAcabamentoItemStateChanged
        clearAll2();
        valoresAbacamentos();
    }//GEN-LAST:event_jComboBoxAcabamentoItemStateChanged

    private void jComboBoxSegmentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSegmentoItemStateChanged
        clearAll2();
        jComboBoxQuantidade.removeAllItems();
    }//GEN-LAST:event_jComboBoxSegmentoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBoxAcabamento;
    private javax.swing.JComboBox<String> jComboBoxProdutos;
    private javax.swing.JComboBox<String> jComboBoxQuantidade;
    private javax.swing.JComboBox<String> jComboBoxSegmento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPhoenix;
    private javax.swing.JLabel jLabelValorMinimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPorcentagem;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVenda;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
        jTextFieldVenda.setText("");
        jTextFieldTotal.setText("");
        jTextFieldPorcentagem.setText("");
        jComboBoxAcabamento.removeAllItems();
        jComboBoxProdutos.removeAllItems();
        jComboBoxQuantidade.removeAllItems();
        jComboBoxSegmento.setSelectedItem(null);
    }

    private void clearAll2() {
        jTextFieldTotal.setText("");
        jTextFieldVenda.setText("");
    }

    private int getQuantidadeSelecionada() {
        // Obter a quantidade selecionada na jComboBoxQuantidade
        Object quantidadeItem = jComboBoxQuantidade.getSelectedItem();
        Object itemAcabamento = jComboBoxAcabamento.getSelectedItem();
        if (quantidadeItem != null && itemAcabamento != null) {
            try {
                return Integer.parseInt(quantidadeItem.toString().replace(".", "")); // Remover vírgulas, se houver
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Quantidade não é um valor válido.");
            }
        }

        return 0; // Retorna 0 se a quantidade não puder ser convertida para um número
    }

    private void valoresAbacamentos() {
        Object selectedAcabamento = jComboBoxAcabamento.getSelectedItem();
        if (selectedAcabamento == "Dobra") {
            valorAcabamentoM = 10;
        } else if (selectedAcabamento == "Corte Extra") {
            valorAcabamentoM = 0;
        } else if (selectedAcabamento == "Dobra em Cruz") {
            valorAcabamentoM = 15;
        } else if (selectedAcabamento == "Vinco") {
            valorAcabamentoM = 100;
        } else if (selectedAcabamento == "Furo") {
            valorAcabamentoM = 40;
        } else if (selectedAcabamento == "Revista") {
            valorAcabamentoM = 80;
        }
    }

    private void addAcabamentoDobras() {
        jComboBoxAcabamento.removeAllItems();
        jComboBoxAcabamento.addItem(null);
        jComboBoxAcabamento.addItem("Corte Extra");
        jComboBoxAcabamento.addItem("Dobra");
        jComboBoxAcabamento.addItem("Dobra em Cruz");
    }

    private void addAcabamentosCorteExtra() {
        jComboBoxAcabamento.removeAllItems();
        jComboBoxAcabamento.addItem(null);
        jComboBoxAcabamento.addItem("Corte Extra");
    }

    private void addAcabamentosVincoECorteExtra() {
        jComboBoxAcabamento.removeAllItems();
        jComboBoxAcabamento.addItem(null);
        jComboBoxAcabamento.addItem("Vinco");
        jComboBoxAcabamento.addItem("Corte Extra");
    }

    private double calcularValorFinal() {
        // Obtendo os valores das caixas de texto e convertendo para números
        double total;
        try {
            total = Double.parseDouble(jTextFieldTotal.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor total não é válido.");
            return 0.0; // Retorna 0 se o valor total não puder ser convertido para um número
        }

        String porcentagemText = jTextFieldPorcentagem.getText();

        if (porcentagemText == null || porcentagemText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor para a porcentagem.");
            return 0.0; // Retorna 0 se o campo estiver vazio ou null
        }

        double porcentagem;
        try {
            porcentagem = Double.parseDouble(porcentagemText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "A porcentagem não é um valor válido.");
            return 0.0; // Retorna 0 se a porcentagem não puder ser convertida para um número
        }

        if (porcentagem < 50 || porcentagem > 100) {
            JOptionPane.showMessageDialog(null, "Porcentagem deve estar entre 50 e 100.");
            return 0.0; // Retorna 0 se a porcentagem estiver fora do intervalo desejado
        }

        // Calculando o valor final considerando a quantidade
        double valorFinal = total + (total * (porcentagem / 100.0));

        return valorFinal;
    }

    private void updateProdutos() {
        Object selectedSegment = jComboBoxSegmento.getSelectedItem();

        if (selectedSegment != null) {
            String segmentoSelecionado = selectedSegment.toString();
            jComboBoxProdutos.removeAllItems();

            switch (segmentoSelecionado) {
                case "Cartão de Visita 250g":
                    jComboBoxProdutos.addItem("9x5cm 4/0");
                    jComboBoxProdutos.addItem("9x5cm 4/1");
                    jComboBoxProdutos.addItem("9x5cm 4/4");
                    jComboBoxProdutos.addItem("9x10cm 4/0");
                    jComboBoxProdutos.addItem("9x10cm 4/1");
                    jComboBoxProdutos.addItem("9x10cm 4/4");
                    break;
                case "Cartão Verniz Localizado 300g":
                    jComboBoxProdutos.addItem("9x5cm 4/4");
                    jComboBoxProdutos.addItem("9x10cm 4/4");
                    jComboBoxProdutos.addItem("18x5cm 4/4");
                    break;
                case "Panfletos 70g":
                    jComboBoxProdutos.addItem("10x14cm 4/0");
                    jComboBoxProdutos.addItem("10x14cm 4/4");
                    jComboBoxProdutos.addItem("14x20cm 4/0");
                    jComboBoxProdutos.addItem("14x20cm 4/4");
                    jComboBoxProdutos.addItem("20x28cm 4/0");
                    jComboBoxProdutos.addItem("20x28cm 4/4");
                    jComboBoxProdutos.addItem("28x40cm 4/0");
                    jComboBoxProdutos.addItem("28x40cm 4/4");
                    jComboBoxProdutos.addItem("9x20cm 4/0");
                    jComboBoxProdutos.addItem("9x20cm 4/4");
                    jComboBoxProdutos.addItem("18x20cm 4/0");
                    jComboBoxProdutos.addItem("18x20cm 4/4");
                    break;
                case "Panfletos 90g":
                    jComboBoxProdutos.addItem("10x14cm 4/0");
                    jComboBoxProdutos.addItem("10x14cm 4/4");
                    jComboBoxProdutos.addItem("14x20cm 4/0");
                    jComboBoxProdutos.addItem("14x20cm 4/4");
                    jComboBoxProdutos.addItem("20x28cm 4/0");
                    jComboBoxProdutos.addItem("20x28cm 4/4");
                    jComboBoxProdutos.addItem("28x40cm 4/0");
                    jComboBoxProdutos.addItem("28x40cm 4/4");
                    jComboBoxProdutos.addItem("9x20cm 4/0");
                    jComboBoxProdutos.addItem("9x20cm 4/4");
                    jComboBoxProdutos.addItem("18x20cm 4/0");
                    jComboBoxProdutos.addItem("18x20cm 4/4");
                    break;
                case "Panfletos 115g":
                    jComboBoxProdutos.addItem("10x14cm 4/0");
                    jComboBoxProdutos.addItem("10x14cm 4/4");
                    jComboBoxProdutos.addItem("14x20cm 4/0");
                    jComboBoxProdutos.addItem("14x20cm 4/4");
                    jComboBoxProdutos.addItem("20x28cm 4/0");
                    jComboBoxProdutos.addItem("20x28cm 4/4");
                    jComboBoxProdutos.addItem("28x40cm 4/0");
                    jComboBoxProdutos.addItem("28x40cm 4/4");
                    jComboBoxProdutos.addItem("9x20cm 4/0");
                    jComboBoxProdutos.addItem("9x20cm 4/4");
                    jComboBoxProdutos.addItem("18x20cm 4/0");
                    jComboBoxProdutos.addItem("18x20cm 4/4");
                    break;
                case "Panfletos 150g":
                    jComboBoxProdutos.addItem("10x14cm 4/0");
                    jComboBoxProdutos.addItem("10x14cm 4/4");
                    jComboBoxProdutos.addItem("14x20cm 4/0");
                    jComboBoxProdutos.addItem("14x20cm 4/4");
                    jComboBoxProdutos.addItem("20x28cm 4/0");
                    jComboBoxProdutos.addItem("20x28cm 4/4");
                    jComboBoxProdutos.addItem("28x40cm 4/0");
                    jComboBoxProdutos.addItem("28x40cm 4/4");
                    jComboBoxProdutos.addItem("9x20cm 4/0");
                    jComboBoxProdutos.addItem("9x20cm 4/4");
                    jComboBoxProdutos.addItem("18x20cm 4/0");
                    jComboBoxProdutos.addItem("18x20cm 4/4");
                    break;
                case "Revistas":
                    // jComboBoxProdutos.addItem("");
                    break;
                case "Pastas":
                    //  jComboBoxProdutos.addItem("");
                    break;
                case "Ventarolas":
                    // jComboBoxProdutos.addItem("");
                    break;
                case "Calendários":
                    // jComboBoxProdutos.addItem("");
                    break;
                default:
                    break;
            }
        }
    }

    private void ifSegmento() {
        Object selectedSegmento = jComboBoxSegmento.getSelectedItem();

        switch (selectedSegmento.toString()) {
            case "Cartão de Visita 250g":
                itemComboBoxValuesCartao250g();
                break;
            case "Panfletos 70g":
                itemComboBoxValuesPanfletos70g();
                break;
            case "Panfletos 90g":
                itemComboBoxValuesPanfletos90g();
                break;
            case "Panfletos 115g":
                itemComboBoxValuesPanfletos115g();
                break;
            case "Panfletos 150g":
                itemComboBoxValuesPanfletos150g();
                break;
            case "Cartão Verniz Localizado 300g":
                itemComboBoxValuesCartao300g();
                break;
            default:
                // Trate o caso em que nenhum dos valores corresponda
                break;
        }
    }

    private void itemComboBoxValuesCartao250g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "9x5cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x5cm 4/1":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x5cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x10cm 4/0":
                    addAcabamentosVincoECorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x10cm 4/1":
                    addAcabamentosVincoECorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x10cm 4/4":
                    addAcabamentosVincoECorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
            }

        }

    }

    private void itemComboBoxValuesCartao300g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "9x5cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("6.000");
                    jComboBoxQuantidade.addItem("7.000");
                    jComboBoxQuantidade.addItem("8.000");
                    jComboBoxQuantidade.addItem("9.000");
                    jComboBoxQuantidade.addItem("10.000");

                    break;
                case "9x10cm 4/4":
                    addAcabamentosVincoECorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");

                    break;
                case "18x5cm 4/4":
                    addAcabamentosVincoECorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("1.000");
                    jComboBoxQuantidade.addItem("2.000");
                    jComboBoxQuantidade.addItem("3.000");
                    jComboBoxQuantidade.addItem("4.000");
                    jComboBoxQuantidade.addItem("5.000");

                    break;
            }

        }
    }

    private void itemComboBoxValuesPanfletos70g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "10x14cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("90.000");
                    jComboBoxQuantidade.addItem("100.000");
                    break;
                case "10x14cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "14x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("60.000");
                    jComboBoxQuantidade.addItem("100.000");
                    break;
                case "14x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("85.000");
                    break;
                case "20x28cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("60.000");
                    break;
                case "20x28cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("60.000");
                    jComboBoxQuantidade.addItem("70.000");
                    jComboBoxQuantidade.addItem("80.000");
                    break;
                case "28x40cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "28x40cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("60.000");
                    break;
                case "9x20cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("80.000");
                    break;
                case "9x20cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "18x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    break;
                case "18x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    break;
            }
        }
    }

    private void itemComboBoxValuesPanfletos90g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "10x14cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "10x14cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("55.000");
                    break;
                case "14x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "14x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("40.000");
                    break;
                case "20x28cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "20x28cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    break;
                case "28x40cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "28x40cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "9x20cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "9x20cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("60.000");
                    break;
                case "18x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "18x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
            }
        }
    }

    private void itemComboBoxValuesPanfletos115g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "10x14cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "10x14cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("55.000");
                    break;
                case "14x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("130.000");
                    break;
                case "14x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("120.000");
                    break;
                case "20x28cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "20x28cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("100.000");
                    break;
                case "28x40cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "28x40cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x20cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "9x20cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    jComboBoxQuantidade.addItem("80.000");
                    break;
                case "18x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "18x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
            }
        }
    }

    private void itemComboBoxValuesPanfletos150g() {
        jComboBoxQuantidade.removeAllItems();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();

        if (itemSelecionado != null) {
            switch (itemSelecionado.toString()) {
                case "10x14cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "10x14cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "14x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "14x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    jComboBoxQuantidade.addItem("35.000");
                    jComboBoxQuantidade.addItem("40.000");
                    jComboBoxQuantidade.addItem("45.000");
                    jComboBoxQuantidade.addItem("50.000");
                    break;
                case "20x28cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "20x28cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "28x40cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "28x40cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    break;
                case "9x20cm 4/0":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    break;
                case "9x20cm 4/4":
                    addAcabamentosCorteExtra();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    jComboBoxQuantidade.addItem("25.000");
                    jComboBoxQuantidade.addItem("30.000");
                    break;
                case "18x20cm 4/0":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    break;
                case "18x20cm 4/4":
                    addAcabamentoDobras();
                    jComboBoxQuantidade.addItem(null);
                    jComboBoxQuantidade.addItem("2.500");
                    jComboBoxQuantidade.addItem("5.000");
                    jComboBoxQuantidade.addItem("10.000");
                    jComboBoxQuantidade.addItem("15.000");
                    jComboBoxQuantidade.addItem("20.000");
                    break;
            }
        }
    }

    private void valores() {
        Object itemS = jComboBoxSegmento.getSelectedItem();
        Object itemSelecionado = jComboBoxProdutos.getSelectedItem();
        Object itemSelecionadoQuant = jComboBoxQuantidade.getSelectedItem();
        int quantidade = getQuantidadeSelecionada();

        ///// Cartão 250g 9x5cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(38.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(76.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(114.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(152.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(190.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(228.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(266.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(304.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(342.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(380.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 250g 9x5cm 4/1 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(40.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(80.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(120.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/1" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 250g 9x5cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(40.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(80.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(120.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 250g 9x10cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(76.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(152.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(228.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(304.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(380.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(456.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(532.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(608.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(684.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(760.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 250g 9x10cm 4/1 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(80.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(560.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(640.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/1" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 250g 9x10cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(80.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(560.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(640.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão de Visita 250g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 300g 9x5cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(90.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(180.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(270.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(450.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "6.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "7.000") {
            jTextFieldTotal.setText(String.valueOf(630.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "8.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "9.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x5cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(900.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 300g 9x10cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(180.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "9x10cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(900.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Cartão 300g 18x5cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "18x5cm 4/4" && itemSelecionadoQuant == "1.000") {
            jTextFieldTotal.setText(String.valueOf(180.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "18x5cm 4/4" && itemSelecionadoQuant == "2.000") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "18x5cm 4/4" && itemSelecionadoQuant == "3.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "18x5cm 4/4" && itemSelecionadoQuant == "4.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Cartão Verniz Localizado 300g" && itemSelecionado == "18x5cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(900.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 10x14cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(110.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(310.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "90.000") {
            jTextFieldTotal.setText(String.valueOf(1800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "100.000") {
            jTextFieldTotal.setText(String.valueOf(2000.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 10x14cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(140.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(230.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(370.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(460.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(690.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1150.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 14x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(220.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(2000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "60.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "100.000") {
            jTextFieldTotal.setText(String.valueOf(4000.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 14x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(460.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(740.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1380.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(2300.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "85.000") {
            jTextFieldTotal.setText(String.valueOf(3960.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 20x28cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(440.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(4000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "60.000") {
            jTextFieldTotal.setText(String.valueOf(4800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 20x28cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(560.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(2760.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(3680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(4600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "60.000") {
            jTextFieldTotal.setText(String.valueOf(5520.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "70.000") {
            jTextFieldTotal.setText(String.valueOf(6440.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "80.000") {
            jTextFieldTotal.setText(String.valueOf(7360.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 28x40cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(880.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(2480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(4800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(6400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(8000.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 28x40cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1120.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(2960.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(3680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(4800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(5520.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(7360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(9200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "60.000") {
            jTextFieldTotal.setText(String.valueOf(11040.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 9x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(165.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(300.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(900.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1500.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "80.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 9x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(210.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(345.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(690.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1035.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1380.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1725.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 18x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(330.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(930.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 70g 18x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(420.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(690.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1110.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 70g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1380.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 10x14cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(110.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(135.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(270.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(405.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(675.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(945.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(1215.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1350.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 10x14cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(135.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(170.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(340.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(510.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(850.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1020.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(1190.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(1530.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(1700.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "55.000") {
            jTextFieldTotal.setText(String.valueOf(1870.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 14x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(220.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(270.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1350.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 14x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(270.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(340.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1020.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1700.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(2040.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(2720.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 20x28cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(440.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2700.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 20x28cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(2040.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(3400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(4080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(4760.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(5440.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 28x40cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(880.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(3240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(4320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(5400.0 + valorAcabamentoM * quantidade / 1000));

        }

        ///// Panfletos 90g 28x40cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(2720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(4080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(5440.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(6800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 9x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(165.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(202.5 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(405.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(607.5 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1012.5 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 9x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(202.5 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(255.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(510.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(765.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1020.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1275.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(2550.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "60.000") {
            jTextFieldTotal.setText(String.valueOf(3060.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 18x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(330.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(405.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1215.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2025.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 90g 18x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(405.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(510.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1020.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1530.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2040.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 90g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2550.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 10x14cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(120.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(640.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 10x14cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(150.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "55.000") {
            jTextFieldTotal.setText(String.valueOf(2200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 14x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(640.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(960.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "130.000") {
            jTextFieldTotal.setText(String.valueOf(8320.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 14x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(300.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(2800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "120.000") {
            jTextFieldTotal.setText(String.valueOf(9600.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 20x28cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(640.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2560.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 20x28cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(4000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(8000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "100.000") {
            jTextFieldTotal.setText(String.valueOf(16000.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 28x40cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(960.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1280.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(2560.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 28x40cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 28x40cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(3200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 9x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(180.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(720.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(960.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 9x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(225.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(300.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(900.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1500.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(2100.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(2700.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(3000.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "9x20cm 4/4" && itemSelecionadoQuant == "80.000") {
            jTextFieldTotal.setText(String.valueOf(4800.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 18x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(360.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(960.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1440.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 115g 18x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(450.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(600.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1200.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1800.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2400.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 115g" && itemSelecionado == "18x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(3000.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 10x14cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(155.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(230.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(460.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(690.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1150.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1380.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(1610.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(2070.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(2300.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 10x14cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(185.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(270.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(810.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(1350.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(1620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(1890.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(2430.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "10x14cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(2700.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 14x20cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(310.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(460.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1380.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2300.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(2760.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(3220.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(3680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(4140.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/0" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(4600.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 14x20cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(370.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(540.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(1620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(2700.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "30.000") {
            jTextFieldTotal.setText(String.valueOf(3240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "35.000") {
            jTextFieldTotal.setText(String.valueOf(3780.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "40.000") {
            jTextFieldTotal.setText(String.valueOf(4320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "45.000") {
            jTextFieldTotal.setText(String.valueOf(4860.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "14x20cm 4/4" && itemSelecionadoQuant == "50.000") {
            jTextFieldTotal.setText(String.valueOf(5400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 20x28cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(620.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(920.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(2760.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(3680.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/0" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(4600.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 20x28cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(740.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1080.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "15.000") {
            jTextFieldTotal.setText(String.valueOf(3240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "20.000") {
            jTextFieldTotal.setText(String.valueOf(4320.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "20x28cm 4/4" && itemSelecionadoQuant == "25.000") {
            jTextFieldTotal.setText(String.valueOf(5400.0 + valorAcabamentoM * quantidade / 1000));
        }

        ///// Panfletos 150g 28x40cm 4/0 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(1240.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(1840.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/0" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(3680.0 + valorAcabamentoM * quantidade / 1000));

        }

        ///// Panfletos 150g 28x40cm 4/4 ///////////////////////////////////////////////////
        if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "2.500") {
            jTextFieldTotal.setText(String.valueOf(1480.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "5.000") {
            jTextFieldTotal.setText(String.valueOf(2160.0 + valorAcabamentoM * quantidade / 1000));

        } else if (itemS == "Panfletos 150g" && itemSelecionado == "28x40cm 4/4" && itemSelecionadoQuant == "10.000") {
            jTextFieldTotal.setText(String.valueOf(4320.0 + valorAcabamentoM * quantidade / 1000));

        }
    }
}
