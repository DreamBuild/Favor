package favor.domain.component;/**
 * Created by Joyor on 2014-09-06.
 */

import favor.domain.model.PropertyValue;

public interface Verifiable
{
    PropertyValue getValue(String name);
}
