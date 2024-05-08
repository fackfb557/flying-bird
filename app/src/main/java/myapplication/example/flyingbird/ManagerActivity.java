package myapplication.example.flyingbird;

import static myapplication.example.flyingbird.MainActivity.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_manager);
    }

    @Override
    protected void onStart() {
        super.onStart ( );
        ArrayList<Flight> listOfFlights = new ArrayList<Flight> ();
        for(int i = 0; i < 10; i++)
            listOfFlights.add (flight);
        ListView listView = findViewById(R.id.listView);
        FlightAdapter adapter = new FlightAdapter(this,listOfFlights );
        listView.setAdapter(adapter);
    }
}