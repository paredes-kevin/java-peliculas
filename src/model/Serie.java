package model;

public class Serie extends Title{

    private int season;

    private int episodesPerSeason;

    private int durationInMinutesPerEpisode;

    @Override
    public int getDurationTimeInMinutes() {
        return durationInMinutesPerEpisode * episodesPerSeason * season;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getDurationInMinutesPerEpisode() {
        return durationInMinutesPerEpisode;
    }

    public void setDurationInMinutesPerEpisode(int durationInMinutesPerEpisode) {
        this.durationInMinutesPerEpisode = durationInMinutesPerEpisode;
    }
}
