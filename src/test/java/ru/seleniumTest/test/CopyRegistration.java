package ru.seleniumTest.test;

import org.testng.annotations.Test;

public class CopyRegistration extends BaseDriverClass {

    @Test
    public void getRegistrationFormWithValidValues(){
        RegistrationFieldsObject validRegistrationFieldsObject = new RegistrationFieldsObject("test@test.test", "123456");
        appManager.fillRegistrationFields(validRegistrationFieldsObject);
    }

    @Test
    public void getRegistrationFormWithEmptyValues(){
        RegistrationFieldsObject emptyRegistrationFieldsObject = new RegistrationFieldsObject("", "");
        appManager.fillRegistrationFields(emptyRegistrationFieldsObject);
    }


}