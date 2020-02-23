package replitExamples;

public class School {
    public static void main(String[] args) {
        LawSchool ls = new LawSchool();
        System.out.println(ls.graduationRequirement());

        EducationalInstitution ei = new EducationalInstitution();

        System.out.println(ei.graduationRequirement());
    }
}
