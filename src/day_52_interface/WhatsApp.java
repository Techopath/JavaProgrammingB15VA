package day_52_interface;
/*this class is a concrete class, not an abstract class.
This class is extending MessagingApp
and implementing VideoCallable and VoiceCallable interfaces */

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{


    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending message - "+msg+" ...");
    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp making a call with Mr. Nadir ...");

    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp is calling "+contact);



    }
}
