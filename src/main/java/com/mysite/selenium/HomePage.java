package com.mysite.selenium;

import org.openqa.selenium.By;

/**
 * Created by macbook on 6/25/16.
 */
public class HomePage {
    //the tabs
    public static final String LOC_LNK_PROJECTSTAB = "li#menu_projects a[href$='projects/']";
    public static final String LOC_LNK_DOWNLOADTAB = "li#menu_download a[href$='download/']";
    public static final By LOC_LNK_DOCUMENTATIONTAB = By.xpath("//li[@id='menu_documentation']/a[contains(@href, 'docs/')]");
    public static final String LOC_LNK_SUPPORTAB = "li#menu_support a[href$='support/']";
    public static final String LOC_LNK_ABOUTAB = "li#menu_about a[href$='about/']";

    //download link
    public static final By LOC_LNK_DOWNLOAD_SELENIUM = By.linkText("Download Selenium");
}
