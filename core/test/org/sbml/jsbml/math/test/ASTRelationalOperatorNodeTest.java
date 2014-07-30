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
import org.sbml.jsbml.math.ASTCnIntegerNode;
import org.sbml.jsbml.math.ASTRelationalOperatorNode;


/**
 * Test cases for {@link ASTRelationalOperatorNode}
 * 
 * @author Victor Kofia
 * @version $Rev$
 * @since 1.0
 * @date Jul 24, 2014
 */
public class ASTRelationalOperatorNodeTest {

  /**
   * Test method for {@link org.sbml.jsbml.math.ASTRelationalOperatorNode#clone()}.
   */
  @Test
  public final void testClone() {
    ASTRelationalOperatorNode operator = new ASTRelationalOperatorNode();
    ASTRelationalOperatorNode unknown = operator.clone();
    assertTrue(operator.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTRelationalOperatorNode#clone()}.
   */
  @Test
  public final void testCloneWithChildren() {
    ASTRelationalOperatorNode operator = new ASTRelationalOperatorNode(Type.RELATIONAL_EQ);
    operator.addChild(new ASTCnIntegerNode(1));
    operator.addChild(new ASTCnIntegerNode(4));
    ASTRelationalOperatorNode unknown = operator.clone();
    assertTrue(operator.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTRelationalOperatorNode#ASTRelationalOperatorNode(org.sbml.jsbml.math.ASTRelationalOperatorNode)}.
   */
  @Test
  public final void testCloneWithConstructor() {
    ASTRelationalOperatorNode operator = new ASTRelationalOperatorNode();
    ASTRelationalOperatorNode unknown = new ASTRelationalOperatorNode(operator);
    assertTrue(operator.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTRelationalOperatorNode#clone()}.
   */
  @Test
  public final void testCloneWithType() {
    ASTRelationalOperatorNode operator = new ASTRelationalOperatorNode(Type.RELATIONAL_EQ);
    ASTRelationalOperatorNode unknown = operator.clone();
    assertTrue(operator.equals(unknown));
  }
  
  /**
   * Test method for {@link org.sbml.jsbml.math.ASTRelationalOperatorNode#isAllowableType()}.
   */
  @Test
  public final void testIsAllowableType() {
    ASTRelationalOperatorNode operator = new ASTRelationalOperatorNode();
    assertTrue(operator.isAllowableType(Type.RELATIONAL_EQ) && operator.isAllowableType(Type.RELATIONAL_GEQ)
            && operator.isAllowableType(Type.RELATIONAL_GT) && operator.isAllowableType(Type.RELATIONAL_LEQ)
            && operator.isAllowableType(Type.RELATIONAL_LT) && operator.isAllowableType(Type.RELATIONAL_NEQ)
            && ! operator.isAllowableType(null));
  }
  
}