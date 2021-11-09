package com.zhangchao.todolist;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zhangchao.todolist.databinding.ActivityMainBinding;
import com.zhangchao.todolist.SimplePaddingDecoration;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    private RecyclerView rcv;
    private ArrayList<Item> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        arrayList.add(new Item("array"));
        rcv = (RecyclerView)findViewById(R.id.list_main);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adaper = new ItemAdapter(arrayList);
        rcv.setAdapter(adaper);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void fabclick(android.view.View view){

        arrayList.add(new Item("array"));
        ItemAdapter adaper = new ItemAdapter(arrayList);
        rcv.setAdapter(adaper);
    }
}