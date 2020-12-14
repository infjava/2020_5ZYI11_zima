public class Tetromino {
    private boolean[][] svietiacePixely;
    
    private int x;
    private int y;
    
    public Tetromino(boolean[][] svietiacePixely) {
        this.svietiacePixely = svietiacePixely;
        
        this.x = 0;
        this.y = 0;
    }
    
    public void posunVlavo() {
        this.zmaz();
        this.x--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        this.zmaz();
        this.x++;
        this.nakresli();
    }
    
    public void zmaz() {
        for (int y = 0; y < this.svietiacePixely.length; y++) {
            for (int x = 0; x < this.svietiacePixely[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.zmen(x + this.x, y + this.y, false);
            }
        }
    }
    
    public void nakresli() {
        for (int y = 0; y < this.svietiacePixely.length; y++) {
            for (int x = 0; x < this.svietiacePixely[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.zmen(x + this.x, y + this.y, this.svietiacePixely[y][x]);
            }
        }
    }
}
