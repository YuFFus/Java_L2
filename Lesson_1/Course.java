package Java_2.Lesson_1;

import java.util.Random;

public class Course {
    public int[] courses_level;
    Team team;

    public Course(int obstAmount) {
        courses_level = new int[obstAmount];
        Random random = new Random();
        for (int i = 0; i < obstAmount; i++) {
            courses_level[i] = random.nextInt(10);
        }
    }
    public void doIt(Team team){
        for (int i = 0; i < team.teammates.length; i++) {
            for (int k = 0; k < courses_level.length; k++) {
                if (team.teammates[i].training_level <= courses_level[k]) {
                    team.teammates[i].competition_faults++;
                }
            }
            if (team.teammates[i].competition_faults == 0) team.teammates[i].competition_result = 1;
            else team.teammates[i].competition_result = 2;
        }
    }

}
