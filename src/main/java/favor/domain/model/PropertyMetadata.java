package favor.domain.model;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyMetadata
{
    private PropertyTableMeta tableMeta;
    private PropertyColumnMeta columnMeta;

    public void setTableMeta(PropertyTableMeta tableMeta)
    {
        this.tableMeta = tableMeta;
    }

    public PropertyTableMeta getTableMeta()
    {
        return this.tableMeta;
    }

    public void setColumnMeta(PropertyColumnMeta columnMeta)
    {
        this.columnMeta = columnMeta;
    }

    public PropertyColumnMeta getColumnMeta()
    {
        return this.columnMeta;
    }
}
