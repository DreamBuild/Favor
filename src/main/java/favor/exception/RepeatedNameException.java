package favor.exception;

/**
 * Created by Joyor on 2014-09-07.
 */
public class RepeatedNameException extends RuntimeException
{
    public RepeatedNameException(String message)
    {
        super(message);
    }

    public RepeatedNameException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
