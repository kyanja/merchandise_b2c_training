package de.hybris.merchandise.facades.customer.impl;

import de.hybris.merchandise.core.jalo.MyStoreCustomer;
import de.hybris.merchandise.core.model.MyStoreCustomerModel;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

public class MyStoreDefaultCustomerFacade extends DefaultCustomerFacade {

    @Override
    public void updateProfile(CustomerData customerData) throws DuplicateUidException {

        validateDataBeforeUpdate(customerData);

        final String name = getCustomerNameStrategy().getName(customerData.getFirstName(), customerData.getLastName());
        final CustomerModel customer = getCurrentSessionCustomer();
        customer.setEmailPreference(Boolean.valueOf(customerData.getIsEmailNotificationEnabled()));
        customer.setContactPhoneNumber(customerData.getCustomerPhoneNumberBean());
        customer.setOriginalUid(customerData.getDisplayUid());
        getCustomerAccountService().updateProfile(customer, customerData.getTitleCode(), name, customerData.getUid());


    }
}
