package com.hgyc.quickstart.controller;

import com.hgyc.quickstart.common.MultipartFileUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class MultipartfileController {

    private final String tempDirectory = ".";

    @PostMapping("/test")
    public String test(@RequestParam("file") MultipartFile file,
                       @RequestParam("image")MultipartFile image){
        File dir = new File(tempDirectory);
        try {
            String dirPath = dir.getCanonicalPath();
            String filePath = dirPath + File.separator + file.getOriginalFilename();
            File tempFile = new File(filePath);
            if(!tempFile.exists()){
                tempFile.createNewFile();
            }
            file.transferTo(tempFile);

            String imagePath = dirPath + File.separator + image.getOriginalFilename();
            File tempImage = new File(imagePath);
            if(!tempImage.exists()){
                tempImage.createNewFile();
            }
            image.transferTo(tempImage);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hello world";
    }

    @PostMapping("/test1")
    public String test1(HttpServletRequest request){
        System.out.println(request);
        request.getParameterMap().forEach((key, value) -> {
            System.out.println(key + ":" + value[0]);
        });
        ((StandardMultipartHttpServletRequest) request).getMultiFileMap().forEach((key, file) ->{
            String filePath = MultipartFileUtils.createTempFile(file.get(0));
            System.out.println(key + ":" + filePath);
        });
        return "hello world";
    }
}
