package fuml.syntax.actions;

public class OpaqueAction extends fuml.syntax.actions.Action{

	public UMLPrimitiveTypes.StringList body = new UMLPrimitiveTypes.StringList();
	public UMLPrimitiveTypes.StringList language = new UMLPrimitiveTypes.StringList();

	public OpaqueAction() {
		super();
	}
	
	public void addBody(String body) {
		this.body.add(body);
	} // addBody

	public void addLanguage(String language) {
		this.language.add(language);
	} // addLanguage
	
}
