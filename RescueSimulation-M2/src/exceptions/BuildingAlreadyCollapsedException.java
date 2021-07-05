package exceptions;

import model.disasters.Disaster;

public class BuildingAlreadyCollapsedException extends DisasterException {

	public BuildingAlreadyCollapsedException(Disaster disaster) {
		super(disaster);
	}
	
	public BuildingAlreadyCollapsedException(Disaster disaster, String m) {
		super(disaster, m);
	}
}
