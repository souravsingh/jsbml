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
 * 6. Marquette University, Milwaukee, WI, USA
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.ext.render.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.sbml.jsbml.ext.render.FontFamily;
import org.sbml.jsbml.ext.render.Group;
import org.sbml.jsbml.ext.render.TextAnchor;
import org.sbml.jsbml.ext.render.VTextAnchor;


/**
 * @author Ibrahim Vazirabad
 * @version $Rev$
 * @since 1.0
 * @date Jun 15, 2014
 */
public class GroupTest {

  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getAllowsChildren()}.
   */
  @Test
  public void testGetAllowsChildren() {
    assertTrue(!new Group().getAllowsChildren());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getChildCount()}.
   */
  @Test
  public void testGetChildCount() {
    Group g=new Group();
    assertEquals("childCountError",g.getChildCount(),0);
  }

  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getId()}.
   */
  @Test
  public void testGetId() {
    Group g=new Group();
    String id="newGroup";
    g.setId(id);
    assertEquals(id,g.getId());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetId()}.
   */
  @Test
  public void testIsSetId() {
    Group g=new Group();
    String id="newGroup";
    g.setId(id);
    assertTrue(g.isSetId());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setId(java.lang.String)}.
   */
  @Test
  public void testSetId() {
    Group g=new Group();
    String id="newGroup";
    g.setId(id);
    assertEquals(id,g.getId());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getFontFamily()}.
   */
  @Test
  public void testGetFontFamily() {
    FontFamily fontType=FontFamily.MONOSPACE;
    Group g=new Group();
    assertTrue(!g.isSetFontFamily());
    g.setFontFamily(fontType);
    assertEquals("getFontFamily",fontType,g.getFontFamily());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetFontFamily()}.
   */
  @Test
  public void testIsSetFontFamily() {
    FontFamily fontType=FontFamily.MONOSPACE;
    Group g=new Group();
    assertTrue(!g.isSetFontFamily());
    g.setFontFamily(fontType);
    assertTrue(g.isSetFontFamily());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setFontFamily(org.sbml.jsbml.ext.render.FontFamily)}.
   */
  @Test
  public void testSetFontFamily() {
    FontFamily fontType=FontFamily.MONOSPACE;
    Group g=new Group();
    assertTrue(!g.isSetFontFamily());
    g.setFontFamily(fontType);
    assertEquals("setFontFamilyError",g.getFontFamily(),fontType);
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getFontSize()}.
   */
  @Test
  public void testGetFontSize() {
    short fontSize=18;
    Group g=new Group();
    assertTrue(!g.isSetFontSize());
    g.setFontSize(fontSize);
    assertEquals("getFontSizeError",Short.valueOf(fontSize),g.getFontSize());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetFontSize()}.
   */
  @Test
  public void testIsSetFontSize() {
    short fontSize=18;
    Group g=new Group();
    assertTrue(!g.isSetFontSize());
    g.setFontSize(fontSize);
    assertTrue(g.isSetFontSize());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setFontSize(java.lang.Short)}.
   */
  @Test
  public void testSetFontSize() {
    short fontSize=19;
    Group g=new Group();
    assertTrue(!g.isSetFontSize());
    g.setFontSize(fontSize);
    assertEquals("getFontSizeError",Short.valueOf(fontSize),g.getFontSize());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isFontWeightBold()}.
   */
  @Test
  public void testIsFontWeightBold() {
    Group g=new Group();
    g.setFontWeightBold(true);
    assertTrue(g.isFontWeightBold());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetFontWeightBold()}.
   */
  @Test
  public void testIsSetFontWeightBold() {
    Group g=new Group();
    g.setFontWeightBold(false);
    assertTrue(g.isSetFontWeightBold());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setFontWeightBold(java.lang.Boolean)}.
   */
  @Test
  public void testSetFontWeightBold() {
    Group g=new Group();
    g.setFontWeightBold(true);
    assertTrue(g.isFontWeightBold());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isFontStyleItalic()}.
   */
  @Test
  public void testIsFontStyleItalic() {
    Group g=new Group();
    g.setFontStyleItalic(true);
    assertTrue(g.isFontStyleItalic());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetFontStyleItalic()}.
   */
  @Test
  public void testIsSetFontStyleItalic() {
    Group g=new Group();
    assertTrue(!g.isSetFontStyleItalic());
    g.setFontStyleItalic(true);
    assertTrue(g.isSetFontStyleItalic());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setFontStyleItalic(java.lang.Boolean)}.
   */
  @Test
  public void testSetFontStyleItalic() {
    Group g=new Group();
    assertTrue(!g.isSetFontStyleItalic());
    g.setFontStyleItalic(false);
    assertTrue(g.isSetFontStyleItalic());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getStartHead()}.
   */
  @Test
  public void testGetStartHead() {
    Group g=new Group();
    String startH="s1";
    g.setStartHead(startH);
    assertEquals(startH,g.getStartHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetStartHead()}.
   */
  @Test
  public void testIsSetStartHead() {
    Group g=new Group();
    String startH="s1";
    g.setStartHead(startH);
    assertTrue(g.isSetStartHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setStartHead(java.lang.String)}.
   */
  @Test
  public void testSetStartHead() {
    Group g=new Group();
    String startH="s1";
    g.setStartHead(startH);
    assertEquals(startH,g.getStartHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getEndHead()}.
   */
  @Test
  public void testGetEndHead() {
    Group g=new Group();
    String endH="s2";
    g.setStartHead(endH);
    assertEquals(endH,g.getStartHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetEndHead()}.
   */
  @Test
  public void testIsSetEndHead() {
    Group g=new Group();
    String endH="s2";
    g.setEndHead(endH);
    assertTrue(g.isSetEndHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setEndHead(java.lang.String)}.
   */
  @Test
  public void testSetEndHead() {
    Group g=new Group();
    String endH="s2";
    g.setEndHead(endH);
    assertEquals(endH,g.getEndHead());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getTextAnchor()}.
   */
  @Test
  public void testGetTextAnchor() {
    TextAnchor anchor=TextAnchor.START;
    Group g=new Group();
    assertTrue(!g.isSetTextAnchor());
    g.setTextAnchor(anchor);
    assertEquals("getTextAnchorError",anchor,g.getTextAnchor());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetTextAnchor()}.
   */
  @Test
  public void testIsSetTextAnchor() {
    Group g=new Group();
    TextAnchor anchor=TextAnchor.MIDDLE;
    assertTrue(!g.isSetTextAnchor());
    g.setTextAnchor(anchor);
    assertTrue(g.isSetTextAnchor());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setTextAnchor(org.sbml.jsbml.ext.render.TextAnchor)}.
   */
  @Test
  public void testSetTextAnchor() {
    Group g=new Group();
    TextAnchor anchor=TextAnchor.END;
    g.setTextAnchor(anchor);
    assertEquals("textAnchorError",anchor,g.getTextAnchor());
    anchor=TextAnchor.MIDDLE;
    g.setTextAnchor(anchor);
    assertEquals("textAnchorError",anchor,g.getTextAnchor());
    anchor=TextAnchor.START;
    g.setTextAnchor(anchor);
    assertEquals("textAnchorError",anchor,g.getTextAnchor());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#getVTextAnchor()}.
   */
  @Test
  public void testGetVTextAnchor() {
    VTextAnchor anchor=VTextAnchor.BOTTOM;
    Group g=new Group();
    g.setVTextAnchor(anchor);
    assertEquals("getTextAnchorError",anchor,g.getVTextAnchor());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#isSetVTextAnchor()}.
   */
  @Test
  public void testIsSetVTextAnchor() {
    Group g=new Group();
    VTextAnchor anchor=VTextAnchor.BOTTOM;
    assertTrue(!g.isSetVTextAnchor());
    g.setVTextAnchor(anchor);
    assertTrue(g.isSetVTextAnchor());
  }


  /**
   * Test method for {@link org.sbml.jsbml.ext.render.Group#setVTextAnchor(org.sbml.jsbml.ext.render.VTextAnchor)}.
   */
  @Test
  public void testSetVTextAnchor() {
    Group g=new Group();
    VTextAnchor anchor=VTextAnchor.BOTTOM;
    g.setVTextAnchor(anchor);
    assertEquals("VTextAnchorError",anchor,g.getVTextAnchor());
    anchor=VTextAnchor.MIDDLE;
    g.setVTextAnchor(anchor);
    assertEquals("VTextAnchorError",anchor,g.getVTextAnchor());
    anchor=VTextAnchor.TOP;
    g.setVTextAnchor(anchor);
    assertEquals("VTextAnchorError",anchor,g.getVTextAnchor());
  }
}