package sg.edu.rp.c346.id20028056.mymodule;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Descriptions extends AppCompatActivity {
    TextView tvDisplay;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptions);

        tvDisplay=findViewById(R.id.tvDisplay);
        btnBack=findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent=getIntent();
        String code=intent.getStringExtra("code");
        if(code.equals("C328")){
            Module mod= new Module("C328","IT Delivery",2020,1,4,"E62B");
            tvDisplay.setText(mod.display());
        }
        else if (code.equals("C322")){
            Module mod= new Module("C322","Data Center and Cloud Management ",2020,1,4,"E61H");
            tvDisplay.setText(mod.display());
        }

        else if(code.equals("C346")){
            Module mod= new Module("C346","Android Programming",2020,1,4,"E62E");
            tvDisplay.setText(mod.display());
        }
    }
}