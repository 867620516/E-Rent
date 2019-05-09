package graduation.spring.erent.app.dao;

import graduation.spring.erent.app.model.Talk;
import graduation.spring.erent.sys.base.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TalkMapper extends BaseDao<Talk> {
    void addClickRateById(@Param("number") int number, @Param("id") int id);

    void addCommentCountById(@Param("number") int number, @Param("id") int talkid);
}
