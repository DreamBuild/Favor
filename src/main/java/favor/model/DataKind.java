package favor.model;

import favor.component.Converter;
import favor.converters.DoubleConverter;
import favor.converters.IntegerConverter;
import favor.converters.LongConverter;
import favor.converters.StringConverter;

/**
 * Created by Joyor on 2014-09-06.
 */
public class DataKind
{
    public static DataKind INTEGER  = new DataKind(new IntegerConverter(), "Integer");
    public static DataKind LONG     = new DataKind(new LongConverter(),    "Long");
    public static DataKind DOUBLE   = new DataKind(new DoubleConverter(),  "Double");
    public static DataKind STRING   = new DataKind(new StringConverter(),  "String");

    private final String kind;
    private final Converter converter;

    public DataKind(Converter converter, String kind)
    {
        this.converter = converter;
        this.kind = kind;
    }

    public String getKind()
    {
        return this.kind;
    }

    public Converter getConverter()
    {
        return this.converter;
    }
}
