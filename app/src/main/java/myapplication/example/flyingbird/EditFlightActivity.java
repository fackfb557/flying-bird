package myapplication.example.flyingbird;

import static myapplication.example.flyingbird.MainActivity.flight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class EditFlightActivity extends AppCompatActivity {

    private EditText flightNumberEditText;
    private EditText departureAirportEditText;
    private EditText arrivalAirportEditText;
    private EditText departureTimeEditText;
    private EditText arrivalTimeEditText;

    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_edit_flight);
        flightNumberEditText = findViewById (R.id.flightNumber);
        departureAirportEditText = findViewById (R.id.departureAirport);
        arrivalAirportEditText = findViewById (R.id.arrivalAirport);
        departureTimeEditText = findViewById (R.id.departureTime);
        arrivalTimeEditText = findViewById (R.id.arrivalTime);
        saveButton = findViewById (R.id.save);


    }

    @Override
    protected void onStart() {
        super.onStart ( );
        flightNumberEditText.setText (flight.getFlightNumber ());
        departureAirportEditText.setText (flight.getDepartureAirport ());
        arrivalAirportEditText.setText ( flight.getArrivalAirport () );
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
        String departureTimeString = dateFormat.format(flight.getDepartureTime());
        departureTimeEditText.setText(departureTimeString);
        String arrivalTimeString = dateFormat.format(flight.getArrivalTime());
        arrivalTimeEditText.setText(arrivalTimeString);



                saveButton.setOnClickListener (new View.OnClickListener ( ) {
                    @Override
                    public void onClick(View v) {
                        try {
                            flight.setDepartureTime (dateFormat.parse (departureTimeEditText.getText ( ).toString ( )));
                            flight.setArrivalTime (dateFormat.parse (arrivalTimeEditText.getText ( ).toString ( )));
                            flight.setFlightNumber (flightNumberEditText.getText ( ).toString ( ));
                            flight.setDepartureAirport (departureAirportEditText.getText ( ).toString ( ));
                            flight.setArrivalAirport (arrivalAirportEditText.getText ( ).toString ( ));
                            Toast.makeText (EditFlightActivity.this, "Data Changed Successfully", Toast.LENGTH_LONG).show ( );

                            finish ();
                        } catch (Exception e) {
                            Toast.makeText (EditFlightActivity.this, e.getMessage ( ), Toast.LENGTH_LONG).show ( );
                        }

                    }
                });


    }
}