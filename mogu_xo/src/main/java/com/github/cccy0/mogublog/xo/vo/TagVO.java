package com.github.cccy0.mogublog.xo.vo;

import com.github.cccy0.mogublog.base.validator.annotion.NotBlank;
import com.github.cccy0.mogublog.base.validator.group.Insert;
import com.github.cccy0.mogublog.base.validator.group.Update;
import com.github.cccy0.mogublog.base.vo.BaseVO;
import lombok.Data;

/**
 * BlogVO
 *
 * @author: 陌溪
 * @create: 2019年12月4日12:26:36
 */
@Data
public class TagVO extends BaseVO<TagVO> {

    /**
     * 标签内容
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String content;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * OrderBy排序字段（desc: 降序）
     */
    private String orderByDescColumn;

    /**
     * OrderBy排序字段（asc: 升序）
     */
    private String orderByAscColumn;

    /**
     * 无参构造方法，初始化默认值
     */
    TagVO() {

    }

}
