package favor.domain.model;

import favor.exception.InvalidValueException;
import favor.exception.InvalidOperationException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyValue
{
    public static final PropertyValue NULL = new PropertyValue();

    private final DataKind dataKind;
    private final List<Object> values;
    private final boolean isArray;

    private PropertyValue()
    {
        this.dataKind = DataKind.NULL;
        this.values = null;
        isArray = false;
    }

    public PropertyValue(String value)
    {
        dataKind = DataKind.STRING;
        this.values = new ArrayList<Object>();
        this.values.add(value);
        isArray = false;
    }

    public PropertyValue(int value)
    {
        dataKind = DataKind.INTEGER;
        this.values = new ArrayList<Object>();
        this.values.add(value);
        isArray = false;
    }

    public PropertyValue(long value)
    {
        dataKind = DataKind.LONG;
        this.values = new ArrayList<Object>();
        this.values.add(value);
        isArray = false;
    }

    public PropertyValue(double value)
    {
        dataKind = DataKind.DOUBLE;
        this.values = new ArrayList<Object>();
        this.values.add(value);
        isArray = false;
    }

    public PropertyValue(boolean value)
    {
        dataKind = DataKind.BOOLEAN;
        this.values = new ArrayList<Object>();
        this.values.add(value);
        isArray = false;
    }

    public PropertyValue(Object value, DataKind kind)
    {
        this.values = new ArrayList<Object>();
        this.values.addAll(values);
        dataKind = kind;
        isArray = false;
    }

    public PropertyValue(List<?> values, DataKind kind)
    {
        this.values = new ArrayList<Object>();
        this.values.addAll(values);
        dataKind = kind;
        isArray = true;
    }

    public PropertyValue(DataKind kind, boolean isArray)
    {
        dataKind = kind;
        this.values = new ArrayList<Object>();
        this.isArray = isArray;
    }

    public DataKind getDataKind()
    {
        return this.dataKind;
    }

    public Object getValue()
    {
        if(this.isArray)
        {
            throw new InvalidOperationException("当前值是数组，请使用getValues方法!");
        }
        return this.values.get(0);
    }

    public List<Object> getValues()
    {
        if(!this.isArray)
        {
            return null;
        }

        return values;
    }

    /**
     * 设置属性的值
     *
     * <p>
     *     在设置值的过程中会调用关联的DataKind的Converter，将值转换为目标类型<br/>
     *     如果转换失败则会抛出{@link favor.exception.InvalidValueException}
     * </p>
     * @param value 待设置的值
     * @exception favor.exception.InvalidValueException 所设置的值不能转换为目标值类型
     * @exception favor.exception.InvalidOperationException 当值为数组时调用该方法时
     */
    public void setValue(Object value) throws InvalidValueException
    {
        if(this.isArray)
        {
            throw new InvalidOperationException("当前值是数组，不支持此操作！应当使用addValue方法！");
        }

        Object data = dataKind.getConverter().convert(value);
        this.values.add(0, value);
    }

    public PropertyValue addValue(Object value) throws InvalidValueException
    {
        if(!this.isArray)
        {
            throw new InvalidOperationException("当值为数组时才支持此操作！应当使用setValue方法");
        }

        Object data = dataKind.getConverter().convert(value);
        this.values.add(data);
        return this;
    }

    public int getValueCount()
    {
        int count = 0;

        if(this.values != null)
        {
            count = this.values.size();
        }

        return count;
    }

    public boolean isArray()
    {
        return this.isArray;
    }
}