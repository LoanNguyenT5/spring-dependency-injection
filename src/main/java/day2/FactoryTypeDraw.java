package day2;

import dependencydemo.AbstractDAO;
import dependencydemo.MSSQLDAO;
import dependencydemo.MySQLDAO;
import dependencydemo.PostgreDAO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryTypeDraw {
    public static Draw getTypeDraw() {
        Properties prop = new Properties();
        InputStream input = null;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try {
            input = classloader.getResourceAsStream("config.properties");
            // load a properties file
            prop.load(input);
            // get the type draw value
            String database = prop.getProperty("draw");
            if (database.equals("1")) {
                return new DrawCircle();
            }
            if (database.equals("2")) {
                return new DrawSquare();
            }
            if (database.equals("3")) {
                return new DrawRectangular();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return null;
    }

}
