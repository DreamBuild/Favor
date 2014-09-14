package favor.domain.component;

/**
 * Created by Joyor on 2014-09-07.
 */
public interface Validator
{
    ValidateMessage validate(Verifiable target);
}
