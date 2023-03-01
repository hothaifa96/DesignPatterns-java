package com.structurlas.flyweightDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints(){
        List<Point> points= new ArrayList<>();
        var point = new Point(2,4,iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        point = new Point(2,4,iconFactory.getPointIcon(PointType.BANK));
        points.add(point);
        points.add(point);
        points.add(point);
        points.add(point);
        return points;
    }
}
