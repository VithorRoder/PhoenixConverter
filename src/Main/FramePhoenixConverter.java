package Main;

import Atualizador.Atualizador;
import DatabaseConnection.ConnectionPostgres;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class FramePhoenixConverter extends JFrame {

    private int mouseX, mouseY;

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        Atualizador.checarAtualizacao();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Conexao com o banco encerrada.");
            ConnectionPostgres.closeConnection();
        }));
        JFrame frame = new FramePhoenixConverter();
        frame.setVisible(true);
    }

    public FramePhoenixConverter() {
        setUndecorated(true);
        initComponents();

        setOpacity(0.992f);

        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/png/convert.png"));
        setIconImage(icon);
        setTitle("Conversor Phoenix");

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new PainelPrincipal(), BorderLayout.CENTER);

        mouseListenerFrame();

        setShape(new java.awt.geom.RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1095, 710));
        setMinimumSize(new java.awt.Dimension(1095, 710));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1095, 710));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
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
