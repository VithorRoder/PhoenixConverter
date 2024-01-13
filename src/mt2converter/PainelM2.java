package mt2converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
        jLabelPhoenix = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
        jLabelValorMinimo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPorcentagem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBoxProdutos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSegmento = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1360, 700));
        setMinimumSize(new java.awt.Dimension(1360, 700));
        setPreferredSize(new java.awt.Dimension(1360, 700));

        jPanel1.setBackground(new java.awt.Color(82, 82, 82));
        jPanel1.setMaximumSize(new java.awt.Dimension(1364, 708));

        jLabelPhoenix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhoenix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/phoenix.png"))); // NOI18N
        jLabelPhoenix.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phoenix Gráfica Converter M2");

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

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton3.setText("Valor Venda");
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
        jComboBoxSegmento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lonas", "Adesivos", "Banner" }));
        jComboBoxSegmento.setSelectedIndex(-1);
        jComboBoxSegmento.setFocusable(false);
        jComboBoxSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSegmentoActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1265, 1265, 1265)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jComboBoxSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jComboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldMt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(947, 947, 947)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1103, 1103, 1103)
                .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(947, 947, 947)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358)
                .addComponent(jLabel6)
                .addGap(512, 512, 512)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabelPhoenix, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1352, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1103, 1103, 1103)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1103, 1103, 1103)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPhoenix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jTextFieldMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jComboBoxSegmento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jComboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMt2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelValorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(6, 6, 6))
        );

        add(jPanel1);
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
        calcularValorTotalMT2();
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
        jTextField2.setText("");
    }//GEN-LAST:event_jTextFieldPorcentagemFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextFieldTotal.getText() != null && !jTextFieldTotal.getText().isEmpty()) {
            CalculaValorVenda();
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
    private javax.swing.JLabel jLabelPhoenix;
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
                case "Adesivo Jateado + Branco + Refile - Impressão UV - 5/0":
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
                case "Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 280g":
                    jTextFieldMt2.setText("26,00");
                    clearAll2();
                    break;
                case "Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 280g":
                    jTextFieldMt2.setText("30,00");
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
                    jComboBoxProdutos.addItem("Adesivo Jateado + Branco + Refile - Impressão UV - 5/0");
                    // Adicione outros produtos para o segmento MC conforme necessário
                    break;
                case "Banner":
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Solvente - 4/0 - 280g");
                    jComboBoxProdutos.addItem("Banner c Tubete e Corda - Brilho -  Impressão Látex - 4/0 - 280g");
                // Adicione outros casos para segmentos adicionais, se aplicável
                default:
                    break;
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
        }
    }

}
