package favor.exception;

/**
 * Created by Joyor on 2014-09-13.
 */
public class TableServiceException extends RuntimeException
{
    public TableServiceException()
    {
        super();
    }

    public TableServiceException(String message)
    {
        super(message);
    }
}