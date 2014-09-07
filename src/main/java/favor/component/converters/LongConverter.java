package favor.component.converters;

import favor.component.Converter;

/**
 * Created by Joyor on 2014-09-07.
 */
public class LongConverter implements Converter
{
    public static final LongConverter INSTANCE = new LongConverter();

    @Override
    public Object convert(Object source)
    {
        return new PrimitiveCommonConverter("long", Long.class, Parser.LONG).convert(source);
    }
}
