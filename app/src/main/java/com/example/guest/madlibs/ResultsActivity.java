package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultsActivity extends AppCompatActivity {
    @Bind(R.id.resultsView) TextView mResultsView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String adjective = intent.getStringExtra("adjective");
        String emotion = intent.getStringExtra("emotion");
        String place = intent.getStringExtra("place");

        mResultsView.setText("Once upon a time there was a very " + adjective + " princess, who lived alone atop a tall tower. She was alone all the time, which left her feeling bored and " + emotion + ". One day, the princess decided to " + verb + " away from her tower, so she did. Last I heard, she moved off to " + place + " to become a " + noun + ".");
    }
}
