import java.io.BufferedReader;
import java.io.FileReader;


public class GitHubDemo {
	public static void main(String[] args) {
		new GitHubDemo();
	}
	
	public GitHubDemo() {
		System.out.println("The People on the left side of the room are." 
	                       + loadFile("leftSide.txt"));
		System.out.println("\nThe People on the right side of the room are." 
                + loadFile("rightSide.txt"));
	}
	
	private String loadFile(final String filename) {
		String returnString = "";
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = null;

	        // repeat until all lines is read
	        while ((line = reader.readLine()) != null) {
	            returnString += "\n" + line;
	        }
	        reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return returnString;
	}
}
