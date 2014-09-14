package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class IntegerConverter implements Converter
{
    public static final IntegerConverter INSTANCE = new IntegerConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        return new PrimitiveCommonConverter("integer", Integer.class, Parser.INTEGER).convert(source);
    }
}
