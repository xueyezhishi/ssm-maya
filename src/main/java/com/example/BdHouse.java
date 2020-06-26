package com.example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 * 
 */
public class BdHouse implements Serializable {
    /**
     * 主键
     */
    private String pkHouse;

    /**
     * 房产编号

     */
    private String code;

    /**
     * 区域

     */
    private String area;

    /**
     * 项目小区
     */
    private String pkProject;

    /**
     * 变更次数

     */
    private Long addressversion;

    /**
     * 房屋类型

     */
    private String housetype;

    /**
     * 产权单位

     */
    private String ownerunit;

    /**
     * 分级管理单位

     */
    private String userunit;

    /**
     * 是否局属单位

     */
    private String bureauunit;

    /**
     * 建筑面积

     */
    private BigDecimal structurearea;

    /**
     * 使用面积

     */
    private BigDecimal usearea;

    /**
     * 房屋结构

     */
    private String housestructure;

    /**
     * 建筑年份

     */
    private String buildyear;

    /**
     * 所在层总层数
     */
    private Long alllevel;

    /**
     * 层数

     */
    private Long levels;

    /**
     * 使用权类型

     */
    private String usetype;

    /**
     * 发证日期

     */
    private String licensedate;

    /**
     * 权证面积

     */
    private BigDecimal warrantarea;

    /**
     * 权证数量

     */
    private String ownershiplicense;

    /**
     * 土地用途

     */
    private String fielduse;

    /**
     * 土地面积-独用、公用
     */
    private BigDecimal fieldarea;

    /**
     * 登记时间-录入时间
     */
    private String signtime;

    /**
     * 是否封存-有效
     */
    private String enable;

    /**
     * 软删除-标志
     */
    private String dr;

    /**
     * 时间轴

     */
    private String ts;

    /**
     * 保留字段1
-产权单位value
     */
    private String def1;

    /**
     * 保留字段2-分级管理单位value
     */
    private String def2;

    /**
     * 保留字段3
     */
    private String def3;

    /**
     * 保留字段4
     */
    private String def4;

    /**
     * 保留字段5
     */
    private String def5;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private String creationtime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private String modifitime;

    /**
     * 房屋来源
     */
    private String housesource;

    /**
     * 信息完整-0：否；1：是
     */
    private String infoall;

    /**
     * 保留字段6
     */
    private String def6;

    /**
     * 保留字段7 ///用于表示历史数据，该字段存贮真实数据主键
     */
    private String def7;

    /**
     * 保留字段8
     */
    private String def8;

    /**
     * 保留字段9
     */
    private String def9;

    /**
     * 保留字段10
     */
    private String def10;

    private String pkOrg;

    private String pkDept;

    /**
     * 是否入账
     */
    private String isaccount;

    /**
     * 导入人
     */
    private String importer;

    /**
     * 导入时间
     */
    private String importtime;

    /**
     * 朝向
     */
    private String orientation;

    /**
     * 部位
     */
    private String part;

    /**
     * 资产价值
     */
    private BigDecimal propervalue;

    /**
     * 使用状态
     */
    private String status;

    /**
     * 产权状态
     */
    private String prostatus;

    /**
     * 锚点id
     */
    private String poiId;

    /**
     * x坐标
     */
    private BigDecimal ordx;

    /**
     * x1坐标
     */
    private BigDecimal ordx1;

    /**
     * y坐标
     */
    private BigDecimal ordy;

    /**
     * y1坐标
     */
    private BigDecimal ordy1;

    /**
     * 地域分类
     */
    private String zoneType;

    /**
     * 行政区域
     */
    private String adminDistrict;

    /**
     * 房屋用途
     */
    private String houseUsage;

    /**
     * 用途分类
     */
    private String usageTyle;

    /**
     * 产权人
     */
    private String propertyOwner;

    /**
     * 建筑年份
     */
    private String yearBuilt;

    /**
     * 是否危房
     */
    private String isDangerousHouse;

    /**
     * 是否有地下室
     */
    private String isBasement;

    /**
     * 房屋权利
     */
    private String houseRight;

    /**
     * 资产卡片编号
     */
    private String assetNo;

    /**
     * 证书情况
     */
    private String certStatus;

    /**
     * 历史记录对应主键
     */
    private String historyid;

    /**
     * 附件数量
     */
    private String filenum;

