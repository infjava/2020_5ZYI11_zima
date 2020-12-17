public class GeneratorTetromin {
    public GeneratorTetromin() {
    }
    
    public Tetromino vytvorNahodne() {
        return new Tetromino(new boolean[][]{
            {true, false}, {true, false}, {true, true}
        });
    }
}
