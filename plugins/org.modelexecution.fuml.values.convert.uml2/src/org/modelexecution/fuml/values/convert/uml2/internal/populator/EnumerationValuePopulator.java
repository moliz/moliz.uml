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
package org.modelexecution.fuml.values.convert.uml2.internal.populator;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.modelexecution.fuml.values.convert.IConversionResult;
import org.modelexecution.fuml.values.convert.uml2.internal.IFUMLValuePopulator;
import org.modelexecution.fuml.trace.uml2.fuml.Semantics.Classes.Kernel.EnumerationValue;
import org.modelexecution.fuml.trace.uml2.fuml.Semantics.Classes.Kernel.Value;

/**
 * @author Tanja Mayerhofer (mayerhofer@big.tuwien.ac.at)
 *
 */
public class EnumerationValuePopulator implements IFUMLValuePopulator {

	/* (non-Javadoc)
	 * @see org.modelexecution.fuml.trace.convert.uml2.internal.IUML2TraceElementPopulator#populate(java.lang.Object, java.lang.Object, org.modelexecution.fuml.trace.uml2.convert.IConversionResult)
	 */
	@Override
	public void populate(Value umlValue,
			fUML.Semantics.Classes.Kernel.Value fumlValue,
			IConversionResult result, org.modelexecution.fuml.convert.IConversionResult modelConversionResult) {

		if(!(umlValue instanceof EnumerationValue) || !(fumlValue instanceof fUML.Semantics.Classes.Kernel.EnumerationValue)) {
			return;
		}

		EnumerationValue umlEnumerationValue = (EnumerationValue) umlValue;
		fUML.Semantics.Classes.Kernel.EnumerationValue fumlEnumerationValue = (fUML.Semantics.Classes.Kernel.EnumerationValue) fumlValue;
		
		umlEnumerationValue.setType((Enumeration)modelConversionResult.getInputObject(fumlEnumerationValue.type));
		umlEnumerationValue.setLiteral((EnumerationLiteral)modelConversionResult.getInputObject(fumlEnumerationValue.literal));
				
	}

}
