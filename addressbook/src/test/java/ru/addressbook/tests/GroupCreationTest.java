package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHalper().gotoGroupPage();
        app.getGroupHelper1().initGroupCreation();
        app.getGroupHelper1().fillGroupFogms(new GroupData("test1", "qwerty", "sdfg"));
        app.getGroupHelper1().submitGroupCreation();
        app.getGroupHelper1().returnToGroupPage();
    }

}
