package sg.edu.rp.c346.id20028056.mymodule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv322;
    TextView tv346;
    TextView tv328;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv322=findViewById(R.id.tv322);
        tv346=findViewById(R.id.tv346);
        tv328=findViewById(R.id.tv328);

        tv328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, Descriptions.class);
                i.putExtra("code","C328");

                startActivity(i);
            }
        });
        tv322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, Descriptions.class);
                i.putExtra("code","C322");

                startActivity(i);
            }
        });
        tv346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this, Descriptions.class);
                i.putExtra("code","C346");

                startActivity(i);
            }
        });
    }
}