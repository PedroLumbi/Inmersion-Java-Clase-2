package Model;

import ToolsPackage.Tools;

public class Serie extends Title{
    private int seasons;
    private int episodesBySeason;
    private int minuteByEpisode;

    @Override
    public void create(String titleType) {
        super.create(titleType);

        Tools.print("Enter " + titleType + " seasons");
        setSeasons(Tools.inputInt());

        Tools.print("Enter " + titleType + " episodes by season");
        setEpisodesBySeason(Tools.inputInt());

        Tools.print("Enter " + titleType + " minute by episode");
        setMinuteByEpisode(Tools.inputInt());
    }

    public String getTimeOfMarathon() {
        int timeInMinutes = getMinuteByEpisode() * getEpisodesBySeason() * getSeasons();
        return Tools.getTime(timeInMinutes);
    }

    @Override
    public String getDataSheet() {
        return super.getDataSheet() +
                "|Seasons: " + seasons + "|" + "\n" +
                "|Episodes by season: " + episodesBySeason + "|" + "\n" +
                "|Minute by episode: " + minuteByEpisode + "|" + "\n" +
                "|Time required for series marathon: " + getTimeOfMarathon() + "|" + "\n" +
                "|******************|" + "\n";
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getMinuteByEpisode() {
        return minuteByEpisode;
    }

    public void setMinuteByEpisode(int minuteByEpisode) {
        this.minuteByEpisode = minuteByEpisode;
    }
}
