
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.syntax.actions;

public class CreateObjectAction extends fuml.syntax.actions.Action {

	public fuml.syntax.actions.OutputPin result = null;
	public fuml.syntax.classification.Classifier classifier = null;

	public void setClassifier(fuml.syntax.classification.Classifier classifier) {
		this.classifier = classifier;
	} // setClassifier

	public void setResult(fuml.syntax.actions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

} // CreateObjectAction
