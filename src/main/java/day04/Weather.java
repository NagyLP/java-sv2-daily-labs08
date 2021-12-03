package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Weather {

    public static void main(String[] args) {
        Weather weather = new Weather();
        System.out.printf(String.valueOf(weather.findSmallestTemperatureSpread("src/main/resources/weather.dat")));
        System.out.printf(weather.findSmallestDifference("src/main/resources/football.dat"));
    }

    public String findSmallestDifference(String filename) {

        List<String> lines = new ArrayList<>();
        String team = null;
        int fGoal;
        int aGoal;
        int minDiff = 1_000;

        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (int i = 1; i < lines.size(); i++) {
            if (i != 18) {
                fGoal = Integer.parseInt(lines.get(i).substring(42, 45).trim());
                aGoal = Integer.parseInt(lines.get(i).substring(49, 52).trim());

                if (Math.abs(aGoal - fGoal) < minDiff) {
                    minDiff = Math.abs(aGoal - fGoal);
                    team = lines.get(i).substring(7, 22).trim();
                }
            }
        }
        return team;
    }

    public int findSmallestTemperatureSpread(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/weather.dat" + filename));

            int minDiff = 1_000;
            int minDay = 0;

            for (int i = 2; i < lines.size() - 1; i++) {
                int day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
                int dayMax = Integer.parseInt(lines.get(i).substring(6, 8).trim());
                int dayMin = Integer.parseInt(lines.get(i).substring(12, 14).trim());

                int spreed = dayMax - dayMin;
                if (minDiff > spreed) {
                    minDiff = spreed;
                    minDay = day;
                }
            }
            return minDay;

        } catch (IOException ioe) {
            throw new IllegalArgumentException("Error while reading the container file, vagy valami hasonló...", ioe);
        }

    }
}
