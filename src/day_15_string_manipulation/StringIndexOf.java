package day_15_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String technologies = "java, c++, python, tomcat, aws";
        System.out.println(technologies.indexOf(("java")));
        int java,c, python, tomcat, aws;
        //System.out.println(java);nothing assigned to java so it gives error

        java = technologies.indexOf("java");
        c = technologies.indexOf("c++");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");
        int html = technologies.indexOf("html");
        System.out.println("java = " +java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html); //not fount in the string above
        //technologies -> how can i check if "c++", is in the technologies string.
        if (technologies.contains("c++")){
            System.out.println("c++ is there");
        }else {
            System.out.println("c++ is not present");
        }
        if (technologies.indexOf("c++") > -1){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not attending");
        }
        int firstComma = technologies.indexOf(",");
        int lastComma = technologies.lastIndexOf(",");
        System.out.println("firstComma = " + firstComma);
        System.out.println("lastComma = " + lastComma);

        System.out.println(technologies.indexOf(",",5));
        int secondComma = technologies.indexOf(",",5);
        System.out.println(secondComma);
        System.out.println(technologies.indexOf(",", secondComma+1));
        int thirdComma = technologies.indexOf(",", secondComma+1);
        System.out.println(thirdComma);
        int fourthComma = technologies.indexOf(",", thirdComma+1);
        System.out.println(fourthComma);
        if (fourthComma == technologies.lastIndexOf(",")){
            System.out.println("both methods are showing the same position");
        }else
        {
            System.out.println("methods have some wrong");
        }

        String url = "www.cybertekschool.com";
        //find the second . from the url and print index
        int firstDot = url.indexOf(".");
        System.out.println("the index of first Dot (.) is " +firstDot+ " in  "+ url);
        int secondDot = url.indexOf(".", firstDot +1 );
        System.out.println(secondDot);
    }
}
