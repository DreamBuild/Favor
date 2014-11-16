package favor.domain.model;


import favor.metadata.model.TableMetadata;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyTableMeta
{
    private final TableMetadata tableMetadata;

    public PropertyTableMeta(String databaseName, String tableName, String description)
    {
        this.tableMetadata = new TableMetadata(databaseName, tableName, description);
    }

    public PropertyTableMeta(String databaseName, String tableName)
    {
        this(databaseName, tableName, null);
    }

    public TableMetadata getTableMetadata()
    {
        return this.tableMetadata;
    }
}
