package favor.domain.model;

import favor.domain.component.Verifiable;
import favor.exception.RepeatedNameException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Joyor on 2014-09-06.
 */
public class DomainModel implements Verifiable, Iterable<Map.Entry<String, Property>>
{
    private Map<String, Property> properties = new HashMap<String, Property>();

    public DomainModel addProperty(String name, PropertyValue value)
    {
        checkName(name);

        Property property = new Property(name, value);
        properties.put(name, property);

        return this;
    }

    public Iterator<Map.Entry<String, Property>> iterator()
    {
        return properties.entrySet().iterator();
    }

    private void checkName(String name)
    {
        if(properties.containsKey(name))
        {
            throw new RepeatedNameException("property name " + name + " exists!");
        }
    }

    @Override
    public PropertyValue getValue(String name)
    {
        PropertyValue value = PropertyValue.NULL;

        if(properties.containsKey(name))
        {
            value =  properties.get(name).getValue();
        }

        return value;
    }
}