    /**
     * 附件编码1
     */
    private String code1;

    /**
     * 附件编码2
     */
    private String code2;

    /**
     * 附件编码3
     */
    private String code3;

    /**
     * 附件编码4
     */
    private String code4;

    /**
     * 附件编码5
     */
    private String code5;

    /**
     * 附件编码6
     */
    private String code6;

    /**
     * 出售时间
     */
    private String sellDate;

    /**
     * 土地id
     */
    private String pkLand;

    private String pkOrgValue;

    private static final long serialVersionUID = 1L;

    public String getPkHouse() {
        return pkHouse;
    }

    public void setPkHouse(String pkHouse) {
        this.pkHouse = pkHouse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPkProject() {
        return pkProject;
    }

    public void setPkProject(String pkProject) {
        this.pkProject = pkProject;
    }

    public Long getAddressversion() {
        return addressversion;
    }

    public void setAddressversion(Long addressversion) {
        this.addressversion = addressversion;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getOwnerunit() {
        return ownerunit;
    }

    public void setOwnerunit(String ownerunit) {
        this.ownerunit = ownerunit;
    }

    public String getUserunit() {
        return userunit;
    }

    public void setUserunit(String userunit) {
        this.userunit = userunit;
    }

    public String getBureauunit() {
        return bureauunit;
    }

    public void setBureauunit(String bureauunit) {
        this.bureauunit = bureauunit;
    }

    public BigDecimal getStructurearea() {
        return structurearea;
    }

    public void setStructurearea(BigDecimal structurearea) {
        this.structurearea = structurearea;
    }

    public BigDecimal getUsearea() {
        return usearea;
    }

    public void setUsearea(BigDecimal usearea) {
        this.usearea = usearea;
    }

    public String getHousestructure() {
        return housestructure;
    }

    public void setHousestructure(String housestructure) {
        this.housestructure = housestructure;
    }

    public String getBuildyear() {
        return buildyear;
    }

    public void setBuildyear(String buildyear) {
        this.buildyear = buildyear;
    }

    public Long getAlllevel() {
        return alllevel;
    }

    public void setAlllevel(Long alllevel) {
        this.alllevel = alllevel;
    }

    public Long getLevels() {
        return levels;
    }

    public void setLevels(Long levels) {
        this.levels = levels;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

    public String getLicensedate() {
        return licensedate;
    }

    public void setLicensedate(String licensedate) {
        this.licensedate = licensedate;
    }

    public BigDecimal getWarrantarea() {
        return warrantarea;
    }

    public void setWarrantarea(BigDecimal warrantarea) {
        this.warrantarea = warrantarea;
    }

    public String getOwnershiplicense() {
        return ownershiplicense;
    }

    public void setOwnershiplicense(String ownershiplicense) {
        this.ownershiplicense = ownershiplicense;
    }

    public String getFielduse() {
        return fielduse;
    }

    public void setFielduse(String fielduse) {
        this.fielduse = fielduse;
    }

    public BigDecimal getFieldarea() {
        return fieldarea;
    }

    public void setFieldarea(BigDecimal fieldarea) {
        this.fieldarea = fieldarea;
    }

    public String getSigntime() {
        return signtime;
    }

    public void setSigntime(String signtime) {
        this.signtime = signtime;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifitime() {
        return modifitime;
    }

    public void setModifitime(String modifitime) {
        this.modifitime = modifitime;
    }

    public String getHousesource() {
        return housesource;
    }

    public void setHousesource(String housesource) {
        this.housesource = housesource;
    }

    public String getInfoall() {
        return infoall;
    }

    public void setInfoall(String infoall) {
        this.infoall = infoall;
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    public String getPkDept() {
        return pkDept;
    }

    public void setPkDept(String pkDept) {
        this.pkDept = pkDept;
    }

    public String getIsaccount() {
        return isaccount;
    }

    public void setIsaccount(String isaccount) {
        this.isaccount = isaccount;
    }

    public String getImporter() {
        return importer;
    }

    public void setImporter(String importer) {
        this.importer = importer;
    }

    public String getImporttime() {
        return importtime;
    }

    public void setImporttime(String importtime) {
        this.importtime = importtime;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public BigDecimal getPropervalue() {
        return propervalue;
    }

    public void setPropervalue(BigDecimal propervalue) {
        this.propervalue = propervalue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProstatus() {
        return prostatus;
    }

    public void setProstatus(String prostatus) {
        this.prostatus = prostatus;
    }

    public String getPoiId() {
        return poiId;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public BigDecimal getOrdx() {
        return ordx;
    }

    public void setOrdx(BigDecimal ordx) {
        this.ordx = ordx;
    }

    public BigDecimal getOrdx1() {
        return ordx1;
    }

    public void setOrdx1(BigDecimal ordx1) {
        this.ordx1 = ordx1;
    }

    public BigDecimal getOrdy() {
        return ordy;
    }

    public void setOrdy(BigDecimal ordy) {
        this.ordy = ordy;
    }

    public BigDecimal getOrdy1() {
        return ordy1;
    }

    public void setOrdy1(BigDecimal ordy1) {
        this.ordy1 = ordy1;
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public String getAdminDistrict() {
        return adminDistrict;
    }

    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    public String getHouseUsage() {
        return houseUsage;
    }

    public void setHouseUsage(String houseUsage) {
        this.houseUsage = houseUsage;
    }

    public String getUsageTyle() {
        return usageTyle;
    }

    public void setUsageTyle(String usageTyle) {
        this.usageTyle = usageTyle;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getIsDangerousHouse() {
        return isDangerousHouse;
    }

    public void setIsDangerousHouse(String isDangerousHouse) {
        this.isDangerousHouse = isDangerousHouse;
    }

    public String getIsBasement() {
        return isBasement;
    }

    public void setIsBasement(String isBasement) {
        this.isBasement = isBasement;
    }

    public String getHouseRight() {
        return houseRight;
    }

    public void setHouseRight(String houseRight) {
        this.houseRight = houseRight;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getCertStatus() {
        return certStatus;
    }

    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    public String getHistoryid() {
        return historyid;
    }

    public void setHistoryid(String historyid) {
        this.historyid = historyid;
    }

    public String getFilenum() {
        return filenum;
    }

    public void setFilenum(String filenum) {
        this.filenum = filenum;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public String getCode4() {
        return code4;
    }

    public void setCode4(String code4) {
        this.code4 = code4;
    }

    public String getCode5() {
        return code5;
    }

    public void setCode5(String code5) {
        this.code5 = code5;
    }

    public String getCode6() {
        return code6;
    }

    public void setCode6(String code6) {
        this.code6 = code6;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getPkLand() {
        return pkLand;
    }

    public void setPkLand(String pkLand) {
        this.pkLand = pkLand;
    }

    public String getPkOrgValue() {
        return pkOrgValue;
    }

    public void setPkOrgValue(String pkOrgValue) {
        this.pkOrgValue = pkOrgValue;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BdHouse other = (BdHouse) that;
        return (this.getPkHouse() == null ? other.getPkHouse() == null : this.getPkHouse().equals(other.getPkHouse()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getPkProject() == null ? other.getPkProject() == null : this.getPkProject().equals(other.getPkProject()))
            && (this.getAddressversion() == null ? other.getAddressversion() == null : this.getAddressversion().equals(other.getAddressversion()))
            && (this.getHousetype() == null ? other.getHousetype() == null : this.getHousetype().equals(other.getHousetype()))
            && (this.getOwnerunit() == null ? other.getOwnerunit() == null : this.getOwnerunit().equals(other.getOwnerunit()))
            && (this.getUserunit() == null ? other.getUserunit() == null : this.getUserunit().equals(other.getUserunit()))
            && (this.getBureauunit() == null ? other.getBureauunit() == null : this.getBureauunit().equals(other.getBureauunit()))
            && (this.getStructurearea() == null ? other.getStructurearea() == null : this.getStructurearea().equals(other.getStructurearea()))
            && (this.getUsearea() == null ? other.getUsearea() == null : this.getUsearea().equals(other.getUsearea()))
            && (this.getHousestructure() == null ? other.getHousestructure() == null : this.getHousestructure().equals(other.getHousestructure()))
            && (this.getBuildyear() == null ? other.getBuildyear() == null : this.getBuildyear().equals(other.getBuildyear()))
            && (this.getAlllevel() == null ? other.getAlllevel() == null : this.getAlllevel().equals(other.getAlllevel()))
            && (this.getLevels() == null ? other.getLevels() == null : this.getLevels().equals(other.getLevels()))
            && (this.getUsetype() == null ? other.getUsetype() == null : this.getUsetype().equals(other.getUsetype()))
            && (this.getLicensedate() == null ? other.getLicensedate() == null : this.getLicensedate().equals(other.getLicensedate()))
            && (this.getWarrantarea() == null ? other.getWarrantarea() == null : this.getWarrantarea().equals(other.getWarrantarea()))
            && (this.getOwnershiplicense() == null ? other.getOwnershiplicense() == null : this.getOwnershiplicense().equals(other.getOwnershiplicense()))
            && (this.getFielduse() == null ? other.getFielduse() == null : this.getFielduse().equals(other.getFielduse()))
            && (this.getFieldarea() == null ? other.getFieldarea() == null : this.getFieldarea().equals(other.getFieldarea()))
            && (this.getSigntime() == null ? other.getSigntime() == null : this.getSigntime().equals(other.getSigntime()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getDr() == null ? other.getDr() == null : this.getDr().equals(other.getDr()))
            && (this.getTs() == null ? other.getTs() == null : this.getTs().equals(other.getTs()))
            && (this.getDef1() == null ? other.getDef1() == null : this.getDef1().equals(other.getDef1()))
            && (this.getDef2() == null ? other.getDef2() == null : this.getDef2().equals(other.getDef2()))
            && (this.getDef3() == null ? other.getDef3() == null : this.getDef3().equals(other.getDef3()))
            && (this.getDef4() == null ? other.getDef4() == null : this.getDef4().equals(other.getDef4()))
            && (this.getDef5() == null ? other.getDef5() == null : this.getDef5().equals(other.getDef5()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifitime() == null ? other.getModifitime() == null : this.getModifitime().equals(other.getModifitime()))
            && (this.getHousesource() == null ? other.getHousesource() == null : this.getHousesource().equals(other.getHousesource()))
            && (this.getInfoall() == null ? other.getInfoall() == null : this.getInfoall().equals(other.getInfoall()))
            && (this.getDef6() == null ? other.getDef6() == null : this.getDef6().equals(other.getDef6()))
            && (this.getDef7() == null ? other.getDef7() == null : this.getDef7().equals(other.getDef7()))
            && (this.getDef8() == null ? other.getDef8() == null : this.getDef8().equals(other.getDef8()))
            && (this.getDef9() == null ? other.getDef9() == null : this.getDef9().equals(other.getDef9()))
            && (this.getDef10() == null ? other.getDef10() == null : this.getDef10().equals(other.getDef10()))
            && (this.getPkOrg() == null ? other.getPkOrg() == null : this.getPkOrg().equals(other.getPkOrg()))
            && (this.getPkDept() == null ? other.getPkDept() == null : this.getPkDept().equals(other.getPkDept()))
            && (this.getIsaccount() == null ? other.getIsaccount() == null : this.getIsaccount().equals(other.getIsaccount()))
            && (this.getImporter() == null ? other.getImporter() == null : this.getImporter().equals(other.getImporter()))
            && (this.getImporttime() == null ? other.getImporttime() == null : this.getImporttime().equals(other.getImporttime()))
            && (this.getOrientation() == null ? other.getOrientation() == null : this.getOrientation().equals(other.getOrientation()))
            && (this.getPart() == null ? other.getPart() == null : this.getPart().equals(other.getPart()))
            && (this.getPropervalue() == null ? other.getPropervalue() == null : this.getPropervalue().equals(other.getPropervalue()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProstatus() == null ? other.getProstatus() == null : this.getProstatus().equals(other.getProstatus()))
            && (this.getPoiId() == null ? other.getPoiId() == null : this.getPoiId().equals(other.getPoiId()))
            && (this.getOrdx() == null ? other.getOrdx() == null : this.getOrdx().equals(other.getOrdx()))
            && (this.getOrdx1() == null ? other.getOrdx1() == null : this.getOrdx1().equals(other.getOrdx1()))
            && (this.getOrdy() == null ? other.getOrdy() == null : this.getOrdy().equals(other.getOrdy()))
            && (this.getOrdy1() == null ? other.getOrdy1() == null : this.getOrdy1().equals(other.getOrdy1()))
            && (this.getZoneType() == null ? other.getZoneType() == null : this.getZoneType().equals(other.getZoneType()))
            && (this.getAdminDistrict() == null ? other.getAdminDistrict() == null : this.getAdminDistrict().equals(other.getAdminDistrict()))
            && (this.getHouseUsage() == null ? other.getHouseUsage() == null : this.getHouseUsage().equals(other.getHouseUsage()))
            && (this.getUsageTyle() == null ? other.getUsageTyle() == null : this.getUsageTyle().equals(other.getUsageTyle()))
            && (this.getPropertyOwner() == null ? other.getPropertyOwner() == null : this.getPropertyOwner().equals(other.getPropertyOwner()))
            && (this.getYearBuilt() == null ? other.getYearBuilt() == null : this.getYearBuilt().equals(other.getYearBuilt()))
            && (this.getIsDangerousHouse() == null ? other.getIsDangerousHouse() == null : this.getIsDangerousHouse().equals(other.getIsDangerousHouse()))
            && (this.getIsBasement() == null ? other.getIsBasement() == null : this.getIsBasement().equals(other.getIsBasement()))
            && (this.getHouseRight() == null ? other.getHouseRight() == null : this.getHouseRight().equals(other.getHouseRight()))
            && (this.getAssetNo() == null ? other.getAssetNo() == null : this.getAssetNo().equals(other.getAssetNo()))
            && (this.getCertStatus() == null ? other.getCertStatus() == null : this.getCertStatus().equals(other.getCertStatus()))
            && (this.getHistoryid() == null ? other.getHistoryid() == null : this.getHistoryid().equals(other.getHistoryid()))
            && (this.getFilenum() == null ? other.getFilenum() == null : this.getFilenum().equals(other.getFilenum()))
            && (this.getCode1() == null ? other.getCode1() == null : this.getCode1().equals(other.getCode1()))
            && (this.getCode2() == null ? other.getCode2() == null : this.getCode2().equals(other.getCode2()))
            && (this.getCode3() == null ? other.getCode3() == null : this.getCode3().equals(other.getCode3()))
            && (this.getCode4() == null ? other.getCode4() == null : this.getCode4().equals(other.getCode4()))
            && (this.getCode5() == null ? other.getCode5() == null : this.getCode5().equals(other.getCode5()))
            && (this.getCode6() == null ? other.getCode6() == null : this.getCode6().equals(other.getCode6()))
            && (this.getSellDate() == null ? other.getSellDate() == null : this.getSellDate().equals(other.getSellDate()))
            && (this.getPkLand() == null ? other.getPkLand() == null : this.getPkLand().equals(other.getPkLand()))
            && (this.getPkOrgValue() == null ? other.getPkOrgValue() == null : this.getPkOrgValue().equals(other.getPkOrgValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPkHouse() == null) ? 0 : getPkHouse().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getPkProject() == null) ? 0 : getPkProject().hashCode());
        result = prime * result + ((getAddressversion() == null) ? 0 : getAddressversion().hashCode());
        result = prime * result + ((getHousetype() == null) ? 0 : getHousetype().hashCode());
        result = prime * result + ((getOwnerunit() == null) ? 0 : getOwnerunit().hashCode());
        result = prime * result + ((getUserunit() == null) ? 0 : getUserunit().hashCode());
        result = prime * result + ((getBureauunit() == null) ? 0 : getBureauunit().hashCode());
        result = prime * result + ((getStructurearea() == null) ? 0 : getStructurearea().hashCode());
        result = prime * result + ((getUsearea() == null) ? 0 : getUsearea().hashCode());
        result = prime * result + ((getHousestructure() == null) ? 0 : getHousestructure().hashCode());
        result = prime * result + ((getBuildyear() == null) ? 0 : getBuildyear().hashCode());
        result = prime * result + ((getAlllevel() == null) ? 0 : getAlllevel().hashCode());
        result = prime * result + ((getLevels() == null) ? 0 : getLevels().hashCode());
        result = prime * result + ((getUsetype() == null) ? 0 : getUsetype().hashCode());
        result = prime * result + ((getLicensedate() == null) ? 0 : getLicensedate().hashCode());
        result = prime * result + ((getWarrantarea() == null) ? 0 : getWarrantarea().hashCode());
        result = prime * result + ((getOwnershiplicense() == null) ? 0 : getOwnershiplicense().hashCode());
        result = prime * result + ((getFielduse() == null) ? 0 : getFielduse().hashCode());
        result = prime * result + ((getFieldarea() == null) ? 0 : getFieldarea().hashCode());
        result = prime * result + ((getSigntime() == null) ? 0 : getSigntime().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getDr() == null) ? 0 : getDr().hashCode());
        result = prime * result + ((getTs() == null) ? 0 : getTs().hashCode());
        result = prime * result + ((getDef1() == null) ? 0 : getDef1().hashCode());
        result = prime * result + ((getDef2() == null) ? 0 : getDef2().hashCode());
        result = prime * result + ((getDef3() == null) ? 0 : getDef3().hashCode());
        result = prime * result + ((getDef4() == null) ? 0 : getDef4().hashCode());
        result = prime * result + ((getDef5() == null) ? 0 : getDef5().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifitime() == null) ? 0 : getModifitime().hashCode());
        result = prime * result + ((getHousesource() == null) ? 0 : getHousesource().hashCode());
        result = prime * result + ((getInfoall() == null) ? 0 : getInfoall().hashCode());
        result = prime * result + ((getDef6() == null) ? 0 : getDef6().hashCode());
        result = prime * result + ((getDef7() == null) ? 0 : getDef7().hashCode());
        result = prime * result + ((getDef8() == null) ? 0 : getDef8().hashCode());
        result = prime * result + ((getDef9() == null) ? 0 : getDef9().hashCode());
        result = prime * result + ((getDef10() == null) ? 0 : getDef10().hashCode());
        result = prime * result + ((getPkOrg() == null) ? 0 : getPkOrg().hashCode());
        result = prime * result + ((getPkDept() == null) ? 0 : getPkDept().hashCode());
        result = prime * result + ((getIsaccount() == null) ? 0 : getIsaccount().hashCode());
        result = prime * result + ((getImporter() == null) ? 0 : getImporter().hashCode());
        result = prime * result + ((getImporttime() == null) ? 0 : getImporttime().hashCode());
        result = prime * result + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        result = prime * result + ((getPart() == null) ? 0 : getPart().hashCode());
        result = prime * result + ((getPropervalue() == null) ? 0 : getPropervalue().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProstatus() == null) ? 0 : getProstatus().hashCode());
        result = prime * result + ((getPoiId() == null) ? 0 : getPoiId().hashCode());
        result = prime * result + ((getOrdx() == null) ? 0 : getOrdx().hashCode());
        result = prime * result + ((getOrdx1() == null) ? 0 : getOrdx1().hashCode());
        result = prime * result + ((getOrdy() == null) ? 0 : getOrdy().hashCode());
        result = prime * result + ((getOrdy1() == null) ? 0 : getOrdy1().hashCode());
        result = prime * result + ((getZoneType() == null) ? 0 : getZoneType().hashCode());
        result = prime * result + ((getAdminDistrict() == null) ? 0 : getAdminDistrict().hashCode());
        result = prime * result + ((getHouseUsage() == null) ? 0 : getHouseUsage().hashCode());
        result = prime * result + ((getUsageTyle() == null) ? 0 : getUsageTyle().hashCode());
        result = prime * result + ((getPropertyOwner() == null) ? 0 : getPropertyOwner().hashCode());
        result = prime * result + ((getYearBuilt() == null) ? 0 : getYearBuilt().hashCode());
        result = prime * result + ((getIsDangerousHouse() == null) ? 0 : getIsDangerousHouse().hashCode());
        result = prime * result + ((getIsBasement() == null) ? 0 : getIsBasement().hashCode());
        result = prime * result + ((getHouseRight() == null) ? 0 : getHouseRight().hashCode());
        result = prime * result + ((getAssetNo() == null) ? 0 : getAssetNo().hashCode());
        result = prime * result + ((getCertStatus() == null) ? 0 : getCertStatus().hashCode());
        result = prime * result + ((getHistoryid() == null) ? 0 : getHistoryid().hashCode());
        result = prime * result + ((getFilenum() == null) ? 0 : getFilenum().hashCode());
        result = prime * result + ((getCode1() == null) ? 0 : getCode1().hashCode());
        result = prime * result + ((getCode2() == null) ? 0 : getCode2().hashCode());
        result = prime * result + ((getCode3() == null) ? 0 : getCode3().hashCode());
        result = prime * result + ((getCode4() == null) ? 0 : getCode4().hashCode());
        result = prime * result + ((getCode5() == null) ? 0 : getCode5().hashCode());
        result = prime * result + ((getCode6() == null) ? 0 : getCode6().hashCode());
        result = prime * result + ((getSellDate() == null) ? 0 : getSellDate().hashCode());
        result = prime * result + ((getPkLand() == null) ? 0 : getPkLand().hashCode());
        result = prime * result + ((getPkOrgValue() == null) ? 0 : getPkOrgValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pkHouse=").append(pkHouse);
        sb.append(", code=").append(code);
        sb.append(", area=").append(area);
        sb.append(", pkProject=").append(pkProject);
        sb.append(", addressversion=").append(addressversion);
        sb.append(", housetype=").append(housetype);
        sb.append(", ownerunit=").append(ownerunit);
        sb.append(", userunit=").append(userunit);
        sb.append(", bureauunit=").append(bureauunit);
        sb.append(", structurearea=").append(structurearea);
        sb.append(", usearea=").append(usearea);
        sb.append(", housestructure=").append(housestructure);
        sb.append(", buildyear=").append(buildyear);
        sb.append(", alllevel=").append(alllevel);
        sb.append(", levels=").append(levels);
        sb.append(", usetype=").append(usetype);
        sb.append(", licensedate=").append(licensedate);
        sb.append(", warrantarea=").append(warrantarea);
        sb.append(", ownershiplicense=").append(ownershiplicense);
        sb.append(", fielduse=").append(fielduse);
        sb.append(", fieldarea=").append(fieldarea);
        sb.append(", signtime=").append(signtime);
        sb.append(", enable=").append(enable);
        sb.append(", dr=").append(dr);
        sb.append(", ts=").append(ts);
        sb.append(", def1=").append(def1);
        sb.append(", def2=").append(def2);
        sb.append(", def3=").append(def3);
        sb.append(", def4=").append(def4);
        sb.append(", def5=").append(def5);
        sb.append(", creator=").append(creator);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifitime=").append(modifitime);
        sb.append(", housesource=").append(housesource);
        sb.append(", infoall=").append(infoall);
        sb.append(", def6=").append(def6);
        sb.append(", def7=").append(def7);
        sb.append(", def8=").append(def8);
        sb.append(", def9=").append(def9);
        sb.append(", def10=").append(def10);
        sb.append(", pkOrg=").append(pkOrg);
        sb.append(", pkDept=").append(pkDept);
        sb.append(", isaccount=").append(isaccount);
        sb.append(", importer=").append(importer);
        sb.append(", importtime=").append(importtime);
        sb.append(", orientation=").append(orientation);
        sb.append(", part=").append(part);
        sb.append(", propervalue=").append(propervalue);
        sb.append(", status=").append(status);
        sb.append(", prostatus=").append(prostatus);
        sb.append(", poiId=").append(poiId);
        sb.append(", ordx=").append(ordx);
        sb.append(", ordx1=").append(ordx1);
        sb.append(", ordy=").append(ordy);
        sb.append(", ordy1=").append(ordy1);
        sb.append(", zoneType=").append(zoneType);
        sb.append(", adminDistrict=").append(adminDistrict);
        sb.append(", houseUsage=").append(houseUsage);
        sb.append(", usageTyle=").append(usageTyle);
        sb.append(", propertyOwner=").append(propertyOwner);
        sb.append(", yearBuilt=").append(yearBuilt);
        sb.append(", isDangerousHouse=").append(isDangerousHouse);
        sb.append(", isBasement=").append(isBasement);
        sb.append(", houseRight=").append(houseRight);
        sb.append(", assetNo=").append(assetNo);
        sb.append(", certStatus=").append(certStatus);
        sb.append(", historyid=").append(historyid);
        sb.append(", filenum=").append(filenum);
        sb.append(", code1=").append(code1);
        sb.append(", code2=").append(code2);
        sb.append(", code3=").append(code3);
        sb.append(", code4=").append(code4);
        sb.append(", code5=").append(code5);
        sb.append(", code6=").append(code6);
        sb.append(", sellDate=").append(sellDate);
        sb.append(", pkLand=").append(pkLand);
        sb.append(", pkOrgValue=").append(pkOrgValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}