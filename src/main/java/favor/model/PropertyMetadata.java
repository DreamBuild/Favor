package favor.model;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyMetadata
{
    private TableMeta tableMeta;
    private ColumnMeta columnMeta;

    public void setTableMeta(TableMeta tableMeta)
    {
        this.tableMeta = tableMeta;
    }

    public TableMeta getTableMeta()
    {
        return this.tableMeta;
    }

    public void setColumnMeta(ColumnMeta columnMeta)
    {
        this.columnMeta = columnMeta;
    }

    public ColumnMeta getColumnMeta()
    {
        return this.columnMeta;
    }
}
