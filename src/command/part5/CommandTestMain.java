package command.part5;

import java.util.List;
import java.util.Map;

public class CommandTestMain {

	public static void main(String[] args) {
		CommandSchedule schedule = new CommandSchedule();
		schedule.addCommandSchedule("TYPE3");
		schedule.addCommandSchedule("TYPE1");
		schedule.addCommandSchedule("TYPE2");
		
		CommandStorage commandStorage = new CommandStorage();
		commandStorage.collectCommand();
		Map<String, CommandType> commandMap = commandStorage.getCommandStorage();
		
		List<String> scheduleList = schedule.getCommandSchedule();
		
		for (String command : scheduleList) {
			if (command.equals("TYPE1")) {
				CommandType commandType = commandMap.get(command);
				((Type1)commandType).execute();
			}
			
			if (command.equals("TYPE2")) {
				CommandType commandType = commandMap.get(command);
				((Type2)commandType).execute();
			}
			
			if (command.equals("TYPE3")) {
				CommandType commandType = commandMap.get(command);
				((Type3)commandType).execute();
			}
		}
	}

}
