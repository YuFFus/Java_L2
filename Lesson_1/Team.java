package Java_2.Lesson_1;

import java.util.Random;

public class Team {
    public String team_name;
    public Teammate[] teammates;
    private int winCount = 0;
    private int looseCount = 0;

    public  Team(String team_name, int teammateAmount){
        String name;
        teammates = new Teammate[teammateAmount];
        this.team_name = team_name;
        Random random = new Random();
        for (int i = 0; i<teammateAmount; i++) {
            name = ("participant_"+i);
            teammates[i] = new Teammate(name, random.nextInt(15));
        }
    }
    public void showResults(){
        for (int i = 0; i<teammates.length; i++){
            if (teammates[i].competition_result == 1) winCount++;
        }
        System.out.println("Total teammates, wining competition: " + winCount);
        if (teammates.length > winCount){
            System.out.println("Loosers are: ");
            for (int i = 0; i < teammates.length; i++){
                if (teammates[i].competition_result == 2) {
                    System.out.println(teammates[i].teammate_name + "- " + teammates[i].competition_faults + " faults");
                }
            }
        }
        else System.out.println("No loosers! Fantastic!!!");
    }
}
