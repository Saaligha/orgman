package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

     public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String Capital = "";

        for(int x=0; x <className.length(); x++){
            if(Character.isUpperCase(className.charAt(x))){
                  Capital += " " +className.charAt(x);
            }
        }
        return Capital;
    }
}
