package com.example.myrolletapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myrolletapplication.model.Rollet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static Rollet rollet = new Rollet();
    private TextView tv_total_price;

    private EditText ed_width;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_width = findViewById(R.id.ed_width);

        //rollet.constractRollet(ed_width.getText(), );

        tv_total_price.setText(rollet.getTotalPrice());
    }
    
}
