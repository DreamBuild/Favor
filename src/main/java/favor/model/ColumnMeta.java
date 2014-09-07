package favor.model;

/**
 * Created by Joyor on 2014-09-06.
 */
public class ColumnMeta
{
    private String columnName;
    private DataKind dataKind;
    private String modelName;

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
}
