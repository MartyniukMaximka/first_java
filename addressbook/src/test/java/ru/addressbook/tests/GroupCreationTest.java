package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.newGroupCreation();
        app.fillGroupFogms(new GroupData("test1", "qwerty", "sdfg"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
