package day_47_inheritance_intro_02;

public class SlackApp {
    public static void main(String[] args) {

        SlackUser member1 = new SlackUser();

        member1.name = "Ali";
        member1.status = "online";

        member1.sendMessage("hello there");
        member1.callSomeone();
        member1.addEmoji("haha");

        SlackAdminUser member2 = new SlackAdminUser();
        member2.name = "Selim";
        member2.status ="relaxing";
        member2.adminID = 280293939;
        member2.sendMessage("God bless each of you");
        member2.callSomeone();
        member2.addEmoji("tired");
        member2.sendChannelMessage("Everyone is fine?");
        member2.deleteChannelMessage("fine?");
    }
}

