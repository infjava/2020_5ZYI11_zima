public class Banka {
    public Ucet zalozUcet(String menoMajitela) {
        int urokovaSadzba = 1;
        String cisloUctu = "SK9011000000002600000126";
        
        return new Ucet(menoMajitela, urokovaSadzba, cisloUctu);
    }
}
