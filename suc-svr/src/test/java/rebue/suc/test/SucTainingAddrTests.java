package rebue.suc.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.IdRo;
import rebue.robotech.ro.Ro;
import rebue.suc.mo.SucTainingAddrMo;
import rebue.wheel.OkhttpUtils;
import rebue.wheel.RandomEx;

/**
 * 训练场信息
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Slf4j
public class SucTainingAddrTests {

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final String hostUrl = "http://127.0.0.1:9100";

    /**
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    private final ObjectMapper _objectMapper = new ObjectMapper();

    /**
     * 测试基本的增删改查
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Test
    public void testCrud() throws IOException, ReflectiveOperationException {
        SucTainingAddrMo mo = null;
        for (int i = 0; i < 20; i++) {
            mo = (SucTainingAddrMo) RandomEx.randomPojo(SucTainingAddrMo.class);
            mo.setId(null);
            log.info("添加训练场信息的参数为：" + mo);
            final String addResult = OkhttpUtils.postByJsonParams(hostUrl + "/suc/taining-addr", mo);
            log.info("添加训练场信息的返回值为：" + addResult);
            final IdRo idRo = _objectMapper.readValue(addResult, IdRo.class);
            log.info(idRo.toString());
            Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
            mo.setId(Long.valueOf(idRo.getId()));
        }
        final String listResult = OkhttpUtils.get(hostUrl + "/suc/taining-addr?pageNum=1&pageSize=5");
        log.info("查询训练场信息的返回值为：" + listResult);
        log.info("获取单个训练场信息的参数为：" + mo.getId());
        final String getByIdResult = OkhttpUtils.get(hostUrl + "/suc/taining-addr/get-by-id?id=" + mo.getId());
        log.info("获取单个训练场信息的返回值为：" + getByIdResult);
        log.info("修改训练场信息的参数为：" + mo);
        final String modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/suc/taining-addr", mo);
        log.info("修改训练场信息的返回值为：" + modifyResult);
        final Ro modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());
        log.info("删除训练场信息的参数为：" + mo.getId());
        final String deleteResult = OkhttpUtils.delete(hostUrl + "/suc/taining-addr?id=" + mo.getId());
        log.info("删除训练场信息的返回值为：" + deleteResult);
        final Ro deleteRo = _objectMapper.readValue(deleteResult, Ro.class);
        log.info(deleteRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, deleteRo.getResult());
    }
}
