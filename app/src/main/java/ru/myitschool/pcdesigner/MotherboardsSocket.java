package ru.myitschool.pcdesigner;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
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

public class MotherboardsSocket extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<MainListView> listView;
    Intent cpuManufacturer;

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
        topText.setText(R.string.socket);

        mainListView();
    }

    private List<MainListView> initData() {
        listView = new ArrayList<>();

        listView.add(new MainListView(1, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_1));
        listView.add(new MainListView(2, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_2));
        listView.add(new MainListView(3, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_3));
        listView.add(new MainListView(4, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_4));
        listView.add(new MainListView(5, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_5));
        listView.add(new MainListView(6, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_6));
        listView.add(new MainListView(7, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_7));
        listView.add(new MainListView(8, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_8));
        listView.add(new MainListView(9, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_9));
        listView.add(new MainListView(10, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_10));
        listView.add(new MainListView(11, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_11));
        listView.add(new MainListView(12, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_12));
        listView.add(new MainListView(13, R.mipmap.socket1+(int) (Math.random()*2), R.string.socket_13));

        return listView;
    }

    private void mainListView() {
        ListView mainListView = (ListView) findViewById(R.id.main_list_view);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "LGA2011-3 Square ILM", Toast.LENGTH_LONG).show();
                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), "LGA2011-3 Narrow ILM", Toast.LENGTH_LONG).show();
                }
                if (position == 2) {
                    Toast.makeText(getApplicationContext(), "LGA2011-3", Toast.LENGTH_LONG).show();
                }
                if (position == 3) {
                    Toast.makeText(getApplicationContext(), "LGA2011 Narrow ILM", Toast.LENGTH_LONG).show();
                }
                if (position == 4) {
                    Toast.makeText(getApplicationContext(), "LGA1151", Toast.LENGTH_LONG).show();
                }
                if (position == 5) {
                    Toast.makeText(getApplicationContext(), "LGA1150", Toast.LENGTH_LONG).show();
                }
                if (position == 6) {
                    Toast.makeText(getApplicationContext(), "LGA1155", Toast.LENGTH_LONG).show();
                }
                if (position == 7) {
                    Toast.makeText(getApplicationContext(), "LGA775", Toast.LENGTH_LONG).show();
                }
                if (position == 8) {
                    Toast.makeText(getApplicationContext(), "FM2 plus", Toast.LENGTH_LONG).show();
                }
                if (position == 9) {
                    Toast.makeText(getApplicationContext(), "FM2", Toast.LENGTH_LONG).show();
                }
                if (position == 10) {
                    Toast.makeText(getApplicationContext(), "AM3 plus", Toast.LENGTH_LONG).show();
                }
                if (position == 11) {
                    Toast.makeText(getApplicationContext(), "AM3", Toast.LENGTH_LONG).show();
                }
                if (position == 12) {
                    Toast.makeText(getApplicationContext(), "AM1", Toast.LENGTH_LONG).show();
                }
            }
        });
        MainListViewAdapter adapter = new MainListViewAdapter(this, initData());

        mainListView.setAdapter(adapter);

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
            cpuManufacturer = new Intent(MotherboardsSocket.this, MainMenu.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_cpu) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, CPUManufacturer.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_motherboard) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, MotherboardsSocket.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ram) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, RAMTypeOfMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_hdd) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, HDDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ssd) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, SSDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_video_card) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, GraphicsCardsMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_fan) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, FansCategory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_drive) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, OpticalDrivesTypeOfTheOpticalDrive.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_tower) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, FansCategory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_power) {
            cpuManufacturer = new Intent(MotherboardsSocket.this, PowerPower.class);
            startActivity(cpuManufacturer);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}