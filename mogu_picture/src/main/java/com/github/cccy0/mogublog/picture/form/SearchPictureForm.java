package com.github.cccy0.mogublog.picture.form;

import com.github.cccy0.mogublog.base.vo.FileVO;
import lombok.Data;

@Data
public class SearchPictureForm extends FileVO {
    private String searchKey;
    private Integer count;
}
