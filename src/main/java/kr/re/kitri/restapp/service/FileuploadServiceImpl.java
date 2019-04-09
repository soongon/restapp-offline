package kr.re.kitri.restapp.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileuploadServiceImpl implements FileuploadService {

    private Path location;

    public FileuploadServiceImpl() throws IOException {
        location = Paths.get("c:/test/");
        Files.createDirectories(location);
    }

    @Override
    public void doUplad(MultipartFile file) throws IOException {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        if (fileName.isEmpty()) {
            throw new IOException("File is empty " + fileName);
        }
        try {
            Files.copy(file.getInputStream(),
                    this.location.resolve(fileName),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new IOException("File Upload Error : " + fileName);
        }
    }
}
