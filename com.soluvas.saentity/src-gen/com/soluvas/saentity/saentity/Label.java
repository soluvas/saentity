/**
 * <copyright>
 * </copyright>
 *
 */
package com.soluvas.saentity.saentity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.soluvas.saentity.saentity.Label#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.soluvas.saentity.saentity.SaentityPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.soluvas.saentity.saentity.SaentityPackage#getLabel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.soluvas.saentity.saentity.Label#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Label
