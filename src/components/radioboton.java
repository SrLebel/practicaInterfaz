package components;

import javax.swing.*;
import java.awt.*;

public class radioboton extends JRadioButton {
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface1 = new Color(73, 77, 100);
    Color surface2 = new Color(54, 58, 79);

    public radioboton (String texto){
        setText(texto);
        setForeground(text);
        setBackground(base);
        setFont(new Font("JetBrains Mono", Font.BOLD, 10));
    }
}
