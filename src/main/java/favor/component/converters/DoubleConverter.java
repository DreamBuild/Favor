package favor.component.converters;

import favor.component.Converter;

/**
 * Created by Joyor on 2014-09-07.
 */
public class DoubleConverter implements Converter
{
    public static final DoubleConverter INSTANCE =
            new DoubleConverter();

    @Override
    public Object convert(Object source)
    {
        return new PrimitiveCommonConverter("double", Double.class, Parser.DOUBLE).convert(source);
    }
}
