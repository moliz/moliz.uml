/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package org.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;
import org.modelexecution.fuml.convert.impl.ConversionResultImpl;
import org.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class StructuralFeatureActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.StructuralFeatureAction) ||
			!(fumlElement instanceof fUML.Syntax.Actions.IntermediateActions.StructuralFeatureAction)) {
			return;
		}
		
		fUML.Syntax.Actions.IntermediateActions.StructuralFeatureAction fumlNamedElement = (fUML.Syntax.Actions.IntermediateActions.StructuralFeatureAction) fumlElement;
		org.eclipse.uml2.uml.StructuralFeatureAction uml2NamedElement = (org.eclipse.uml2.uml.StructuralFeatureAction) uml2Element;
		
		fumlNamedElement.structuralFeature = (fUML.Syntax.Classes.Kernel.StructuralFeature) result
							.getFUMLElement(uml2NamedElement.getStructuralFeature());
		fumlNamedElement.object = (fUML.Syntax.Actions.BasicActions.InputPin) result
							.getFUMLElement(uml2NamedElement.getObject());
		
		
		
		
	}
	
}