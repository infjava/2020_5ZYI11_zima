public class SegmentovyDisplej {
    public SegmentovyDisplej() {
        Obdlznik a;
        Obdlznik b;
        Obdlznik c;
        Obdlznik d;
        Obdlznik e;
        Obdlznik f;
        Obdlznik g;
        
        a = new Obdlznik();
        b = new Obdlznik();
        c = new Obdlznik();
        d = new Obdlznik();
        e = new Obdlznik();
        f = new Obdlznik();
        g = new Obdlznik();
        
        a.zmenStrany(30, 5);
        g.zmenStrany(30, 5);
        d.zmenStrany(30, 5);
        
        b.zmenStrany(5, 30);
        c.zmenStrany(5, 30);
        e.zmenStrany(5, 30);
        f.zmenStrany(5, 30);
        
        a.posunVodorovne(5);
        g.posunVodorovne(5);
        d.posunVodorovne(5);
        
        b.posunVodorovne(35);
        c.posunVodorovne(35);
        
        f.posunZvisle(5);
        b.posunZvisle(5);
        
        g.posunZvisle(35);
        
        e.posunZvisle(40);
        c.posunZvisle(40);
        
        d.posunZvisle(70);
        
        a.zobraz();
        b.zobraz();
        c.zobraz();
        d.zobraz();
        e.zobraz();
        f.zobraz();
        g.zobraz();
    }
}
