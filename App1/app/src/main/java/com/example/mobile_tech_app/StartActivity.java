package com.example.mobile_tech_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_menu,menu);
        setTitle("Mobile Tech");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.action_uievent:
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("message","hello world");
                startActivity(intent);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void openMainActivity(View view){
        // the Intent class is used to create an instance with current activity (this)
        //and the main activity.
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("message","Hello World");
        startActivity(intent);
    }

    public void viewBean(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("image", "mr_bean");
        startActivity(intent);
    }

    public void viewChaplin(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("image", "chaplin");
        startActivity(intent);
    }


}