package co.org.poli.futbolgolapp;

import androidx.appcompat.app.AppCompatActivity;
import co.org.poli.Entity.Match;
import co.org.poli.Entity.Team;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Match match;
    private Team FirstTeam;
    private Team secondTeam;
    private EditText etFirstTeam;
    private EditText etSecondTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstTeam = findViewById(R.id.idFirstTeam);
        etSecondTeam = findViewById(R.id.idSecondTeam);
    }

    public void startMatch(View view){

        FirstTeam = new Team(etFirstTeam.getText().toString());
        secondTeam = new Team(etSecondTeam.getText().toString());
        match = new Match(FirstTeam, secondTeam, 0, 0);
        //Create Intent of second activity
        Intent matchActivity = new Intent(this, MatchActvity.class);

        matchActivity.putExtra("currentMatch", match);
        startActivity(matchActivity);
    }
}