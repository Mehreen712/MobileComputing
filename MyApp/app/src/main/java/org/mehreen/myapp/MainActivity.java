package org.mehreen.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button4);
       Button mybutton = findViewById(R.id.button3);
       Button  newbutton = findViewById(R.id.button);
       textview=findViewById(R.id.textView3);
    }

    public void FeelFreeToContactUs(View view) {
        textview.setText("FeelFreeToContactUs");
    }
}