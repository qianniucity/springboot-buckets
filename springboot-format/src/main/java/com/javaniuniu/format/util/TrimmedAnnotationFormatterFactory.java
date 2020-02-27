package com.javaniuniu.format.util;

import com.javaniuniu.format.annotation.Trimmed.TrimmerType;
import com.javaniuniu.format.annotation.Trimmed;
import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.text.ParseException;
import java.util.*;
import java.util.regex.Pattern;


/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/2/27 5:39 PM
 */
public class TrimmedAnnotationFormatterFactory implements AnnotationFormatterFactory<Trimmed> {
    private static final Map<TrimmerType, TrimmerFormatter> TRIMMER_FORMATTER_MAP;

    static {
        TrimmerType[] values = TrimmerType.values();
        Map<TrimmerType, TrimmerFormatter> map = new HashMap<TrimmerType, TrimmerFormatter>(values.length);
        for (TrimmerType type : values) {
            map.put(type, new TrimmerFormatter(type));
        }
        TRIMMER_FORMATTER_MAP = Collections.unmodifiableMap(map);
    }

    @Override
    public Set<Class<?>> getFieldTypes() {
        Set<Class<?>> fieldTypes = new HashSet<Class<?>>(1, 1);
        fieldTypes.add(String.class);
        return fieldTypes;
    }

    @Override
    public Printer<?> getPrinter(Trimmed annotation, Class<?> aClass) {
        return TRIMMER_FORMATTER_MAP.get(annotation.value());
    }

    @Override
    public Parser<?> getParser(Trimmed annotation, Class<?> aClass) {
        return TRIMMER_FORMATTER_MAP.get(annotation.value());
    }

    private static class TrimmerFormatter implements Formatter<String> {

        private static final Pattern PATTERN_WHITESPACES = Pattern.compile("\\s+");
        private static final Pattern PATTERN_WHITESPACES_WITH_LINE_BREAK = Pattern.compile("\\s*\\n\\s*");
        private static final Pattern PATTERN_WHITESPACES_EXCEPT_LINE_BREAK = Pattern.compile("[\\s&&[^\\n]]+");

        private final TrimmerType type;

        public TrimmerFormatter(TrimmerType type) {
            if (type == null)
                throw new NullPointerException();
            this.type = type;
        }

        @Override
        public String print(String object, Locale locale) {
            return object;
        }

        @Override
        public String parse(String text, Locale locale) throws ParseException {
            text = text.trim();
            switch (type) {
                case ALL_WHITESPACES:
                    return PATTERN_WHITESPACES.matcher(text).replaceAll(" ");
                case EXCEPT_LINE_BREAK:
                    return PATTERN_WHITESPACES_EXCEPT_LINE_BREAK
                            .matcher(PATTERN_WHITESPACES_WITH_LINE_BREAK.matcher(text).replaceAll("\n")).replaceAll(" ");
                case SIMPLE:
                    return text;
                default:
                    // not possible
                    throw new AssertionError();
            }
        }

    }
}
