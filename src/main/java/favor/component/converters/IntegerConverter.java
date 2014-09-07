package favor.component.converters;

import favor.component.Converter;

/**
 * Created by Joyor on 2014-09-07.
 */
public class IntegerConverter implements Converter
{
    public static final IntegerConverter INSTANCE = new IntegerConverter();

    @Override
    public Object convert(Object source)
    {
        return new PrimitiveCommonConverter("integer", Integer.class, Parser.INTEGER).convert(source);
    }
}
