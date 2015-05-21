package com.itwheel.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the C_CUSTOMER database table.
 * 
 */
@Entity
@Table(name="C_CUSTOMER", schema="NEANDS3")
@NamedQuery(name="CCustomer.findAll", query="SELECT c.code,c.description FROM CCustomer c order by c.code asc")
public class CCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String account;

	@Column(name="AD_CLIENT_ID")
	private BigDecimal adClientId;

	@Column(name="AD_ORG_ID")
	private BigDecimal adOrgId;

	private String address;

	private BigDecimal agtretrate;

	private BigDecimal agtsaledis;

	private BigDecimal agtsaleretdis;

	private String areamng;

	@Column(name="AREAMNG_ID")
	private BigDecimal areamngId;

	@Column(name="B_CUSCODE_FORMAT_ID")
	private BigDecimal bCuscodeFormatId;

	@Column(name="BIGAREAMNG_ID")
	private BigDecimal bigareamngId;

	private BigDecimal butsaledis;

	@Column(name="C_AREA_ID")
	private BigDecimal cAreaId;

	@Column(name="C_BIGAREA_ID")
	private BigDecimal cBigareaId;

	@Column(name="C_CITY_ID")
	private BigDecimal cCityId;

	@Column(name="C_CLASSCODE_ID")
	private BigDecimal cClasscodeId;

	@Column(name="C_CONSUMEAREA_ID")
	private BigDecimal cConsumeareaId;

	@Column(name="C_CUSATTRIB1_ID")
	private BigDecimal cCusattrib1Id;

	@Column(name="C_CUSATTRIB10_ID")
	private BigDecimal cCusattrib10Id;

	@Column(name="C_CUSATTRIB11_ID")
	private BigDecimal cCusattrib11Id;

	@Column(name="C_CUSATTRIB12_ID")
	private BigDecimal cCusattrib12Id;

	@Column(name="C_CUSATTRIB13_ID")
	private BigDecimal cCusattrib13Id;

	@Column(name="C_CUSATTRIB14_ID")
	private BigDecimal cCusattrib14Id;

	@Column(name="C_CUSATTRIB15_ID")
	private BigDecimal cCusattrib15Id;

	@Column(name="C_CUSATTRIB16_ID")
	private BigDecimal cCusattrib16Id;

	@Column(name="C_CUSATTRIB17_ID")
	private BigDecimal cCusattrib17Id;

	@Column(name="C_CUSATTRIB18_ID")
	private BigDecimal cCusattrib18Id;

	@Column(name="C_CUSATTRIB19_ID")
	private BigDecimal cCusattrib19Id;

	@Column(name="C_CUSATTRIB2_ID")
	private BigDecimal cCusattrib2Id;

	@Column(name="C_CUSATTRIB20_ID")
	private BigDecimal cCusattrib20Id;

	@Column(name="C_CUSATTRIB3_ID")
	private BigDecimal cCusattrib3Id;

	@Column(name="C_CUSATTRIB4_ID")
	private BigDecimal cCusattrib4Id;

	@Column(name="C_CUSATTRIB5_ID")
	private BigDecimal cCusattrib5Id;

	@Column(name="C_CUSATTRIB6_ID")
	private BigDecimal cCusattrib6Id;

	@Column(name="C_CUSATTRIB7_ID")
	private BigDecimal cCusattrib7Id;

	@Column(name="C_CUSATTRIB8_ID")
	private BigDecimal cCusattrib8Id;

	@Column(name="C_CUSATTRIB9_ID")
	private BigDecimal cCusattrib9Id;

	@Column(name="C_CUSRANK_ID")
	private BigDecimal cCusrankId;

	@Column(name="C_CUSTOMERUP_ID")
	private BigDecimal cCustomerupId;

	@Column(name="C_CUSTYPE_ID")
	private BigDecimal cCustypeId;

	@Column(name="C_DEPART_ID")
	private BigDecimal cDepartId;

	@Column(name="C_DEPARTMENT_ID")
	private BigDecimal cDepartmentId;

	private BigDecimal calculation;

	@Column(name="CAN_AGTSALE")
	private String canAgtsale;

	@Column(name="CAN_BUTSALE")
	private String canButsale;

	@Column(name="CAN_NOTBUTSALE")
	private String canNotbutsale;

	private String code;

	private String contacter;

	@Temporal(TemporalType.DATE)
	private Date creationdate;

	private String description;

	private String email;

	private BigDecimal enterdate;

	private BigDecimal exitdate;

	private BigDecimal feelsale;

	private BigDecimal feeltake;

	private BigDecimal feeremain;

	private BigDecimal feesale;

	private BigDecimal firretrate;

	private BigDecimal firsaledis;

	private BigDecimal firsaleretdis;

	@Column(name="GL_COMPANY")
	private String glCompany;

	private String imgurl1;

	private String imgurl2;

	private String imgurl3;

	private String imgurl4;

	private String imgurl5;

	@Column(name="IS_COSTBRAND")
	private String isCostbrand;

	@Column(name="IS_INTERFACE")
	private String isInterface;

	@Column(name="IS_LEQEE_READ")
	private String isLeqeeRead;

	@Column(name="IS_PASSWORDCHECK")
	private String isPasswordcheck;

	@Column(name="IS_PCK")
	private String isPck;

	@Column(name="IS_READ")
	private BigDecimal isRead;

	@Column(name="IS_RETPUT_PCK")
	private String isRetputPck;

	@Column(name="IS_SALE_PCK")
	private String isSalePck;

	private String isaccount;

	private String isactive;

	private String isautoin;

	private String isautoout;

	private String iscrefund;

	private String isgroup;

	private String iskd;

	private String isperiod;

	private String isstop;

	private String isthird;

	private String legal;

	@Column(name="LEGAL_ID")
	private BigDecimal legalId;

	@Temporal(TemporalType.DATE)
	@Column(name="LEQEE_TIME")
	private Date leqeeTime;

	@Column(name="M_DIM1_ID")
	private BigDecimal mDim1Id;

	@Column(name="M_DIMCUS1_ID")
	private BigDecimal mDimcus1Id;

	@Column(name="M_DIMCUS10_ID")
	private BigDecimal mDimcus10Id;

	@Column(name="M_DIMCUS2_ID")
	private BigDecimal mDimcus2Id;

	@Column(name="M_DIMCUS3_ID")
	private BigDecimal mDimcus3Id;

	@Column(name="M_DIMCUS4_ID")
	private BigDecimal mDimcus4Id;

	@Column(name="M_DIMCUS5_ID")
	private BigDecimal mDimcus5Id;

	@Column(name="M_DIMCUS6_ID")
	private BigDecimal mDimcus6Id;

	@Column(name="M_DIMCUS7_ID")
	private BigDecimal mDimcus7Id;

	@Column(name="M_DIMCUS8_ID")
	private BigDecimal mDimcus8Id;

	@Column(name="M_DIMCUS9_ID")
	private BigDecimal mDimcus9Id;

	private String mobile;

	@Temporal(TemporalType.DATE)
	private Date modifieddate;

	private BigDecimal modifierid;

	private String name;

	@Column(name="OLD_CODE")
	private String oldCode;

	private BigDecimal orderrate;

	private BigDecimal ownerid;

	private String phone;

	private String post;

	private BigDecimal priority;

	private String profitcenter;

	private String remark;

	@Column(name="RET_RATE")
	private BigDecimal retRate;

	private BigDecimal retrate;

	private BigDecimal saledis;

	private String saleinvitem;

	private BigDecimal saleretdis;

	private String smsaccount;

	@Column(name="STORY_STORAGE")
	private String storyStorage;

	private String taxno;

	private BigDecimal trandis;

	public CCustomer() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}

	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getAgtretrate() {
		return this.agtretrate;
	}

	public void setAgtretrate(BigDecimal agtretrate) {
		this.agtretrate = agtretrate;
	}

	public BigDecimal getAgtsaledis() {
		return this.agtsaledis;
	}

	public void setAgtsaledis(BigDecimal agtsaledis) {
		this.agtsaledis = agtsaledis;
	}

	public BigDecimal getAgtsaleretdis() {
		return this.agtsaleretdis;
	}

	public void setAgtsaleretdis(BigDecimal agtsaleretdis) {
		this.agtsaleretdis = agtsaleretdis;
	}

	public String getAreamng() {
		return this.areamng;
	}

	public void setAreamng(String areamng) {
		this.areamng = areamng;
	}

	public BigDecimal getAreamngId() {
		return this.areamngId;
	}

	public void setAreamngId(BigDecimal areamngId) {
		this.areamngId = areamngId;
	}

	public BigDecimal getBCuscodeFormatId() {
		return this.bCuscodeFormatId;
	}

	public void setBCuscodeFormatId(BigDecimal bCuscodeFormatId) {
		this.bCuscodeFormatId = bCuscodeFormatId;
	}

	public BigDecimal getBigareamngId() {
		return this.bigareamngId;
	}

	public void setBigareamngId(BigDecimal bigareamngId) {
		this.bigareamngId = bigareamngId;
	}

	public BigDecimal getButsaledis() {
		return this.butsaledis;
	}

	public void setButsaledis(BigDecimal butsaledis) {
		this.butsaledis = butsaledis;
	}

	public BigDecimal getCAreaId() {
		return this.cAreaId;
	}

	public void setCAreaId(BigDecimal cAreaId) {
		this.cAreaId = cAreaId;
	}

	public BigDecimal getCBigareaId() {
		return this.cBigareaId;
	}

	public void setCBigareaId(BigDecimal cBigareaId) {
		this.cBigareaId = cBigareaId;
	}

	public BigDecimal getCCityId() {
		return this.cCityId;
	}

	public void setCCityId(BigDecimal cCityId) {
		this.cCityId = cCityId;
	}

	public BigDecimal getCClasscodeId() {
		return this.cClasscodeId;
	}

	public void setCClasscodeId(BigDecimal cClasscodeId) {
		this.cClasscodeId = cClasscodeId;
	}

	public BigDecimal getCConsumeareaId() {
		return this.cConsumeareaId;
	}

	public void setCConsumeareaId(BigDecimal cConsumeareaId) {
		this.cConsumeareaId = cConsumeareaId;
	}

	public BigDecimal getCCusattrib1Id() {
		return this.cCusattrib1Id;
	}

	public void setCCusattrib1Id(BigDecimal cCusattrib1Id) {
		this.cCusattrib1Id = cCusattrib1Id;
	}

	public BigDecimal getCCusattrib10Id() {
		return this.cCusattrib10Id;
	}

	public void setCCusattrib10Id(BigDecimal cCusattrib10Id) {
		this.cCusattrib10Id = cCusattrib10Id;
	}

	public BigDecimal getCCusattrib11Id() {
		return this.cCusattrib11Id;
	}

	public void setCCusattrib11Id(BigDecimal cCusattrib11Id) {
		this.cCusattrib11Id = cCusattrib11Id;
	}

	public BigDecimal getCCusattrib12Id() {
		return this.cCusattrib12Id;
	}

	public void setCCusattrib12Id(BigDecimal cCusattrib12Id) {
		this.cCusattrib12Id = cCusattrib12Id;
	}

	public BigDecimal getCCusattrib13Id() {
		return this.cCusattrib13Id;
	}

	public void setCCusattrib13Id(BigDecimal cCusattrib13Id) {
		this.cCusattrib13Id = cCusattrib13Id;
	}

	public BigDecimal getCCusattrib14Id() {
		return this.cCusattrib14Id;
	}

	public void setCCusattrib14Id(BigDecimal cCusattrib14Id) {
		this.cCusattrib14Id = cCusattrib14Id;
	}

	public BigDecimal getCCusattrib15Id() {
		return this.cCusattrib15Id;
	}

	public void setCCusattrib15Id(BigDecimal cCusattrib15Id) {
		this.cCusattrib15Id = cCusattrib15Id;
	}

	public BigDecimal getCCusattrib16Id() {
		return this.cCusattrib16Id;
	}

	public void setCCusattrib16Id(BigDecimal cCusattrib16Id) {
		this.cCusattrib16Id = cCusattrib16Id;
	}

	public BigDecimal getCCusattrib17Id() {
		return this.cCusattrib17Id;
	}

	public void setCCusattrib17Id(BigDecimal cCusattrib17Id) {
		this.cCusattrib17Id = cCusattrib17Id;
	}

	public BigDecimal getCCusattrib18Id() {
		return this.cCusattrib18Id;
	}

	public void setCCusattrib18Id(BigDecimal cCusattrib18Id) {
		this.cCusattrib18Id = cCusattrib18Id;
	}

	public BigDecimal getCCusattrib19Id() {
		return this.cCusattrib19Id;
	}

	public void setCCusattrib19Id(BigDecimal cCusattrib19Id) {
		this.cCusattrib19Id = cCusattrib19Id;
	}

	public BigDecimal getCCusattrib2Id() {
		return this.cCusattrib2Id;
	}

	public void setCCusattrib2Id(BigDecimal cCusattrib2Id) {
		this.cCusattrib2Id = cCusattrib2Id;
	}

	public BigDecimal getCCusattrib20Id() {
		return this.cCusattrib20Id;
	}

	public void setCCusattrib20Id(BigDecimal cCusattrib20Id) {
		this.cCusattrib20Id = cCusattrib20Id;
	}

	public BigDecimal getCCusattrib3Id() {
		return this.cCusattrib3Id;
	}

	public void setCCusattrib3Id(BigDecimal cCusattrib3Id) {
		this.cCusattrib3Id = cCusattrib3Id;
	}

	public BigDecimal getCCusattrib4Id() {
		return this.cCusattrib4Id;
	}

	public void setCCusattrib4Id(BigDecimal cCusattrib4Id) {
		this.cCusattrib4Id = cCusattrib4Id;
	}

	public BigDecimal getCCusattrib5Id() {
		return this.cCusattrib5Id;
	}

	public void setCCusattrib5Id(BigDecimal cCusattrib5Id) {
		this.cCusattrib5Id = cCusattrib5Id;
	}

	public BigDecimal getCCusattrib6Id() {
		return this.cCusattrib6Id;
	}

	public void setCCusattrib6Id(BigDecimal cCusattrib6Id) {
		this.cCusattrib6Id = cCusattrib6Id;
	}

	public BigDecimal getCCusattrib7Id() {
		return this.cCusattrib7Id;
	}

	public void setCCusattrib7Id(BigDecimal cCusattrib7Id) {
		this.cCusattrib7Id = cCusattrib7Id;
	}

	public BigDecimal getCCusattrib8Id() {
		return this.cCusattrib8Id;
	}

	public void setCCusattrib8Id(BigDecimal cCusattrib8Id) {
		this.cCusattrib8Id = cCusattrib8Id;
	}

	public BigDecimal getCCusattrib9Id() {
		return this.cCusattrib9Id;
	}

	public void setCCusattrib9Id(BigDecimal cCusattrib9Id) {
		this.cCusattrib9Id = cCusattrib9Id;
	}

	public BigDecimal getCCusrankId() {
		return this.cCusrankId;
	}

	public void setCCusrankId(BigDecimal cCusrankId) {
		this.cCusrankId = cCusrankId;
	}

	public BigDecimal getCCustomerupId() {
		return this.cCustomerupId;
	}

	public void setCCustomerupId(BigDecimal cCustomerupId) {
		this.cCustomerupId = cCustomerupId;
	}

	public BigDecimal getCCustypeId() {
		return this.cCustypeId;
	}

	public void setCCustypeId(BigDecimal cCustypeId) {
		this.cCustypeId = cCustypeId;
	}

	public BigDecimal getCDepartId() {
		return this.cDepartId;
	}

	public void setCDepartId(BigDecimal cDepartId) {
		this.cDepartId = cDepartId;
	}

	public BigDecimal getCDepartmentId() {
		return this.cDepartmentId;
	}

	public void setCDepartmentId(BigDecimal cDepartmentId) {
		this.cDepartmentId = cDepartmentId;
	}

	public BigDecimal getCalculation() {
		return this.calculation;
	}

	public void setCalculation(BigDecimal calculation) {
		this.calculation = calculation;
	}

	public String getCanAgtsale() {
		return this.canAgtsale;
	}

	public void setCanAgtsale(String canAgtsale) {
		this.canAgtsale = canAgtsale;
	}

	public String getCanButsale() {
		return this.canButsale;
	}

	public void setCanButsale(String canButsale) {
		this.canButsale = canButsale;
	}

	public String getCanNotbutsale() {
		return this.canNotbutsale;
	}

	public void setCanNotbutsale(String canNotbutsale) {
		this.canNotbutsale = canNotbutsale;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContacter() {
		return this.contacter;
	}

	public void setContacter(String contacter) {
		this.contacter = contacter;
	}

	public Date getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getEnterdate() {
		return this.enterdate;
	}

	public void setEnterdate(BigDecimal enterdate) {
		this.enterdate = enterdate;
	}

	public BigDecimal getExitdate() {
		return this.exitdate;
	}

	public void setExitdate(BigDecimal exitdate) {
		this.exitdate = exitdate;
	}

	public BigDecimal getFeelsale() {
		return this.feelsale;
	}

	public void setFeelsale(BigDecimal feelsale) {
		this.feelsale = feelsale;
	}

	public BigDecimal getFeeltake() {
		return this.feeltake;
	}

	public void setFeeltake(BigDecimal feeltake) {
		this.feeltake = feeltake;
	}

	public BigDecimal getFeeremain() {
		return this.feeremain;
	}

	public void setFeeremain(BigDecimal feeremain) {
		this.feeremain = feeremain;
	}

	public BigDecimal getFeesale() {
		return this.feesale;
	}

	public void setFeesale(BigDecimal feesale) {
		this.feesale = feesale;
	}

	public BigDecimal getFirretrate() {
		return this.firretrate;
	}

	public void setFirretrate(BigDecimal firretrate) {
		this.firretrate = firretrate;
	}

	public BigDecimal getFirsaledis() {
		return this.firsaledis;
	}

	public void setFirsaledis(BigDecimal firsaledis) {
		this.firsaledis = firsaledis;
	}

	public BigDecimal getFirsaleretdis() {
		return this.firsaleretdis;
	}

	public void setFirsaleretdis(BigDecimal firsaleretdis) {
		this.firsaleretdis = firsaleretdis;
	}

	public String getGlCompany() {
		return this.glCompany;
	}

	public void setGlCompany(String glCompany) {
		this.glCompany = glCompany;
	}

	public String getImgurl1() {
		return this.imgurl1;
	}

	public void setImgurl1(String imgurl1) {
		this.imgurl1 = imgurl1;
	}

	public String getImgurl2() {
		return this.imgurl2;
	}

	public void setImgurl2(String imgurl2) {
		this.imgurl2 = imgurl2;
	}

	public String getImgurl3() {
		return this.imgurl3;
	}

	public void setImgurl3(String imgurl3) {
		this.imgurl3 = imgurl3;
	}

	public String getImgurl4() {
		return this.imgurl4;
	}

	public void setImgurl4(String imgurl4) {
		this.imgurl4 = imgurl4;
	}

	public String getImgurl5() {
		return this.imgurl5;
	}

	public void setImgurl5(String imgurl5) {
		this.imgurl5 = imgurl5;
	}

	public String getIsCostbrand() {
		return this.isCostbrand;
	}

	public void setIsCostbrand(String isCostbrand) {
		this.isCostbrand = isCostbrand;
	}

	public String getIsInterface() {
		return this.isInterface;
	}

	public void setIsInterface(String isInterface) {
		this.isInterface = isInterface;
	}

	public String getIsLeqeeRead() {
		return this.isLeqeeRead;
	}

	public void setIsLeqeeRead(String isLeqeeRead) {
		this.isLeqeeRead = isLeqeeRead;
	}

	public String getIsPasswordcheck() {
		return this.isPasswordcheck;
	}

	public void setIsPasswordcheck(String isPasswordcheck) {
		this.isPasswordcheck = isPasswordcheck;
	}

	public String getIsPck() {
		return this.isPck;
	}

	public void setIsPck(String isPck) {
		this.isPck = isPck;
	}

	public BigDecimal getIsRead() {
		return this.isRead;
	}

	public void setIsRead(BigDecimal isRead) {
		this.isRead = isRead;
	}

	public String getIsRetputPck() {
		return this.isRetputPck;
	}

	public void setIsRetputPck(String isRetputPck) {
		this.isRetputPck = isRetputPck;
	}

	public String getIsSalePck() {
		return this.isSalePck;
	}

	public void setIsSalePck(String isSalePck) {
		this.isSalePck = isSalePck;
	}

	public String getIsaccount() {
		return this.isaccount;
	}

	public void setIsaccount(String isaccount) {
		this.isaccount = isaccount;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsautoin() {
		return this.isautoin;
	}

	public void setIsautoin(String isautoin) {
		this.isautoin = isautoin;
	}

	public String getIsautoout() {
		return this.isautoout;
	}

	public void setIsautoout(String isautoout) {
		this.isautoout = isautoout;
	}

	public String getIscrefund() {
		return this.iscrefund;
	}

	public void setIscrefund(String iscrefund) {
		this.iscrefund = iscrefund;
	}

	public String getIsgroup() {
		return this.isgroup;
	}

	public void setIsgroup(String isgroup) {
		this.isgroup = isgroup;
	}

	public String getIskd() {
		return this.iskd;
	}

	public void setIskd(String iskd) {
		this.iskd = iskd;
	}

	public String getIsperiod() {
		return this.isperiod;
	}

	public void setIsperiod(String isperiod) {
		this.isperiod = isperiod;
	}

	public String getIsstop() {
		return this.isstop;
	}

	public void setIsstop(String isstop) {
		this.isstop = isstop;
	}

	public String getIsthird() {
		return this.isthird;
	}

	public void setIsthird(String isthird) {
		this.isthird = isthird;
	}

	public String getLegal() {
		return this.legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	public BigDecimal getLegalId() {
		return this.legalId;
	}

	public void setLegalId(BigDecimal legalId) {
		this.legalId = legalId;
	}

	public Date getLeqeeTime() {
		return this.leqeeTime;
	}

	public void setLeqeeTime(Date leqeeTime) {
		this.leqeeTime = leqeeTime;
	}

	public BigDecimal getMDim1Id() {
		return this.mDim1Id;
	}

	public void setMDim1Id(BigDecimal mDim1Id) {
		this.mDim1Id = mDim1Id;
	}

	public BigDecimal getMDimcus1Id() {
		return this.mDimcus1Id;
	}

	public void setMDimcus1Id(BigDecimal mDimcus1Id) {
		this.mDimcus1Id = mDimcus1Id;
	}

	public BigDecimal getMDimcus10Id() {
		return this.mDimcus10Id;
	}

	public void setMDimcus10Id(BigDecimal mDimcus10Id) {
		this.mDimcus10Id = mDimcus10Id;
	}

	public BigDecimal getMDimcus2Id() {
		return this.mDimcus2Id;
	}

	public void setMDimcus2Id(BigDecimal mDimcus2Id) {
		this.mDimcus2Id = mDimcus2Id;
	}

	public BigDecimal getMDimcus3Id() {
		return this.mDimcus3Id;
	}

	public void setMDimcus3Id(BigDecimal mDimcus3Id) {
		this.mDimcus3Id = mDimcus3Id;
	}

	public BigDecimal getMDimcus4Id() {
		return this.mDimcus4Id;
	}

	public void setMDimcus4Id(BigDecimal mDimcus4Id) {
		this.mDimcus4Id = mDimcus4Id;
	}

	public BigDecimal getMDimcus5Id() {
		return this.mDimcus5Id;
	}

	public void setMDimcus5Id(BigDecimal mDimcus5Id) {
		this.mDimcus5Id = mDimcus5Id;
	}

	public BigDecimal getMDimcus6Id() {
		return this.mDimcus6Id;
	}

	public void setMDimcus6Id(BigDecimal mDimcus6Id) {
		this.mDimcus6Id = mDimcus6Id;
	}

	public BigDecimal getMDimcus7Id() {
		return this.mDimcus7Id;
	}

	public void setMDimcus7Id(BigDecimal mDimcus7Id) {
		this.mDimcus7Id = mDimcus7Id;
	}

	public BigDecimal getMDimcus8Id() {
		return this.mDimcus8Id;
	}

	public void setMDimcus8Id(BigDecimal mDimcus8Id) {
		this.mDimcus8Id = mDimcus8Id;
	}

	public BigDecimal getMDimcus9Id() {
		return this.mDimcus9Id;
	}

	public void setMDimcus9Id(BigDecimal mDimcus9Id) {
		this.mDimcus9Id = mDimcus9Id;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	public BigDecimal getModifierid() {
		return this.modifierid;
	}

	public void setModifierid(BigDecimal modifierid) {
		this.modifierid = modifierid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOldCode() {
		return this.oldCode;
	}

	public void setOldCode(String oldCode) {
		this.oldCode = oldCode;
	}

	public BigDecimal getOrderrate() {
		return this.orderrate;
	}

	public void setOrderrate(BigDecimal orderrate) {
		this.orderrate = orderrate;
	}

	public BigDecimal getOwnerid() {
		return this.ownerid;
	}

	public void setOwnerid(BigDecimal ownerid) {
		this.ownerid = ownerid;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	public String getProfitcenter() {
		return this.profitcenter;
	}

	public void setProfitcenter(String profitcenter) {
		this.profitcenter = profitcenter;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getRetRate() {
		return this.retRate;
	}

	public void setRetRate(BigDecimal retRate) {
		this.retRate = retRate;
	}

	public BigDecimal getRetrate() {
		return this.retrate;
	}

	public void setRetrate(BigDecimal retrate) {
		this.retrate = retrate;
	}

	public BigDecimal getSaledis() {
		return this.saledis;
	}

	public void setSaledis(BigDecimal saledis) {
		this.saledis = saledis;
	}

	public String getSaleinvitem() {
		return this.saleinvitem;
	}

	public void setSaleinvitem(String saleinvitem) {
		this.saleinvitem = saleinvitem;
	}

	public BigDecimal getSaleretdis() {
		return this.saleretdis;
	}

	public void setSaleretdis(BigDecimal saleretdis) {
		this.saleretdis = saleretdis;
	}

	public String getSmsaccount() {
		return this.smsaccount;
	}

	public void setSmsaccount(String smsaccount) {
		this.smsaccount = smsaccount;
	}

	public String getStoryStorage() {
		return this.storyStorage;
	}

	public void setStoryStorage(String storyStorage) {
		this.storyStorage = storyStorage;
	}

	public String getTaxno() {
		return this.taxno;
	}

	public void setTaxno(String taxno) {
		this.taxno = taxno;
	}

	public BigDecimal getTrandis() {
		return this.trandis;
	}

	public void setTrandis(BigDecimal trandis) {
		this.trandis = trandis;
	}

}