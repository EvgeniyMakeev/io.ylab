package homework3.transliterator;

import java.util.HashMap;
import java.util.Map;

public class TransliteratorImpl implements Transliterator{
    @Override
    public String transliterate(String source) {
        Map<Character, String> mapAlphabet = new HashMap<>();
        mapAlphabet.put('Б', "B");
        mapAlphabet.put('В', "V");
        mapAlphabet.put('Г', "G");
        mapAlphabet.put('Д', "D");
        mapAlphabet.put('Ё', "E");
        mapAlphabet.put('Ж', "ZH");
        mapAlphabet.put('З', "Z");
        mapAlphabet.put('И', "I");
        mapAlphabet.put('Й', "I");
        mapAlphabet.put('Л', "L");
        mapAlphabet.put('Н', "N");
        mapAlphabet.put('П', "P");
        mapAlphabet.put('Р', "R");
        mapAlphabet.put('С', "S");
        mapAlphabet.put('У', "U");
        mapAlphabet.put('Ф', "F");
        mapAlphabet.put('Х', "KH");
        mapAlphabet.put('Ц', "TS");
        mapAlphabet.put('Ч', "CH");
        mapAlphabet.put('Ш', "SH");
        mapAlphabet.put('Щ', "SHCH");
        mapAlphabet.put('Ы', "Y");
        mapAlphabet.put('Ь', "");
        mapAlphabet.put('Ъ', "IE");
        mapAlphabet.put('Э', "E");
        mapAlphabet.put('Ю', "IU");
        mapAlphabet.put('Я', "IA");

        if (source != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (!mapAlphabet.containsKey(source.charAt(i))) {
                    sb.append(source.charAt(i));
                } else {
                    sb.append(mapAlphabet.get(source.charAt(i)));
                }
            }
            return sb.toString();
        }
        return null;
    }
}
