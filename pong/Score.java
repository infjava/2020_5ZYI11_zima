public class Score {
    private int score;
    private SegmentovaCislica displej;
    
    public Score(boolean jeLavy) {
        this.score = 0;
        if (jeLavy) {
            this.displej = new SegmentovaCislica(57, 0);
        } else {
            this.displej = new SegmentovaCislica(207, 0);
        }
    }
    
    public void zvys() {
        this.score++;
        this.displej.zobraz(this.score);
    }
}
