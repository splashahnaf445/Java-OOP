
public class Movie{
    private String name;
    private String origin;
    String genre;
    double rating;

    Movie(String name, String origin, String genre, double rating){
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }
    public String getName(){
        return name;
    }
    public String getOrigin(){
        return origin;

    }

    public void Details(){
        System.out.println("You are watching: " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}
