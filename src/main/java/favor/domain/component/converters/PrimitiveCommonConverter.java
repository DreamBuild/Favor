package favor.domain.component.converters;

import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
class PrimitiveCommonConverter
{
    private final Class<?> primitive;
    private final Parser parser;
    private final String name;

    PrimitiveCommonConverter(String name, Class<?> primitive, Parser parser)
    {
        this.primitive = primitive;
        this.parser = parser;
        this.name = name;
    }

    Object convert(Object source) throws InvalidValueException
    {
        Object result;

        if(source == null)
        {
            result = null;
        }
        else if(primitive.isInstance(source))
        {
            result = source;
        }
        else if(source instanceof String)
        {
            try
            {
                result = parser.parse(source.toString());
            }
            catch(Exception e)
            {
                throw new InvalidValueException("failed to convert input data to " + name + ","
                        + e.getMessage().toLowerCase(), source);
            }
        }
        else
        {
            throw new InvalidValueException("failed to convert input data to " + name, source);
        }

        return result;
    }
}

