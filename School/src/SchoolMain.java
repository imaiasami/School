import manager.SchoolManager;
import ui.SchoolUI;

public class SchoolMain {
	public static void main(String[] args) {
		SchoolManager manager = new SchoolManager();
		new SchoolUI(manager);

	}

}
