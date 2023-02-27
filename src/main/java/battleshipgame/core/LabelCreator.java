package battleshipgame.core;

import javax.swing.*;
import java.awt.*;

public class LabelCreator extends JLabel {
    private String id;
    private int w;
    private int h;
    private int posX;
    private int posY;
    private String text;
    private Label label;




    public LabelCreator(String text,  String id, int w, int h, int posX, int posY) {
        super();
        this.id = id;
        this.w = w;
        this.h = h;
        this.posX = posX;
        this.posY = posY;
        this.text = text;

        label = new Label();
        label.setBounds(posX,posY,w,h);
        label.setText(text);
        label.setFont(new Font(Font.SERIF,Font.BOLD,h-3));
        label.setBackground(Color.black);
        //label.setVisible(true);

    }

    public Label getLabel() {
        return label;
    }
}
