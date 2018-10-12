package ss.upupoo.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ss.upupoo.com.entity.SeckillEntity;
import ss.upupoo.com.mapper.SeckillMapper;
import ss.upupoo.com.service.SeckillService;

import java.util.Date;
import java.util.List;

public class SeckillServiceImpl implements SeckillService {

    @Autowired
    private SeckillMapper seckillMapper;
    
    @Override
    public int reduceNumber(long seckillId, Date seckillDate) {
        return 0;
    }

    @Override
    public SeckillEntity getById(long seckillId) {
        return null;
    }

    @Override
    public List<SeckillEntity> listAll(int offset, int limit) {
        return null;
    }
}
