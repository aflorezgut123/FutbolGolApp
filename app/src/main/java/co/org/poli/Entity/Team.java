package co.org.poli.Entity;

import java.io.Serializable;

public class Team implements Serializable {
    private String nameTeam;

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }
}
