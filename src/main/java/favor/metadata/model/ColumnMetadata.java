package favor.metadata.model;

import favor.domain.model.DataKind;

/**
 * Created by Joyor on 2014-09-14.
 */
public class ColumnMetadata
{
    private final String columnName;
    private final DataKind dataKind;
    private final String description;

    public ColumnMetadata(String name, DataKind kind, String description)
    {
        this.columnName = name;
        this.dataKind = kind;
        this.description = description;
    }

    public ColumnMetadata(String name, DataKind dataKind)
    {
        this(name, dataKind, null);
    }

    public String getColumnName()
    {
        return this.columnName;
    }

    public DataKind getDataKind()
    {
        return this.dataKind;
    }

    public String getDescription()
    {
        return this.description;
    }

}
