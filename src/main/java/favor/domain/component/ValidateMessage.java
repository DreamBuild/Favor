package favor.domain.component;

/**
 * Created by Joyor on 2014-09-07.
 */
public class ValidateMessage
{
    private final ValidateResult result;
    private final String message;

    /**
     * 构造一个验证正常的消息
     */
    public ValidateMessage()
    {
        this.result = ValidateResult.SUCCESS;
        this.message = null;
    }

    /**
     * 构造一个验证失败的情况，传入失败的消息
     * @param message 失败信息
     */
    public ValidateMessage(String message)
    {
        this.result = ValidateResult.FAIL;
        this.message = message;
    }

    public ValidateMessage(ValidateResult result, String message)
    {
        this.result = result;
        this.message = message;
    }

    public ValidateResult getResult()
    {
        return this.result;
    }

    public String getMessage()
    {
        return this.message;
    }
}
