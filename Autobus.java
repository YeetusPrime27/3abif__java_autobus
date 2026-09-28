public class Autobus {
    
    // attributes
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;

    // constructor
    public Autobus()
    {
        setKennzeichen("W-1234A");
        setSitzplatze(29);
        setAnhanger(false);
    }
    public Autobus(boolean neuAnhanger)
    {
        setKennzeichen("W-1234A");
        setSitzplatze(29);
        setAnhanger(neuAnhanger);
    }
    public Autobus(int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen("W-1234A");
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
      public Autobus(String neuKennzeichen, int neuSitzplatze, boolean neuAnhanger)
    {
        setKennzeichen(neuKennzeichen);
        setSitzplatze(neuSitzplatze);
        setAnhanger(neuAnhanger);
    }
    
    // getMethoden
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    public int getSitzplatze()
    {
        return sitzplatze;    
    }
    public boolean getAnhanger()
    {
        return anhanger;
    }
    
    // setMethoden
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    public void setSitzplatze(int neuSitzplatze)
    {
        sitzplatze = neuSitzplatze;
    }
    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger;
    }
}