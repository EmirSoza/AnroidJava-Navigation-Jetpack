package com.emirhan.naviagationjava;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflater- in order to use created xml files
        //inflater gets the items

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Here is for after selecting item what will happen
        //if the selected id == add_art_item navigate to second page
        if(item.getItemId() == R.id.add_art_item) {
            //Intent intent = new Intent(MainActivity.this, Addart.class);
            //bu info amaci listeden mi yoksa menu iconundan mi tiklandi onu ayirt etmek icin
            //new ise menu den old ise listview dan tiklanmistir
            //ona gore addart sayfasinin gorunumunu yapacagiz
            // intent.putExtra("info", "new");
            //    startActivity(intent);
            FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
            action.setAge(30);
            Navigation.findNavController(this, R.id.fragment).navigate(action);

        }
        return super.onOptionsItemSelected(item);
    }
}