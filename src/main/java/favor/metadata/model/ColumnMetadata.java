package favor.metadata.model;

import favor.domain.model.PropertyColumnMeta;

/**
 * Created by Joyor on 2014-09-14.
 */
public class ColumnMetadata
{
    private PropertyColumnMeta propertyColumnMeta;

    public PropertyColumnMeta getPropertyColumnMeta()
    {
        return this.propertyColumnMeta;
    }

    public void setPropertyColumnMeta(PropertyColumnMeta columnMeta)
    {
        this.propertyColumnMeta = columnMeta;
    }
}
