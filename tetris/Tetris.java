public class Tetris {
    private Tetromino tetromino;
    private int pocetTikov;
    
    public Tetris() {
        this.tetromino = new Tetromino(new boolean[][]{
            {true, false}, {true, false}, {true, true}
        });
        
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
                this.tetromino = new Tetromino(new boolean[][]{
                    {true, false}, {true, false}, {true, true}
                });
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
