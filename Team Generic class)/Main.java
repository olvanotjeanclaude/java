import main.*;

public class Main {
    public static void main(String[] args) {
        BasketPlayer basketPlayer1= new BasketPlayer("olvanot");
        BasketPlayer basketPlayer2= new BasketPlayer("Jacquinot");
        BasketPlayer basketPlayer3= new BasketPlayer("Olga");

        FootBallPlayer footBallPlayer1 = new FootBallPlayer("Umit");
        FootBallPlayer footBallPlayer2 = new FootBallPlayer("manana");
        FootBallPlayer footBallPlayer3 = new FootBallPlayer("Fenosoa");
        FootBallPlayer footBallPlayer4 = new FootBallPlayer("Umit");

        Team<BasketPlayer> basketTeam= new Team<>("Malagasy football miray hina");
        Team<FootBallPlayer> footballTeam = new Team<>("Chicago team");

        basketTeam.addPlayer(basketPlayer1);
        basketTeam.addPlayer(basketPlayer2);
        basketTeam.addPlayer(basketPlayer3);

        footballTeam.addPlayer(footBallPlayer1);
        footballTeam.addPlayer(footBallPlayer2);
        footballTeam.addPlayer(footBallPlayer1);
        footballTeam.addPlayer(footBallPlayer3);
        footballTeam.addPlayer(footBallPlayer4);

        

        System.out.println(basketTeam.toString());
        System.out.println(footballTeam.toString());
    }
}
