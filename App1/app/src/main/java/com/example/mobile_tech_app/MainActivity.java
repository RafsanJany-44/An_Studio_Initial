package com.example.mobile_tech_app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        // this is not the app name this is the title. The app name is in the activity_main.xml
        setTitle("Mobile Tech App");

        String msg = extras.getString("message");
        String img = extras.getString("image");

        System.out.println(msg);
        System.out.println(img);

        if (img == null){
            setContentView(R.layout.activity_main);

            TextView textView = findViewById(R.id.TextViewOutput);
            textView.setText(msg);

            EditText editText = findViewById(R.id.editTextInput);
            editText.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {

                    if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                        // do something when the enter key on the keyboard is clicked

                        TextView textView = findViewById(R.id.TextViewOutput);
                        EditText editText = findViewById(R.id.editTextInput);
                        textView.setText(editText.getText());
                        Toast.makeText(MainActivity.this, "Enter pressed", Toast.LENGTH_LONG).show();
                    }
                    return false; //disapare the keyboard after typing in landscape
                }
            });
          }
        else
        {
            if(img.equals("mr_bean")) {
                setContentView(R.layout.activity_demo);
            }
            else{
                setContentView(R.layout.activity_demo2);
            }
        }
    }

    public void displayMessage(View view){

        TextView textView  = findViewById(R.id.TextViewOutput);
        EditText editText  = findViewById(R.id.editTextInput);
        textView.setText(editText.getText());
        Toast.makeText(this,"Ok button clicked.",Toast.LENGTH_LONG).show();
    }


    public void displayHintEditTextInput(View view){
        TextView hint  = findViewById(R.id.editTextInput);
        hint.setText("");
        hint.setHint("Enter a message than tap ok.");

    }




}
