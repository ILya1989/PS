package ru.stqa.pft.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import java.net.MalformedURLException;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.Init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
