package com;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    private String userDir = System.getProperty("user.dir");
    private Properties variables = readProperties("variables");
    protected String url = variables.getProperty("url");


    public Properties readProperties(String name) {
        Properties prop = System.getProperties();
        FileInputStream fis = null;
        File file = null;

        try {
            file = new File(userDir+"/src/test/resources/"+name+".properties");
            fis = new FileInputStream(file);
            prop.load(fis);
            fis.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return prop;

    }



}
