package ru.myitschool.pcdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<MainListView> listView;
    Intent cpuManufacturer;

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
        topText.setText(R.string.computing_accessories);

        mainListView();
    }

    private List<MainListView> initData() {
        listView = new ArrayList<>();

        listView.add(new MainListView(1, R.mipmap.cpu, R.string.cpu));
        listView.add(new MainListView(2, R.mipmap.motherboard, R.string.motherboards));
        listView.add(new MainListView(3, R.mipmap.ram1, R.string.ram));
        listView.add(new MainListView(4, R.mipmap.hdd1, R.string.hdd));
        listView.add(new MainListView(5, R.mipmap.ssd1, R.string.ssd));
        listView.add(new MainListView(6, R.mipmap.video_card1, R.string.graphics_cards));
        listView.add(new MainListView(7, R.mipmap.fan, R.string.fans));
        listView.add(new MainListView(8, R.mipmap.drive1, R.string.optical_drives));
        listView.add(new MainListView(9, R.mipmap.tower1, R.string.towers));
        listView.add(new MainListView(10, R.mipmap.power, R.string.power_supplies));

        return listView;
    }

    private void mainListView() {
        ListView mainListView = (ListView) findViewById(R.id.main_list_view);

        MainListViewAdapter adapter = new MainListViewAdapter(this, initData());

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    cpuManufacturer = new Intent(MainMenu.this, CPUManufacturer.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 1) {
                    cpuManufacturer = new Intent(MainMenu.this, MotherboardsSocket.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 2) {
                    cpuManufacturer = new Intent(MainMenu.this, RAMTypeOfMemory.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 3) {
                    cpuManufacturer = new Intent(MainMenu.this, HDDMemory.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 4) {
                    cpuManufacturer = new Intent(MainMenu.this, SSDMemory.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 5) {
                    cpuManufacturer = new Intent(MainMenu.this, GraphicsCardsMemory.class);
                    startActivity(cpuManufacturer);
                }
                if (position == 6) {
                    Toast.makeText(getApplicationContext(), R.string.fans, Toast.LENGTH_LONG).show();
                }
                if (position == 7) {
                    Toast.makeText(getApplicationContext(), R.string.optical_drives, Toast.LENGTH_LONG).show();
                }
                if (position == 8) {
                    Toast.makeText(getApplicationContext(), R.string.towers, Toast.LENGTH_LONG).show();
                }
                if (position == 9) {
                    Toast.makeText(getApplicationContext(), R.string.power_supplies, Toast.LENGTH_LONG).show();
                }
            }
        });
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
            cpuManufacturer = new Intent(MainMenu.this, MainMenu.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_cpu) {
            cpuManufacturer = new Intent(MainMenu.this, CPUManufacturer.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_motherboard) {
            cpuManufacturer = new Intent(MainMenu.this, MotherboardsSocket.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ram) {
            cpuManufacturer = new Intent(MainMenu.this, RAMTypeOfMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_hdd) {
            cpuManufacturer = new Intent(MainMenu.this, HDDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ssd) {
            cpuManufacturer = new Intent(MainMenu.this, SSDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_video_card) {
            cpuManufacturer = new Intent(MainMenu.this, GraphicsCardsMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_fan) {
            Toast.makeText(getApplicationContext(), R.string.fans, Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_drive) {
            Toast.makeText(getApplicationContext(), R.string.optical_drives, Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_tower) {
            Toast.makeText(getApplicationContext(), R.string.towers, Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_power) {
            Toast.makeText(getApplicationContext(), R.string.power_supplies, Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
