import java.io.IOException;

public class Tetris {
    private GeneratorTetromin generator;
    private Tetromino tetromino;
    private int pocetTikov;
    
    public Tetris() throws IOException {
        this.generator = new GeneratorTetromin();
        this.tetromino = this.generator.vytvorNahodne();
        
        this.pocetTikov = 0;
        
        new Manazer().spravujObjekt(this);
    }
    
    public void posunVlavo() {
        this.tetromino.posunVlavo();
    }
    
    public void posunVpravo() {
        this.tetromino.posunVpravo();
    }
    
    public void tik() {
        this.pocetTikov++;
        if (this.pocetTikov % 4 == 0) {
            this.tetromino.posunDole();
            if (this.tetromino.jeNaDne()) {
                this.tetromino = this.generator.vytvorNahodne();
            }
        }
    }
    
    public void aktivuj() {
        this.tetromino.otoc();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
