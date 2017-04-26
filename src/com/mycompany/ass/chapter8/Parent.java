/**
 * 
 */
package com.mycompany.ass.chapter8;

/**
 * @author Paul Jerchaflie
 *
 */
public class Parent extends GrandParent {
	protected float wealth;
	/**
	 * @param debt
	 * @param _name
	 * @param _lastName
	 */
	public Parent(float debt, String _name, String _lastName,float _wealth) {
		super(debt, _name, _lastName);
		wealth=_wealth;
	}

	/**
	 * 
	 */
	public Parent() {
		super();
	}

}
