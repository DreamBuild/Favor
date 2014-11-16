package favor.domain.model;

import favor.metadata.model.ColumnMetadata;

/**
 * Created by Joyor on 2014-09-06.
 */
public class PropertyColumnMeta
{
    private ColumnMetadata columnMetadata;
    private String modelName;

    public String getModelName()
    {
        return this.modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public void setColumnMetadata(ColumnMetadata columnMetadata)
    {
        this.columnMetadata = columnMetadata;
    }

    public ColumnMetadata getColumnMetadata()
    {
        return this.columnMetadata;
    }
}