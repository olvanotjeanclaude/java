package main;
import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> players;
    private ArrayList<String> teams;

    public Team(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.players = new ArrayList<T>();
    }

    public boolean addPlayer(T player) {
        if (this.players.contains(player)) {
            System.out.println("Player " + player.getName() + " already exists. PLease find another name");
            return false;
        }
        this.players.add(player);
        System.out.println(player.getName() + " added successfully!");
        return true;
    }

    @Override
    public String toString() {
        String text = "Team :" + this.name + "\n";
        for (T player : players) {
            text +=player.getName() + "\n";
        }

        return text;
    }

    public boolean addTeam(String name) {
        if (this.teams.contains(name)) {
            return false;
        }
        this.teams.add(name);
        return true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getPlayers() {
        return players;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }
}