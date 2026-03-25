package com.sharanya.bms_college_project;  // ← Match your actual package

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Your coffee-themed home page

        // Events Button
        MaterialButton btnEvents = findViewById(R.id.btnEvents);
        if (btnEvents != null) {
            btnEvents.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, EventsActivity.class);
                    startActivity(intent);
                }
            });
        }

        // About Button
        MaterialButton btnAbout = findViewById(R.id.btnAbout);
        if (btnAbout != null) {
            btnAbout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this,
                            "☕ Campus Hub - Your Campus Coffee Companion",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        // Lost Items Button
        // Lost Items Button
        MaterialButton btnLost = findViewById(R.id.btnLost);
        if (btnLost != null) {
            btnLost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, LostItemsActivity.class);
                    startActivity(intent);
                }
            });
        }

        // Setup club cards
        setupClubCards();
    }

    private void setupClubCards() {
        View cardTech = findViewById(R.id.cardTech);
        if (cardTech != null) {
            cardTech.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this,
                            "💻 Tech Club - Code & Coffee events every Friday!",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        View cardArt = findViewById(R.id.cardArt);
        if (cardArt != null) {
            cardArt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this,
                            "🎨 Art Club - Latte Art workshops every Wednesday!",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        View cardMusic = findViewById(R.id.cardMusic);
        if (cardMusic != null) {
            cardMusic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this,
                            "🎵 Music Club - Jazz nights every Saturday!",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

        View cardSports = findViewById(R.id.cardSports);
        if (cardSports != null) {
            cardSports.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this,
                            "⚽ Sports Club - Coffee Kickoff every Monday!",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}