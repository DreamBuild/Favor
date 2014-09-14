package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class DoubleConverter implements Converter
{
    public static final DoubleConverter INSTANCE =
            new DoubleConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        return new PrimitiveCommonConverter("double", Double.class, Parser.DOUBLE).convert(source);
    }
}
