package ru.addressbook.tests;


import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getNavigationHalper().gotoGroupPage();
        app.getGroupHelper1().selectGroup();
        app.getGroupHelper1().deleteGroup();
        app.getGroupHelper1().returnToGroupPage();
    }

}