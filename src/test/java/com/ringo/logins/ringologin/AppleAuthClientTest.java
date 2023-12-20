package com.ringo.logins.ringologin;

import com.ringo.logins.ringologin.social.GetMemberInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("default")
public class AppleAuthClientTest {
    @Autowired
    GetMemberInfoService getMemberInfoService;

    @Test
    void 토큰을가져온다(){
        String authorizationCode="애플 인가코드";
        var source = getMemberInfoService.get(authorizationCode);
    }
}
