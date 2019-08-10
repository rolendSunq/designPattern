package command.part5;

import java.util.ArrayList;
import java.util.List;

public class CommandSchedule {
	private List<String> commandScheduleList;
	
	public CommandSchedule() {
		commandScheduleList = new ArrayList<String>();
	}
	
	public void addCommandSchedule(String type) {
		commandScheduleList.add(type);
	}
	
	public List<String> getCommandSchedule() {
		return commandScheduleList;
	}
}
