package favor.component.converters;

import favor.component.Converter;

/**
 * Created by Joyor on 2014-09-07.
 */
public class NULLConverter implements Converter
{
    public static final NULLConverter INSTANCE = new NULLConverter();

    @Override
    public Object convert(Object source)
    {
        return source;
    }
}
