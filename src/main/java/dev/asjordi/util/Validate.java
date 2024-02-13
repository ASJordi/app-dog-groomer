package dev.asjordi.util;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class Validate {
    
    private Validate() {}
    
    public static boolean validateText(String s) {
        return s.isBlank();
    }
    
}
