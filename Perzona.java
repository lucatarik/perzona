public class Perzona implements Comparable<Kane> {
	boolean perzona;
	int età;
	public Perzona(boolean perzona, int età) {
		this.perzona = perzona;
		this.età = età;
	}
	public static Perzona getPerzonaFalza() {
		return new Perzona(false,40);
	}
	public void REDIMI() {
	    /*la perzona falsa kiede skusa e diventa kome i kani, solo un pò  peggio*/
	    this.perzona = true;
	}
	public String KonfrontaConKani() {
		if(perzona==false)
			return "SN MEJO I KANID DELE PERZONE FALSE1!1!!";
		return "I KANI SONO MEJO DELE PERZONE11!!1";
	}
	public int getEtà() {
		return età;
	}
	@Override
	public int compareTo(Kane o) {
		if(perzona=false)
			return -100000;
		return -10000;
	}
	public String Kaffè() {
		if(this.getEtà()>=40)
			return "Buongiornissimooo kaffèèèèè?!!? 1!";
		return null;
	}
}