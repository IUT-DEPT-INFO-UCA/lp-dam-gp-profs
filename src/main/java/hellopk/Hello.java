package hellopk;
/**
 * Cette classe sert uniquement à montrer différents outils dont Junit, SonarLint, ...
 * 
 * @author blay
 *
 */
public class Hello {
	
	
	private static final String DEFAULT_WELCOME_MESSAGE = "Hello";
	public static final String DEFAULT_LANGUAGE = "French";
	public static final String UNKNOWN_LANGUAGE ="to be translated";
	
	private String language = DEFAULT_LANGUAGE;
	private String welcome = DEFAULT_WELCOME_MESSAGE;
	private boolean newLanguage = false;
	
	
	/*
	 * Code pour voir des erreurs "simples" identifiées par sonarLint
	 * A remplacer par return newLanguage
	 */
	public boolean isNewLanguage() {
		if (newLanguage = true)
		   return true;
		else
			return false;
	}

	
	private Message message;
	
	public String getWelcome() {
		//Une erreur possible avec l'absence de creation d'un objet Message non détectée...
		if (newLanguage)
			return UNKNOWN_LANGUAGE;
		return DEFAULT_WELCOME_MESSAGE + message.getContents();
	}


	public Hello() {
		this(DEFAULT_LANGUAGE); 
	}
	
	public Hello(String language) {
		this.language = language;
	}

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		newLanguage = true;
		this.language = language;
	}
	
	public String  sayHello() {
		return welcome + " in : " + language;
	}
	
	public static void main(final String[] args) {
		System.out.print("Not the right string, tests will fail!");
	}
	
}
