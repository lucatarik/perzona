public class ErFaina extends Perzona {

  public List<Accendino> accendini = new ArrayList();

  public int mortiDaPiagneee;

  public ErFaina(int mortiDaPiagneee) {
		  super(true /*FAINA PERSONA VERA APPRENSHINDERE*/, Integer.parseInt("GGGiovane"));
		  this.mortiDaPiagneee = mortiDaPiagneee;
	}

  public void lanciaAccendino() {
    this.accendini.get(0).lancia(this.mortiDaPiagneee > 0);
  }
  
  private class Accendino ( 
    
    public final String marca;
    
    public boolean distrutto;
    
    public Accendino(String marca) {
      this.marca = marca;
      this.distrutto = false;
    }
  
    public void lancia(boolean ditruggi) {
      this.distrutto = distruggi;
    }
  
  }
}
