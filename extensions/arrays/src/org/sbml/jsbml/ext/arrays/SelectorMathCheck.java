/*
 * $Id:  SelectorMathCheck.java 2:28:48 PM lwatanabe $
 * $URL: SelectorMathCheck.java $
 * ---------------------------------------------------------------------------- 
 * This file is part of JSBML. Please visit <http://sbml.org/Software/JSBML> 
 * for the latest version of JSBML and more information about SBML. 
 * 
 * Copyright (C) 2009-2014  jointly by the following organizations: 
 * 1. The University of Tuebingen, Germany 
 * 2. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK 
 * 3. The California Institute of Technology, Pasadena, CA, USA 
 * 4. The University of California, San Diego, La Jolla, CA, USA
 * 5. The Babraham Institute, Cambridge, UK
 * 6. The University of Utah, Salt Lake City, UT, USA
 *
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation. A copy of the license agreement is provided 
 * in the file named "LICENSE.txt" included with this software distribution 
 * and also available online as <http://sbml.org/Software/JSBML/License>. 
 * ---------------------------------------------------------------------------- 
 */
package org.sbml.jsbml.ext.arrays;

import org.sbml.jsbml.ASTNode;
import org.sbml.jsbml.MathContainer;
import org.sbml.jsbml.Model;
import org.sbml.jsbml.SBase;


/**
 * @author Leandro Watanabe
 * @version $Rev$
 * @since 1.0
 * @date Jun 10, 2014
 */
public class SelectorMathCheck extends ArraysConstraint {

  private final MathContainer mathContainer;
  
  /**
   * 
   * @param model
   * @param sbase
   * @param math
   */
  public SelectorMathCheck(Model model, SBase sbase, MathContainer mathContainer) {
    super(model);
    this.mathContainer = mathContainer;
  }

  /**
   * 
   */
  @Override
  public void check()
  {
    if(model == null || mathContainer == null) {
      return;
    }
    
    ASTNode math = mathContainer.getMath();
    
    if(math.getChildCount() == 0) {
      System.err.println("Selector has wrong number of arguments");
      String shortMsg = "";
      logSelectorInconsistency(shortMsg);
    }

    ASTNode obj = math.getChild(0);

    if(obj.isString())
    {
      SBase sbase = model.findNamedSBase(obj.toString());
      
      if(sbase == null)
      {
        System.err.println("Selector references non-valid object");
        return;
      }
      
      ArraysSBasePlugin arraysSBasePlugin = (ArraysSBasePlugin) sbase.getExtension(ArraysConstants.shortLabel);
      
      if(arraysSBasePlugin.getDimensionCount() != math.getChildCount()-1)
      {
        System.err.println("Selector references an object with number of dimensions that doesn't match the number of arguments");
        String shortMsg = "";
        logSelectorInconsistency(shortMsg);
      }
      
      
      
    }
    else if(!obj.isVector())
    {
      System.err.println("The first argument of selector should be a vector or valid SIdref");
      String shortMsg = "";
      logSelectorInconsistency(shortMsg);
    }
    
    // TODO: check if all arguments evaluate to an integer and that is less than the size of the array

  }


  /**
   * 
   * @param shortMsg
   */
  private void logSelectorInconsistency(String shortMsg) {
    int code = 10207, severity = 0, category = 0, line = 0, column = 0;

    String pkg = "arrays";
    String msg = "The first argument of a MathML selector must be a MathML vector object or a valid identifier" +
                 "to an SBase object extended with a list of Dimension objects. (Reference: SBML Level 3 Package" +
                 "Specification for Arrays, Version 1, Section 3.5 on page 10.)";
    
    logFailure(code, severity, category, line, column, pkg, msg, shortMsg);
  }

}
