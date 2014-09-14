package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class StringConverter implements Converter
{
    public static final StringConverter INSTANCE = new StringConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        if(source == null)
        {
            return null;
        }

        Object result = source;

        if(source instanceof String == false)
        {
            throw new InvalidValueException("failed convert source to string", source);
        }

        return result;
    }
}
