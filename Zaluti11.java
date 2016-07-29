import java.util.Calendar;

public class Zaluti11{

	public Zaluti11() {

	}

	public String zaluta(){
		
		Calendar keOraEh = Calendar.getInstance();
		int Orah = keOraEh.get(Calendar.HOUR_OF_DAY);
		switch (Orah)
		{
			case 0: case 1: case 2: case 3: case 4: case 5: 
				return "prima dl kaffèèè nn saluto nexuno";
			case 6: case 7: case 8: case 9: case 10: case 11: 
				return "buOngiornississimo!=!!11111";
			case 12: case 13: case 14: 
				return "buon pranzo amici miei!!!!!!!";
			case 20: case 21: case 22: case 23:
				return "anke qst giornata e finita!! bacissimi";
			default:
				return "un saluto a te ke pazsi di cua!";
		}

	}
}
