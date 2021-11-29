package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumerSequence {

    private List<Integer> number = new ArrayList<>();

    public NumerSequence(List<Integer> number) {
        this.number = number;
    }

    public NumerSequence(int count, int minValue, int maxValue) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            number.add(random.nextInt(minValue, maxValue + 1));
        }
    }

    public List<Integer> closeAvarage(int value) {
        List<Integer> result = new ArrayList<>();

        double avg = calculateAvg();

        for (int act : number) {
            if (Math.abs(act - avg) <= value + 0.00000001d) {
                result.add(act);
            }
        }
        return result;
    }

    private double calculateAvg() {
        double sum = 0;
        for (int act : number) {
            sum += act;
        }
        return sum / number.size();
    }


    public NumerSequence(int a, String b) {
    }

    public NumerSequence(String a, int b) {
    }

    public List<Integer> getNumber() {
        return number;
    }
}
