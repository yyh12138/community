package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VideoController {

    @GetMapping("/videos")
    public String index(){
        return "videos";
    }

    @GetMapping("/video/{id}")
    public String video(@PathVariable(name="id")String id){
        return "video";
    }
}
