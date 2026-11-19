package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity shows information about the category the user selected.
 *
 * The selected category is identified by an index passed through the Intent.
 * That index is used to read the matching title, content and image name from
 * the three string arrays in arrays.xml. No if/switch statements are used.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve the unique identifier sent by MainActivity.
        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_POSITION, 0);

        // Look up the data arrays.
        String[] images = getResources().getStringArray(R.array.string_array_images);
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);

        // Use the position as an index into each array.
        String imageName = images[position].trim();
        String title = titles[position];
        String content = contents[position];

        // Find the drawable at runtime from its name and apply all three values.
        int imageResId = getResources().getIdentifier(
                imageName, "drawable", getPackageName());

        ImageView detailImage = findViewById(R.id.detail_image);
        TextView shortTitle = findViewById(R.id.detail_short_title);
        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailContent = findViewById(R.id.detail_content);

        detailImage.setImageResource(imageResId);
        // Derive the short banner name from the image name, e.g.
        // "img_btn_facilities" -> "Facilities", without any conditionals.
        shortTitle.setText(toTitleCase(imageName
                .replace("img_btn_", "")
                .replace('_', ' ')));
        detailTitle.setText(title);
        detailContent.setText(content);
    }

    /**
     * Capitalises the first letter of a string ("facilities" -> "Facilities").
     */
    private String toTitleCase(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
