package ss.upupoo.com.service;

import ss.upupoo.com.entity.SeckillEntity;

import java.util.Date;
import java.util.List;

public interface SeckillService {

    int reduceNumber(long seckillId, Date seckillDate);

    SeckillEntity getById(long seckillId);

    List<SeckillEntity> listAll(int offset, int limit);
}
