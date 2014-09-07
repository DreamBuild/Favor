package favor.model;

import favor.exception.RepeatedNameException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Joyor on 2014-09-06.
 */
public class DomainModel implements Iterable<Map.Entry<String, Property>>
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
}
