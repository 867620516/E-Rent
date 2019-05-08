package graduation.spring.erent.app.web;

import graduation.spring.erent.app.model.Talk;
import graduation.spring.erent.app.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class talkController {
    @Autowired
    TalkService talkService;

    @RequestMapping("/api/testTalk")
    public void testTalk(@RequestBody Talk talk){
        System.out.println(talk.getContent());
        System.out.println(talk.getUserID());
        System.out.println(talk.getCreateTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        talkService.save(talk);
    }

    @RequestMapping("/api/userTalk")
    public List<Talk> userTalk(@RequestBody Talk talk){
        int userID = talk.getUserID();
        return talkService.findList(talk);
    }

    @RequestMapping("/api/talkById")
    public Talk talkById(String id){
        return talkService.findById(Integer.parseInt(id));
    }

}
