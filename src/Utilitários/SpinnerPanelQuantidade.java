package Utilitários;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpinnerPanelQuantidade extends JPanel {

    private int valor = 1;
    private final JTextField campoTexto;
    private final JButton btnEsquerda;
    private final JButton btnDireita;
    private final int valorMinimo = 1;

    public SpinnerPanelQuantidade() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        btnEsquerda = new JButton("◀");
        btnDireita = new JButton("▶");

        campoTexto = new JTextField(String.valueOf(valor), 3);
        campoTexto.setHorizontalAlignment(JTextField.CENTER);
        campoTexto.setFont(new Font("Arial", Font.BOLD, 14));

        add(btnEsquerda, BorderLayout.WEST);
        add(campoTexto, BorderLayout.CENTER);
        add(btnDireita, BorderLayout.EAST);

        btnEsquerda.addActionListener(e -> atualizarValor(-1));
        btnDireita.addActionListener(e -> atualizarValor(1));

        btnEsquerda.setBackground(new Color(220, 220, 220));
        btnDireita.setBackground(new Color(220, 220, 220));

        btnEsquerda.setForeground(new Color(0, 0, 0));
        btnDireita.setForeground(new Color(0, 0, 0));

        campoTexto.setBackground(Color.WHITE);
        campoTexto.setForeground(Color.BLACK);
        campoTexto.addActionListener(e -> lerValorManual());
        campoTexto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                lerValorManual();
            }
        });
    }

    private void atualizarValor(int delta) {
        lerValorManual();
        int novoValor = valor + delta;
        if (novoValor >= valorMinimo) {
            valor = novoValor;
            campoTexto.setText(String.valueOf(valor));
        }
    }

    private void lerValorManual() {
        try {
            int valorDigitado = Integer.parseInt(campoTexto.getText().trim());
            if (valorDigitado >= valorMinimo) {
                valor = valorDigitado;
            } else {
                valor = valorMinimo;
                campoTexto.setText(String.valueOf(valor));
            }
        } catch (NumberFormatException ex) {
            campoTexto.setText(String.valueOf(valor));
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int novoValor) {
        if (novoValor >= valorMinimo) {
            this.valor = novoValor;
            campoTexto.setText(String.valueOf(valor));
        }
    }
    
}
