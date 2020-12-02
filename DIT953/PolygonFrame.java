package DIT953;

import javax.swing.*;

public class PolygonFrame extends JFrame {

    public PolygonFrame(JComponent view){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(30,30,300,300);
        this.getContentPane().add(view);
        this.setVisible(true);
    }

}
