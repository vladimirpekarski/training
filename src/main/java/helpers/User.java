package helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class User {
    public static final Properties USER_CRED;
    static {
        USER_CRED = new Properties();
        InputStream in = User.class.getResourceAsStream("/user.properties");

        try {
            USER_CRED.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] getUserCred(String userCredProperties) {
        return USER_CRED.getProperty(userCredProperties).split(",");
    }
}
