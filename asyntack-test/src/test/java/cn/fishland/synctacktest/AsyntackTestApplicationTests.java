package cn.fishland.synctacktest;

import cn.fishland.synctack.SyncTack;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyntackTestApplicationTests {

    @Autowired
    SyncTack syncTack;

    @Test
    void contextLoads() {
        System.out.println(syncTack.getName());
        System.out.println(syncTack.getStatus());
    }

}
