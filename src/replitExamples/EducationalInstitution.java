package replitExamples;

public class EducationalInstitution {
private int years;

public EducationalInstitution(){

}


    public EducationalInstitution(int years){
        this.years = years;
    }

    String graduationRequirement(){
        return years+" years of study";
    }
}
