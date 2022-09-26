package zadatak1;


//Sportsman (name, lastname, personalID, Level) - parent
//Level enum (professional, semi-professional, amateur)
//Tennis (Sportsman ,ATP rank) -child
//Football (Sportsman, Position, value) -child
//Position (enum)


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tennis tennis1 = new Tennis("Novak","Djokovic", "02158745", Level.PROFESSIONAL, 1);
        Tennis tennis2 = new Tennis("Monika", "Seles", "021598756",Level.PROFESSIONAL,2);
        Tennis tennis3 = new Tennis("Rafael", "Nadal", "02359445", Level.SEMI_PROFESSIONAL, 10);

        Tennis tennis4 = new Tennis("Dusan","Klajic", "021525845", Level.AMATERUR, 105);
        Tennis tennis5 = new Tennis("Kim", "Kleisters", "021205856",Level.PROFESSIONAL,209);
        Tennis tennis6 = new Tennis("Rafael", "Nurmagomedov", "023589544", Level.SEMI_PROFESSIONAL, 10);

        Tennis tennis7 = new Tennis("Nenad","Zimonjic", "012478741", Level.PROFESSIONAL, 50);
        Tennis tennis8 = new Tennis("Olga", "Danilovic", "021598756",Level.AMATERUR,5);
        Tennis tennis9 = new Tennis("Diego", "Schwatzman", "21058746", Level.SEMI_PROFESSIONAL, 110);

        ArrayList<Tennis> list1 = new ArrayList<>();
        list1.add(tennis1);
        list1.add(tennis2);
        list1.add(tennis3);

        ArrayList<Tennis> list2 = new ArrayList<>();
        list2.add(tennis6);
        list2.add(tennis4);
        list2.add(tennis5);

        ArrayList<Tennis> list3 = new ArrayList<>();
        list3.add(tennis7);
        list3.add(tennis8);
        list3.add(tennis9);

        bestaPlayerOverall(bestPlayer(list1), bestPlayer(list2),bestPlayer(list3));

        Football football1 = new Football("Milan", "Baros","102587465",Level.PROFESSIONAL,100_000,Position.CF);
        Football football2 = new Football("Pavel", "Nedved", "12025874",Level.SEMI_PROFESSIONAL, 1_000_000,Position.DM);
        Football football3 = new Football("Predrag", "Luka","012574698",Level.AMATERUR,20_000,Position.LWB);
        Football football4 = new Football("Dejan", "Stankovic","012574554",Level.PROFESSIONAL,2_000_000,Position.SW);
        Football football5 = new Football("Jirzej","Dudek","54877410254",Level.SEMI_PROFESSIONAL,1_500_000,Position.GK);

        Football football6 = new Football("Clarence","Sedorf", "012478111",Level.PROFESSIONAL,5_000_000,Position.RWB);
        Football football7 = new Football("Raul", "Gonsalez", "01247741477", Level.AMATERUR,2_500_000,Position.AM);
        Football football8 = new Football("Aleksandar", "Mitrovic","012698745",Level.SEMI_PROFESSIONAL,6_000_000,Position.CF);
        Football football9 = new Football("Adama","Traore","02103980",Level.AMATERUR, 500_000,Position.LWB);
        Football football10 = new Football("Gianluigi", "Buffon","140502390",Level.PROFESSIONAL,1_000_000,Position.GK);

        ArrayList<Football> teamA = new ArrayList<>();
        ArrayList<Football> teamB = new ArrayList<>();

        teamA.add(football1);
        teamA.add(football2);
        teamA.add(football3);
        teamA.add(football4);
        teamA.add(football5);

        teamB.add(football6);
        teamB.add(football7);
        teamB.add(football8);
        teamB.add(football9);
        teamB.add(football10);

        mostExpensiveOverall(mostExpensiveInPlayer(teamA), mostExpensiveInPlayer(teamB));

    }

    public static Tennis bestPlayer(ArrayList<Tennis> listOfPlayers){
        Tennis bestPlayer = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < listOfPlayers.size(); i++) {
            if (listOfPlayers.get(i).getRankATP() < min) {
                min = listOfPlayers.get(i).getRankATP();
                bestPlayer = listOfPlayers.get(i);
            }
        }
        return bestPlayer;
    }

    public static void bestaPlayerOverall(Tennis player1, Tennis player2, Tennis player3){
        if (player1.getRankATP() < player2.getRankATP()){
            System.out.println(player1);
        } else if (player1.getRankATP() < player3.getRankATP()){
            System.out.println(player1);
        } else if (player2.getRankATP() < player1.getRankATP()) {
            System.out.println(player2);
        } else if (player2.getRankATP() < player3.getRankATP()) {
            System.out.println(player2);
        } else if (player3.getRankATP() < player1.getRankATP()) {
            System.out.println(player3);
        } else {
            System.out.println(player3);
        }
    }

    public static Football mostExpensiveInPlayer(ArrayList<Football> listOfPlayers){
        Football expensivePlayer = null;
        double max = 0;
        for (int i = 0; i < listOfPlayers.size(); i++) {
            if (listOfPlayers.get(i).getValue() > max){
                max = listOfPlayers.get(i).getValue();
                expensivePlayer = listOfPlayers.get(i);
            }

        }
        return expensivePlayer;
    }

    public static void mostExpensiveOverall(Football playerList1, Football playerList2){
        if (playerList1.getValue() > playerList2.getValue()){
            System.out.println(playerList1);
        }else if (playerList1.getValue() < playerList2.getValue()){
            System.out.println(playerList2);
        }else {
            System.out.println("They have the most expensive player of the same value.");
        }
    }
}