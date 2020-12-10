public class Tetromino {
    private boolean[][] svietiacePixely;
    
    public Tetromino(boolean[][] svietiacePixely) {
        this.svietiacePixely = svietiacePixely;
    }
    
    public void nakresli() {
        for (int y = 0; y < this.svietiacePixely.length; y++) {
            for (int x = 0; x < this.svietiacePixely[y].length; x++) {
                Displej displej = Displej.getDisplej();
                displej.zmen(x, y, this.svietiacePixely[y][x]);
            }
        }
    }
}
