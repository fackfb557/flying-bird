package myapplication.example.flyingbird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
  Button managerButton , customerButton;
   private static final Date departureTime = new Date ();
    private static final Date arrivalTime = new Date(System.currentTimeMillis() + 3600000);
    public static  Flight flight = new Flight("1", "DXB", "GACA", departureTime, arrivalTime);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        managerButton =  findViewById (R.id.manager);
        customerButton =  findViewById (R.id.customer);
    }

    @Override
    protected void onStart() {
        super.onStart ( );
        managerButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ManagerActivity.class);
                startActivity(intent);
            }
        });
        customerButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CustomerActivity.class);
                startActivity(intent);
            }
        });
    }
}