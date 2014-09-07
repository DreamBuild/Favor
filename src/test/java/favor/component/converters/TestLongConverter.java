package favor.component.converters;

import favor.component.converters.LongConverter;
import favor.exception.FailedConvertException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joyor on 2014-09-07.
 */
public class TestLongConverter
{
    @Test
    public void testCase1()
    {
        Object result = LongConverter.INSTANCE.convert("1234567");
        Assert.assertEquals(1234567L, result);
    }

    @Test
    public void testCase2()
    {
        try
        {
            LongConverter.INSTANCE.convert("for failed");
            Assert.fail();
        }
        catch (FailedConvertException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
