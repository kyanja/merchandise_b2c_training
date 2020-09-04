/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4 sept. 2020 à 16:26:52                     ---
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
import de.hybris.merchandise.core.jalo.ApparelProduct;
import de.hybris.merchandise.core.jalo.ApparelSizeVariantProduct;
import de.hybris.merchandise.core.jalo.ApparelStyleVariantProduct;
import de.hybris.merchandise.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>MerchandiseCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMerchandiseCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactPhoneNumber", AttributeMode.INITIAL);
		tmp.put("alternativeEmail", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.alternativeEmail</code> attribute.
	 * @return the alternativeEmail
	 */
	public String getAlternativeEmail(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, MerchandiseCoreConstants.Attributes.Customer.ALTERNATIVEEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.alternativeEmail</code> attribute.
	 * @return the alternativeEmail
	 */
	public String getAlternativeEmail(final Customer item)
	{
		return getAlternativeEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.alternativeEmail</code> attribute. 
	 * @param value the alternativeEmail
	 */
	public void setAlternativeEmail(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, MerchandiseCoreConstants.Attributes.Customer.ALTERNATIVEEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.alternativeEmail</code> attribute. 
	 * @param value the alternativeEmail
	 */
	public void setAlternativeEmail(final Customer item, final String value)
	{
		setAlternativeEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactPhoneNumber</code> attribute.
	 * @return the contactPhoneNumber
	 */
	public String getContactPhoneNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, MerchandiseCoreConstants.Attributes.Customer.CONTACTPHONENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactPhoneNumber</code> attribute.
	 * @return the contactPhoneNumber
	 */
	public String getContactPhoneNumber(final Customer item)
	{
		return getContactPhoneNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactPhoneNumber</code> attribute. 
	 * @param value the contactPhoneNumber
	 */
	public void setContactPhoneNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, MerchandiseCoreConstants.Attributes.Customer.CONTACTPHONENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactPhoneNumber</code> attribute. 
	 * @param value the contactPhoneNumber
	 */
	public void setContactPhoneNumber(final Customer item, final String value)
	{
		setContactPhoneNumber( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MerchandiseCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MerchandiseCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MerchandiseCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MerchandiseCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return MerchandiseCoreConstants.EXTENSIONNAME;
	}
	
}
