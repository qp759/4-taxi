package com.example.me.taxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class main extends AppCompatActivity {


    private EditText editText;
    private Button bt;
    private TextView textView2;
    private float meter,answer,addm5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        textView2 = (TextView)findViewById(R.id.textView2);
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String Hmeter = editText.getText().toString();

                meter = Float.parseFloat(Hmeter);

                addm5 = meter%250;
                answer = 75+((meter-addm5)/250)*5;
                if (addm5>0) {
                    answer = answer + 5;
                    addm5=0;}
                textView2.setText("費用 : "+answer);
                editText.setText("");

            }
        });
    }
}
