package de.hybris.merchandise.facades.customer.impl;

import de.hybris.merchandise.core.jalo.MyStoreCustomer;
import de.hybris.merchandise.core.model.MyStoreCustomerModel;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import org.springframework.util.Assert;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

public class MyStoreDefaultCustomerFacade extends DefaultCustomerFacade {

    @Override
    public void updateProfile(CustomerData customerData) throws DuplicateUidException {

        validateDataBeforeUpdate(customerData);

        final String name = getCustomerNameStrategy().getName(customerData.getFirstName(), customerData.getLastName());
        final CustomerModel customer = getCurrentSessionCustomer();
        customer.setEmailPreference(Boolean.valueOf(customerData.getIsEmailNotificationEnabled()));
        customer.setContactPhoneNumber(customerData.getCustomerPhoneNumberBean());
        customer.setAlternativeEmail(customerData.getAlternativeEmailBean());
        customer.setOriginalUid(customerData.getDisplayUid());
        getCustomerAccountService().updateProfile(customer, customerData.getTitleCode(), name, customerData.getUid());
    }

    @Override
    public void register(final RegisterData registerData) throws DuplicateUidException
    {

        final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
        newCustomer.setAlternativeEmail(registerData.getAlternativeEmail());
        newCustomer.setContactPhoneNumber(registerData.getCustomerPhoneNumber());
        setCommonPropertiesForRegister(registerData, newCustomer);
        getCustomerAccountService().register(newCustomer, registerData.getPassword());
    }
}
