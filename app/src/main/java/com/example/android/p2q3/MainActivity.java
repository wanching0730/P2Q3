package com.example.android.p2q3;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText point_1_x_field, point_1_y_field, point_2_x_field, point_2_y_field;
    private Toolbar toolbar;
    private FloatingActionButton fab;
    private double point_x, point_y;
    private Point p1, p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = (FloatingActionButton) findViewById(R.id.fab_done);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                point_1_x_field = (EditText) findViewById(R.id.point_1_x);
                point_1_y_field = (EditText) findViewById(R.id.point_1_y);
                point_2_x_field = (EditText) findViewById(R.id.point_2_x);
                point_2_y_field = (EditText) findViewById(R.id.point_2_y);

                point_x = Double.parseDouble(point_1_x_field.getText().toString());
                point_y = Double.parseDouble(point_1_y_field.getText().toString());
                p1 = new Point(point_x, point_y);
                point_x = Double.parseDouble(point_2_x_field.getText().toString());
                point_y = Double.parseDouble(point_2_y_field.getText().toString());
                p2 = new Point(point_x, point_y);

                Intent intent = new Intent(MainActivity.this, DisplayMidpoint.class);
                intent.putExtra("Point1", p1);
                intent.putExtra("Point2", p2);
                startActivity(intent);
            }
        });
    }
}
