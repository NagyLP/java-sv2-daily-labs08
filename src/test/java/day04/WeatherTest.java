package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherTest {

    Weather weather = new Weather();

    @Test
    void findSmallestDifference() {
        assertEquals("Aston_Villa", weather.findSmallestDifference("src/main/resources/football.dat"));
    }

    @Test
    void findSmallestTemperatureSpread() {
//        assertEquals(14, weather.findSmallestTemperatureSpread("src/main/resources/football.dat"));
    }
}