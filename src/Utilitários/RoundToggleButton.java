package Utilitários;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RoundToggleButton extends JToggleButton {

    private static final Color SELECTED_BG = new Color(173, 216, 230); // Azul claro
    private static final Color UNSELECTED_BG = Color.WHITE;
    private static final Color SHADOW_COLOR = new Color(0, 0, 0, 50);
    private static final int SHADOW_OFFSET = 2;
    private static final int ARC = 20;

    private ImageIcon iconSelecionado;
    private String fixedText;

    public RoundToggleButton() {
        this(null);
    }

    public RoundToggleButton(String text) {
        super(text);
        this.fixedText = text;
        init();
    }

    private void init() {
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateIconAndText();
            }
        });
    }

    public void setSelectedIconWhenToggled(ImageIcon icon, String textoPadrao) {
        this.iconSelecionado = icon;
        this.fixedText = textoPadrao;
        updateIconAndText();
    }

    private void updateIconAndText() {
        setText(fixedText);
        setIcon(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Sombra
        g2.setColor(SHADOW_COLOR);
        g2.fillRoundRect(SHADOW_OFFSET, SHADOW_OFFSET, width - SHADOW_OFFSET * 2, height - SHADOW_OFFSET * 2, ARC, ARC);

        // Fundo
        g2.setColor(isSelected() ? SELECTED_BG : UNSELECTED_BG);
        g2.fillRoundRect(0, 0, width - SHADOW_OFFSET * 2, height - SHADOW_OFFSET * 2, ARC, ARC);

        // Borda
        g2.setColor(new Color(0, 0, 0, 80));
        g2.drawRoundRect(0, 0, width - SHADOW_OFFSET * 2, height - SHADOW_OFFSET * 2, ARC, ARC);

        // Texto
        FontMetrics fm = g2.getFontMetrics(getFont());
        String text = getText();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getAscent();
        int textX = (width - textWidth) / 2;
        int textY = (height + textHeight) / 2 - SHADOW_OFFSET;

        g2.setColor(Color.BLACK);
        g2.setFont(getFont());
        g2.drawString(text, textX, textY);

        // Desenha ícone se estiver selecionado
        if (isSelected() && iconSelecionado != null) {
            int iconHeight = iconSelecionado.getIconHeight();
            int iconWidth = iconSelecionado.getIconWidth();
            int iconX = width - iconWidth - 8;
            int iconY = (height - iconHeight) / 2;
            g2.drawImage(iconSelecionado.getImage(), iconX, iconY, this);
        }

        g2.dispose();
    }

    public Color getSelectedBackground() {
        return SELECTED_BG;
    }

    public Color getUnselectedBackground() {
        return UNSELECTED_BG;
    }

}
