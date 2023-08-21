package movieconsole;

import java.util.List;

public interface MovieService {
    public void  addMovie(Movie m);
    public void deleteMovie(int index);

    List<Movie> getAllMovie();

}
