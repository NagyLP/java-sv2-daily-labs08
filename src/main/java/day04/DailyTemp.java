package day04;

public class DailyTemp {

    private int day;
    private int dayMaxTemp;
    private int dayMinTemp;

    public DailyTemp(String oneDay) {
        String oneDayTemp = oneDay.substring(2, 4).trim();
        day = Integer.parseInt(oneDay);
        oneDayTemp = oneDay.substring(6, 8).trim();
        dayMaxTemp = Integer.parseInt(oneDayTemp);
        oneDayTemp = oneDay.substring(12, 14).trim();
    }

    public int getDay() {
        return day;
    }

    public int getDayMaxTemp() {
        return dayMaxTemp;
    }

    public int getDayMinTemp() {
        return dayMinTemp;
    }
}
