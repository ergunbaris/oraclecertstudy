package bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle{
    public static void main(String...args){
	if(args.length != 4){
	    throw new IllegalArgumentException("usage java -cp target TestRosurceBundle <language_code> <country code> <bundle name> <text>");
	}
	Locale locale = new Locale(args[0],args[1]);
	ResourceBundle bundle = ResourceBundle.getBundle(args[2], locale);
	System.out.println(bundle.getObject(args[3]));
    }
}
