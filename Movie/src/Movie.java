public class Movie {
    String title;
    int year;
    String genera;
    int rating;


    public Movie(String title, int year, String genera, int rating) {
        this.title = title;
        this.year = year;
        this.genera = genera;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenera() {
        return genera;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setGenera(String genera) {
        this.genera = genera;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genera='" + genera + '\'' +
                ", rating=" + rating +
                '}';
    }
}