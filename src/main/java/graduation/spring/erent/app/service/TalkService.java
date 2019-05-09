package graduation.spring.erent.app.service;

import graduation.spring.erent.app.dao.TalkMapper;
import graduation.spring.erent.app.model.Talk;
import graduation.spring.erent.sys.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class TalkService extends BaseService<Talk, TalkMapper> {
    @Autowired
    TalkMapper dao;

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    public void addClickRateById(int id){
        threadPoolTaskExecutor.execute(() -> {
            dao.addClickRateById(1,id);
        });

        }

    public void addCommentCountById(int talkid){
        threadPoolTaskExecutor.execute(() ->{
            dao.addCommentCountById(1, talkid);
                }
        );
        }
}
