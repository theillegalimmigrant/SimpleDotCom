
iport java.util.ArrayList;

public class DotCom {
	
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}
	
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public String checkYourself (String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}
		
		return result;
	}
}