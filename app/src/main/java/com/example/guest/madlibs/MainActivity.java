package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.inputNoun) EditText mInputNoun;
    @Bind(R.id.inputVerb) EditText mInputVerb;
    @Bind(R.id.inputAdjective) EditText mInputAdjective;
    @Bind(R.id.inputEmotion) EditText mInputEmotion;
    @Bind(R.id.inputPlace) EditText mInputPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mSubmitButton) {
            String noun = mInputNoun.getText().toString();
            String verb = mInputVerb.getText().toString();
            String adjective = mInputAdjective.getText().toString();
            String emotion = mInputEmotion.getText().toString();
            String place = mInputPlace.getText().toString();
            Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
            intent.putExtra("noun", noun);
            intent.putExtra("verb", verb);
            intent.putExtra("adjective", adjective);
            intent.putExtra("emotion", emotion);
            intent.putExtra("place", place);
            startActivity(intent);
        }
    }
}
