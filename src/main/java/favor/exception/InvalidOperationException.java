package favor.exception;

/**
 * Created by Joyor on 2014-09-14.
 */
public class InvalidOperationException extends RuntimeException
{
    public InvalidOperationException()
    {
        super();
    }

    public InvalidOperationException(String message)
    {
        super(message);
    }
}
