package favor.domain.component.converters;

import favor.domain.component.Converter;
import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class NullConverter implements Converter
{
    public static final NullConverter INSTANCE = new NullConverter();

    @Override
    public Object convert(Object source) throws InvalidValueException
    {
        return source;
    }
}
