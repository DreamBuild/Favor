package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class BooleanConverter implements Converter
{
    public static final BooleanConverter INSTANCE = new BooleanConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        return  new PrimitiveCommonConverter("boolean", Boolean.class,
                Parser.BOOLEAN).convert(source);
    }
}
