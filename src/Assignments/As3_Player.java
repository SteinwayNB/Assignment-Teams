package Assignments;

public class As3_Player {
    private String name;
    private int memberID;
    private int age;
    private boolean isMarried;

    public As3_Player (String n, int ID, int a, boolean iM){
        name = n;
        memberID = ID;
        age = a;
        isMarried = iM;
    }
    public void printMe(){
        System.out.println("name: "+name+", ID: "+memberID+", age: "+age+", married: "+isMarried);
    }
    public void addOneAge(){
        age ++;
    }
    public void gettingMarried(){
        isMarried = true;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
