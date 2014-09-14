package favor.domain.model;

import favor.domain.component.Converter;
import favor.domain.component.converters.*;

/**
 * Created by Joyor on 2014-09-06.
 */
public class DataKind
{
    public static final DataKind INTEGER  = new DataKind(IntegerConverter.INSTANCE, "Integer");
    public static final DataKind LONG     = new DataKind(LongConverter.INSTANCE,    "Long");
    public static final DataKind DOUBLE   = new DataKind(DoubleConverter.INSTANCE,  "Double");
    public static final DataKind STRING   = new DataKind(StringConverter.INSTANCE,  "String");
    public static final DataKind BOOLEAN  = new DataKind(BooleanConverter.INSTANCE, "Boolean");
    public static final DataKind NULL = new DataKind(NullConverter.INSTANCE, "Null");

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
