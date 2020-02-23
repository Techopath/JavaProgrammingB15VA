package replitExamples;
/*
for the first three years this tree grows 1 cm each year, for the next years it grows 2 cm each adding year.
find out the growth of tree after 10 years.
 */
public class UtopeanTree_120 {
    public static void main(String[] args) {
        int year =0;
        int growthProgress =0;
        for (int i=1; i<=15;i++){
            if (i >= 1 && i<=3){
                growthProgress++;
                year ++;
                System.out.println("year "+year+" - growth 1 cm");
                System.out.println("tree size: "+growthProgress+"cm");
            }else if(i >3){
                growthProgress +=2;
                year ++;
                System.out.println("year "+year+" - growth 2 cm");
                System.out.println("tree size: "+growthProgress+"cm");
                if (i ==10){
                    break;
                }
            }
        }
        //System.out.println("Utopean Tree grew "+growthProgress+" cms in "+year+" years");
    }
}
