package day_47_inheritance_intro_02;

public class AudioBook extends Book {
    private double audioLength;
    private String narrator;

    //Listening to AudioBook written by Jackie chan with title Java in action
    //narrated by Maria

    public void listen(){
        System.out.println("Listening to AudioBook written by "+getAuthor()+" with title "+getTitle() +"narrated by "+getNarrator() /*or narrator possible*/);
    }

    public double getAudioLength(){
        return audioLength;
    }
    public void setAudioLength(double audioLength){
        this.audioLength =audioLength;
    }

    public String getNarrator(){
        return narrator;
    }
    public void setNarrator(String narrator){
        this.narrator = narrator;
    }


}
