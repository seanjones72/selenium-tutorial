package com.mysite.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;

@Config(
        browser = Browser.CHROME,
        url = "http://www.seleniumhq.com"
)

/**
 * Created by macbook on 6/25/16.
 */
public class SeleniumHQTest extends Locomotive {
    @Test
    public void testDownloadLinkExist() {
        validatePresent(HomePage.LOC_LNK_DOWNLOAD_SELENIUM);
    }

    @Test
    public void testTabsExists() {
        validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
                .validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
                .validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
                .validatePresent(HomePage.LOC_LNK_SUPPORTAB)
                .validatePresent(HomePage.LOC_LNK_ABOUTAB);

    }
}
