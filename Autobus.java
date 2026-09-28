public class Autobus {
    
    // attributes
    private String kennzeichen;
    private int sitzplatze;
    private boolean anhanger;

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