package day_34_methodsPractice;

//about 232,34 results (0.69 seconds )
/*
method: getNumberOfGoogleSearchResults
input/param: String searchResults
returs: long

we need to extract number of results and convert to long and return from method.

getNumberOfGoogleSearchResults("about 232, 34 results (0.69 seconds )") => 23234

Application specific reusable custom methods


 */
public class FormatString {
    public static void main(String[] args) {
        //if we do without using methods approach
//        String results = "About 1,250,000,000 results (0.83 seconds)";
//        String countOfrs = results.split(" ")[1];
//        System.out.println("countOfrs = " + countOfrs);
//
//        //remove commas and replace them with empty space
//
//        countOfrs = countOfrs.replace(",", "");
//        System.out.println("countOfrs = " + countOfrs);
//
//        long count = Long.parseLong(countOfrs); //convert string numbers into long
//        System.out.println(count);

//method getNumberOfGoogleSearchResults

        System.out.println(getNumberOfGoogleSearchResults("About 1,250,000,000 results (0.83 seconds)"));
        long cppResults = getNumberOfGoogleSearchResults("About 210,000,001 results (0.83 seconds)");
        System.out.println("cppResults = " + cppResults);
    }

    public static long getNumberOfGoogleSearchResults(String searchResults ){

        String countOfrs = searchResults.split(" ")[1];
       // System.out.println("countOfrs = " + countOfrs);

        //remove commas and replace them with empty space


        countOfrs = countOfrs.replace(",", "");
       // System.out.println("countOfrs = " + countOfrs);

        long count = Long.parseLong(countOfrs); //convert string numbers into long
       // System.out.println(count);

        return  count;

    }

}
