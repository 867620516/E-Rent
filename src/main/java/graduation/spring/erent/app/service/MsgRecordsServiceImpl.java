package graduation.spring.erent.app.service;


import graduation.spring.erent.app.dao.MsgRecordsDao;
import graduation.spring.erent.app.model.MsgRecordEntity;
import graduation.spring.erent.app.model.response.MsgRecordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MsgRecordsService {

    @Autowired
    private MsgRecordsDao msgRecordsDao;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Override
    public void addMsg(MsgRecordEntity entity) {
        threadPoolTaskExecutor.execute(()->{
            msgRecordsDao.addMsg(entity);
        });
    }

    @Override
    public int getUnreadMsgCount(Integer userid) {
        return msgRecordsDao.getUnreadMsgCount(userid);
    }

    @Override
    @Transactional
    public PageResult getUserMegsResult(int pageSize, int start) {
        int userid = SecurityAuthenUtil.getId();
        List<MsgRecordResponse> list = msgRecordsDao.getMsgListByUserid(userid,pageSize,start);
        int size = msgRecordsDao.getMsgSizeByUserid(userid);

        PageResult pageResult = new PageResult();
        pageResult.setTotalCount(size);
        pageResult.setData(list);
        return pageResult;
    }

    @Override
    public void updateMsgRecordIsread(Integer msgRecordId, int isread) {
        msgRecordsDao.updateMsgRecordIsread(msgRecordId,isread);
    }
}
