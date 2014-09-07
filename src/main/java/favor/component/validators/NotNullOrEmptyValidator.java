package favor.component.validators;

import favor.component.ValidateMessage;
import favor.component.ValidateResult;
import favor.component.Validator;
import favor.component.Verifiable;
import favor.model.PropertyValue;

/**
 * Created by Joyor on 2014-09-07.
 */
public class NotNullOrEmptyValidator implements Validator
{
    private final String propertyName;
    private final String message;

    public NotNullOrEmptyValidator(String propertyName)
    {
        this.propertyName = propertyName;
        this.message = "property " + propertyName + " can't be null";
    }

    public NotNullOrEmptyValidator(String propertyName, String message)
    {
        this.propertyName = propertyName;
        this.message = message;
    }

    @Override
    public ValidateMessage validate(Verifiable target)
    {
        PropertyValue value = target.getValue(propertyName);

        if(value.getValue() == null)
        {
            return new ValidateMessage(ValidateResult.FAIL, this.message);
        }

        return new ValidateMessage();
    }
}
