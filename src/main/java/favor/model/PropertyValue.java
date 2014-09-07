package favor.model;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyValue
{
    private final DataKind dataKind;
    private final Object value;

    public PropertyValue(String value)
    {
        dataKind = DataKind.STRING;
        this.value = value;
    }

    public PropertyValue(int value)
    {
        dataKind = DataKind.INTEGER;
        this.value = value;
    }

    public PropertyValue(long value)
    {
        dataKind = DataKind.LONG;
        this.value = value;
    }

    public PropertyValue(double value)
    {
        dataKind = DataKind.DOUBLE;
        this.value = value;
    }

    public PropertyValue(Object value, DataKind kind)
    {
        dataKind = kind;
        this.value = value;
    }

    public DataKind getDataKind()
    {
        return this.dataKind;
    }

    public Object getValue()
    {
        return this.value;
    }
}
