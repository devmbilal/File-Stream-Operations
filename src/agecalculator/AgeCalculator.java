package agecalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
    public static void calculateAge(String birthDate) {
        // Parse the birth date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(birthDate, formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the two dates
        Period period = Period.between(date, currentDate);

        // Print the age
        System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months, and " + period.getDays() + " days old.");

        // Print the day of the birthday for each year since birth
        for (int i = 0; i <= period.getYears(); i++) {
            LocalDate birthday = date.plusYears(i);
            System.out.println("Year " + i + ": " + birthday.getDayOfWeek());
        }
    }
}