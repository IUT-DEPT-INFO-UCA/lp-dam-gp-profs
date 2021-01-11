package hellopk;

/**
 * This class contains useful methods to deal with message contents 
 * 
 * @author blay
 *
 */
public class Message {
	private String contents;

	/**
	 * {@code Message}'s default constructor.
	 * @param message content {@code String}.
	 */
	public Message(String pcontents) {
		contents = pcontents;
	}

	/**
	 * @return the message content : {@code String}.
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * Set message content.
	 * @param the content of the message of type {@code String}.
	 */
	public void setContents(String pcontents) {
		this.contents = pcontents;
	}
	
	
}
