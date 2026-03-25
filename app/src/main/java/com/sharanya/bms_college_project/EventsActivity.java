package com.sharanya.bms_college_project;  // ← Match your actual package

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_page);  // Now R will be found

        // Back Button
        MaterialButton btnBack = findViewById(R.id.btnBack);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }

        // Add Event Button
        MaterialButton btnAddEvent = findViewById(R.id.btnAddEvent);
        if (btnAddEvent != null) {
            btnAddEvent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(EventsActivity.this,
                            "✨ Add Event - UI Demo Only",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}