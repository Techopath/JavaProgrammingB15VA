package replitExamples;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int param){
        if(param ==25 && timeLeft <maxTime ){
            timeLeft = timeLeft +30;

        }else{
            timeLeft = timeLeft;
        }

        if (timeLeft >maxTime ){
            return true;
        }else{
           return false;
        }

    }

    public void tick(){
        if (timeLeft >0){
            timeLeft --;

        }
    }

    public boolean isExpired(){
        if (timeLeft ==0){
            return true;
        }else{
            return false;
        }
    }

}
