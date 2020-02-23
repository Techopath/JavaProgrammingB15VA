package replitExamples;
import java.util.*;
public class LawSchool extends EducationalInstitution {

    public LawSchool(){
        super(3);
    }

    String graduationRequirement(){
        return ""+super.graduationRequirement()+" and passing the bar";
    }


}
