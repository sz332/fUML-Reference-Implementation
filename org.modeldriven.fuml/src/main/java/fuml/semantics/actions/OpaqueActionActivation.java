package fuml.semantics.actions;

import fuml.syntax.actions.OpaqueAction;

public class OpaqueActionActivation extends ActionActivation {

	@Override
	public void doAction() {
		OpaqueAction action = (OpaqueAction) this.node;
		System.out.println("Running an opaque action: " + action);
	}

}
