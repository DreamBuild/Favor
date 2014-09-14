package favor.domain.model;

public class Property
{
    private String name;
    private PropertyValue value;
    private PropertyMetadata metadata;

    public Property(){}

    private void init(String name, PropertyValue value)
    {
        this.name = name;
        this.value = value;
    }

    public Property(String name, PropertyValue value)
    {
        init(name, value);
    }

    public Property(String name, String value)
    {
        PropertyValue propertyValue = new PropertyValue(value);
        init(name, propertyValue);
    }

    public Property(String name, int value)
    {
        PropertyValue propertyValue = new PropertyValue(value);
        init(name, propertyValue);
    }

    public Property(String name, long value)
    {
        PropertyValue propertyValue = new PropertyValue(value);
        init(name, propertyValue);
    }

    public Property(String name, double value)
    {
        PropertyValue propertyValue = new PropertyValue(value);
        init(name, propertyValue);
    }

    public Property(String name, boolean value)
    {
        PropertyValue propertyValue = new PropertyValue(value);
        init(name, propertyValue);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setValue(PropertyValue value)
    {
        this.value = value;
    }

    public PropertyValue getValue()
    {
        return this.value;
    }

    public void setMetadata(PropertyMetadata metadata)
    {
        this.metadata = metadata;
    }

    public PropertyMetadata getMetadata()
    {
        return this.metadata;
    }
}
