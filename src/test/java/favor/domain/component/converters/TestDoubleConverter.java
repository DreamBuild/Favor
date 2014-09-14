package favor.domain.component.converters;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joyor on 2014-09-07.
 */
public class TestDoubleConverter
{
    @Test
    public void testCase1()
    {
        try
        {
            Object result = DoubleConverter.INSTANCE.convert("1412error");
            Assert.fail();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testCase2()
    {
        Object result = DoubleConverter.INSTANCE.convert(null);
        Assert.assertEquals(null, result);
    }
}
