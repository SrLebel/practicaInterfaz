package components;

import javax.swing.*;
import java.awt.*;

public class titulo extends JLabel{
    Color base = new Color(36, 39, 58);
    Color text = new Color(202, 211, 245);
    Color surface = new Color(73, 77, 100);

    public titulo (String texto){
        setText(texto);
        setForeground(text);
        setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
    }
}
