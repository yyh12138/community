package life.majiang.community.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//需求不仅返回问题列表，还要返回页码等信息
//即包裹了具体一页的所有元素
@Data
public class PaginationDTO {

    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer totalCount, Integer page, Integer size) {

        Integer totalPage;
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        //是否展示上一页
        if (page == 1) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }
        //是否展示下一页
        if (page == totalPage) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
        //是否展示首页
        if (pages.contains(1)){

        }
    }
}
