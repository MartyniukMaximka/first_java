package ru.addressbook.tests;

import org.testng.annotations.Test;
import ru.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test

    public void testGroupModification() {
        app.getNavigationHalper().gotoGroupPage();
        app.getGroupHelper1().selectGroup();
        app.getGroupHelper1().initGroupModification();
        app.getGroupHelper1().fillGroupFogms(new GroupData("test1", "qwerty", "sdfg"));
        app.getGroupHelper1().submitGroupModification();
        app.getGroupHelper1().returnToGroupPage();

    }
}
