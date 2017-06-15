package com.example.android.p2q3;

import java.io.Serializable;

/**
 * Created by USER on 11/6/2017.
 */

public class Point implements Serializable {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double returnX(){
        return x;
    }

    public double returnY(){
        return y;
    }
}
