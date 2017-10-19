package CODINGBAT;


class Cinema{
    public String name;
    public Cinema(){this.name=name;}
}
public class Movie extends Cinema {
    public Movie(String movie) {
        super();
    }

    public static void main(String[] args) {
        System.out.println(new Movie("Another Trilogy").name);
    }
}
