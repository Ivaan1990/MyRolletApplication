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
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private static Rollet rollet = new Rollet();
    private TextView tv_total_price;
    private TextView priceOneSquareMeter;
    private TextInputEditText textInputEditText_width;
    private TextInputEditText textInputEditText_height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputEditText_width = findViewById(R.id.inputEditText_width);
        textInputEditText_height = findViewById(R.id.inputEditText_height);
        priceOneSquareMeter = findViewById(R.id.priceOneSquareMeter);
    }

    public void showTotalPrice(View view) throws NullPointerException {
            rollet.constractRollet(
                Integer.parseInt(textInputEditText_width.getText().toString()),
                Integer.parseInt(textInputEditText_height.getText().toString()),
                1,
                true,
                true,
                2
            );
        priceOneSquareMeter.setText(rollet.getArea());
    }
}