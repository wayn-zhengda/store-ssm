package ss.upupoo.com.entity;

import java.util.Date;

public class SeckillSuccessEntity {

    private long seckillId;
    private long userPhone;
    private int state;
    private Date create_time;

    //完成一对多关系的方式（目前还不了解，需要学习）
    private SeckillEntity seckillEntity;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public SeckillEntity getSeckillEntity() {
        return seckillEntity;
    }

    public void setSeckillEntity(SeckillEntity seckillEntity) {
        this.seckillEntity = seckillEntity;
    }

    @Override
    public String toString() {
        return "SeckillSuccessEntity{" + "seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state + ", create_time=" + create_time + ", seckillEntity=" + seckillEntity + '}';
    }
}
