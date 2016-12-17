package ru.myitschool.pcdesigner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CPUManufacturer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<MainListView> listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("Manufacturer");

        mainListView();
    }

    private List<MainListView> initData() {
        listView = new ArrayList<>();

        listView.add(new MainListView(1, R.mipmap.intel, "INTEL"));
        listView.add(new MainListView(2, R.mipmap.amd, "AMD"));

        return listView;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_main) {
            Intent menuManufacturer = new Intent(CPUManufacturer.this, MainMenu.class);
            startActivity(menuManufacturer);
        } else if (id == R.id.nav_cpu) {
        } else if (id == R.id.nav_motherboard) {
            Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_ram) {
            Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_hdd) {
            Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_ssd) {
            Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_video_card) {
            Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_fan) {
            Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_drive) {
            Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_tower) {
            Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_power) {
            Toast.makeText(getApplicationContext(), "10", Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void mainListView() {
        ListView mainListView = (ListView) findViewById(R.id.main_list_view);

        MainListViewAdapter adapter = new MainListViewAdapter(this, initData());

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_LONG).show();
                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}