package model;

public class Title {

    private String name;

    private int launchDate;

    private double evaluation;

    private boolean includedInTheBasicPlan;

    private String synopsis;

    private int durationTimeInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public boolean isIncludedInTheBasicPlan() {
        return includedInTheBasicPlan;
    }

    public void setIncludedInTheBasicPlan(boolean includedInTheBasicPlan) {
        this.includedInTheBasicPlan = includedInTheBasicPlan;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDurationTimeInMinutes() {
        return durationTimeInMinutes;
    }

    public void setDurationTimeInMinutes(int durationTimeInMinutes) {
        this.durationTimeInMinutes = durationTimeInMinutes;
    }

    public void sampleTechnicalSheet(){
        System.out.println("--- Ficha Tecnica --- ");
        System.out.println("Nombre del Titulo: " + name );
        System.out.println("Fecha de lanzamiento: " + launchDate);
        System.out.println("Tiempo de Duración: " + getDurationTimeInMinutes() + " minutos");
    }
}
