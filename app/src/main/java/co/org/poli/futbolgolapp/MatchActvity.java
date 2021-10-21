package co.org.poli.futbolgolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import co.org.poli.Entity.Match;

public class MatchActvity extends AppCompatActivity {

    private TextView firstTeam;
    private TextView secondTeam;
    private TextView countOne;
    private TextView countTwo;
    private Intent dataMainActivity;
    private Match match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_actvity);

        firstTeam = findViewById(R.id.textNameF);
        secondTeam = findViewById(R.id.textNameS);
        countOne = findViewById(R.id.textContOne);
        countTwo = findViewById(R.id.textContTwo);

        //Get Intent mainActivity
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");

        firstTeam.setText(match.getHomeTeam().getNameTeam());
        secondTeam.setText(match.getVisitingTeam().getNameTeam());
        countOne.setText(String.valueOf(match.getHomeTeamGoals()));
        countTwo.setText(String.valueOf(match.getVisitingTeamGoals()));
    }

    public void addPointOneE1(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setHomeTeamGoals(match.getHomeTeamGoals() + 1);
        countOne.setText(String.valueOf(match.getHomeTeamGoals()));

    }

    public void addPointTwoE1(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setHomeTeamGoals(match.getHomeTeamGoals() + 2);
        countOne.setText(String.valueOf(match.getHomeTeamGoals()));
    }

    public void addPointThreeE1(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setHomeTeamGoals(match.getHomeTeamGoals() + 3);
        countOne.setText(String.valueOf(match.getHomeTeamGoals()));
    }

    public void addPointOneE2(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setVisitingTeamGoals(match.getVisitingTeamGoals() + 1);
        countTwo.setText(String.valueOf(match.getVisitingTeamGoals()));

    }

    public void addPointTwoE2(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setVisitingTeamGoals(match.getVisitingTeamGoals() + 2);
        countTwo.setText(String.valueOf(match.getVisitingTeamGoals()));
    }

    public void addPointThreeE2(View view) {
        dataMainActivity = getIntent();
        match = (Match) dataMainActivity.getSerializableExtra("currentMatch");
        match.setVisitingTeamGoals(match.getVisitingTeamGoals() + 3);
        countTwo.setText(String.valueOf(match.getVisitingTeamGoals()));
    }
}
