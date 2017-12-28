package ru.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    
    @Test
    public void testContactCreation() {
        app.getGroupHelper1().initContactCreation();
        app.getGroupHelper1().fillContactFrm();
        app.getGroupHelper1().submitContactCreation();
        app.getGroupHelper1().returnToHome();
    }

    }

