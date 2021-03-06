package com.wisely.web.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        String fileSavePath = "d:/upload/";

        try {
            String originalFileName = file.getOriginalFilename();
            System.out.println("fileName"+originalFileName);
            FileUtils.writeByteArrayToFile(new File(fileSavePath+originalFileName), file.getBytes());
            return "ok";
        }catch (IOException e){
            e.printStackTrace();
            return "upload file wrong";
        }
    }
}
