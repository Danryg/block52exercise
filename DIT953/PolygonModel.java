package DIT953;

import DIT953.polygons.polygon.IPolygon;

import java.util.ArrayList;
import java.util.List;


public class PolygonModel implements IPolygonModel {

    public boolean direction = true;
    public int ticker = 0;

    List<IPolygon> polygons;


    public PolygonModel(){
        this(new ArrayList<>());
    }

    public PolygonModel(List<IPolygon> polygons){
        this.polygons = polygons;
    }

    public void update(){
        ticker++;
        int value = direction ? 10 : -10;
        for (IPolygon p: polygons){
            p.updateCenter(p.getCenter().x+value, p.getCenter().y+value);
        }
        if (ticker > 10) {
            direction = !direction;
            ticker = 0;
        }
    }

    public void addPolygon(IPolygon polygon){
        this.polygons.add(polygon);
    }

    public List<IPolygon> getPolygons() {
        return polygons;
    }

}
