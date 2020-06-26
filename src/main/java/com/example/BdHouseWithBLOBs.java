package com.example;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class BdHouseWithBLOBs extends BdHouse implements Serializable {
    /**
     * 地址

     */
    private String address;

    /**
     * 房产证号
1
     */
    private String licenseno;

    /**
     * 土地证号
1
     */
    private String fieldno;

    /**
     * 备注

     */
    private String vnote;

    /**
     * 房产证号
2
     */
    private String licenseno2;

    /**
     * 房产证号
3
     */
    private String licenseno3;

    /**
     * 土地证号
2
     */
    private String fieldno2;

    /**
     * 土地证号
3
     */
    private String fieldno3;

    /**
     * 真实地址
     */
    private String addresspath;

    /**
     * poi端点集合
     */
    private String pois;

    /**
     * 不动产证号
     */
    private String impropertyno;

    /**
     * 原使用单位
     */
    private String oldUnit;

    /**
     * 使用人-单位
     */
    private String useUnit;

    private static final long serialVersionUID = 1L;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseno() {
        return licenseno;
    }

    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    public String getFieldno() {
        return fieldno;
    }

    public void setFieldno(String fieldno) {
        this.fieldno = fieldno;
    }

    public String getVnote() {
        return vnote;
    }

    public void setVnote(String vnote) {
        this.vnote = vnote;
    }

    public String getLicenseno2() {
        return licenseno2;
    }

    public void setLicenseno2(String licenseno2) {
        this.licenseno2 = licenseno2;
    }

    public String getLicenseno3() {
        return licenseno3;
    }

    public void setLicenseno3(String licenseno3) {
        this.licenseno3 = licenseno3;
    }

    public String getFieldno2() {
        return fieldno2;
    }

    public void setFieldno2(String fieldno2) {
        this.fieldno2 = fieldno2;
    }

    public String getFieldno3() {
        return fieldno3;
    }

    public void setFieldno3(String fieldno3) {
        this.fieldno3 = fieldno3;
    }

    public String getAddresspath() {
        return addresspath;
    }

    public void setAddresspath(String addresspath) {
        this.addresspath = addresspath;
    }

    public String getPois() {
        return pois;
    }

    public void setPois(String pois) {
        this.pois = pois;
    }

    public String getImpropertyno() {
        return impropertyno;
    }

    public void setImpropertyno(String impropertyno) {
        this.impropertyno = impropertyno;
    }

    public String getOldUnit() {
        return oldUnit;
    }

    public void setOldUnit(String oldUnit) {
        this.oldUnit = oldUnit;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
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
        BdHouseWithBLOBs other = (BdHouseWithBLOBs) that;
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
            && (this.getPkOrgValue() == null ? other.getPkOrgValue() == null : this.getPkOrgValue().equals(other.getPkOrgValue()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLicenseno() == null ? other.getLicenseno() == null : this.getLicenseno().equals(other.getLicenseno()))
            && (this.getFieldno() == null ? other.getFieldno() == null : this.getFieldno().equals(other.getFieldno()))
            && (this.getVnote() == null ? other.getVnote() == null : this.getVnote().equals(other.getVnote()))
            && (this.getLicenseno2() == null ? other.getLicenseno2() == null : this.getLicenseno2().equals(other.getLicenseno2()))
            && (this.getLicenseno3() == null ? other.getLicenseno3() == null : this.getLicenseno3().equals(other.getLicenseno3()))
            && (this.getFieldno2() == null ? other.getFieldno2() == null : this.getFieldno2().equals(other.getFieldno2()))
            && (this.getFieldno3() == null ? other.getFieldno3() == null : this.getFieldno3().equals(other.getFieldno3()))
            && (this.getAddresspath() == null ? other.getAddresspath() == null : this.getAddresspath().equals(other.getAddresspath()))
            && (this.getPois() == null ? other.getPois() == null : this.getPois().equals(other.getPois()))
            && (this.getImpropertyno() == null ? other.getImpropertyno() == null : this.getImpropertyno().equals(other.getImpropertyno()))
            && (this.getOldUnit() == null ? other.getOldUnit() == null : this.getOldUnit().equals(other.getOldUnit()))
            && (this.getUseUnit() == null ? other.getUseUnit() == null : this.getUseUnit().equals(other.getUseUnit()));
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
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLicenseno() == null) ? 0 : getLicenseno().hashCode());
        result = prime * result + ((getFieldno() == null) ? 0 : getFieldno().hashCode());
        result = prime * result + ((getVnote() == null) ? 0 : getVnote().hashCode());
        result = prime * result + ((getLicenseno2() == null) ? 0 : getLicenseno2().hashCode());
        result = prime * result + ((getLicenseno3() == null) ? 0 : getLicenseno3().hashCode());
        result = prime * result + ((getFieldno2() == null) ? 0 : getFieldno2().hashCode());
        result = prime * result + ((getFieldno3() == null) ? 0 : getFieldno3().hashCode());
        result = prime * result + ((getAddresspath() == null) ? 0 : getAddresspath().hashCode());
        result = prime * result + ((getPois() == null) ? 0 : getPois().hashCode());
        result = prime * result + ((getImpropertyno() == null) ? 0 : getImpropertyno().hashCode());
        result = prime * result + ((getOldUnit() == null) ? 0 : getOldUnit().hashCode());
        result = prime * result + ((getUseUnit() == null) ? 0 : getUseUnit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", address=").append(address);
        sb.append(", licenseno=").append(licenseno);
        sb.append(", fieldno=").append(fieldno);
        sb.append(", vnote=").append(vnote);
        sb.append(", licenseno2=").append(licenseno2);
        sb.append(", licenseno3=").append(licenseno3);
        sb.append(", fieldno2=").append(fieldno2);
        sb.append(", fieldno3=").append(fieldno3);
        sb.append(", addresspath=").append(addresspath);
        sb.append(", pois=").append(pois);
        sb.append(", impropertyno=").append(impropertyno);
        sb.append(", oldUnit=").append(oldUnit);
        sb.append(", useUnit=").append(useUnit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}