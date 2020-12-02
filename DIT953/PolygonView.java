package DIT953;

import DIT953.polygons.polygon.IPolygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PolygonView extends JComponent {



    IPolygonModel model;
    PolygonView(IPolygonModel model){
        this.model = model;
    }

    @Override
    public void paint(Graphics g) {
        for (IPolygon currentPolygon : model.getPolygons()) {
            currentPolygon.paint(g);
        }
    }

}
