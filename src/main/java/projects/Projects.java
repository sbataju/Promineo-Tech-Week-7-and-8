package projects;

//import projects.dao.DbConnection;

public class Projects {

	public static void main(String[] args) {
		//Testing that we get a connection
		//DbConnection.getConnection();
		new ProjectsApp().processUserSelections();
	}

}
