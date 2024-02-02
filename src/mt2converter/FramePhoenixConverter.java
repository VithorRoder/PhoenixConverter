package mt2converter;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class FramePhoenixConverter extends javax.swing.JFrame {

    private int mouseX, mouseY;

    public FramePhoenixConverter() {
        initComponents();

        // Nível de Opacidade do Frame
        setOpacity(0.992f);

        // Título e ícone do Frame
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/png/convert.png"));
        setIconImage(icon);
        setTitle("Conversor Phoenix");

        // Adicionando o Container do PanelPrincipal
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new PainelPrincipal(), BorderLayout.CENTER);

        // Ação do Mouse de clicar e arrastar a Frame
        mouseListenerFrame();

        // Desenho das Bordas do Frame
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1200, 690));
        setMinimumSize(new java.awt.Dimension(1200, 690));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 690));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void mouseListenerFrame() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - mouseX;
                int y = e.getYOnScreen() - mouseY;
                setLocation(x, y);
            }
        });
    }

}
