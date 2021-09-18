package fuml.semantics.actions;

import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.syntax.actions.OpaqueAction;
import fuml.syntax.actions.OutputPin;

public class OpaqueActionActivation extends ActionActivation {

	public OpaqueActionActivation() {
		super();
	}
	
	@Override
	public void doAction() {
		OpaqueAction action = (OpaqueAction) this.node;

		System.out.println("Running an opaque action: " + action);
		
		for (OutputPin pin : action.output) {
			
			System.out.println("Sending output token int = 5 to pin : " + pin.name);
			
			IntegerValue value = new IntegerValue();
			value.value = 5;
			
			this.putToken(pin, value);
		}
		
	}

}
