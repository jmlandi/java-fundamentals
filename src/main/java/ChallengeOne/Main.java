package ChallengeOne;

public class Main {
    public static void main(String[] args) {
        /*
         * Create a program that represents three ninjas from the Hidden Leaf Village (Konoha) in "Naruto"
         * and their respective missions.
         * Each ninja has a name, an age, and an assigned mission,
         * with the mission name, difficulty level, and completion status.
         */

        // ************************** Ninja 1 **************************
        String ninjaOneName = "Iruka Umino";
        short ninjaOneAge = 23;
        String ninjaOneMissionName = "Academy Graduation Exam Oversight";
        char ninjaOneMissionLevel = 'C';
        String ninjaOneMissionCompleted;
        if (ninjaOneAge > 15 || ninjaOneMissionLevel == 'C' || ninjaOneMissionLevel == 'D') {
            ninjaOneMissionCompleted = "Completed";
        } else {
            ninjaOneMissionCompleted = "Uncompleted";
        }
        System.out.println("******************** NINJA 1 ********************");
        System.out.println("Ninja name: " + ninjaOneName);
        System.out.println("Mission name: " + ninjaOneMissionName);
        System.out.println("Mission rank: " + ninjaOneMissionLevel);
        System.out.println("Mission completed: " + ninjaOneMissionCompleted);

        // ************************** Ninja 2 **************************
        String ninjaTwoName = "Naruto Uzumaki";
        short ninjaTwoAge = 13;
        String ninjaTwoMissionName = "Sasuke Retrieval Squad";
        char ninjaTwoMissionLevel = 'A';
        String ninjaTwoMissionCompleted;
        if (ninjaTwoAge > 15 || ninjaTwoMissionLevel == 'C' || ninjaTwoMissionLevel == 'D') {
            ninjaTwoMissionCompleted = "Completed";
        } else {
            ninjaTwoMissionCompleted = "Uncompleted";
        }
        System.out.println("******************** NINJA 2 ********************");
        System.out.println("Ninja name: " + ninjaTwoName);
        System.out.println("Mission name: " + ninjaTwoMissionName);
        System.out.println("Mission rank: " + ninjaTwoMissionLevel);
        System.out.println("Mission completed: " + ninjaTwoMissionCompleted);

        // ************************** Ninja 3 **************************
        String ninjaThreeName = "Rock Lee";
        short ninjaThreeAge = 14;
        String ninjaThreeMissionName = "Sasuke Retrieval Squad";
        char ninjaThreeMissionLevel = 'A';
        String ninjaThreeMissionCompleted;
        if (ninjaThreeAge > 15 || ninjaThreeMissionLevel == 'C' || ninjaThreeMissionLevel == 'D') {
            ninjaThreeMissionCompleted = "Completed";
        } else {
            ninjaThreeMissionCompleted = "Uncompleted";
        }
        System.out.println("******************** NINJA 3 ********************");
        System.out.println("Ninja name: " + ninjaThreeName);
        System.out.println("Mission name: " + ninjaThreeMissionName);
        System.out.println("Mission rank: " + ninjaThreeMissionLevel);
        System.out.println("Mission completed: " + ninjaThreeMissionCompleted);
    }
}