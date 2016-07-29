import static org.junit.Assert.fail;
import org.junit.Assert.*

class KaniMeglioDelePerzone {
	
	@org.junit.Test
	public final void test() {
		Perzona perzonafalza = Perzona.getPerzonaFalza();
		if(perzonafalza.perzona==false)
			System.out.println("I KANI SN MELIO");
		else
			fail("NN è VERO SEI UNA PERZONA FALZA, KOLPA DELLA KASTA");
	}
	
}