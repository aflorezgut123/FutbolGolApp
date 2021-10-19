package co.org.poli.Entity;

import java.io.Serializable;

public class Match implements Serializable {
    private Team homeTeam;
    private Team visitingTeam;
    private int homeTeamGoals;
    private int visitingTeamGoals;

    public Match(Team homeTeam, Team visitingTeam, int homeTeamGoals, int visitingTeamGoals) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamGoals = homeTeamGoals;
        this.visitingTeamGoals = visitingTeamGoals;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(Team visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public int getVisitingTeamGoals() {
        return visitingTeamGoals;
    }

    public void setVisitingTeamGoals(int visitingTeamGoals) {
        this.visitingTeamGoals = visitingTeamGoals;
    }
}
