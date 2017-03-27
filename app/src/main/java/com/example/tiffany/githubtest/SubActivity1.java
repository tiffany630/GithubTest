package com.example.tiffany.githubtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.getItem(0).setVisible(false);  //main  //找上一個index????????????
        menu.getItem(1).setVisible(false);  //sub1
        menu.getItem(2).setVisible(true);  //sub2
        menu.getItem(3).setVisible(true);  //back
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasClickedId = item.getItemId();

        if (itemThatWasClickedId == R.id.menu_main) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        } else if (itemThatWasClickedId == R.id.menu_sub2) {
            Intent intent = new Intent(this, SubActivity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        } else if (itemThatWasClickedId == R.id.menu_back) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
