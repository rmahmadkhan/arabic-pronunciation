package dev.ahmadkhan.arabic_pronunciation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TestActivity extends AppCompatActivity {

    String[] letters = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    String[] emissionPoints= {"Halqiyah","Shafaweeyah","Niteeyah", "Lisaveyah", "ShajariyahHaafiyah", "Halqiyah", "Halqiyah", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "ShajariyahHaafiyah", "Asleeyah", "ShajariyahHaafiyah", "Niteeyah", "Lisaveyah", "Halqiyah","Halqiyah", "Shafaweeyah", "Lahatiyah", "Lahatiyah", "Tarfiyah", "Ghunna", "Halqiyah", "Shafaweeyah", "ShajariyahHaafiyah", "Halqiyah", "Halqiyah", "Halqiyah"};


    int index = 0;
    int score = 0;

    TextView textViewLetter;
    TextView textViewAnswer;
    TextView textViewScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textViewLetter.setText(letters[index++]);
    }

    public void onClickNiteeyah(View view) {
    }

    public void onClickHalqiyah(View view) {
    }

    public void onClickLisaveyah(View view) {
    }

    public void onClickGhunna(View view) {
    }

    public void onClickLahatiyah(View view) {
    }

    public void onClickTarfiyah(View view) {
    }

    public void onClickShafaweeyah(View view) {
    }

    public void onClickThalqeeyah(View view) {
    }

    public void onClickAsleeyah(View view) {
    }

    public void onClickShajariyahHaafiyah(View view) {
    }

    public void onClickNext(View view) {
        textViewScore.setText(Integer.toString(score));
        if(index > 29){
            textViewLetter.setText("Questions completed");
        }
        else{
            textViewLetter.setText(letters[index++]);
        }
    }

    public void onClickFinish(View view) {
    }
}