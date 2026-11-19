package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity is the entry point of the CampusLife application.
 * It displays the banner and the four service category buttons.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Key used to pass the selected category's index to DetailActivity.
     */
    public static final String EXTRA_POSITION =
            "com.example.assignmentone.EXTRA_POSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Starts DetailActivity for the given category index. The index is the
     * unique identifier DetailActivity uses to look up the correct data in
     * arrays.xml.
     */
    private void openDetail(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_POSITION, position);
        startActivity(intent);
    }

    /** Handles a tap on the Facilities button (index 0). */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        openDetail(0);
    }

    /** Handles a tap on the Events button (index 1). */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        openDetail(1);
    }

    /** Handles a tap on the Clubs button (index 2). */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        openDetail(2);
    }

    /** Handles a tap on the Support button (index 3). */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        openDetail(3);
    }
}
