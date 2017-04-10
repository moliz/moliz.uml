/*
* Copyright (c) 2014 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API
* Tanja Mayerhofer - implementation
*/
package org.modelexecution.fuml.trace.convert.uml2.internal.populator;

import org.eclipse.uml2.uml.ExpansionNode;
import org.modelexecution.fuml.trace.convert.IConversionResult;
import org.modelexecution.fuml.trace.convert.uml2.internal.IUML2TraceElementPopulator;
import org.modelexecution.fuml.trace.uml2.tracemodel.ExpansionInput;
import org.modelexecution.fuml.trace.uml2.tracemodel.InputValue;

/**
 * @author Tanja Mayerhofer (mayerhofer@big.tuwien.ac.at)
 *
 */
public class ExpansionInputPopulator implements IUML2TraceElementPopulator {

	/* (non-Javadoc)
	 * @see org.modelexecution.fuml.trace.convert.uml2.internal.IUML2TraceElementPopulator#populate(java.lang.Object, java.lang.Object, org.modelexecution.fuml.trace.uml2.convert.IConversionResult)
	 */
	@Override
	public void populate(Object umlTraceElement, Object fumlTraceElement,
			IConversionResult result, org.modelexecution.fuml.convert.IConversionResult modelConversionResult) {

		if(!(umlTraceElement instanceof ExpansionInput) || !(fumlTraceElement instanceof org.modelexecution.fumldebug.core.trace.tracemodel.ExpansionInput)) {
			return;
		}

		ExpansionInput umlExpansionInput = (ExpansionInput) umlTraceElement;
		org.modelexecution.fumldebug.core.trace.tracemodel.ExpansionInput fumlExpansionInput = (org.modelexecution.fumldebug.core.trace.tracemodel.ExpansionInput) fumlTraceElement;
		
		umlExpansionInput.setExpansionNode((ExpansionNode)modelConversionResult.getInputObject(fumlExpansionInput.getExpansionNode()));
		
		for(org.modelexecution.fumldebug.core.trace.tracemodel.InputValue fumlExpansionInputValue : fumlExpansionInput.getExpansionInputValues()) {
			umlExpansionInput.getExpansionInputValues().add((InputValue)result.getOutputUMLTraceElement(fumlExpansionInputValue));
		}		
	}

}
