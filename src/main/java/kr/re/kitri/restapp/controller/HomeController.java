package kr.re.kitri.restapp.controller;

import kr.re.kitri.restapp.service.FileuploadService;
import kr.re.kitri.restapp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    public String uploadFile(@RequestParam MultipartFile file) {

        return fileuploadService.doUplad(file);
    }
    @GetMapping("security/generate/token")
    public Map<String, Object> generateToken(
                        @RequestParam String userid) {
        String token = securityService
                .generateToken(userid, 1000*60*60*24L);
        Map<String, Object> map = new HashMap<>();
        map.put("userid", userid);
        map.put("token", token);

        return map;
    }

}
