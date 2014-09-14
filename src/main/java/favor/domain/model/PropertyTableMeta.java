package favor.domain.model;


/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyTableMeta
{
    private final String tableName;
    private final String description;

    public PropertyTableMeta(String tableName, String description)
    {
        this.tableName = tableName;
        this.description = description;
    }

    public PropertyTableMeta(String tableName)
    {
        this(tableName, null);
    }

    public String getTableName()
    {
        return this.tableName;
    }

    public String getDescription(){return this.description;}
}
