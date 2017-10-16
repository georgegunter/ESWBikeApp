package com.example.cubikerouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class PreRideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_ride);

        // set up autocomplete suggestions for origin/destination inputs
        AutoCompleteTextView originInput = (AutoCompleteTextView) findViewById(R.id.origin_input);
        AutoCompleteTextView destinationInput = (AutoCompleteTextView) findViewById(R.id.destination_input);

        // suggestions defined in res/values/strings.xml
        // TODO: expand autocomplete suggestions (will probably need some sophisticated than a string array when we start dealing with lots of locations)
        String[] places = getResources().getStringArray(R.array.places_array);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, places);

        originInput.setAdapter(adapter);
        destinationInput.setAdapter(adapter);


        Button startRideButton = (Button) findViewById(R.id.start_ride_button);

        startRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RideActivity.class);
                startActivity(intent);
            }
        });
    }
}
