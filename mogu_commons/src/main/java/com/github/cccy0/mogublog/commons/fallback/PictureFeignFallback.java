package com.github.cccy0.mogublog.commons.fallback;

import com.github.cccy0.mogublog.base.holder.RequestHolder;
import com.github.cccy0.mogublog.base.vo.FileVO;
import com.github.cccy0.mogublog.commons.feign.PictureFeignClient;
import com.github.cccy0.mogublog.utils.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 图片服务降级兜底方法【当服务不可用时会触发】
 *
 * @author Zhai
 * 2021/6/19 17:57
 */

@Component
@Slf4j
public class PictureFeignFallback implements PictureFeignClient {
    @Override
    public String getPicture(String fileIds, String code) {
        HttpServletRequest request = RequestHolder.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        log.error("图片服务出现异常，服务降级返回，请求路径: {}", requestURL);
        return ResultUtil.errorWithMessage("获取图片服务降级返回");
    }

    @Override
    public String uploadPicsByUrl(FileVO fileVO) {
        HttpServletRequest request = RequestHolder.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        log.error("图片服务出现异常，更新图片失败，服务降级返回，请求路径: {}", requestURL);
        return ResultUtil.errorWithMessage("更新图片服务降级返回");
    }

    @Override
    public String initStorageSize(String adminUid, Long maxStorageSize) {
        HttpServletRequest request = RequestHolder.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        log.error("图片服务出现异常，初始化网盘容量失败，服务降级返回，请求路径: {}", requestURL);
        return ResultUtil.errorWithMessage("图片服务出现异常，初始化网盘容量失败");
    }

    @Override
    public String editStorageSize(String adminUid, Long maxStorageSize) {
        HttpServletRequest request = RequestHolder.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        log.error("图片服务出现异常，更新网盘容量失败，服务降级返回，请求路径: {}", requestURL);
        return ResultUtil.errorWithMessage("图片服务出现异常，更新网盘容量失败，服务降级返回");
    }

    @Override
    public String getStorageByAdminUid(List<String> adminUidList) {
        HttpServletRequest request = RequestHolder.getRequest();
        StringBuffer requestURL = request.getRequestURL();
        log.error("图片服务出现异常，获取网盘容量失败，服务降级返回，请求路径: {}", requestURL);
        return ResultUtil.errorWithMessage("图片服务出现异常，获取网盘容量失败，服务降级返回");
    }
}
