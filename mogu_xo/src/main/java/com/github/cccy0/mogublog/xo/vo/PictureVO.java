package com.github.cccy0.mogublog.xo.vo;

import com.github.cccy0.mogublog.base.validator.group.GetList;
import com.github.cccy0.mogublog.base.validator.group.Insert;
import com.github.cccy0.mogublog.base.validator.group.Update;
import com.github.cccy0.mogublog.base.vo.BaseVO;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * 图片实体类
 *
 * @author 陌溪
 * @date 2018年9月17日16:08:58
 */
@ToString
@Data
public class PictureVO extends BaseVO<PictureVO> {

    /**
     * 图片UID
     */
    private String fileUid;

    /**
     * 图片UIDs
     */
    @NotBlank(groups = {Insert.class})
    private String fileUids;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 所属相册分类UID
     */
    @NotBlank(groups = {Insert.class, Update.class, GetList.class})
    private String pictureSortUid;
}
