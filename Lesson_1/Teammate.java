package Java_2.Lesson_1;

public class Teammate {
    public String teammate_name;
    public int training_level;
    public int competition_result;
    public int competition_faults;
    public Teammate(String teammate_name, int training_level){
        this.competition_result = 0; // 0 - initial level; 1 - win competition; 2 - loose competition;
        this.competition_faults = 0; // total amount of competition faults;
        this.teammate_name =  teammate_name;
        this.training_level = training_level;
    }
}
