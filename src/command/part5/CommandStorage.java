package command.part5;

import java.util.HashMap;
import java.util.Map;

public class CommandStorage {
	private Map<String, CommandType> commandMap;
	
	public void collectCommand() {
		commandMap = new HashMap<String, CommandType>();
		commandMap.put("TYPE1", new Type1());
		commandMap.put("TYPE2", new Type2());
		commandMap.put("TYPE3", new Type3());
	}

	public Map<String, CommandType> getCommandStorage() {
		return commandMap;
	}

}
