package com.hudongwx.drawlottery.mobile.web.user;

import com.alibaba.fastjson.JSONObject;
import com.hudongwx.drawlottery.mobile.service.commodity.ICommodityExchangeService;
import com.hudongwx.drawlottery.mobile.service.commodity.IExchangeMethodService;
import com.hudongwx.drawlottery.mobile.service.commodity.IVirtualCommodityService;
import com.hudongwx.drawlottery.mobile.service.user.IDeliveryAddressService;
import com.hudongwx.drawlottery.mobile.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author wu
 * @version 1.0, 2017/1/9 <br/>
 * @desc <p>
 * <p>
 * 创建　wu　2017/1/9 <br/>
 * <p>
 * 商品兑换方式
 * <p>
 * @email 294786949@qq.com
 */
@RestController
@Api(value = "CommodityExchangeController", description = "商品兑换方式")
public class CommodityExchangeController extends BaseController {

    @Autowired
    ICommodityExchangeService ceService;
    @Autowired
    IExchangeMethodService emService;
    @Autowired
    IVirtualCommodityService vcService;
    @Autowired
    IDeliveryAddressService daService;

    /**
     * 查询商品兑换方式
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("查询商品兑换方式")
    @RequestMapping(value = "/api/v1/user/commodity/commexchways", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject queryCommExchangeWays(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success(ceService.selectByCommodityId(commId));
    }

    /**
     * 兑换现金
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("兑换现金")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/temp3", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject exchangeToCash(@ApiParam("商品Id") @RequestParam("commId") Long commId, @ApiParam("平台名称（例：支付宝平台）") @RequestParam("TPName") String TPName, @ApiParam("平台账号") @RequestParam("TPAccount") String TPAccount) {
        return success(emService.exchangeToCash(TPName, TPAccount, commId, 10000L));
    }

    /**
     * 兑换闪币
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("兑换闪币")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/temp4", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject exchangeToGold(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success(emService.temp4(10000L, commId));
    }

    /**
     * 兑换充值卡(查看卡密)
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("兑换充值卡(查看卡密)")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/rcard/temp1", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject exchangeToRechargeCard(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success("操作成功！", emService.temp1(1000l, commId));
    }

    /**
     * 可兑换充值卡方式详情
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("可兑换充值卡方式详情")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/rcard/show", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject queryExchangeToRechargeCard(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success(emService.selectUserRechargeCardPrize(10000L, commId));
    }

    /**
     * 兑换流程详情
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("充值卡兑换流程详情")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/rcard/info", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject queryExchangeToRechargeCardInfo(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success(emService.selectUserRechargeCardExchangeProcess(10000L, commId));
    }

    /**
     * 快递收货
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("快递收货")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/temp2", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject exchangeToExpress(@ApiParam("商品Id") @RequestParam("commId") Long commId, @ApiParam("注册用户地址Id") @RequestParam("addressId") Long addressId) {
        return success(emService.temp2(10000L, commId, addressId));
    }

    /**
     * 到店领取
     *
     * @param commId
     * @return
     */
    @ResponseBody
    @ApiOperation("到店领取")
    @RequestMapping(value = "/api/v1/user/commodity/exchange/temp5", method = {RequestMethod.POST, RequestMethod.GET})
    public JSONObject exchangeToLocale(@ApiParam("商品Id") @RequestParam("commId") Long commId) {
        return success(emService.temp5(10000L, commId));
    }
}
