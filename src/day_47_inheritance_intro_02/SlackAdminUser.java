package day_47_inheritance_intro_02;

public class SlackAdminUser extends SlackUser{ //child class created using extends SlackUser

    int adminID;
    public void sendChannelMessage(String msg){
        System.out.println("SlackUser "+name+" sending @channel msg ...");
    }

    public void deleteChannelMessage(String msg){
        System.out.println("SlackUser "+name+" whose id is "+adminID+" is deleting the msg");
    }

}
