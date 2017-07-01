package com.example.ronald.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next(View view) {
        Intent intent2 = new Intent(this, Main3Activity.class);
        startActivity(intent2);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mnu1,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent3 = null;
        switch (item.getItemId()) {
            case R.id.item1:
                intent3 = new Intent(this, MainActivity.class);
                break;
            case R.id.item2:
                intent3 = new Intent(this, Main2Activity.class);
                break;
            case R.id.item3:
                intent3 = new Intent(this, Main3Activity.class);
                break;
            case R.id.item4:
                finish();
        }
        startActivity(intent3);
        return true;
    }

    public void Navigation(View view) {
        Intent intent4= new Intent(this,Main4Activity.class);
        startActivity(intent4);
    }
}
