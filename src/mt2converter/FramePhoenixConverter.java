package mt2converter;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;

public class FramePhoenixConverter extends javax.swing.JFrame {

    public FramePhoenixConverter() {
        initComponents();
        setExtendedState(FramePhoenixConverter.MAXIMIZED_BOTH);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/png/convert.png"));
        setIconImage(icon);
        setTitle("Conversor Phoenix");
        getContentPane().removeAll();
        CardLayout card = new CardLayout();
        getContentPane().setLayout(card);
        getContentPane().add(new PainelPrincipal(), "PainelPrincipal");
        card.show(getContentPane(), "PainelPrincipal");
        getContentPane().revalidate();
        getContentPane().repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 750));
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setPreferredSize(new java.awt.Dimension(1400, 750));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
