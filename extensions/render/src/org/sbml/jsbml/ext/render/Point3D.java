/*
 * $Id: Point3D.java 17:06:27 jakob $
 * $URL: Point3D.java $
 * ----------------------------------------------------------------------------
 * This file is part of JSBML. Please visit <http://sbml.org/Software/JSBML>
 * for the latest version of JSBML and more information about SBML.
 * Copyright (C) 2009-2012 jointly by the following organizations:
 * 1. The University of Tuebingen, Germany
 * 2. EMBL European Bioinformatics Institute (EBML-EBI), Hinxton, UK
 * 3. The California Institute of Technology, Pasadena, CA, USA
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation. A copy of the license agreement is provided
 * in the file named "LICENSE.txt" included with this software distribution
 * and also available online as <http://sbml.org/Software/JSBML/License>.
 * ----------------------------------------------------------------------------
 */
package org.sbml.jsbml.ext.render;

/**
 * @author Alexander Diamantikos
 * @author Jakob Matthes
 * @author Eugen Netz
 * @author Jan Rudolph
 * @version $Rev$
 * @since 1.0
 * @date 16.05.2012
 */
public interface Point3D {

  /**
   * @return the value of absoluteY
   */
  public abstract boolean isAbsoluteY();


  /**
   * @return the value of absoluteZ
   */
  public abstract boolean isAbsoluteZ();


  /**
   * @return the value of x
   */
  public abstract double getX();


  /**
   * @return the value of y
   */
  public abstract double getY();


  /**
   * @return the value of z
   */
  public abstract double getZ();


  /**
   * @return the value of absoluteX
   */
  public abstract boolean isAbsoluteX();


  /**
   * @return whether absoluteX is set 
   */
  public abstract boolean isSetAbsoluteX();


  /**
   * @return whether absoluteY is set 
   */
  public abstract boolean isSetAbsoluteY();


  /**
   * @return whether absoluteZ is set 
   */
  public abstract boolean isSetAbsoluteZ();


  /**
   * @return whether x is set 
   */
  public abstract boolean isSetX();


  /**
   * @return whether y is set 
   */
  public abstract boolean isSetY();


  /**
   * @return whether z is set 
   */
  public abstract boolean isSetZ();


  /**
   * Set the value of absoluteX
   */
  public abstract void setAbsoluteX(Boolean absoluteX);


  /**
   * Set the value of absoluteY
   */
  public abstract void setAbsoluteY(Boolean absoluteY);


  /**
   * Set the value of absoluteZ
   */
  public abstract void setAbsoluteZ(Boolean absoluteZ);


  /**
   * Set the value of x
   */
  public abstract void setX(Double x);


  /**
   * Set the value of y
   */
  public abstract void setY(Double y);


  /**
   * Set the value of z
   */
  public abstract void setZ(Double z);


  /**
   * Unsets the variable absoluteX 
   * @return <code>true</code>, if absoluteX was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetAbsoluteX();


  /**
   * Unsets the variable absoluteY 
   * @return <code>true</code>, if absoluteY was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetAbsoluteY();


  /**
   * Unsets the variable absoluteZ 
   * @return <code>true</code>, if absoluteZ was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetAbsoluteZ();


  /**
   * Unsets the variable x 
   * @return <code>true</code>, if x was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetX();


  /**
   * Unsets the variable y 
   * @return <code>true</code>, if y was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetY();


  /**
   * Unsets the variable z 
   * @return <code>true</code>, if z was set before, 
   *         otherwise <code>false</code>
   */
  public abstract boolean unsetZ();
}