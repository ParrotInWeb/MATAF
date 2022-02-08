package utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Translation {

    /**
     * @param key - key from MesssagesBundle.properties
     * @return returned value from MesssagesBundle depended from country and language
     */
    public static String getTranslation(String key) {
        return ResourceBundle.getBundle(
                "MessagesBundle",
                new Locale(AppProperties.getProperty("project.languageCode"),
                        AppProperties.getProperty("project.countryCode")))
                .getString(key)
                .trim();
    }
}
