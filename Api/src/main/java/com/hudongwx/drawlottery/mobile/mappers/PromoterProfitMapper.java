package com.hudongwx.drawlottery.mobile.mappers;

import com.hudongwx.drawlottery.mobile.commn.BaseMapper;
import com.hudongwx.drawlottery.mobile.entitys.Approve;
import com.hudongwx.drawlottery.mobile.entitys.PromoterProfit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PromoterProfitMapper extends BaseMapper<Approve> {

    /**
     * 通过推广Id(用户账号)查询收益历史信息
     *
     * @param accountId
     * @return
     */
    List<PromoterProfit> selectByAccountId(@Param("accountId") Long accountId);
}