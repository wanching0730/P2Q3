package com.example.android.p2q3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class DisplayMidpoint extends AppCompatActivity {

    private Point p1, p2;
    private double midpoint_x, midpoint_y;
    private EditText x_midpoint, y_midpoint;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_midpoint);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        p1 = (Point) bundle.getSerializable("Point1");
        p2 = (Point) bundle.getSerializable("Point2");

        midpoint_x = (p1.returnX() + p2.returnX())/2;
        midpoint_y = (p1.returnY() + p2.returnY())/2;

        x_midpoint = (EditText) findViewById(R.id.x_midpoint);
        y_midpoint = (EditText) findViewById(R.id.y_midpoint);

        x_midpoint.setText("" + midpoint_x);
        y_midpoint.setText("" + midpoint_y);
    }
}
