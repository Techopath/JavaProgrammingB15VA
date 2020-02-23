package day_21_For_loop_4_arrayintro;

public class LookForError {
    public static void main(String[] args) {


        String log = "<error:atable style=display: none;<tbody><error:btr id=edit_rubric>" +
                "<td coerror:qlspan=4><form id=error:jedit_rubric_form " +
                "class=edit-rubric-formerror:p no-margin-bottom>error:a";

//count number of errors
        //loook for 'error' text inside the log
        //optionally also print type of error
        int errorCount = 0;

        for (int i=0; i <log.length()-4; i++) {
            //System.out.println(log.substring(i, i+5));
            String tempStr =log.substring(i, i+5);

            if(tempStr.equals("error")) {
                System.out.println("Error found at  Index - " + i);
                errorCount++;
                //<error:a. Print error type
                System.out.println("ERROR TYPE: " + log.charAt(i+6));


            }
        }
            if (errorCount>0){
                System.out.println("Error count: " +errorCount);
            }else{
                System.out.println("\"No errors found!\"");
            }




    }


}
