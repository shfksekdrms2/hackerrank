package JAVA.DataStructs.Implementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        LocalDateTime localDateTime = LocalDateTime.of(year, 1, 1, 0, 0);
        LocalDateTime resultLocalDateTime = localDateTime.plusDays(256);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String result = resultLocalDateTime.format(dateTimeFormatter);
        return result;
    }
}


