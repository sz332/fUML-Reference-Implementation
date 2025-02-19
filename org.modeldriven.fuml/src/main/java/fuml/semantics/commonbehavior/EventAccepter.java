
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

package fuml.semantics.commonbehavior;

public abstract class EventAccepter extends org.modeldriven.fuml.FumlObject {

	public abstract void accept(
			fuml.semantics.commonbehavior.EventOccurrence eventOccurrence);

	public abstract boolean match(
			fuml.semantics.commonbehavior.EventOccurrence eventOccurrence);

} // EventAccepter
