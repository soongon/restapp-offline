package kr.re.kitri.restapp.controller;

import kr.re.kitri.restapp.service.FileuploadService;
import kr.re.kitri.restapp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private FileuploadService fileuploadService;

    @Autowired
    private SecurityService securityService;

    @PostMapping("upload")
    public Map<String, Object> uploadFile(@RequestParam MultipartFile file) throws IOException {

        fileuploadService.doUplad(file);

        Map<String, Object> map = new HashMap<>();
        map.put("result", "upload completed..");
        return map;
    }

    @GetMapping("security/generate/token")
    public Map<String, Object> generateToken(
                        @RequestParam String subject) {
        String token = securityService
                .generateToken(subject, 1000*60*60*24L);
        Map<String, Object> map = new HashMap<>();
        map.put("userid", subject);
        map.put("token", token);

        return map;
    }

    @GetMapping("security/get/subject")
    public Map<String, Object> getSubject(@RequestParam("token") String token) {
        String subject = securityService.getSubject(token);
        Map<String, Object> map = new HashMap<>();
        map.put("result", subject);
        return map;
    }

}
