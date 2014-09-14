package favor.domain.component;

import favor.exception.InvalidValueException;

/**
 * Created by Joyor on 2014-09-07.
 */
public interface Converter
{
    /**
     * 数据类型转换方法，从一个数据类型转换为另一个数据类型
     *
     * <p>
     * 如果传入的值为null，则应该直接返回null，不抛出异常<br/>
     * 对于null的检查应该放到数据的有效性检查，而不是在数据转换的过程中
     * </p>
     * 
     * @param source 被转换的数据
     * @return 转换后的结果
     * 
     * @exception favor.exception.InvalidValueException 转换失败后抛出的异常
     */
    Object convert(Object source) throws InvalidValueException;
}
