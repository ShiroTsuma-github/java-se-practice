package pl.globallogic.exercises;

public class ex45Song {

    private final String title;
    private final double duration;

    public ex45Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String toString()
    {
        return title + ": " + duration;
    }

    public String getTitle() {
        return title;
    }
}
