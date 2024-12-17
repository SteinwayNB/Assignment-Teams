package Assignments;

public class As3_Player {
    private String namep;
    private int memberID;
    private int age;
    private boolean isMarried;

    public As3_Player (String n, int ID, int a, boolean iM){
        namep = n;
        memberID = ID;
        age = a;
        isMarried = iM;
    }
    public void printMe(){
        System.out.println("name: "+namep+", ID: "+memberID+", age: "+age+", married: "+isMarried);
    }
    public void addOneAge(){
        age ++;
    }
    public void gettingMarried(){
        isMarried = true;

    }
    public String toString(){
        return "Player Name: "+namep+", ID: "+memberID+", Age: "+age+", is married?: "+isMarried;
    }
    public int toAge(){
        return age;
    }

    public String getName() {
        return namep;
    }

    public void setName(String name) {
        this.namep = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
