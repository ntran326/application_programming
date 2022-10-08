// Nhu Tran

public class ch1_11 {
   public static void main(String[] args) {
      int population = 312032486;
      int seconds_in_year = 31536000;

      System.out.println("Current population: " + population);

      int birth_year = seconds_in_year / 7;
      System.out.println("Birth per year: " + birth_year);

      int death_year = seconds_in_year / 13;
      System.out.println("Death per year: " + death_year);

      int new_immigrant = seconds_in_year / 45;
      System.out.println("New immigrant per year: " + new_immigrant);

      int pop_year = birth_year - death_year + new_immigrant;

      System.out.println("Rate Per Year:  " + pop_year);
      System.out.println("End of year 1 population:  " + (population + (pop_year * 1)));
      System.out.println("End of year 2 population:  " + (population + (pop_year * 2)));
      System.out.println("End of year 3 population:  " + (population + (pop_year * 3)));
      System.out.println("End of year 4 population:  " + (population + (pop_year * 4)));
      System.out.println("End of year 5 population:  " + (population + (pop_year * 5)));

   }
}

// test 2