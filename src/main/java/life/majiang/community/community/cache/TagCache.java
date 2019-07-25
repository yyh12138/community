package life.majiang.community.community.cache;

import life.majiang.community.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TagCache {
    public static List<TagDTO> get(){
        List<TagDTO> tagDTOS = new ArrayList<>();

        TagDTO javaTag = new TagDTO();
        javaTag.setCategoryName("Java");
        javaTag.setTags(Arrays.asList("Java基础","网络编程","Java8","多线程","正则表达式","Java9","Spring","SpringBoot"));
        tagDTOS.add(javaTag);

        TagDTO jsTag = new TagDTO();
        jsTag.setCategoryName("前端");
        jsTag.setTags(Arrays.asList("html","css","JavaScript","jquery","vue"));
        tagDTOS.add(jsTag);

        TagDTO ccTag = new TagDTO();
        ccTag.setCategoryName("C语言");
        ccTag.setTags(Arrays.asList("C语言基础","编程的那些事"));
        tagDTOS.add(ccTag);

        TagDTO sqlTag = new TagDTO();
        sqlTag.setCategoryName("数据库");
        sqlTag.setTags(Arrays.asList("数据库配置","curd","function","trigger","transaction"));
        tagDTOS.add(sqlTag);

        TagDTO toolTag = new TagDTO();
        toolTag.setCategoryName("开发工具");
        toolTag.setTags(Arrays.asList("git","github","maven","eclipse","idea","vim","vscode"));
        tagDTOS.add(toolTag);

        return tagDTOS;
    }

    public static String filterInvalid(String tags){
        String[] split = StringUtils.split(tags,",");
        List<TagDTO> tagDTOS = get();
        List<String> tagList = tagDTOS.stream().flatMap(tag-> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t->!tagList.contains(t)).collect(Collectors.joining(","));

        return invalid;
    }
}
