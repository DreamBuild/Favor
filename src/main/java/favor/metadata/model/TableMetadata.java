package favor.metadata.model;

import favor.domain.model.PropertyTableMeta;

/**
 * Created by Joyor on 2014-09-14.
 */
public class TableMetadata
{
    private PropertyTableMeta propertyTableMeta;

    public void setPropertyTableMeta(PropertyTableMeta meta)
    {
        this.propertyTableMeta = meta;
    }

    public PropertyTableMeta getPropertyTableMeta()
    {
        return this.propertyTableMeta;
    }
}
