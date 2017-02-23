package com.zkn.learnspringmvc.news.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by zkn on 2017/2/22.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/uploadPage.do")
    public String uploadPage() {

        return "uploadPage";
    }

    /**
     * 第一种上传文件方式
     * @param uploadFile
     * @param request
     * @return
     */
    @RequestMapping(value = "/uploadFileAction.do",produces = MediaType.APPLICATION_JSON_VALUE)
    public String uploadFileAction(@RequestParam("uploadFile") CommonsMultipartFile uploadFile, HttpServletRequest request) {
        BufferedInputStream bufferedIn = null;
        BufferedOutputStream bufferedOut = null;
        try {
            bufferedIn = new BufferedInputStream(uploadFile.getInputStream());
            String tempPath = request.getSession().getServletContext().getRealPath("upload");
            bufferedOut = new BufferedOutputStream(new FileOutputStream(tempPath+File.separatorChar+uploadFile.getOriginalFilename()));
            byte[] bytes = new byte[1024];
            int flag = 0;
            while ((flag = bufferedIn.read(bytes)) > 0){
                bufferedOut.write(bytes,0,flag);
            }
            bufferedOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedIn != null)
                try {
                    bufferedIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if(bufferedOut != null)
                try {
                    bufferedOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return "uploadPage";
    }
}
