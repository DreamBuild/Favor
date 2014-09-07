package favor.component.converters;

import favor.component.Converter;
import favor.exception.FailedConvertException;

/**
 * Created by Joyor on 2014-09-07.
 */
public class StringConverter implements Converter
{
    public static final StringConverter INSTANCE = new StringConverter();

    @Override
    public Object convert(Object source)
    {
        if(source == null)
        {
            return null;
        }

        Object result = source;

        if(source instanceof String == false)
        {
            throw new FailedConvertException("failed convert source to string", source);
        }

        return result;
    }
}
