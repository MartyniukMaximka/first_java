package ru.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        newGroupCreation();
        fillGroupFogms(new GroupData("test1", "qwerty", "sdfg"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
