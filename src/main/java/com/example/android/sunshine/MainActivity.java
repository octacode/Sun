package com.example.android.sunshine;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
    */
    /**
     * a fragment is a modular container within your activity
     */
    public static class PlaceholderFragment extends Fragment{


        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Rainy -43/60",
                "Wed - Sunny - 88/63",
                "Thurs - Rainy -43/60",
                "Fri - Sunny - 88/63",
                "Sat - Rainy -43/60",
        };
        ArrayList<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        @Override
        public View onCreateView(LayoutInflater inflater , ViewGroup content,Bundle savedInstanceState)
        {
            View rootView = inflater.inflate(R.layout.fragment_main,content);
            ArrayAdapter<String> mForecastAdapter =new ArrayAdapter<String>(
                    //The current context (this fragment's parent activity
                    getActivity(),
                    //the id of listview
                    R.layout.list_item_forecast,
                    //id of textview to populate
                    R.id.list_item_forecast_textView,
                    //This week's forecast
                    weekForecast);
            ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);
            listView.setAdapter(mForecastAdapter);
            return rootView;
        }

    }

}
