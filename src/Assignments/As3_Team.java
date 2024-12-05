package Assignments;

public class As3_Team {
    private String name;
    private String region;
    private int numAlbums;
    private int time;
    private String conductor;
    private int earnings;

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
}