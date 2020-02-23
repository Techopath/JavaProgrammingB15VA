package day_37_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TeamMates {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<>();
        team.add("Marujon-Selenium instructor");
        team.add("Nair-dont forget");
        team.add("Mike - YNFJ");
        team.add("Asiya - in our group");
        team.add("Kuzzat Altay");
        team.add("Murodil");
        team.add("Luis The Boss");
        team.add("Muhtar");
        team.add("Vasyl");
        team.add("Guljannat");

        System.out.println("Team size: "+team.size());

        //print first last person
        System.out.println("----------------------");
        System.out.println(team.get(0)+" | " + team.get(team.size()-1));

        //print each value using for each loop.
        System.out.println("-------------");
        for (String member:team) {
            System.out.println(member);
        }

        //print each value using for loop
        System.out.println("-------each member separately using for loop--------------");
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
        }

        //print each person in reverse order
        System.out.println("-----recerse order-------------");

        for (int i = team.size()-1; i>=0; i--) {
            System.out.println(team.get(i));

        }

        //print 2 people at a time. marufjon | vasyl
        System.out.println("---print 2 people at a time");

        for (int i = 0; i < team.size()-1; i+=2) {

            if (i ==team.size()-1){
                System.out.println(team.get(i));
            }else{
                System.out.println(team.get(i)+" | "+team.get(i+1));

            }

        }
//        if (team.size()%2 !=0){
//            System.out.println(team.get(team.size()-1));
//        }else{
//
//        }

        //declare String allTeam and add everyone into that string

        String allTeam ="";

        for (int i = 0; i < team.size(); i++) {
            allTeam = allTeam + team.get(i)+" - ";
        }

        allTeam = allTeam.substring(0, allTeam.length()-3);
        System.out.println(allTeam);

        System.out.println();
        System.out.println("----also possible this way -----------");
        String alTeam ="";
        for (int i = 0; i < team.size(); i++) {

            if (i==team.size()-1){
                alTeam = alTeam +team.get(i);
            }else{
                alTeam = alTeam + team.get(i)+" - ";
            }

        }
        System.out.println(alTeam);
    }
}
