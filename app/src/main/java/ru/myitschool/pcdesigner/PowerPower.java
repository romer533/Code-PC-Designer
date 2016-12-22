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

public class PowerPower extends AppCompatActivity
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
        topText.setText(R.string.power);

        mainListView();
    }

    private List<MainListView> initData() {
        listView = new ArrayList<>();

        listView.add(new MainListView(1, R.mipmap.power, R.string.power_1));
        listView.add(new MainListView(2, R.mipmap.power, R.string.power_2));
        listView.add(new MainListView(3, R.mipmap.power, R.string.power_3));
        listView.add(new MainListView(4, R.mipmap.power, R.string.power_4));
        listView.add(new MainListView(5, R.mipmap.power, R.string.power_5));
        listView.add(new MainListView(6, R.mipmap.power, R.string.power_6));
        listView.add(new MainListView(7, R.mipmap.power, R.string.power_7));
        listView.add(new MainListView(8, R.mipmap.power, R.string.power_8));
        listView.add(new MainListView(9, R.mipmap.power, R.string.power_9));
        listView.add(new MainListView(10, R.mipmap.power, R.string.power_10));
        listView.add(new MainListView(11, R.mipmap.power, R.string.power_11));
        listView.add(new MainListView(12, R.mipmap.power, R.string.power_12));
        listView.add(new MainListView(13, R.mipmap.power, R.string.power_13));
        listView.add(new MainListView(14, R.mipmap.power, R.string.power_14));

        return listView;
    }

    private void mainListView() {
        ListView mainListView = (ListView) findViewById(R.id.main_list_view);

        MainListViewAdapter adapter = new MainListViewAdapter(this, initData());

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();
                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_LONG).show();
                }
                if (position == 2) {
                    Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_LONG).show();
                }
                if (position == 3) {
                    Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_LONG).show();
                }
                if (position == 4) {
                    Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_LONG).show();
                }
                if (position == 5) {
                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_LONG).show();
                }
                if (position == 6) {
                    Toast.makeText(getApplicationContext(), "7", Toast.LENGTH_LONG).show();
                }
                if (position == 7) {
                    Toast.makeText(getApplicationContext(), "8", Toast.LENGTH_LONG).show();
                }
                if (position == 8) {
                    Toast.makeText(getApplicationContext(), "9", Toast.LENGTH_LONG).show();
                }
                if (position == 9) {
                    Toast.makeText(getApplicationContext(), "10", Toast.LENGTH_LONG).show();
                }
                if (position == 10) {
                    Toast.makeText(getApplicationContext(), "11", Toast.LENGTH_LONG).show();
                }
                if (position == 11) {
                    Toast.makeText(getApplicationContext(), "12", Toast.LENGTH_LONG).show();
                }
                if (position == 12) {
                    Toast.makeText(getApplicationContext(), "13", Toast.LENGTH_LONG).show();
                }
                if (position == 13) {
                    Toast.makeText(getApplicationContext(), "14", Toast.LENGTH_LONG).show();
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
            cpuManufacturer = new Intent(PowerPower.this, MainMenu.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_cpu) {
            cpuManufacturer = new Intent(PowerPower.this, CPUManufacturer.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_motherboard) {
            cpuManufacturer = new Intent(PowerPower.this, MotherboardsSocket.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ram) {
            cpuManufacturer = new Intent(PowerPower.this, RAMTypeOfMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_hdd) {
            cpuManufacturer = new Intent(PowerPower.this, HDDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_ssd) {
            cpuManufacturer = new Intent(PowerPower.this, SSDMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_video_card) {
            cpuManufacturer = new Intent(PowerPower.this, GraphicsCardsMemory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_fan) {
            cpuManufacturer = new Intent(PowerPower.this, FansCategory.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_drive) {
            cpuManufacturer = new Intent(PowerPower.this, OpticalDrivesTypeOfTheOpticalDrive.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_tower) {
            cpuManufacturer = new Intent(PowerPower.this, TowersFormFactor.class);
            startActivity(cpuManufacturer);
        } else if (id == R.id.nav_power) {
            cpuManufacturer = new Intent(PowerPower.this, PowerPower.class);
            startActivity(cpuManufacturer);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
