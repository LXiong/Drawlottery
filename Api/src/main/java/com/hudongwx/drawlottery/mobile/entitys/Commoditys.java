package com.hudongwx.drawlottery.mobile.entitys;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_commoditys")
public class Commoditys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品类型id
     */
    @Column(name = "commodity_type_id")
    private Long commodityTypeId;

    /**
     * 商品类别（1：实体，0：虚拟）
     */
    private Integer genre;

    /**
     * 当前购买次数
     */
    @Column(name = "buy_current_number")
    private Integer buyCurrentNumber;

    /**
     * 总购买次数
     */
    @Column(name = "buy_total_number")
    private Integer buyTotalNumber;

    /**
     * 开抢时间
     */
    @Column(name = "ground_time")
    private Date groundTime;

    /**
     * 中奖幸运码id
     */
    @Column(name = "luck_code_id")
    private Long luckCodeId;

    /**
     * 商品状态ID
     */
    @Column(name = "state_id")
    private Integer stateId;

    /**
     * 当前期数
     */
    @Column(name = "round_time")
    private String roundTime;

    /**
     * 封面图片id
     */
    @Column(name = "cover_img_url")
    private String coverImgUrl;

    /**
     * 是否自动生成下一期（1：是，0：否）
     */
    @Column(name = "auto_round")
    private Integer autoRound;

    /**
     * 商品详情URL
     */
    @Column(name = "commodity_desc_url")
    private String commodityDescUrl;

    /**
     * 商品描述
     */
    @Column(name = "commodity_desc")
    private String commodityDesc;

    /**
     * 获取上一次购买人次数量
     *
     * @return 上一次购买人次
     */
    public Integer getByLastNumber() {
        return byLastNumber;
    }

    /**
     * 修改上一次购买人次数量
     *
     * @param byLastNumber 上一次购买人次
     */
    public void setByLastNumber(Integer byLastNumber) {
        this.byLastNumber = byLastNumber;
    }

    /**
     * 上一次购买人次
     */
    @Column(name = "buy_last_number")
    private Integer byLastNumber;

    /**
     * 售罄时间
     */
    @Column(name = "sell_out_time")
    private Date sellOutTime;

    /**
     * 下架时间
     */
    @Column(name = "undercarriage_time")
    private Date undercarriageTime;

    /**
     * 是否可用
     */
    private Integer valid;

    /**
     * 最低购买量
     */
    private Integer minimum;

    public Date getUndercarriageTime() {
        return undercarriageTime;
    }

    public void setUndercarriageTime(Date undercarriageTime) {
        this.undercarriageTime = undercarriageTime;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名
     *
     * @return name - 商品名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名
     *
     * @param name 商品名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商品类型id
     *
     * @return commodity_type_id - 商品类型id
     */
    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型id
     *
     * @param commodityTypeId 商品类型id
     */
    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取商品类别（1：实体，0：虚拟）
     *
     * @return genre - 商品类别（1：实体，0：虚拟）
     */
    public Integer getGenre() {
        return genre;
    }

    /**
     * 设置商品类别（1：实体，0：虚拟）
     *
     * @param genre 商品类别（1：实体，0：虚拟）
     */
    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    /**
     * 获取当前购买次数
     *
     * @return buy_current_number - 当前购买次数
     */
    public Integer getBuyCurrentNumber() {
        return buyCurrentNumber;
    }

    /**
     * 设置当前购买次数
     *
     * @param buyCurrentNumber 当前购买次数
     */
    public void setBuyCurrentNumber(Integer buyCurrentNumber) {
        this.buyCurrentNumber = buyCurrentNumber;
    }

    /**
     * 获取总购买次数
     *
     * @return buy_total_number - 总购买次数
     */
    public Integer getBuyTotalNumber() {
        return buyTotalNumber;
    }

    /**
     * 设置总购买次数
     *
     * @param buyTotalNumber 总购买次数
     */
    public void setBuyTotalNumber(Integer buyTotalNumber) {
        this.buyTotalNumber = buyTotalNumber;
    }

    /**
     * 获取开抢时间
     *
     * @return startTime - 开抢时间
     */
    public Date getGroundTime() {
        return groundTime;
    }

    /**
     * 设置开抢时间
     *
     * @param groundTime 开抢时间
     */
    public void setGroundTime(Date groundTime) {
        this.groundTime = groundTime;
    }

    /**
     * 获取中奖幸运码id
     *
     * @return luck_code_id - 中奖幸运码id
     */
    public Long getLuckCodeId() {
        return luckCodeId;
    }

    /**
     * 设置中奖幸运码id
     *
     * @param luckCodeId 中奖幸运码id
     */
    public void setLuckCodeId(Long luckCodeId) {
        this.luckCodeId = luckCodeId;
    }

    /**
     * 获取当前中奖状态（1：已开奖，0：未开奖）
     *
     * @return state - 当前中奖状态（1：已开奖，0：未开奖）
     */
    public Integer getStateId() {
        return stateId;
    }

    /**
     * 设置当前中奖状态（1：已开奖，0：未开奖）
     *
     * @param state 当前中奖状态（1：已开奖，0：未开奖）
     */
    public void setStateId(Integer state) {
        this.stateId = state;
    }

    /**
     * 获取当前期数
     *
     * @return round_time - 当前期数
     */
    public String getRoundTime() {
        return roundTime;
    }

    /**
     * 设置当前期数
     *
     * @param roundTime 当前期数
     */
    public void setRoundTime(String roundTime) {
        this.roundTime = roundTime == null ? null : roundTime.trim();
    }

    /**
     * 获取封面图片id
     *
     * @return cover_img_id - 封面图片id
     */
    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    /**
     * 设置封面图片id
     *
     * @param coverImgId 封面图片id
     */
    public void setCoverImgUrl(String coverImgId) {
        this.coverImgUrl = coverImgId;
    }

    /**
     * 获取是否自动生成下一期（1：是，0：否）
     *
     * @return auto_round - 是否自动生成下一期（1：是，0：否）
     */
    public Integer getAutoRound() {
        return autoRound;
    }

    /**
     * 设置是否自动生成下一期（1：是，0：否）
     *
     * @param autoRound 是否自动生成下一期（1：是，0：否）
     */
    public void setAutoRound(Integer autoRound) {
        this.autoRound = autoRound;
    }

    /**
     * 获取商品详情URL
     *
     * @return commodity_desc_url - 商品详情URL
     */
    public String getCommodityDescUrl() {
        return commodityDescUrl;
    }

    /**
     * 设置商品详情URL
     *
     * @param commodityDescUrl 商品详情URL
     */
    public void setCommodityDescUrl(String commodityDescUrl) {
        this.commodityDescUrl = commodityDescUrl == null ? null : commodityDescUrl.trim();
    }

    /**
     * 获取商品描述
     *
     * @return desc - 商品描述
     */
    public String getDesc() {
        return commodityDesc;
    }

    /**
     * 设置商品描述
     *
     * @param desc 商品描述
     */
    public void setDesc(String desc) {
        this.commodityDesc = desc == null ? null : desc.trim();
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public Date getSellOutTime() {
        return sellOutTime;
    }

    public void setSellOutTime(Date sellOutTime) {
        this.sellOutTime = sellOutTime;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }
}