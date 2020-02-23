package day_62_collections4;
import org.w3c.dom.ls.LSOutput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;
import java.io.*;
public class CSVDataToMap {
    public static void main(String[] args) throws /*FileNotFoundException*/Exception {
        //String fileName = "C:\\Users\\musad\\Downloads\\countryCodes.csv"; //if we dont't have the file imported to our project.
        String fileName = "countryCodes.csv";
        File dataFile = new File(fileName);
        System.out.println(dataFile.exists());

        Scanner scan = new Scanner(dataFile); //we imported throws FileNotFoundException

//        System.out.println(scan.nextLine());
//        System.out.println(scan.nextLine());

        List<String> fileDataList = new ArrayList<>();

        int counter = 1;
        while (scan.hasNext()){
            //System.out.println(counter +". "+ scan.nextLine());
            String row =  scan.nextLine();
            System.out.println(counter +". "+ row);
            fileDataList.add(row);

            //fileDataList.add(scan.nextLine()); //we can store directly this way too.

            counter ++;
        }
        scan.close();
        System.out.println(fileName + " contains "+fileDataList.size()+" rows");


        System.out.println("--read from csv using new way ----");

        List<String> countryCodesList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodesList.size());
        System.out.println(countryCodesList.get(2));

        countryCodesList.remove(0); //removes column


        //how to retrieve unique - non-duplicate country codes?
        Set<String> countryCodesSet = new HashSet<>(countryCodesList);

        System.out.println("Remember: Set does not keep order. \nUnique country codes count: "+countryCodesList.size());

        System.out.println("there are "+countryCodesSet.size()+" countries");
        System.out.println(countryCodesSet.toString());

        //Store each countryCode and country name in HashMap
        //key -> Country code, Value -> country name

        //Map<String,String> countriesMap = new HashMap<>();
        Map<String,String> countriesMap = new TreeMap<>(); //for sorting we use treeMap
        //loop through the countryCodesSet

        //split each value with comma
        for (String eachLine:countryCodesSet) {
            System.out.println(eachLine);
            String [] arr = eachLine.split(","); //{RU, Russia}
            //store index 0 as a Key, and index 1 as a value to the Map.
            countriesMap.put(arr[0], arr[1]);

        }
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.toString());

        if(countriesMap.containsValue("Mongolia")){
            System.out.println("Mongolia is in the Map");
        }else{
            System.out.println("There's no Mongolia Listed");
        }

        //PE We know country code but want to find country name

        System.out.println(countriesMap.get("PE"));
        System.out.println(countriesMap.get("MO"));
        System.out.println(countriesMap.get("TJ"));
        System.out.println(countriesMap.get("MA"));

        System.out.println("-------PRINT ALL VALUES USING FOREACH METHOD + LAMBDA --------");

        countriesMap.forEach((k,v) -> System.out.println(k+"|" +v));

        for (String eachKey:countriesMap.keySet()) {

            System.out.println(eachKey + " | "+countriesMap.get(eachKey));

        }

        //
        System.out.println("---Print all values using iterator and entrySet");
        for (Map.Entry<String, String> entry : countriesMap.entrySet()) {

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

        countriesMap.put(null,null);
        Map<String, String> hashTable = new Hashtable<>();

    }

}
