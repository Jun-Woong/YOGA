package io.openvidu.js.java.dto;

import org.springframework.web.multipart.MultipartFile;

public class ImgDto {
   
	private MultipartFile imgFile;
 
    public MultipartFile getImgFile() {
        return imgFile;
    }
 
    public void setImgFile(MultipartFile imgFile) {
        this.imgFile = imgFile;
    }
}


