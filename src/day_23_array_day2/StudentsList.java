package day_23_array_day2;

public class StudentsList {
    public static void main(String[] args) {
        String[] students = new String[9];
        students[0] = "Merdan";
        students[1] = "Julisia";
        students[2] = "Edilbek";
        students[3] = "Aika";
        students[4] = "Tahmina";
        students[5] = "Violetta";
        students[6] = "Gunel";
        students[7] = "Yana";
        students[8] = "Furkan";

        String[] student2 = {"Merdan", "Julisia", "Edilbek", "Aika", "Tahmina", "Violetta", "Gunel", "Yana", "Furkan"};
//print students count
//"total students: 9"
        System.out.println("Total student: " + "" + students.length);
//print first student
        System.out.println("first student: " + students[0]);
//using for Loop print.
        //edilbek >> 7
        // aika >>4
        //tahmina >> 7

        for (int i = 0; i < students.length; i++) {
            System.out.println(i+"." +students[i] + ">>" + students[i].length());

        }
        System.out.println();
        //for each loop
        for (String friend : students){
            System.out.println(friend+" >> " +friend.length());
        }
        //for each loop
        int count =0;
        for (String friend : students){
            count ++;
            System.out.println(count +"."+friend+" >> " +friend.length());

        }
        System.out.println();
        String allFriends = "";
        for (int i=0; i<students.length; i++){
            allFriends = allFriends+" "+students[i]+", ";


            //allFriends = allFriends.replace(",", " ");
        }
        allFriends = allFriends.substring(0, allFriends.length()-2);
        System.out.println(allFriends);

        ///print two friends at a time.
        /*
        "Merdan", "Julisia"
         "Edilbek", "Aika"
          "Tahmina", "Violetta"
           "Gunel", "Yana"
            "Furkan"
         */
        String twoAtATime = "";
        for (int j = 0; j < students.length; j+=2) {
            if(j == students.length-1){//??????
                System.out.println(students[j]);
            }else{
                System.out.println(students[j] +" " +students[j+1] );

            }






        }





    }
}