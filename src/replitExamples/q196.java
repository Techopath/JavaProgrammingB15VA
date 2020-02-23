package replitExamples;

public class q196 {

    private String data;
    private int yint;

    public void insertData(String data, int yint){
        this.data = data;
        if(yint>0 && yint<20){
            this.yint = yint;
        }else{
            System.out.println("invalid numbers: ");
        }


    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getYint(){
        return yint;
    }
    public void setYint(int yint){
        this.yint = yint;
    }

}
