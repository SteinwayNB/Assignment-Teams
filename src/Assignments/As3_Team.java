package Assignments;

import java.util.ArrayList;

public class As3_Team {
    private String name;
    private String region;
    private int numAlbums;
    private int time;
    private String conductor;
    private int earnings;
    private ArrayList<As3_Player> allPlayers = new ArrayList<>();

    public As3_Team(String n, String r, int nA, int t, String d, int en ){
        name = n;
        region = r;
        numAlbums = nA;
        time = t;
        conductor =d;
        earnings = en;
    }




    public void printMe(){
        System.out.println("name: "+name+", region: "+region+", number of albums: "+numAlbums+", history: "+time+" years, conductor: "+conductor+", earnings: $"+earnings+"K");
    }


    public int getEarnings() {
        return earnings;
    }

    public String getConductor() {
        return conductor;
    }

    public int getTime() {
        return time;
    }

    public int getNumAlbums() {
        return numAlbums;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }
    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }



    public void addPlayer(String n, int ID, int a, boolean iM){
        this.allPlayers.add(new As3_Player(n,ID, a, iM));
    }

    public ArrayList<As3_Player> getAllPlayers() {
        return allPlayers;
    }


    public void printPlay(){
        for (As3_Player player: allPlayers) {
            System.out.println(player.toString());
        }
    }
    public void printAgeSum(){
        int sum = 0;
        for (As3_Player player: allPlayers){
            sum += player.getAge();
        }
        System.out.println(sum);
    }
    public void findPlayer(String nm, int anm){
        int tempStore = -1;
        for (int i = 0; i < allPlayers.size(); i++) {
            if(nm.equalsIgnoreCase(allPlayers.get(i).getName())){
                tempStore = i;
            }
        }
        if(tempStore != -1){
            allPlayers.get(tempStore).setAge(anm);
        }


    }

}