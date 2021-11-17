package starter.configuracion;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private String status;

	public Estado(String status) {
		this.status = status;
	}


	public List<String> nextStatus(String status) {
		List<String> stlist = new ArrayList<>();
		String nst = "";
		switch (status) {
		case "open":
			nst = "close";
			stlist.add(nst);
			break;
			
		case "close":
			nst = "half-open";
			stlist.add(nst);
			break;
			
		case "half-open":
			nst = "open";
			stlist.add(nst);
			break;
		
		default:
			nst = "close";
			stlist.add(nst);
			break;
		}
		
		
		return stlist;
	}
	
}
