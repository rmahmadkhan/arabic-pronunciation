package dev.ahmadkhan.arabic_pronunciation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    Button buttonShare;
    TextView textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        int score = getIntent().getExtras().getInt("Score");
        textViewScore = findViewById(R.id.textViewScore2);
        textViewScore.setText(Integer.toString(score));
    }

    public void onClickShare(View view) {
        String result = textViewScore.getText().toString();
        String message = "My score in makhārij al-ḥurūf is " + result + "/30";
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);
    }

    public void onClickHome(View view) {
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        startActivity(intent);
    }
}