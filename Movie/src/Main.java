import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("M1", 2024, "Comedy", 67));
        movies.add(new Movie("M2", 2021, "Horror", 91));
        movies.add(new Movie("M3", 2023, "Si-fi", 99));


        System.out.println(movies.isEmpty());
        System.out.println();
        for (Movie temp : movies) {
            System.out.println(temp);
        }
        for (Movie temp : movies) {
            temp.setRating(temp.getRating() + 1);
            System.out.println();

        }
        for (Movie temp : movies) {
            System.out.println(temp);

        }
    }
}