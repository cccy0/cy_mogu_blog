package com.github.cccy0.mogublog.xo.vo;

import com.github.cccy0.mogublog.base.validator.annotion.BooleanNotNULL;
import com.github.cccy0.mogublog.base.validator.annotion.NotBlank;
import com.github.cccy0.mogublog.base.validator.group.GetOne;
import com.github.cccy0.mogublog.base.validator.group.Insert;
import com.github.cccy0.mogublog.base.validator.group.Update;
import com.github.cccy0.mogublog.base.vo.BaseVO;
import lombok.Data;

/**
 * TodoVO
 *
 * @author: 陌溪
 * @create: 2019年12月18日22:16:23
 */
@Data
public class TodoVO extends BaseVO<TodoVO> {

    /**
     * 内容
     */
    @NotBlank(groups = {Insert.class, Update.class})
    private String text;
    /**
     * 表示事项是否完成
     */
    @BooleanNotNULL(groups = {Update.class, GetOne.class})
    private Boolean done;


    /**
     * 无参构造方法，初始化默认值
     */
    TodoVO() {

    }

}
