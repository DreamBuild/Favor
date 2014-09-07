package favor.component.converters;

import favor.component.converters.BooleanConverter;
import favor.exception.FailedConvertException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joyor on 2014-09-07.
 */
public class TestBooleanConverter
{
    @Test
    public void testCase1()
    {
        try
        {
           Object result = BooleanConverter.INSTANCE.convert(false);
           Assert.assertEquals(false, result);
        }
        catch (FailedConvertException e)
        {
            Assert.fail();
        }
    }

    @Test
    public void testCase2()
    {
        try
        {
            Object result = BooleanConverter.INSTANCE.convert("false");
            Assert.assertEquals(false, result);

            result = BooleanConverter.INSTANCE.convert("False");
            Assert.assertEquals(false, result);

            result = BooleanConverter.INSTANCE.convert("true");
            Assert.assertEquals(true, result);
        }
        catch (FailedConvertException e)
        {
            Assert.fail();
        }
    }

    @Test(expected = FailedConvertException.class)
    public void testCase3()
    {
        Object result = BooleanConverter.INSTANCE.convert(new Object());

        System.out.println(result);
    }

    @Test
    public void testCase4()
    {
        Object result = BooleanConverter.INSTANCE.convert(null);
        Assert.assertEquals(null, result);
    }
}
