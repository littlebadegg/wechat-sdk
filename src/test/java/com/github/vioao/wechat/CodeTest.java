package com.github.vioao.wechat;

import com.github.vioao.wechat.api.component.wxa.CodeApi;
import org.junit.Test;

public class CodeTest {

    @Test
    public void getLastAuditStatus(){
        System.out.println(CodeApi.getLatestAuditStatus("24_LHO5rS_UDq10sHdtnxTSrZwmVWOcM1VH3l97s-FeDv9rEggQWvk_mPQXMEyDBT9TxEhIDbdM2ASFOa6jIlTF3w-m5HptPb08DGQ8cYtbsBdp-_5_Mch-XVxZLg4iXryofcDGKAFUPux1fMXNTREcALDHFS"));
    }
}
