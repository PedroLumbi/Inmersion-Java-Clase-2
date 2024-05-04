import java.util.ArrayList;
import ToolsPackage.Tools;
import Model.*;

public class MainMenu {

    ArrayList<Title> listTitle;

    public MainMenu(){
        listTitle = new ArrayList<>();
        runTest(); // Method to enter data automatically
    }

    public void runMenu(){
        int option = 0;

        while (true){
            Tools.print(
                   """
                   Welcome to Screen Match
                   1) Add new Movie
                   2) Add new Serie
                   3) Read Movies list
                   4) Read Series list
                   5) Read all list
                   
                   9) Exit
                   """
            );

            option = Tools.inputInt();

            switch (option){
                case 1:
                    addNewMovie();
                    break;
                case 2:
                    addNewSerie();
                    break;
                case 3:
                    readMoviesList();
                    break;
                case 4:
                    readSeriesList();
                    break;
                case 5:
                    readAllList();
                    break;
                case 9:
                    Tools.print("System Exit..");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private void addNewMovie(){
        Movie movie = new Movie();
        movie.create("Movie");

        listTitle.add(movie);
    }

    private void addNewSerie(){
        Serie serie = new Serie();
        serie.create("Serie");

        listTitle.add(serie);
    }

    private void readMoviesList() {
        for (Title title : listTitle) {
            if (title instanceof Movie) {
                Tools.print(title.getDataSheet());
            }
        }
    }

    private void readSeriesList(){
        for (Title title : listTitle) {
            if (title instanceof Serie) {
                Tools.print(title.getDataSheet());
            }
        }
    }

    private void readAllList() {
        for (Title title : listTitle) {
            Tools.print(title.getDataSheet());
        }
    }

    private void runTest(){
        movieExample_Test();
        serieExample_Test();
    }

    private void movieExample_Test(){
        // Example Movie 1:
        Movie actionMovie = new Movie();
        actionMovie.setName("The Avengers");
        actionMovie.setSummary("Superheroes team up to save the world.");
        actionMovie.setEvaluation(8.5);
        actionMovie.setIncludedInTheBasicPlan(true);
        actionMovie.setReleaseYear(2012);
        actionMovie.setManager("Joss Whedon");
        actionMovie.setDurationInMinutes(143);

        // Example Movie 2:
        Movie comedyMovie = new Movie();
        comedyMovie.setName("Superbad");
        comedyMovie.setSummary("Teenagers embark on a wild adventure.");
        comedyMovie.setEvaluation(7.6);
        comedyMovie.setIncludedInTheBasicPlan(true);
        comedyMovie.setReleaseYear(2007);
        comedyMovie.setManager("Greg Mottola");
        comedyMovie.setDurationInMinutes(113);

        // Example Movie 3:
        Movie dramaMovie = new Movie();
        dramaMovie.setName("The Shawshank Redemption");
        dramaMovie.setSummary("A man finds hope in the midst of despair.");
        dramaMovie.setEvaluation(9.3);
        dramaMovie.setIncludedInTheBasicPlan(true);
        dramaMovie.setReleaseYear(1994);
        dramaMovie.setManager("Frank Darabont");
        dramaMovie.setDurationInMinutes(142);

        listTitle.add(actionMovie);
        listTitle.add(comedyMovie);
        listTitle.add(dramaMovie);
    }

    private void serieExample_Test(){
        // Example Serie 1:
        Serie thrillerSerie = new Serie();
        thrillerSerie.setName("Stranger Things");
        thrillerSerie.setSummary("Mystery and supernatural events in a small town.");
        thrillerSerie.setEvaluation(8.7);
        thrillerSerie.setIncludedInTheBasicPlan(true);
        thrillerSerie.setReleaseYear(2016);
        thrillerSerie.setSeasons(3);
        thrillerSerie.setEpisodesBySeason(8);
        thrillerSerie.setMinuteByEpisode(50);

        // Example Serie 2:
        Serie comedySerie = new Serie();
        comedySerie.setName("Friends");
        comedySerie.setSummary("Life and adventures of six friends in New York City.");
        comedySerie.setEvaluation(8.9);
        comedySerie.setIncludedInTheBasicPlan(true);
        comedySerie.setReleaseYear(1994);
        comedySerie.setSeasons(10);
        comedySerie.setEpisodesBySeason(24);
        comedySerie.setMinuteByEpisode(22);

        // Example Serie 3:
        Serie sciFiSerie = new Serie();
        sciFiSerie.setName("Black Mirror");
        sciFiSerie.setSummary("Dystopian and futuristic scenarios exploring the impact of technology.");
        sciFiSerie.setEvaluation(8.8);
        sciFiSerie.setIncludedInTheBasicPlan(true);
        sciFiSerie.setReleaseYear(2011);
        sciFiSerie.setSeasons(5);
        sciFiSerie.setEpisodesBySeason(3);
        sciFiSerie.setMinuteByEpisode(60);

        listTitle.add(thrillerSerie);
        listTitle.add(comedySerie);
        listTitle.add(sciFiSerie);
    }
}
