package de.hybris.merchandise.facades.populators;


import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


public class MyStoreCustomerPopulator extends CustomerPopulator {

    public void populate(final CustomerModel source, final CustomerData target) {

        super.populate(source, target);


        target.setIsEmailNotificationEnabled(String.valueOf(source.getEmailPreference()));
        target.setCustomerPhoneNumberBean(source.getContactPhoneNumber());
        target.setAlternativeEmailBean(source.getAlternativeEmail());

    }
}
