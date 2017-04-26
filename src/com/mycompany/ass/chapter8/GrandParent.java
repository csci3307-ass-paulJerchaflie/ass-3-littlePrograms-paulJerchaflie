/**
 * 
 */
package com.mycompany.ass.chapter8;

/**
 * @author Paul Jerchaflie
 *
 */
public class GrandParent implements HasName {

	private float debt;
	private String lastName;
	private String name;
	
	public GrandParent(float _debt, String _name, String _lastName) {
		debt=_debt;
		name = _name;
		lastName = _lastName;
	}
	
	public GrandParent() {
		this(0, "oldMan", "grandPa");
		//above line is really the right way to do it, instead of below block
//		this.debt = 0f;
//		lastName = "grandPa";
//		name = "oldMan";
	}
	
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.ass.chapter8.HasName#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the debt
	 */
	public float getDebt() {
		return debt;
	}



}
