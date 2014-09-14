package favor.domain.model;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyColumnMeta
{
    private String columnName;
    private DataKind dataKind;
    private String modelName;
    private String description;

    public String getColumnName()
    {
        return this.columnName;
    }

    public void setColumnName(String columnName)
    {
        this.columnName = columnName;
    }

    public String getModelName()
    {
        return this.modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public DataKind getDataKind()
    {
        return this.dataKind;
    }

    public void setDataKind(DataKind dataKind)
    {
        this.dataKind = dataKind;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}