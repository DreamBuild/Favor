package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class LongConverter implements Converter
{
    public static final LongConverter INSTANCE = new LongConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        return new PrimitiveCommonConverter("long", Long.class, Parser.LONG).convert(source);
    }
}
