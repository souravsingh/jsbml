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

import org.sbml.jsbml.MathContainer;


/**
 * An Abstract Syntax Tree (AST) node representing a real number
 * in a mathematical expression
 * 
 * @author Victor Kofia
 * @version $Rev$
 * @since 1.0
 * @date May 30, 2014
 */
public class ASTCnRealNode extends ASTCnNumberNode {

  /**
   * The value of this node
   */
  private Double value;

  /**
   * Creates a new {@link ASTCnRealNode} that lacks a pointer
   * to its containing {@link MathContainer}.
   */
  public ASTCnRealNode() {
    super();
    setType("real");
  }

  /**
   * Copy constructor; Creates a deep copy of the given {@link ASTCnRealNode}.
   * 
   * @param cnRealNode
   *            the {@link ASTCnRealNode} to be copied.
   */
  public ASTCnRealNode(ASTCnRealNode cnRealNode) {
    super();
    setType("real");
  }

  /**
   * Return the value of this node
   * 
   * @return double value
   */
  public double getValue() {
    return isSetValue() ? value : Double.NaN;
  }

  /**
   * Returns true iff a value has been set
   * @param null
   * @return boolean
   */
  public boolean isSetValue() {
    return value != null;
  }

  /**
   * Set the value of this node
   * 
   * @param double value
   */
  public void setValue(double value) {
    this.value = value;
  }

}