package co.org.poli.futbolgolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import co.org.poli.Entity.Match;

public class MatchActvity extends AppCompatActivity {

    private TextView firstTeam;
    private TextView secondTeam;
    private Intent dataMainActivity;
    private Match  match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_actvity);

        firstTeam = findViewById(R.id.textNameF);
        secondTeam = findViewById(R.id.textNameS);

        //Get Intent mainActivity
        dataMainActivity = getIntent();
        match =  (Match) dataMainActivity.getSerializableExtra("currentMatch");

        firstTeam.setText(match.getHomeTeam().getNameTeam());
        secondTeam.setText(match.getVisitingTeam().getNameTeam());
    }


}