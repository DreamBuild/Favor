package favor.metadata.model;

import favor.domain.model.PropertyTableMeta;

/**
 * Created by Joyor on 2014-09-14.
 */
public class TableMetadata
{
    private final String databaseName;
    private final String tableName;
    private final String description;

    public TableMetadata(String databaseName, String tableName, String description)
    {
        this.databaseName = databaseName;
        this.tableName = tableName;
        this.description = description;
    }

    public TableMetadata(String databaseName, String tableName)
    {
        this(databaseName, tableName, null);
    }

    public String getTableName()
    {
        return this.tableName;
    }

    public String getDescription(){return this.description;}

    public String getDatabaseName(){return this.databaseName;}
}
