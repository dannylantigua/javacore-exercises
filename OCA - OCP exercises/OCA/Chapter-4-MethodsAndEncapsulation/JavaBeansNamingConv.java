public class JavaBeansNamingConv {
	private boolean playing;
	private String name;
	
	// Do these follow JavaBeans naming convention?
	public boolean getPlaying() { return playing; }		// Yes
	public boolean isPlaying() { return playing; }		// Yes
	public String name() { return name; }				// No
	public void updateName(String n) { name = n; }		// No
	public void setname(String n) { name = n; }			// No
	
}