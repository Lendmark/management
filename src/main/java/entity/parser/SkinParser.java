package entity.parser;

import entity.enums.SkinType;

/**
 * Create by Lendemark on 08.05.2019.
 */
public class SkinParser {

    public static SkinType parseStrToSkinType(String str) {

        String type = str.toUpperCase();

        if (type.equals("NATURAL")) {
            return SkinType.NATURAL;
        } else if (type.equals("ARTIFICIAL")) {
            return SkinType.ARTIFICIAL;
        }
        return SkinType.ARTIFICIAL;
    }
}
