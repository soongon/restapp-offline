package kr.re.kitri.restapp.service;

public interface SecurityService {
    String generateToken(String subject, Long i);
}
