/*
 * $Id$
 * $URL$
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
 * 6. The University of Toronto, Toronto, ON, Canada
 * 
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.math;

import java.util.ArrayList;

import org.sbml.jsbml.ASTNode;
import org.sbml.jsbml.ASTNode.Type;
import org.sbml.jsbml.MathContainer;
import org.sbml.jsbml.math.compiler.ASTNode2Compiler;
import org.sbml.jsbml.util.compilers.ASTNodeValue;

/**
 * An Abstract Syntax Tree (AST) node representing a lambda function
 * in a mathematical expression.
 * 
 * @author Victor Kofia
 * @version $Rev$
 * @since 1.0
 * @date May 30, 2014
 */
public class ASTLambdaFunctionNode extends ASTFunction {

  /**
   * 
   */
  private static final long serialVersionUID = 3189146748998908918L;

  /**
   * Creates a new {@link ASTLambdaFunctionNode}.
   */
  public ASTLambdaFunctionNode() {
    super();
    setType(Type.LAMBDA);
  }

  /**
   * Copy constructor; Creates a deep copy of the given {@link ASTLambdaFunctionNode}.
   * 
   * @param node
   *            the {@link ASTLambdaFunctionNode} to be copied.
   */
  public ASTLambdaFunctionNode(ASTLambdaFunctionNode node) {
    super(node);
  }
  
  /*
   * (non-Javadoc)
   * @see org.sbml.jsbml.math.ASTFunction#clone()
   */
  @Override
  public ASTLambdaFunctionNode clone() {
    return new ASTLambdaFunctionNode(this);
  }
  
  /* (non-Javadoc)
   * @see org.sbml.jsbml.math.ASTNode2#compile(org.sbml.jsbml.util.compilers.ASTNode2Compiler)
   */
  @Override
  public ASTNodeValue compile(ASTNode2Compiler compiler) {
    ASTNodeValue value = null;
    value = compiler.lambda(getChildren());
    value.setUIFlag(getChildCount() <= 1);
    value.setType(getType());
    MathContainer parent = getParentSBMLObject();
    if (parent != null) {
      value.setLevel(parent.getLevel());
      value.setVersion(parent.getVersion());
    }
    return value;
  }

  /**
   * Get the number of bvar elements in this {@link ASTLambdaFunctionNode}
   * 
   * @return Integer numBvars
   */
  public int getBvarCount() {
    if (! isSetList()) {
      return 0;
    }
    int i = 0;
    for (ASTNode2 node : getListOfNodes()) {
      i = node.getType() == ASTNode.Type.QUALIFIER_BVAR ? i + 1 : i;
    }
    return i;
  }

  /* (non-Javadoc)
   * @see org.sbml.jsbml.math.ASTFunction#isAllowableType(org.sbml.jsbml.ASTNode.Type)
   */
  @Override
  public boolean isAllowableType(Type type) {
    return type == Type.LAMBDA;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ASTLambdaFunctionNode [listOfNodes=");
    builder.append(listOfNodes);
    builder.append(", parentSBMLObject=");
    builder.append(parentSBMLObject);
    builder.append(", strict=");
    builder.append(strict);
    builder.append(", type=");
    builder.append(type);
    builder.append(", id=");
    builder.append(id);
    builder.append(", style=");
    builder.append(style);
    builder.append(", listOfListeners=");
    builder.append(listOfListeners);
    builder.append(", parent=");
    builder.append(parent);
    builder.append("]");
    return builder.toString();
  }

  /**
   * Replaces occurrences of a name within this {@link ASTLambdaFunctionNode} with the
   * name/value/formula represented by the second argument {@link ASTNode2}, e.g., if
   * the formula in this {@link ASTLambdaFunctionNode} is x + y; bvar is x and arg is an 
   * {@link ASTLambdaFunctionNode} representing the real value 3 ReplaceArgument substitutes
   * 3 for x within this {@link ASTLambdaFunctionNode}.
   * 
   * @param bvar
   *            a string representing the variable name to be substituted
   * @param arg
   *            an {@link ASTNode2} representing the name/value/formula to substitute
   *        
   */
  public void replaceArgument(String bvar, ASTNode2 arg) {
    if (! isSetList()) {
      listOfNodes = new ArrayList<ASTNode2>();
    }
    int n = 0;
    for (ASTNode2 child : listOfNodes) {
      if (child.getType() == Type.QUALIFIER_BVAR) {
        if (((ASTQualifierNode)child).getName().equals(bvar)) {
          replaceChild(n, arg.clone());
        } else if (child.getChildCount() > 0) {
          ((ASTLambdaFunctionNode)child).replaceArgument(bvar, arg);
        }
      }
      n++;
    }
  }

}
