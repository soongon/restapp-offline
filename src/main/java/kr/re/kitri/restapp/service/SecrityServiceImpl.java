package kr.re.kitri.restapp.service;

import org.springframework.stereotype.Service;

@Service
public class SecrityServiceImpl implements SecurityService {
    @Override
    public String generateToken(String subject, Long i) {
        return "aldskfjlsdjflksdjfklsdjfskld";
    }
}
