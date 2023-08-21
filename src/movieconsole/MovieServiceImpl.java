package movieconsole;

import java.util.ArrayList;
import java.util.List;

public class MovieServiceImpl implements MovieService{

    List<Movie> mList = new ArrayList<>();

    @Override
    public void addMovie(Movie m){
        mList.add(m);
        System.out.println("---------- Added Sucessfully ----------");

    }

    @Override
    public void deleteMovie(int index){
        mList.remove(index);

    }

    @Override
    public List<Movie> getAllMovie(){
        return mList;
    }

}
