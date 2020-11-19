public class Experiment {
    private int pocetPokusov;
    private boolean hracMeniRozhodnutie;
    private int pocetVyhier;
    
    public Experiment(int pocetPokusov, boolean hracMeniRozhodnutie) {
        this.pocetPokusov = pocetPokusov;
        this.hracMeniRozhodnutie = hracMeniRozhodnutie;
        this.pocetVyhier = 0;
    }
    
    public void vykonaj() {
        for (int i = 0; i < this.pocetPokusov; i++) {
            Pokus pokus = new Pokus(this.hracMeniRozhodnutie);
            pokus.vykonaj();
            
            if (pokus.jeVyhra()) {
                this.pocetVyhier++;
            }
        }
    }
    
    public int getPocetVyhier() {
        return this.pocetVyhier;
    }
}
