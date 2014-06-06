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
 * An Abstract Syntax Tree (AST) node representing a MathML cn element in a
 * mathematical expression. cn elements are used to specify actual numerical
 * constants.
 * 
 * @author Victor Kofia
 * @version $Rev$
 * @since 1.0
 * @date May 30, 2014
 */
public class ASTCnNumberNode extends ASTNumber {

  /**
   * Numerical base for MathML element
   */
  private Double base;

  /**
   * type attribute for MathML element
   */
  private String type;

  /**
   * units attribute for MathML element
   */
  private String units;

  /**
   * Creates a new {@link ASTCnNumberNode} that lacks a pointer
   * to its containing {@link MathContainer}.
   */
  public ASTCnNumberNode() {
    super();
  }

  /**
   * Copy constructor; Creates a deep copy of the given {@link ASTCnNumberNode}.
   * 
   * @param cnNumberNode
   *            the {@link ASTCnNumberNode} to be copied.
   */
  public ASTCnNumberNode(ASTCnNumberNode cnNumberNode) {
    super(cnNumberNode);
  }

  /**
   * Get the numerical base of MathML element. Number (CDATA for XML DTD)
   * between 2 and 36.
   * 
   * @param null
   * @return Double base
   */
  public Double getBase() {
    return base;
  }

  /**
   * Returns the type of the MathML element represented by this ASTCnNumberNode
   * 
   * @return String type
   */
  public String getType() {
    return type;
  }

  /**
   * Returns the units of the MathML element represented by this ASTCnNumberNode
   * 
   * @return String units
   */
  public String getUnits() {
    return units;
  }

  /**
   * Set the numerical base of MathML element. Number (CDATA for XML DTD)
   * between 2 and 36
   * 
   * @param Double base
   * @return null
   */
  public void setBase(Double base) {
    this.base = base;
  }

  /**
   * Set the type of the MathML element represented by this ASTCnNumberNode
   * 
   * @param String type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Set the units of the MathML element represented by this ASTCnNumberNode
   * 
   * @param String units
   */
  public void setUnits(String units) {
    this.units = units;
  }

}