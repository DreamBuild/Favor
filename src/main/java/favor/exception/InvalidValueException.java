package favor.exception;

/**
 * Created by Joyor on 2014-09-07.
 */
public class InvalidValueException extends Exception
{
    private final Object sourceValue;

    public InvalidValueException(String message, Object source)
    {
        super(message);
        this.sourceValue = source;
    }
    
    public InvalidValueException(String message, Object source, Throwable cause)
    {
        super(message, cause);
        this.sourceValue = source;
    }

    public Object getSourceValue()
    {
        return this.sourceValue;
    }
}
