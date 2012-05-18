/*
 * $Id$
 * $URL$
 *
 * ---------------------------------------------------------------------------- 
 * This file is part of JSBML. Please visit <http://sbml.org/Software/JSBML> 
 * for the latest version of JSBML and more information about SBML. 
 * 
 * Copyright (C) 2009-2012 jointly by the following organizations: 
 * 1. The University of Tuebingen, Germany 
 * 2. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK 
 * 3. The California Institute of Technology, Pasadena, CA, USA 
 * 
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation. A copy of the license agreement is provided 
 * in the file named "LICENSE.txt" included with this software distribution 
 * and also available online as <http://sbml.org/Software/JSBML/License>. 
 * ---------------------------------------------------------------------------- 
 */ 
package org.sbml.jsbml.ext.render;

import java.util.Map;

import javax.swing.tree.TreeNode;

import org.sbml.jsbml.ListOf;
import org.sbml.jsbml.Model;
import org.sbml.jsbml.ext.AbstractSBasePlugin;
import org.sbml.jsbml.ext.SBasePlugin;


/**
 * @author Eugen Netz
 * @author Alexander Diamantikos
 * @author Jakob Matthes
 * @author Jan Rudolph
 * @version $Rev$
 * @since 1.0
 * @date 14.05.2012
 */
public class ExtendedRenderModel extends AbstractSBasePlugin {
   
  /**
   * 
   */
  private static final long serialVersionUID = 7654047378880104537L;
  
  
  protected ListOf<LocalRenderInformation> listOfLocalRenderInformation;
  protected ListOf<GlobalRenderInformation> listOfGlobalRenderInformation;
  // TODO unclear if Integer or int
  protected int versionMajor;
  protected int versionMinor;

  /**
   * 
   */
  private Model model;
  
  public ExtendedRenderModel(Model model) {
    super(model);

    this.model = model;
    createListOfLocalRenderInformation();
    createListOfGlobalRenderInformation();
  }
  
  private void createListOfLocalRenderInformation() {
    listOfLocalRenderInformation = new ListOf<LocalRenderInformation>();
    //TODO
    //listOfLocalRenderInformation.addNamespace(RenderConstant.namespaceURI);
    listOfLocalRenderInformation.setSBaseListType(ListOf.Type.other);
    model.registerChild(listOfLocalRenderInformation);
  }
  
  private void createListOfGlobalRenderInformation(){
    listOfGlobalRenderInformation = new ListOf<GlobalRenderInformation>();
    //TODO
    //listOfGlobalRenderInformation.addNamespace(RenderConstant.namespaceURI);
    listOfGlobalRenderInformation.setSBaseListType(ListOf.Type.other);
    model.registerChild(listOfGlobalRenderInformation);
  }

  public static final int MIN_SBML_LEVEL = 3;
  public static final int MIN_SBML_VERSION = 1;

  //TODO
  public SBasePlugin clone() {
    // TODO Auto-generated method stub
    return null;
  }

  //TODO
  public boolean getAllowsChildren() {
    // TODO Auto-generated method stub
    return false;
  }

  //TODO
  public TreeNode getChildAt(int childIndex) {
    // TODO Auto-generated method stub
    return null;
  }

  //TODO
  public int getChildCount() {
    // TODO Auto-generated method stub
    return 0;
  }

  //TODO
  public boolean readAttribute(String attributeName, String prefix, String value) {
    // TODO Auto-generated method stub
    return false;
  }

  //TODO
  public Map<String, String> writeXMLAttributes() {
    // TODO Auto-generated method stub
    return null;
  }

}