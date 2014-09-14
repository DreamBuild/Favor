package favor.domain.component.validators;

import favor.domain.component.ValidateMessage;
import favor.domain.component.Validator;
import favor.domain.component.Verifiable;
import favor.domain.model.DataKind;
import favor.domain.model.PropertyValue;

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

        if(value.getValue() == null ||
                (value.getDataKind() == DataKind.STRING && value.getValue().toString().trim() == ""))
        {
            return new ValidateMessage(this.message);
        }

        return new ValidateMessage();
    }
}
