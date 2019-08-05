package life.majiang.community.community.schedule;

import life.majiang.community.community.cache.HotTagCache;
import life.majiang.community.community.mapper.QuestionMapper;
import life.majiang.community.community.model.Question;
import life.majiang.community.community.model.QuestionExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.*;

@Component
@Slf4j
public class HotTagTasks {

    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private HotTagCache hotTagCache;

//    @Scheduled(fixedRate = 5000)
    @Scheduled(cron = "0 0 1 * * *")
    public void hotTagSchedule() {

        int offset = 0;
        int limit = 20;
        List<Question> list = new ArrayList<>();
        Map<String, Integer> priorities = new HashMap<>();

        while(offset==0 || list.size()==limit){
            list = questionMapper.selectByExampleWithRowbounds(new QuestionExample(),new RowBounds(offset,limit));
            for (Question question:list){
                String[] tags = StringUtils.split(question.getTag(), ",");
                for (String tag : tags) {
                    Integer priority = priorities.get(tag);
                    if (priority!=null){
                        priorities.put(tag,priority+5+question.getCommentCount());
                    }else {
                        priorities.put(tag,5+question.getCommentCount());
                    }
                }
            }
            offset+=limit;
        }

        hotTagCache.setTags(priorities);
        hotTagCache.getTags().forEach(
                (k,v)->{
                    System.out.println(k);
                    System.out.println(v);
                }
        );
        log.info("hotTagSchedule stop {}", new Date());
    }
}
