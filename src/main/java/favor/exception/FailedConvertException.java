package favor.exception;

/**
 * Created by Joyor on 2014-09-07.
 */
public class FailedConvertException extends RuntimeException
{
    public FailedConvertException(String message)
    {
        super(message);
    }
    
    public FailedConvertException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
