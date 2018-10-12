package ss.upupoo.com.mapper;

import org.springframework.stereotype.Component;
import ss.upupoo.com.entity.SeckillEntity;

import java.util.Date;
import java.util.List;

@Component
public interface SeckillMapper {
    /**
     * 减库存操作
     * @param seckillId
     * @param seckillDate
     * @return
     */
    int reduceNumber(long seckillId, Date seckillDate);

    /**
     * 根据Id查询商品
     * @param seckillId
     * @return
     */
    SeckillEntity getById(long seckillId);

    /**
     *
     * 获取商品的列表
     * @param offset
     * @param limit
     * @return
     */
    List<SeckillEntity> listAll(int offset, int limit);
}
