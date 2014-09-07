package favor.component.converters;

import favor.component.Converter;

/**
 * Created by Joyor on 2014-09-07.
 */
public class BooleanConverter implements Converter
{
    public static final BooleanConverter INSTANCE = new BooleanConverter();

    @Override
    public Object convert(Object source)
    {
        return  new PrimitiveCommonConverter("boolean", Boolean.class,
                Parser.BOOLEAN).convert(source);
    }
}
