/**
 * Java. Level 2. Lesson 1. HomeWork.
 * @author Yuriy Fedak.
 * @version 23.09.2018.
 * @link
 */

package Java_2.Lesson_1;

public class Main {
    Team team;
    Course course;

    public Main(){
        team = new Team("Haters", 10);
        course = new Course(5);
        course.doIt(team);
        team.showResults();
    }

    public static void main(String[] args) {
        new Main();
    }
}
