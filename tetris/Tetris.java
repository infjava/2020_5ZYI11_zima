public class Tetris {
    private Tetromino tetromino;
    
    public Tetris() {
        this.tetromino = new Tetromino(new boolean[][]{
            {true, false}, {true, false}, {true, true}
        });
        
        new Manazer().spravujObjekt(this);
    }
    
    public void posunVlavo() {
        this.tetromino.posunVlavo();
    }
    
    public void posunVpravo() {
        this.tetromino.posunVpravo();
    }
    
    public void tik() {
        this.tetromino.posunDole();
    }
    
    public void aktivuj() {
        this.tetromino.otoc();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
