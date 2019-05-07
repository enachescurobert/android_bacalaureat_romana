package com.example.bacalaureat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public boolean isDrawerFixed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        isDrawerFixed = getResources().getBoolean(R.bool.isDrawerFixed);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "în curând", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                messageTowardsTheAdmin();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        if (!isDrawerFixed) {
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();
            //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        navigationView.setCheckedItem(R.id.nav_home);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            if (!isDrawerFixed) {
                drawer.closeDrawer(GravityCompat.START);
            }
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
            //return true;
            Toast.makeText(MainActivity.this, "în curând",
                    Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        } else if (id == R.id.moara_cu_noroc) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MoaraFragment()).commit();
        } else if (id == R.id.baltagul) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BaltagulFragment()).commit();
        } else if (id == R.id.ion) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new IonFragment()).commit();
        } else if (id == R.id.la_tiganci) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TiganciFragment()).commit();
        } else if (id == R.id.harap_alb) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HarapAlbFragment()).commit();
        } else if (id == R.id.alexandru_lapusneanu) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LapusneanuFragment()).commit();
        } else if (id == R.id.enigma_otiliei) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new EnigmaOtilieiFragment()).commit();
        } else if (id == R.id.ultima_noapte) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new UltimaNoapteFragment()).commit();
        } else if (id == R.id.nav_share) {
            sendIntentToYourMate();
        } else if (id == R.id.nav_send) {
            sendIntentToYourMate();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (!isDrawerFixed) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    public void sendIntentToYourMate(){
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "BAC-ul e aproape!");
        shareIntent.putExtra(Intent.EXTRA_TEXT,
                "Salut! Trebuie neapărat să descarci aplicația asta dacă vrei notă mare la BAC.\n\n" +
                        "https://play.google.com/store/apps/details?id=" +
                        BuildConfig.APPLICATION_ID);
        shareIntent.setType("text/plain");
        startActivity(Intent.createChooser(shareIntent, "share via"));
    }

    public void messageTowardsTheAdmin(){
        String[] mailOfAdmins ={"enachescurobert@gmail.com"};
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_EMAIL, mailOfAdmins);
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,
                "Legat de aplicatia " +
                        getApplicationInfo().loadLabel(getPackageManager()).toString()
                );
        shareIntent.setType("text/plain");
        startActivity(Intent.createChooser(shareIntent, "Scrie un mesaj administratorului prin:"));
    }
}
