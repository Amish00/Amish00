package movieconsole;

import javax.swing.*;
import java.util.List;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieService ms = new MovieServiceImpl();

        // ---------- Add Movies ----------

        char flag = 'y';
        do{
            Movie m = new Movie();

            System.out.println("Enter Movie ID: ");
            m.setId(sc.nextInt());

            System.out.println("Enter Movie Name: ");
            m.setName(sc.next());

            System.out.println("Enter Movie Genre: ");
            m.setGenre(sc.next());

            System.out.println("Enter Movie Rating ( 1-10 ): ");
            m.setRating(sc.nextInt());

            System.out.println("Enter Movie Release Date: ");
            m.setRelease(sc.next());

            System.out.println("Enter Movie Duration: ");
            m.setDuration(sc.next());

            ms.addMovie(m);
            System.out.println("Do you want to continue? (y/n)");
            flag = sc.next().charAt(0);

        }while(flag == 'y');

        // ---------- Get All Movies ----------
        List<Movie> mList = ms.getAllMovie();
        System.out.println(mList.toString());

        // ---------- Delete Movies ---------
        System.out.println("Do you want to Delete Movie? (y/n)");
        char flag1 = 'y';
        flag1 = sc.next().charAt(0);

        if(flag1 == 'y'){
            System.out.println("Enter Index to delete: ");
            ms.deleteMovie(sc.nextInt());

            // ---------- Get All Movie ---------
            System.out.println("--------- Movies After Deletion ---------");
            System.out.println(ms.getAllMovie());
        }

    }


}
