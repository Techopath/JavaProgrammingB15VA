package day_14_string_manipulation;

public class stringStartsEndsWith {
    public static void main(String[] args) {
        String selenium = "Selenium";
        System.out.println(selenium.startsWith("sel"));//true
        System.out.println(selenium.endsWith("ium"));//true
        System.out.println(selenium.startsWith("Sel"));
        System.out.println(selenium.contains("len"));
        System.out.println(selenium.endsWith(" um")); ///false because of space
        //Mr. --> man
        //Mrs ..> married woman
        // Ms. ..> single woman
        //Dr. ..> Doctor
        //Prof. ..> Professor
        String name ="Mr.Omer, Ms.Aysha";
        if (name.startsWith("Mr.")){
            System.out.println("Man");
        }else if (name.startsWith("Ms")){
            System.out.println("Single woman");
        }else if (name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (name.startsWith("Mrs.")){
            System.out.println("Married woman");

        }else if (name.startsWith("Prof.")) {
            System.out.println("Professor");

        }
        System.out.println(name.contains("Ms."));
        //website google.com
        String website = "www.google.com";
        //if website ends with .com print english site
        //if website ends with .gov print government

        if (website.endsWith(".com")){
            System.out.println("English website");
        }else if (website.endsWith(".gov")){
            System.out.println("Governmental website");
        }
    }

}
