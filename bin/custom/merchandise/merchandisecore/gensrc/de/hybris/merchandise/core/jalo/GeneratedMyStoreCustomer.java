/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4 sept. 2020 à 15:33:25                     ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.merchandise.core.jalo;

import de.hybris.merchandise.core.constants.MerchandiseCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.merchandise.core.jalo.MyStoreCustomer MyStoreCustomer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMyStoreCustomer extends Customer
{
	/** Qualifier of the <code>MyStoreCustomer.contactPhoneNumber</code> attribute **/
	public static final String CONTACTPHONENUMBER = "contactPhoneNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTACTPHONENUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStoreCustomer.contactPhoneNumber</code> attribute.
	 * @return the contactPhoneNumber - ContactPhoneNumber
	 */
	public String getContactPhoneNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTPHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStoreCustomer.contactPhoneNumber</code> attribute.
	 * @return the contactPhoneNumber - ContactPhoneNumber
	 */
	public String getContactPhoneNumber()
	{
		return getContactPhoneNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStoreCustomer.contactPhoneNumber</code> attribute. 
	 * @param value the contactPhoneNumber - ContactPhoneNumber
	 */
	public void setContactPhoneNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTPHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStoreCustomer.contactPhoneNumber</code> attribute. 
	 * @param value the contactPhoneNumber - ContactPhoneNumber
	 */
	public void setContactPhoneNumber(final String value)
	{
		setContactPhoneNumber( getSession().getSessionContext(), value );
	}
	
}
