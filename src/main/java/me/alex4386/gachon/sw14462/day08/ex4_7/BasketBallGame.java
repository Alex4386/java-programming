package me.alex4386.gachon.sw14462.day08.ex4_7;

public class BasketBallGame {
    private String teamName1 = "";
    private String teamName2 = "";

    private int teamScore1 = 0;
    private int teamScore2 = 0;

    private BasketBallGameStatus status = BasketBallGameStatus.IN_PROGRESS;

    public void setTeamNames(String team1, String team2) {
        this.teamName1 = team1;
        this.teamName2 = team2;
    }

    public String[] getTeamNames() {
        return new String[] { this.teamName1, this.teamName2 };
    }

    private void addTeamScore(int teamIdx, int score) {
        if (teamIdx == 1) {
            this.teamScore1 += score;
        } else if (teamIdx == 2) {
            this.teamScore2 += score;
        }
    }

    public void addTeam1Point(int teamIdx) {
        this.addTeamScore(teamIdx, 1);
    }

    public void addTeam2Point(int teamIdx) {
        this.addTeamScore(teamIdx, 2);
    }

    public void addTeam3Point(int teamIdx) {
        this.addTeamScore(teamIdx, 3);
    }

    public void finishGame() {
        this.status = BasketBallGameStatus.FINISHED;
    }

    public int[] getTeamScores() {
        return new int[] { this.teamScore1, this.teamScore2 };
    }

    public String getWinningTeamName() {
        if (this.teamScore2 > this.teamScore1) {
            return this.teamName2;
        } else if (this.teamScore1 > this.teamScore2) {
            return this.teamName1;
        } else {
            return null;
        }
    }
}

enum BasketBallGameStatus {
    IN_PROGRESS,
    FINISHED,
}
