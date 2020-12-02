package DIT953;

/* This is now all we (can) use from the sub-package */
import DIT953.polygons.polygon.IPolygon;
import DIT953.polygons.polygon.PolygonFactory;

/* By commenting out the imports above, and instead importing the adapter package,
 * we effectively switch to using the DIT953.shapes package.
 */
//import DIT953.adapter.*;

import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

public class DrawPolygons{

    public static void main(String[] args) {

        PolygonModel model = new PolygonModel();

        model.addPolygon(PolygonFactory.createSquare(50,50));
        model.addPolygon(PolygonFactory.createTriangle(100,100));
        model.addPolygon(PolygonFactory.createRectangle(50,150));


        PolygonView polygonView = new PolygonView(model);
        PolygonFrame frame = new PolygonFrame(polygonView);


        try {
            while (true) {
                Thread.sleep(500);
                model.update();
                polygonView.repaint();
            }
        } catch (InterruptedException e) {}

    }//main

}//DIT953.DrawPolygons