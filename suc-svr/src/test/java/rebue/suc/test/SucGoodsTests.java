package rebue.suc.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import rebue.robotech.dic.ResultDic;
import rebue.robotech.ro.IdRo;
import rebue.robotech.ro.Ro;
import rebue.suc.mo.SucGoodsMo;
import rebue.wheel.OkhttpUtils;
import rebue.wheel.RandomEx;

/**
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@Slf4j
public class SucGoodsTests {

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
        SucGoodsMo mo = null;
        for (int i = 0; i < 20; i++) {
            mo = (SucGoodsMo) RandomEx.randomPojo(SucGoodsMo.class);
            mo.setId(null);
            log.info("添加的参数为：" + mo);
            final String addResult = OkhttpUtils.postByJsonParams(hostUrl + "/suc/goods", mo);
            log.info("添加的返回值为：" + addResult);
            final IdRo idRo = _objectMapper.readValue(addResult, IdRo.class);
            log.info(idRo.toString());
            Assertions.assertEquals(ResultDic.SUCCESS, idRo.getResult());
            mo.setId(Long.valueOf(idRo.getId()));
        }
        final String listResult = OkhttpUtils.get(hostUrl + "/suc/goods?pageNum=1&pageSize=5");
        log.info("查询的返回值为：" + listResult);
        log.info("获取单个的参数为：" + mo.getId());
        final String getByIdResult = OkhttpUtils.get(hostUrl + "/suc/goods/get-by-id?id=" + mo.getId());
        log.info("获取单个的返回值为：" + getByIdResult);
        log.info("修改的参数为：" + mo);
        final String modifyResult = OkhttpUtils.putByJsonParams(hostUrl + "/suc/goods", mo);
        log.info("修改的返回值为：" + modifyResult);
        final Ro modifyRo = _objectMapper.readValue(modifyResult, Ro.class);
        log.info(modifyRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, modifyRo.getResult());
        log.info("删除的参数为：" + mo.getId());
        final String deleteResult = OkhttpUtils.delete(hostUrl + "/suc/goods?id=" + mo.getId());
        log.info("删除的返回值为：" + deleteResult);
        final Ro deleteRo = _objectMapper.readValue(deleteResult, Ro.class);
        log.info(deleteRo.toString());
        Assertions.assertEquals(ResultDic.SUCCESS, deleteRo.getResult());
    }
}
