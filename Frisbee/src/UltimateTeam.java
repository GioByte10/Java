import java.util.ArrayList;

public class UltimateTeam {
		
	private ArrayList <UltimatePlayer> players;
	private ArrayList <Coach> coaches;
		
	public UltimateTeam(ArrayList <UltimatePlayer> players, ArrayList <Coach> coaches) {
			
		this.players = players;
		this.coaches = coaches;
			
	}
		
	public String getCutters() {
			
		String cutters = "";
			
		for(UltimatePlayer player: players) {
				
			if(player.getPosition().equals("cutter")) {
				cutters += player.toString();
				cutters += '\n';
			}
		}
			
		return cutters;
	}
		
	public String getHandlers() {
			
		String handlers = "";
			
		for(UltimatePlayer player: players) {
				
			if(player.getPosition().equals("handler")) {
				handlers += player.toString();
				handlers += '\n';
			}
		}
			
		return handlers;
	}
	
	public String toString() {
		
		String team = "";
		team += "COACHES\n";
		
		for(Coach coach: coaches) {
			
			team += coach.toString(); 
			team += '\n';
			
		}
		
		team += "\nPLAYERS\n";
		
		for(UltimatePlayer player: players) {
			
			team += player.toString();
			team += '\n';
			
		}
		
		return team;
		
	}
}
