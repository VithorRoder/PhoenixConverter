package Utilitários;

import javax.swing.*;
import java.awt.*;

public class DegradePanel extends JPanel {

    public DegradePanel() {
        setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Obtendo as dimensões do painel
        int width = getWidth();
        int height = getHeight();

        // Criando gradientes radiais com cores nos 4 cantos
        RadialGradientPaint gradientTopLeft = new RadialGradientPaint(
                new Point(0, 0), // Canto superior esquerdo
                width * 0.7f, // Raio do gradiente (sem Math.min)
                new float[]{0.0f, 1.0f},
                new Color[]{Color.CYAN, new Color(0, 0, 0, 0)});

        RadialGradientPaint gradientTopRight = new RadialGradientPaint(
                new Point(width, 0), // Canto superior direito
                width * 0.7f, // Raio do gradiente (sem Math.min)
                new float[]{0.0f, 1.0f},
                new Color[]{Color.MAGENTA, new Color(0, 0, 0, 0)});

        RadialGradientPaint gradientBottomLeft = new RadialGradientPaint(
                new Point(0, height), // Canto inferior esquerdo
                width * 0.7f, // Raio do gradiente (sem Math.min)
                new float[]{0.0f, 1.0f},
                new Color[]{Color.BLACK, new Color(0, 0, 0, 0)});

        RadialGradientPaint gradientBottomRight = new RadialGradientPaint(
                new Point(width, height), // Canto inferior direito
                width * 0.7f, // Raio do gradiente (sem Math.min)
                new float[]{0.0f, 1.0f},
                new Color[]{Color.YELLOW, new Color(0, 0, 0, 0)});

        // Preenchendo o painel com os gradientes radiais nos 4 cantos
        g2d.setPaint(gradientTopRight);
        g2d.fillRect(0, 0, width, height);

        g2d.setPaint(gradientTopLeft);
        g2d.fillRect(0, 0, width, height);

        g2d.setPaint(gradientBottomLeft);
        g2d.fillRect(0, 0, width, height);

        g2d.setPaint(gradientBottomRight);
        g2d.fillRect(0, 0, width, height);
    }
}
