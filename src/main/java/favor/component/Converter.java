package favor.component;

import favor.model.PropertyValue;

/**
 * Created by Joyor on 2014-09-07.
 */
public interface Converter
{
    /**
     * 数据类型转换方法，从一个数据类型转换为另一个数据类型
     * 
     * @param source 被转换的数据
     * @return 转换后的结果
     * 
     * @exception favor.exception.FailedConvertException 转换失败后抛出的异常
     */
    PropertyValue convert(PropertyValue source);
}
