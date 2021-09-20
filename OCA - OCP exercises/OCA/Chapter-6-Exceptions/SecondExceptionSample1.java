public class SecondExceptionSample1 {
	
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
		} catch (IOException e) {
			try {
				if (reader != null) reader.close();
			} catch (IOException inner) {}
		}
	}
	
	private static FileReader read() throws IOException {
		// Code goes here
	}
}