package model;

public class CalculadoraDeTiempo {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title title){
        totalTime = totalTime + title.getDurationTimeInMinutes();
        // totalTime += title.getDurationTimeInMinutes();

    }
}
