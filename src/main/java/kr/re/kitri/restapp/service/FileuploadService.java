package kr.re.kitri.restapp.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileuploadService {
    String doUplad(MultipartFile file);
}
