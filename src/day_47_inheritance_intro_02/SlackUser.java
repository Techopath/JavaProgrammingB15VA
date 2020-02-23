package day_47_inheritance_intro_02;

public class SlackUser {    //parent class

    String name;
    String status;



    public void sendMessage(String msg){
        System.out.println("SlackUser "+name+" is "+status+" and typing ...["+msg+"]");
    }
    public void callSomeone(){
        System.out.println("SlackUser "+name+" is calling someone ..");
    }
    public void addEmoji(String emoji){
        System.out.println("SlackUser "+name+" is adding some funny emoji like ["+emoji+"]");
    }

}
