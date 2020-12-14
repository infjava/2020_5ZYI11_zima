public class Tetromino {
    private boolean[][] svietiacePixely;
    
    private int x;
    private int y;
    
    public Tetromino(boolean[][] svietiacePixely) {
        this.svietiacePixely = svietiacePixely;
        
        this.x = (Displej.SIRKA - this.svietiacePixely[0].length) / 2;
        this.y = 0;
        
        this.nakresli();
    }
    
    public void posunVlavo() {
        if (this.x <= 0) {
            return;
        }
        
        this.zmaz();
        this.x--;
        this.nakresli();
    }
    
    public void posunVpravo() {
        if (this.x >= Displej.SIRKA - this.svietiacePixely[0].length) {
            return;
        }
        
        this.zmaz();
        this.x++;
        this.nakresli();
    }
    
    private void zmaz() {
        for (int y = 0; y < this.svietiacePixely.length; y++) {
            for (int x = 0; x < this.svietiacePixely[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.zmen(x + this.x, y + this.y, false);
            }
        }
    }
    
    private void nakresli() {
        for (int y = 0; y < this.svietiacePixely.length; y++) {
            for (int x = 0; x < this.svietiacePixely[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.zmen(x + this.x, y + this.y, this.svietiacePixely[y][x]);
            }
        }
    }
}
