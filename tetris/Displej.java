import java.util.ArrayList;

public class Displej {
    private static final int SIRKA = 10;
    private static final int VYSKA = 20;
    private static final int VELKOST_PIXELU = 15;
    
    private Stvorec[][] pixely;
    
    public Displej() {
        this.pixely = new Stvorec[Displej.VYSKA][Displej.SIRKA];
        
        for (int y = 0; y < Displej.VYSKA; y++) {
            for (int x = 0; x < Displej.SIRKA; x++) {
                Stvorec pixel = new Stvorec();
                pixel.zmenStranu(Displej.VELKOST_PIXELU - 1);
                pixel.zmenFarbu("black");
                pixel.posunVodorovne(x * Displej.VELKOST_PIXELU - 60);
                pixel.posunZvisle(y * Displej.VELKOST_PIXELU - 50);
                pixel.zobraz();
                this.pixely[y][x] = pixel;
            }
        }
    }
    
    public void zmen(int x, int y, boolean zasvietit) {
        if (zasvietit) {
            this.pixely[y][x].zobraz();
        } else {
            this.pixely[y][x].skry();
        }
    }
}
