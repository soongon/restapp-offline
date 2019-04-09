package kr.re.kitri.restapp.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileuploadService {
    void doUplad(MultipartFile file) throws IOException;
}
