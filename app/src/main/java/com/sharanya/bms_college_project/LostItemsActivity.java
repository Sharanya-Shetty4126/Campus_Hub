package com.sharanya.bms_college_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class LostItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lost_items_page);

        // Back Button
        MaterialButton btnBack = findViewById(R.id.btnBack);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish(); // Go back to home
                }
            });
        }

        // Claim Button for Item 1 (Library)
        MaterialButton btnClaim1 = findViewById(R.id.btnClaim1);
        if (btnClaim1 != null) {
            btnClaim1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LostItemsActivity.this,
                            "📚 Claim request sent for Student ID Card! Visit Library to collect.",
                            Toast.LENGTH_LONG).show();
                }
            });
        }

        // Claim Button for Item 2 (Canteen)
        MaterialButton btnClaim2 = findViewById(R.id.btnClaim2);
        if (btnClaim2 != null) {
            btnClaim2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LostItemsActivity.this,
                            "☕ Claim request sent for Coffee Mug! Visit Canteen to collect.",
                            Toast.LENGTH_LONG).show();
                }
            });
        }

        // Claim Button for Item 3 (Sports Complex)
        MaterialButton btnClaim3 = findViewById(R.id.btnClaim3);
        if (btnClaim3 != null) {
            btnClaim3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(LostItemsActivity.this,
                            "🏸 Claim request sent for Badminton Racket! Visit Sports Complex to collect.",
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}