package com.github.cccy0.mogublog.xo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.cccy0.mogublog.commons.entity.PictureSort;
import com.github.cccy0.mogublog.xo.vo.PictureSortVO;
import com.github.cccy0.mogublog.base.service.SuperService;

/**
 * 图片分类表 服务类
 *
 * @author 陌溪
 * @date 2018-09-04
 */
public interface PictureSortService extends SuperService<PictureSort> {

    /**
     * 获取图片分类列表
     *
     * @param pictureSortVO
     * @return
     */
    public IPage<PictureSort> getPageList(PictureSortVO pictureSortVO);

    /**
     * 新增图片分类
     *
     * @param pictureSortVO
     */
    public String addPictureSort(PictureSortVO pictureSortVO);

    /**
     * 编辑图片分类
     *
     * @param pictureSortVO
     */
    public String editPictureSort(PictureSortVO pictureSortVO);

    /**
     * 删除图片分类
     *
     * @param pictureSortVO
     */
    public String deletePictureSort(PictureSortVO pictureSortVO);

    /**
     * 置顶图片分类
     *
     * @param pictureSortVO
     */
    public String stickPictureSort(PictureSortVO pictureSortVO);
}
