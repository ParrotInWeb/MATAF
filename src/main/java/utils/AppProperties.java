package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class AppProperties {
    private static Properties properties = null;

    public static String getProperty(String key) {
        return getProperties().getProperty(key);
    }

    private static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            loadProperties(getThePropertiesUrl());
        }
        return properties;
    }

    private static URL getThePropertiesUrl() {
        String propertiesFileName = "app.properties";
        URL propertiesUrl = AppProperties.class.getClassLoader().getResource(propertiesFileName);
        if (propertiesUrl == null) {
            throw new NullPointerException("AppProperties: File '" + propertiesFileName + "' doesn't exist");
        }
        return propertiesUrl;
    }

    private static void loadProperties(URL preferencesURL) {
        try {
            InputStream inputStream = new FileInputStream(preferencesURL.getPath());
            properties.load(inputStream);
        } catch (final IOException e) {
            System.out.println("AppProperties: Exception while with reading application properties file: " + e);
        }
    }
}
