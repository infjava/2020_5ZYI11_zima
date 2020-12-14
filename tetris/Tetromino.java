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
    
    public void posunDole() {
        if (this.y >= Displej.VYSKA - this.svietiacePixely.length) {
            return;
        }
        
        this.zmaz();
        this.y++;
        this.nakresli();
    }
    
    public void otoc() {
        int staraSirka = this.svietiacePixely[0].length;
        int staraVyska = this.svietiacePixely.length;
        
        int novaSirka = staraVyska;
        int novaVyska = staraSirka;
        
        if (this.x > Displej.SIRKA - novaSirka) {
            return;
        }
        
        if (this.y > Displej.VYSKA - novaVyska) {
            return;
        }
        
        boolean[][] novePixely = new boolean[novaVyska][novaSirka];
        
        for (int stareY = 0; stareY < this.svietiacePixely.length; stareY++) {
            for (int stareX = 0; stareX < this.svietiacePixely[stareY].length; stareX++) {
                int noveX = stareY;
                int noveY = staraSirka - 1 - stareX;
                
                novePixely[noveY][noveX] = this.svietiacePixely[stareY][stareX];
            }
        }
        
        this.zmaz();
        this.svietiacePixely = novePixely;
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
