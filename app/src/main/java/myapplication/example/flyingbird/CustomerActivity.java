package myapplication.example.flyingbird;

import static myapplication.example.flyingbird.MainActivity.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

public class CustomerActivity extends AppCompatActivity {

    private TextView flightNumberTextView;
    private TextView departureAirportTextView;
    private TextView arrivalAirportTextView;
    private TextView departureTimeTextView;
    private TextView arrivalTimeTextView;
    private TextView seatNumberTextView;

    private TextView flightDurationTextView;
    private Button okayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        flightNumberTextView = findViewById(R.id.flightNumber);
        departureAirportTextView = findViewById(R.id.departureAirport);
        arrivalAirportTextView = findViewById(R.id.arrivalAirport);
        departureTimeTextView = findViewById(R.id.departureTime);
        arrivalTimeTextView = findViewById(R.id.arrivalTime);
        seatNumberTextView = findViewById(R.id.seatNumber);
        flightDurationTextView = findViewById(R.id.flightDuration);
        okayButton = findViewById(R.id.okay);
    }

    @Override
    protected void onStart() {
        super.onStart();

        flightNumberTextView.setText("Flight Number : "+flight.getFlightNumber());
        departureAirportTextView.setText("Departure Airport: " + flight.getDepartureAirport());
        arrivalAirportTextView.setText("Arrival Airport: " + flight.getArrivalAirport());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
        departureTimeTextView.setText("Departure Time: " + simpleDateFormat.format(flight.getDepartureTime()));
        arrivalTimeTextView.setText("Arrival Time: " + simpleDateFormat.format(flight.getArrivalTime()));
        seatNumberTextView.setText("Seat Number: " +  new Random ().nextInt (1000));
        long milliseconds = flight.calculateFlightDuration();
        long seconds = milliseconds / 1000;
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        String durationString = String.format("%02d:%02d", hours, minutes);
        flightDurationTextView.setText("Flight Duration: " + durationString);
        okayButton.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                finish ();
            }
        });
    }

}