import java.util.*;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;

	public BoardGame() {

	}

	public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation) {

		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, intialLocation);

		return true;

	}

	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);

	}

	public String getPlayerWithGamePiece(GamePiece gamePiece) {

		for (String a : playerPieces.keySet()) {
			if (playerPieces.get(a).equals(gamePiece)) {
				return a;
			}
		}
		return null;
	}

	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}

	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		String[] move = new String[1];

		move[0] = playerNames[0] + " " + newLocations[0].toString();
		movePlayer(playerNames[0], newLocations[0]);
		move[1] = playerNames[1] + " " + newLocations[1].toString();
		movePlayer(playerNames[1], newLocations[1]);

		return move;

	}

	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);

	}

	public ArrayList<String> getPlayersAtLocation(Location loc) {
		ArrayList<String> players = new ArrayList<String>();

		for (String a : playerLocations.keySet()) {
			if (playerLocations.get(a).equals(loc)) {
				players.add(a);
			}
		}

		return players;

	}

	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		ArrayList<String> players = new ArrayList<String>();

		players = getPlayersAtLocation(loc);

		for (String a : players) {
			pieces.add(playerPieces.get(a));
		}

		return pieces;

	}

	public Set<String> getPlayers() {
		Set<String> players = new HashSet<String>();

		for (String a : playerPieces.keySet()) {
			players.add(a);
		}

		return players;

	}

	public Set<Location> getPlayerLocations() {
		Set<Location> locs = new HashSet<Location>();

		for (String a : playerLocations.keySet()) {
			locs.add(playerLocations.get(a));
		}

		return locs;

	}

	public Set<GamePiece> getPlayerPieces() {
		Set<GamePiece> pieces = new HashSet<GamePiece>();

		for (String a : playerPieces.keySet()) {
			pieces.add(playerPieces.get(a));
		}

		return pieces;

	}

}
