

public class Statistics{
	
	private int stat_year;
	private int stat_amount;
	private String stat_iata;
	
	public Statistics(String iata, int year, int amount) {
		this.stat_iata 	= iata;
		this.stat_amount = amount;
		this.stat_year	= year;
	}
	
	public Statistics() {
	}
	

	public int getYear() {
		return stat_year;
	}
	
	public void setYear(int year) {
		this.stat_year = year;
	}
	
	public int getAmount() {
		return stat_amount;
	}
	
	public void setAmount(int amount) {
		this.stat_amount = amount;
	}
	
	public String getIata() {
		return stat_iata;
	}
	
	public void setIata(String iata) {
		this.stat_iata = iata;
	}
	
	public static void main(String[] args) {
		
		if (args.length == 3) {
			saveStatistics main = new saveStatistics();
			Statistics statistics = new Statistics(new String(args[0]), new Integer(args[1]), new Integer(args[2]));
			main.insertStatistics(statistics);
			
		System.out.println(
				String.format("IATA \t YEAR \t AMOUNT \n%s \t %d \t %d \n\n ...succesfully added.",
				statistics.getIata(), statistics.getYear(), statistics.getAmount()));		
		}
		
		else if (args.length == 1) {
			showStatistics show = new showStatistics();
			show.show(args[0]);
		}
		
		else {
			System.out.println("No insert Statement!");
		}
	}
}

	
	
