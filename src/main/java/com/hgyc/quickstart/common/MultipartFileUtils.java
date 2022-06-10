package com.hgyc.quickstart.common;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class MultipartFileUtils {

    private static final String currentWorkDir = ".";
    public static String createTempFile(MultipartFile file){
        String filePath = "";
        try {
            File dir = new File(currentWorkDir);
            String dirPath = dir.getCanonicalPath();
            filePath = dirPath + File.separator + file.getOriginalFilename();
            File tempFile = new File(filePath);
            if(!tempFile.exists()){
                tempFile.createNewFile();
            }
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath;
    }
}
