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
package org.sbml.jsbml.math.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.sbml.jsbml.ASTNode.Type;
import org.sbml.jsbml.math.ASTLogicalOperatorNode;
import org.sbml.jsbml.math.ASTPiecewiseFunctionNode;
import org.sbml.jsbml.math.ASTQualifierNode;
import org.sbml.jsbml.math.ASTRelationalOperatorNode;


/**
 * Test cases for {@link ASTPiecewiseFunctionNode}
 * 
 * @author Victor Kofia
 * @version $Rev$
 * @since 1.0
 * @date Jul 25, 2014
 */
public class ASTPiecewiseFunctionNodeTest {

  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#clone()}.
   */
  @Test
  public final void testClone() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    ASTPiecewiseFunctionNode unknown = piecewise.clone();
    assertTrue(piecewise.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#clone()}.
   */
  @Test
  public final void testCloneWithChildren() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    piecewise.addChild(new ASTRelationalOperatorNode(Type.RELATIONAL_EQ));
    piecewise.addChild(new ASTLogicalOperatorNode(Type.LOGICAL_AND));
    piecewise.addChild(new ASTQualifierNode(Type.QUALIFIER_BVAR));
    ASTPiecewiseFunctionNode unknown = piecewise.clone();
    assertTrue(piecewise.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#ASTPiecewiseFunctionNode(org.sbml.jsbml.math.ASTPiecewiseFunctionNode)}.
   */
  @Test
  public final void testCloneWithConstructor() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    ASTPiecewiseFunctionNode unknown = new ASTPiecewiseFunctionNode(piecewise);
    assertTrue(piecewise.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#getNumPiece()}.
   */
  @Test
  public final void testGetNumPiece() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    assertTrue(piecewise.getNumPiece() == 0);
  }

  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#getNumPiece()}.
   */
  @Test
  public final void testGetNumPieceWithChildren() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_PIECE));
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_PIECE));
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_OTHERWISE));
    assertTrue(piecewise.getNumPiece() == 2);
  }

  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#hasOtherwise()}.
   */
  @Test
  public final void testHasOtherwise() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    assertFalse(piecewise.hasOtherwise());
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTPiecewiseFunctionNode#hasOtherwise()}.
   */
  @Test
  public final void testHasOtherwiseWithOdd() {
    ASTPiecewiseFunctionNode piecewise = new ASTPiecewiseFunctionNode();
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_PIECE));
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_PIECE));
    piecewise.addChild(new ASTQualifierNode(Type.CONSTRUCTOR_OTHERWISE));
    assertTrue(piecewise.hasOtherwise());
  }

}
