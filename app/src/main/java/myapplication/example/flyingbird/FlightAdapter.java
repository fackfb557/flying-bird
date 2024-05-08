package myapplication.example.flyingbird;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FlightAdapter  extends ArrayAdapter<Flight> {

    public FlightAdapter(Context context, ArrayList<Flight> flights) {
        super(context, 0, flights);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Flight flight = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_flight, parent, false);
        }

        TextView flightNumberTextView = convertView.findViewById(R.id.flightNumber);
        TextView airportsTextView = convertView.findViewById(R.id.airports);
        TextView startTimeTextView = convertView.findViewById(R.id.startTime);
        TextView endTimeTextView = convertView.findViewById(R.id.endTime);

        flightNumberTextView.setText("Flight Number: " + flight.getFlightNumber());
        airportsTextView.setText("From " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());

        startTimeTextView.setText("Start Time: " +flight.getDepartureTime());
        endTimeTextView.setText("End Time: " +flight.getArrivalTime());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(parent.getContext (), EditFlightActivity.class);
                parent.getContext ().startActivity(intent);
            }
        });
        return convertView;
    }
}
