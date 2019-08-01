package com.zomore.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class FileUtil implements Serializable{

        private Long id;
        private String image;

        private MultipartFile file;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public MultipartFile getFile() {
            return file;
        }

        public void setFile(MultipartFile file) {
            this.file = file;
        }


}
