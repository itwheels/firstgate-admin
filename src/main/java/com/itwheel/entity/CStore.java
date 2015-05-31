package com.itwheel.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the C_STORE database table.
 * 
 */
@Entity
@Table(name="C_STORE", schema="NEANDS3")
@NamedQuery(name="CStore.findAll", query="SELECT c FROM CStore c")
public class CStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String accdate;

	private String accessories;

	private String accperiod;

	@Column(name="AD_CLIENT_ID")
	private BigDecimal adClientId;

	@Column(name="AD_ORG_ID")
	private BigDecimal adOrgId;

	private String address;

	@Column(name="ALIPAY_KEY")
	private String alipayKey;

	@Column(name="ALIPAY_PARTNERID")
	private String alipayPartnerid;

	@Column(name="ALIPAY_SELL_MAIL")
	private String alipaySellMail;

	private String areamng;

	@Column(name="AREAMNG_ID")
	private BigDecimal areamngId;

	@Column(name="B_STORECODE_FORMAT_ID")
	private BigDecimal bStorecodeFormatId;

	@Column(name="BIGAREAMNG_ID")
	private BigDecimal bigareamngId;

	@Column(name="BILLDATE_FRIST")
	private BigDecimal billdateFrist;

	private String billdaterange;

	private String billperiod;

	private BigDecimal breakeven;

	@Column(name="BREAKEVEN_INFO")
	private String breakevenInfo;

	@Column(name="C_ADDRESS_ID")
	private BigDecimal cAddressId;

	@Column(name="C_AREA_ID")
	private BigDecimal cAreaId;

	@Column(name="C_BIGAREA_ID")
	private BigDecimal cBigareaId;

	@Column(name="C_BIGCITY_ID")
	private BigDecimal cBigcityId;

	@Column(name="C_BLOCK_ID")
	private BigDecimal cBlockId;

	@Column(name="C_CITY_ID")
	private BigDecimal cCityId;

	@Column(name="C_CLASS_ID")
	private BigDecimal cClassId;

	@Column(name="C_CLASSCODE_ID")
	private BigDecimal cClasscodeId;

	@Column(name="C_CLOSEREASON_ID")
	private BigDecimal cClosereasonId;

	@Column(name="C_CONSUMEAREA_ID")
	private BigDecimal cConsumeareaId;

	@ManyToOne
	@JoinColumn(name = "C_CUSTOMER_ID")
	private CCustomer customer;

	@Column(name="C_CUSTOMERUP_ID")
	private BigDecimal cCustomerupId;

	@Column(name="C_DEPART_ID")
	private BigDecimal cDepartId;

	@Column(name="C_DEPARTMENT_ID")
	private BigDecimal cDepartmentId;

	@Column(name="C_EXPRESSCITY_ID")
	private BigDecimal cExpresscityId;

	@Column(name="C_EXPRESSCOMPANY_ID")
	private BigDecimal cExpresscompanyId;

	@Column(name="C_INTEGRALAREA_ID")
	private BigDecimal cIntegralareaId;

	@Column(name="C_LISTORE_ID")
	private BigDecimal cListoreId;

	@Column(name="C_MARKBALTYPE_ID")
	private BigDecimal cMarkbaltypeId;

	@Column(name="C_PAYWAY_DEFAULT")
	private BigDecimal cPaywayDefault;

	@Lob
	@Column(name="C_PAYWAY_FILTER")
	private String cPaywayFilter;

	@Column(name="C_PERIODAREA_ID")
	private BigDecimal cPeriodareaId;

	@Column(name="C_POSADDR_ID")
	private BigDecimal cPosaddrId;

	@Column(name="C_PRICEAREA_ID")
	private BigDecimal cPriceareaId;

	@Column(name="C_PROVINCE_ID")
	private BigDecimal cProvinceId;

	@Column(name="C_STAND_ID")
	private BigDecimal cStandId;

	@Column(name="C_STORE_ID")
	private BigDecimal cStoreId;

	@Column(name="C_STORE_SQL")
	private String cStoreSql;

	@Column(name="C_STOREATTRIB1_ID")
	private BigDecimal cStoreattrib1Id;

	@Column(name="C_STOREATTRIB10_ID")
	private BigDecimal cStoreattrib10Id;

	@Column(name="C_STOREATTRIB11_ID")
	private BigDecimal cStoreattrib11Id;

	@Column(name="C_STOREATTRIB12_ID")
	private BigDecimal cStoreattrib12Id;

	@Column(name="C_STOREATTRIB13_ID")
	private BigDecimal cStoreattrib13Id;

	@Column(name="C_STOREATTRIB14_ID")
	private BigDecimal cStoreattrib14Id;

	@Column(name="C_STOREATTRIB15_ID")
	private BigDecimal cStoreattrib15Id;

	@Column(name="C_STOREATTRIB16_ID")
	private BigDecimal cStoreattrib16Id;

	@Column(name="C_STOREATTRIB17_ID")
	private BigDecimal cStoreattrib17Id;

	@Column(name="C_STOREATTRIB18_ID")
	private BigDecimal cStoreattrib18Id;

	@Column(name="C_STOREATTRIB19_ID")
	private BigDecimal cStoreattrib19Id;

	@Column(name="C_STOREATTRIB2_ID")
	private BigDecimal cStoreattrib2Id;

	@Column(name="C_STOREATTRIB20_ID")
	private BigDecimal cStoreattrib20Id;

	@Column(name="C_STOREATTRIB3_ID")
	private BigDecimal cStoreattrib3Id;

	@Column(name="C_STOREATTRIB4_ID")
	private BigDecimal cStoreattrib4Id;

	@Column(name="C_STOREATTRIB5_ID")
	private BigDecimal cStoreattrib5Id;

	@Column(name="C_STOREATTRIB6_ID")
	private BigDecimal cStoreattrib6Id;

	@Column(name="C_STOREATTRIB7_ID")
	private BigDecimal cStoreattrib7Id;

	@Column(name="C_STOREATTRIB8_ID")
	private BigDecimal cStoreattrib8Id;

	@Column(name="C_STOREATTRIB9_ID")
	private BigDecimal cStoreattrib9Id;

	@Column(name="C_STOREGRADE_ID")
	private BigDecimal cStoregradeId;

	@Column(name="C_STOREKIND_ID")
	private BigDecimal cStorekindId;

	@Column(name="C_STORETYPE")
	private String cStoretype;

	@Column(name="C_STORETYPE_JZ_ID")
	private BigDecimal cStoretypeJzId;

	@Column(name="C_UFBLOCK_ID")
	private BigDecimal cUfblockId;

	private String calculation;

	private String capacity;

	private String carrier;

	private String carrier2;

	private String catalogcode;

	private String catalogname;

	private String catalogup;

	private BigDecimal checkdate;

	private String checkperiod;

	@Column(name="CHK_OVERDAYS")
	private BigDecimal chkOverdays;

	private BigDecimal chkday;

	private String clienttype;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSE_DATE")
	private Date closeDate;

	private String code;

	private BigDecimal comptype;

	private BigDecimal comrentend;

	private BigDecimal constate;

	private String contactor;

	@Column(name="CONTACTOR_ID")
	private BigDecimal contactorId;

	private String countercode;

	@Temporal(TemporalType.DATE)
	private Date creationdate;

	private BigDecimal datebeg;

	private BigDecimal dateblock;

	private BigDecimal dateend;

	@Column(name="DEC_BEGINDATE")
	private BigDecimal decBegindate;

	@Column(name="DEC_ENDDATE")
	private BigDecimal decEnddate;

	private String description;

	@Lob
	@Column(name="DIM1_FILTER")
	private String dim1Filter;

	private BigDecimal discount;

	@Column(name="DRAW_INVOICE_EMPID")
	private BigDecimal drawInvoiceEmpid;

	private BigDecimal empcnt;

	private String fax;

	private String golf;

	@Column(name="HIGH_SKU")
	private BigDecimal highSku;

	@Column(name="HIGH_STORAGE")
	private BigDecimal highStorage;

	private String ifeffect;

	private String iforderstore;

	private String ifstock;

	private String imgurl1;

	private String imgurl2;

	private String imgurl3;

	private String imgurl4;

	private String imgurl5;

	@Column(name="IMP_MONTH")
	private BigDecimal impMonth;

	@Column(name="IMP_TYPE1")
	private BigDecimal impType1;

	@Column(name="IMP_TYPE2")
	private BigDecimal impType2;

	@Column(name="IMP_TYPE3")
	private BigDecimal impType3;

	private String insidecode;

	@Column(name="INVOICE_ACCOUNT")
	private String invoiceAccount;

	@Column(name="INVOICE_ADDR")
	private String invoiceAddr;

	@Column(name="INVOICE_BANK")
	private String invoiceBank;

	@Column(name="INVOICE_COM")
	private String invoiceCom;

	@Column(name="INVOICE_PHONE")
	private String invoicePhone;

	@Column(name="INVOICE_TAXNO")
	private String invoiceTaxno;

	private String invoicedate;

	@Column(name="IS_ALLPAYWAY")
	private String isAllpayway;

	@Column(name="IS_AUTOACCOUNT")
	private String isAutoaccount;

	@Column(name="IS_AUTOINTLACCOUNT")
	private String isAutointlaccount;

	@Column(name="IS_CHECKALIAS")
	private String isCheckalias;

	@Column(name="IS_CONSIGN")
	private String isConsign;

	@Column(name="IS_COUNTER")
	private String isCounter;

	@Column(name="IS_CREATEDATA")
	private String isCreatedata;

	@Column(name="IS_EXCSTORE")
	private String isExcstore;

	@Column(name="IS_ICHIBAN")
	private String isIchiban;

	@Column(name="IS_LEQEE_READ")
	private String isLeqeeRead;

	@Column(name="IS_MANUALINT")
	private String isManualint;

	@Column(name="IS_MARKETNO")
	private String isMarketno;

	@Column(name="IS_MODIFYPAYAMT")
	private String isModifypayamt;

	@Column(name="IS_MORESALESREP")
	private String isMoresalesrep;

	//private BigDecimal isRead;

	@Column(name="IS_RET")
	private String isRet;

	@Column(name="IS_TAOBAO")
	private String isTaobao;

	@Column(name="IS_TEST")
	private String isTest;

	@Column(name="IS_TOWMS")
	private String isTowms;

	@Column(name="IS_WMSSTORE")
	private String isWmsstore;

	private String isactive;

	private String isblock;

	private String iscenter;

	private String isdiscom;

	private String isfairorig;

	private String isfictitious;

	private String isflag;

	private String isgift;

	private String isjoin;

	private String ismark;

	private String isnegative;

	private String isonlycard;

	private String isretail;

	private String isstop;

	private String istax;

	private String isufstore;

	private String isvipdis;

	private String isvipintl;

	@Column(name="IT_EMP")
	private String itEmp;

	@Column(name="IT_PHONE")
	private BigDecimal itPhone;

	private String kids;

	private String ladies;

	@Temporal(TemporalType.DATE)
	@Column(name="LEQEE_TIME")
	private Date leqeeTime;

	private String license;

	private BigDecimal limitamt;

	private String limitmo;

	private BigDecimal limitqty;

	private BigDecimal lockcash;

	@Column(name="LOWER_SKU")
	private BigDecimal lowerSku;

	@Column(name="LOWER_STORAGE")
	private BigDecimal lowerStorage;

	@Column(name="LOWEST_DISCOUNT")
	private String lowestDiscount;

	@Column(name="M_BREAKEVEN")
	private BigDecimal mBreakeven;

	@Column(name="M_DIM1_ID")
	private BigDecimal mDim1Id;

	private BigDecimal markdis;

	private String market;

	//private BigDecimal marketdate;

	@Column(name="MAX_STORAGE")
	private BigDecimal maxStorage;

	private String mens;

	@Column(name="MIN_STORAGE")
	private BigDecimal minStorage;

	private String mobil;

	@Temporal(TemporalType.DATE)
	private Date modifieddate;

	private BigDecimal modifierid;

	private BigDecimal monthfee;

	private BigDecimal movstate;

	private String name;

	@Column(name="NC_ACCOUNT_ID")
	private BigDecimal ncAccountId;

	@Column(name="NC_ACCOUNTUP_ID")
	private BigDecimal ncAccountupId;

	@Column(name="OLD_STORENAME")
	private String oldStorename;

	@Temporal(TemporalType.DATE)
	@Column(name="OPEN_DATE")
	private Date openDate;

	private String openremark;

	private BigDecimal orderlimitdate;

	private BigDecimal ownerid;

	private String performance;

	private String phone;

	@Column(name="POS_CNT")
	private BigDecimal posCnt;

	private String posprint;

	private String pospw;

	private BigDecimal postcal;

	private BigDecimal priority;

	private String profitcenter;

	private BigDecimal proportion;

	private String purautostay;

	private String registeraddr;

	private String registername;

	private String remark;

	private BigDecimal rentbegin;

	private BigDecimal rentend;

	private String retchkorg;

	@Column(name="SALE_AREA")
	private BigDecimal saleArea;

	@Column(name="SHOP_RECEIVE_TYPE")
	private BigDecimal shopReceiveType;

	private String sname;

	private String srccode;

	private String state;

	private BigDecimal state1;

	private BigDecimal state2;

	private BigDecimal state3;

	@Column(name="STORE_AREA")
	private BigDecimal storeArea;

	private BigDecimal storesign;

	private String supervise;

	@Column(name="SUPERVISE_PHONE")
	private BigDecimal supervisePhone;

	private BigDecimal taxrate;

	@Column(name="TDEFDOWNTYPE_ID")
	private BigDecimal tdefdowntypeId;

	@Column(name="TOT_AMT_BOND")
	private BigDecimal totAmtBond;

	private String upid;

	private String usbkey;

	@Column(name="VIRTUAL_PERIODATE")
	private BigDecimal virtualPeriodate;

	@Column(name="WEBPOS_OFFLINE")
	private String webposOffline;

	private String webposloginurl;

	@Column(name="WMS_CONTRAN_STORE")
	private BigDecimal wmsContranStore;

	@Column(name="WMS_STORECODE")
	private String wmsStorecode;

	//bi-directional many-to-one association to CStore
	@ManyToOne
	@JoinColumn(name="WMS_CONTROLSTORE_ID")
	private CStore CStore;

	//bi-directional many-to-one association to CStore
	@OneToMany(mappedBy="CStore")
	private List<CStore> CStores;

	public CStore() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccdate() {
		return this.accdate;
	}

	public void setAccdate(String accdate) {
		this.accdate = accdate;
	}

	public String getAccessories() {
		return this.accessories;
	}

	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}

	public String getAccperiod() {
		return this.accperiod;
	}

	public void setAccperiod(String accperiod) {
		this.accperiod = accperiod;
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

	public String getAlipayKey() {
		return this.alipayKey;
	}

	public void setAlipayKey(String alipayKey) {
		this.alipayKey = alipayKey;
	}

	public String getAlipayPartnerid() {
		return this.alipayPartnerid;
	}

	public void setAlipayPartnerid(String alipayPartnerid) {
		this.alipayPartnerid = alipayPartnerid;
	}

	public String getAlipaySellMail() {
		return this.alipaySellMail;
	}

	public void setAlipaySellMail(String alipaySellMail) {
		this.alipaySellMail = alipaySellMail;
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

	public BigDecimal getBStorecodeFormatId() {
		return this.bStorecodeFormatId;
	}

	public void setBStorecodeFormatId(BigDecimal bStorecodeFormatId) {
		this.bStorecodeFormatId = bStorecodeFormatId;
	}

	public BigDecimal getBigareamngId() {
		return this.bigareamngId;
	}

	public void setBigareamngId(BigDecimal bigareamngId) {
		this.bigareamngId = bigareamngId;
	}

	public BigDecimal getBilldateFrist() {
		return this.billdateFrist;
	}

	public void setBilldateFrist(BigDecimal billdateFrist) {
		this.billdateFrist = billdateFrist;
	}

	public String getBilldaterange() {
		return this.billdaterange;
	}

	public void setBilldaterange(String billdaterange) {
		this.billdaterange = billdaterange;
	}

	public String getBillperiod() {
		return this.billperiod;
	}

	public void setBillperiod(String billperiod) {
		this.billperiod = billperiod;
	}

	public BigDecimal getBreakeven() {
		return this.breakeven;
	}

	public void setBreakeven(BigDecimal breakeven) {
		this.breakeven = breakeven;
	}

	public String getBreakevenInfo() {
		return this.breakevenInfo;
	}

	public void setBreakevenInfo(String breakevenInfo) {
		this.breakevenInfo = breakevenInfo;
	}

	public BigDecimal getCAddressId() {
		return this.cAddressId;
	}

	public void setCAddressId(BigDecimal cAddressId) {
		this.cAddressId = cAddressId;
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

	public BigDecimal getCBigcityId() {
		return this.cBigcityId;
	}

	public void setCBigcityId(BigDecimal cBigcityId) {
		this.cBigcityId = cBigcityId;
	}

	public BigDecimal getCBlockId() {
		return this.cBlockId;
	}

	public void setCBlockId(BigDecimal cBlockId) {
		this.cBlockId = cBlockId;
	}

	public BigDecimal getCCityId() {
		return this.cCityId;
	}

	public void setCCityId(BigDecimal cCityId) {
		this.cCityId = cCityId;
	}

	public BigDecimal getCClassId() {
		return this.cClassId;
	}

	public void setCClassId(BigDecimal cClassId) {
		this.cClassId = cClassId;
	}

	public BigDecimal getCClasscodeId() {
		return this.cClasscodeId;
	}

	public void setCClasscodeId(BigDecimal cClasscodeId) {
		this.cClasscodeId = cClasscodeId;
	}

	public BigDecimal getCClosereasonId() {
		return this.cClosereasonId;
	}

	public void setCClosereasonId(BigDecimal cClosereasonId) {
		this.cClosereasonId = cClosereasonId;
	}

	public BigDecimal getCConsumeareaId() {
		return this.cConsumeareaId;
	}

	public void setCConsumeareaId(BigDecimal cConsumeareaId) {
		this.cConsumeareaId = cConsumeareaId;
	}

	public CCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(CCustomer customer) {
		this.customer = customer;
	}
	
	public BigDecimal getCCustomerupId() {
		return this.cCustomerupId;
	}

	public void setCCustomerupId(BigDecimal cCustomerupId) {
		this.cCustomerupId = cCustomerupId;
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

	public BigDecimal getCExpresscityId() {
		return this.cExpresscityId;
	}

	public void setCExpresscityId(BigDecimal cExpresscityId) {
		this.cExpresscityId = cExpresscityId;
	}

	public BigDecimal getCExpresscompanyId() {
		return this.cExpresscompanyId;
	}

	public void setCExpresscompanyId(BigDecimal cExpresscompanyId) {
		this.cExpresscompanyId = cExpresscompanyId;
	}

	public BigDecimal getCIntegralareaId() {
		return this.cIntegralareaId;
	}

	public void setCIntegralareaId(BigDecimal cIntegralareaId) {
		this.cIntegralareaId = cIntegralareaId;
	}

	public BigDecimal getCListoreId() {
		return this.cListoreId;
	}

	public void setCListoreId(BigDecimal cListoreId) {
		this.cListoreId = cListoreId;
	}

	public BigDecimal getCMarkbaltypeId() {
		return this.cMarkbaltypeId;
	}

	public void setCMarkbaltypeId(BigDecimal cMarkbaltypeId) {
		this.cMarkbaltypeId = cMarkbaltypeId;
	}

	public BigDecimal getCPaywayDefault() {
		return this.cPaywayDefault;
	}

	public void setCPaywayDefault(BigDecimal cPaywayDefault) {
		this.cPaywayDefault = cPaywayDefault;
	}

	public String getCPaywayFilter() {
		return this.cPaywayFilter;
	}

	public void setCPaywayFilter(String cPaywayFilter) {
		this.cPaywayFilter = cPaywayFilter;
	}

	public BigDecimal getCPeriodareaId() {
		return this.cPeriodareaId;
	}

	public void setCPeriodareaId(BigDecimal cPeriodareaId) {
		this.cPeriodareaId = cPeriodareaId;
	}

	public BigDecimal getCPosaddrId() {
		return this.cPosaddrId;
	}

	public void setCPosaddrId(BigDecimal cPosaddrId) {
		this.cPosaddrId = cPosaddrId;
	}

	public BigDecimal getCPriceareaId() {
		return this.cPriceareaId;
	}

	public void setCPriceareaId(BigDecimal cPriceareaId) {
		this.cPriceareaId = cPriceareaId;
	}

	public BigDecimal getCProvinceId() {
		return this.cProvinceId;
	}

	public void setCProvinceId(BigDecimal cProvinceId) {
		this.cProvinceId = cProvinceId;
	}

	public BigDecimal getCStandId() {
		return this.cStandId;
	}

	public void setCStandId(BigDecimal cStandId) {
		this.cStandId = cStandId;
	}

	public BigDecimal getCStoreId() {
		return this.cStoreId;
	}

	public void setCStoreId(BigDecimal cStoreId) {
		this.cStoreId = cStoreId;
	}

	public String getCStoreSql() {
		return this.cStoreSql;
	}

	public void setCStoreSql(String cStoreSql) {
		this.cStoreSql = cStoreSql;
	}

	public BigDecimal getCStoreattrib1Id() {
		return this.cStoreattrib1Id;
	}

	public void setCStoreattrib1Id(BigDecimal cStoreattrib1Id) {
		this.cStoreattrib1Id = cStoreattrib1Id;
	}

	public BigDecimal getCStoreattrib10Id() {
		return this.cStoreattrib10Id;
	}

	public void setCStoreattrib10Id(BigDecimal cStoreattrib10Id) {
		this.cStoreattrib10Id = cStoreattrib10Id;
	}

	public BigDecimal getCStoreattrib11Id() {
		return this.cStoreattrib11Id;
	}

	public void setCStoreattrib11Id(BigDecimal cStoreattrib11Id) {
		this.cStoreattrib11Id = cStoreattrib11Id;
	}

	public BigDecimal getCStoreattrib12Id() {
		return this.cStoreattrib12Id;
	}

	public void setCStoreattrib12Id(BigDecimal cStoreattrib12Id) {
		this.cStoreattrib12Id = cStoreattrib12Id;
	}

	public BigDecimal getCStoreattrib13Id() {
		return this.cStoreattrib13Id;
	}

	public void setCStoreattrib13Id(BigDecimal cStoreattrib13Id) {
		this.cStoreattrib13Id = cStoreattrib13Id;
	}

	public BigDecimal getCStoreattrib14Id() {
		return this.cStoreattrib14Id;
	}

	public void setCStoreattrib14Id(BigDecimal cStoreattrib14Id) {
		this.cStoreattrib14Id = cStoreattrib14Id;
	}

	public BigDecimal getCStoreattrib15Id() {
		return this.cStoreattrib15Id;
	}

	public void setCStoreattrib15Id(BigDecimal cStoreattrib15Id) {
		this.cStoreattrib15Id = cStoreattrib15Id;
	}

	public BigDecimal getCStoreattrib16Id() {
		return this.cStoreattrib16Id;
	}

	public void setCStoreattrib16Id(BigDecimal cStoreattrib16Id) {
		this.cStoreattrib16Id = cStoreattrib16Id;
	}

	public BigDecimal getCStoreattrib17Id() {
		return this.cStoreattrib17Id;
	}

	public void setCStoreattrib17Id(BigDecimal cStoreattrib17Id) {
		this.cStoreattrib17Id = cStoreattrib17Id;
	}

	public BigDecimal getCStoreattrib18Id() {
		return this.cStoreattrib18Id;
	}

	public void setCStoreattrib18Id(BigDecimal cStoreattrib18Id) {
		this.cStoreattrib18Id = cStoreattrib18Id;
	}

	public BigDecimal getCStoreattrib19Id() {
		return this.cStoreattrib19Id;
	}

	public void setCStoreattrib19Id(BigDecimal cStoreattrib19Id) {
		this.cStoreattrib19Id = cStoreattrib19Id;
	}

	public BigDecimal getCStoreattrib2Id() {
		return this.cStoreattrib2Id;
	}

	public void setCStoreattrib2Id(BigDecimal cStoreattrib2Id) {
		this.cStoreattrib2Id = cStoreattrib2Id;
	}

	public BigDecimal getCStoreattrib20Id() {
		return this.cStoreattrib20Id;
	}

	public void setCStoreattrib20Id(BigDecimal cStoreattrib20Id) {
		this.cStoreattrib20Id = cStoreattrib20Id;
	}

	public BigDecimal getCStoreattrib3Id() {
		return this.cStoreattrib3Id;
	}

	public void setCStoreattrib3Id(BigDecimal cStoreattrib3Id) {
		this.cStoreattrib3Id = cStoreattrib3Id;
	}

	public BigDecimal getCStoreattrib4Id() {
		return this.cStoreattrib4Id;
	}

	public void setCStoreattrib4Id(BigDecimal cStoreattrib4Id) {
		this.cStoreattrib4Id = cStoreattrib4Id;
	}

	public BigDecimal getCStoreattrib5Id() {
		return this.cStoreattrib5Id;
	}

	public void setCStoreattrib5Id(BigDecimal cStoreattrib5Id) {
		this.cStoreattrib5Id = cStoreattrib5Id;
	}

	public BigDecimal getCStoreattrib6Id() {
		return this.cStoreattrib6Id;
	}

	public void setCStoreattrib6Id(BigDecimal cStoreattrib6Id) {
		this.cStoreattrib6Id = cStoreattrib6Id;
	}

	public BigDecimal getCStoreattrib7Id() {
		return this.cStoreattrib7Id;
	}

	public void setCStoreattrib7Id(BigDecimal cStoreattrib7Id) {
		this.cStoreattrib7Id = cStoreattrib7Id;
	}

	public BigDecimal getCStoreattrib8Id() {
		return this.cStoreattrib8Id;
	}

	public void setCStoreattrib8Id(BigDecimal cStoreattrib8Id) {
		this.cStoreattrib8Id = cStoreattrib8Id;
	}

	public BigDecimal getCStoreattrib9Id() {
		return this.cStoreattrib9Id;
	}

	public void setCStoreattrib9Id(BigDecimal cStoreattrib9Id) {
		this.cStoreattrib9Id = cStoreattrib9Id;
	}

	public BigDecimal getCStoregradeId() {
		return this.cStoregradeId;
	}

	public void setCStoregradeId(BigDecimal cStoregradeId) {
		this.cStoregradeId = cStoregradeId;
	}

	public BigDecimal getCStorekindId() {
		return this.cStorekindId;
	}

	public void setCStorekindId(BigDecimal cStorekindId) {
		this.cStorekindId = cStorekindId;
	}

	public String getCStoretype() {
		return this.cStoretype;
	}

	public void setCStoretype(String cStoretype) {
		this.cStoretype = cStoretype;
	}

	public BigDecimal getCStoretypeJzId() {
		return this.cStoretypeJzId;
	}

	public void setCStoretypeJzId(BigDecimal cStoretypeJzId) {
		this.cStoretypeJzId = cStoretypeJzId;
	}

	public BigDecimal getCUfblockId() {
		return this.cUfblockId;
	}

	public void setCUfblockId(BigDecimal cUfblockId) {
		this.cUfblockId = cUfblockId;
	}

	public String getCalculation() {
		return this.calculation;
	}

	public void setCalculation(String calculation) {
		this.calculation = calculation;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCarrier2() {
		return this.carrier2;
	}

	public void setCarrier2(String carrier2) {
		this.carrier2 = carrier2;
	}

	public String getCatalogcode() {
		return this.catalogcode;
	}

	public void setCatalogcode(String catalogcode) {
		this.catalogcode = catalogcode;
	}

	public String getCatalogname() {
		return this.catalogname;
	}

	public void setCatalogname(String catalogname) {
		this.catalogname = catalogname;
	}

	public String getCatalogup() {
		return this.catalogup;
	}

	public void setCatalogup(String catalogup) {
		this.catalogup = catalogup;
	}

	public BigDecimal getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(BigDecimal checkdate) {
		this.checkdate = checkdate;
	}

	public String getCheckperiod() {
		return this.checkperiod;
	}

	public void setCheckperiod(String checkperiod) {
		this.checkperiod = checkperiod;
	}

	public BigDecimal getChkOverdays() {
		return this.chkOverdays;
	}

	public void setChkOverdays(BigDecimal chkOverdays) {
		this.chkOverdays = chkOverdays;
	}

	public BigDecimal getChkday() {
		return this.chkday;
	}

	public void setChkday(BigDecimal chkday) {
		this.chkday = chkday;
	}

	public String getClienttype() {
		return this.clienttype;
	}

	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getComptype() {
		return this.comptype;
	}

	public void setComptype(BigDecimal comptype) {
		this.comptype = comptype;
	}

	public BigDecimal getComrentend() {
		return this.comrentend;
	}

	public void setComrentend(BigDecimal comrentend) {
		this.comrentend = comrentend;
	}

	public BigDecimal getConstate() {
		return this.constate;
	}

	public void setConstate(BigDecimal constate) {
		this.constate = constate;
	}

	public String getContactor() {
		return this.contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
	}

	public BigDecimal getContactorId() {
		return this.contactorId;
	}

	public void setContactorId(BigDecimal contactorId) {
		this.contactorId = contactorId;
	}

	public String getCountercode() {
		return this.countercode;
	}

	public void setCountercode(String countercode) {
		this.countercode = countercode;
	}

	public Date getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public BigDecimal getDatebeg() {
		return this.datebeg;
	}

	public void setDatebeg(BigDecimal datebeg) {
		this.datebeg = datebeg;
	}

	public BigDecimal getDateblock() {
		return this.dateblock;
	}

	public void setDateblock(BigDecimal dateblock) {
		this.dateblock = dateblock;
	}

	public BigDecimal getDateend() {
		return this.dateend;
	}

	public void setDateend(BigDecimal dateend) {
		this.dateend = dateend;
	}

	public BigDecimal getDecBegindate() {
		return this.decBegindate;
	}

	public void setDecBegindate(BigDecimal decBegindate) {
		this.decBegindate = decBegindate;
	}

	public BigDecimal getDecEnddate() {
		return this.decEnddate;
	}

	public void setDecEnddate(BigDecimal decEnddate) {
		this.decEnddate = decEnddate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDim1Filter() {
		return this.dim1Filter;
	}

	public void setDim1Filter(String dim1Filter) {
		this.dim1Filter = dim1Filter;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getDrawInvoiceEmpid() {
		return this.drawInvoiceEmpid;
	}

	public void setDrawInvoiceEmpid(BigDecimal drawInvoiceEmpid) {
		this.drawInvoiceEmpid = drawInvoiceEmpid;
	}

	public BigDecimal getEmpcnt() {
		return this.empcnt;
	}

	public void setEmpcnt(BigDecimal empcnt) {
		this.empcnt = empcnt;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getGolf() {
		return this.golf;
	}

	public void setGolf(String golf) {
		this.golf = golf;
	}

	public BigDecimal getHighSku() {
		return this.highSku;
	}

	public void setHighSku(BigDecimal highSku) {
		this.highSku = highSku;
	}

	public BigDecimal getHighStorage() {
		return this.highStorage;
	}

	public void setHighStorage(BigDecimal highStorage) {
		this.highStorage = highStorage;
	}

	public String getIfeffect() {
		return this.ifeffect;
	}

	public void setIfeffect(String ifeffect) {
		this.ifeffect = ifeffect;
	}

	public String getIforderstore() {
		return this.iforderstore;
	}

	public void setIforderstore(String iforderstore) {
		this.iforderstore = iforderstore;
	}

	public String getIfstock() {
		return this.ifstock;
	}

	public void setIfstock(String ifstock) {
		this.ifstock = ifstock;
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

	public BigDecimal getImpMonth() {
		return this.impMonth;
	}

	public void setImpMonth(BigDecimal impMonth) {
		this.impMonth = impMonth;
	}

	public BigDecimal getImpType1() {
		return this.impType1;
	}

	public void setImpType1(BigDecimal impType1) {
		this.impType1 = impType1;
	}

	public BigDecimal getImpType2() {
		return this.impType2;
	}

	public void setImpType2(BigDecimal impType2) {
		this.impType2 = impType2;
	}

	public BigDecimal getImpType3() {
		return this.impType3;
	}

	public void setImpType3(BigDecimal impType3) {
		this.impType3 = impType3;
	}

	public String getInsidecode() {
		return this.insidecode;
	}

	public void setInsidecode(String insidecode) {
		this.insidecode = insidecode;
	}

	public String getInvoiceAccount() {
		return this.invoiceAccount;
	}

	public void setInvoiceAccount(String invoiceAccount) {
		this.invoiceAccount = invoiceAccount;
	}

	public String getInvoiceAddr() {
		return this.invoiceAddr;
	}

	public void setInvoiceAddr(String invoiceAddr) {
		this.invoiceAddr = invoiceAddr;
	}

	public String getInvoiceBank() {
		return this.invoiceBank;
	}

	public void setInvoiceBank(String invoiceBank) {
		this.invoiceBank = invoiceBank;
	}

	public String getInvoiceCom() {
		return this.invoiceCom;
	}

	public void setInvoiceCom(String invoiceCom) {
		this.invoiceCom = invoiceCom;
	}

	public String getInvoicePhone() {
		return this.invoicePhone;
	}

	public void setInvoicePhone(String invoicePhone) {
		this.invoicePhone = invoicePhone;
	}

	public String getInvoiceTaxno() {
		return this.invoiceTaxno;
	}

	public void setInvoiceTaxno(String invoiceTaxno) {
		this.invoiceTaxno = invoiceTaxno;
	}

	public String getInvoicedate() {
		return this.invoicedate;
	}

	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}

	public String getIsAllpayway() {
		return this.isAllpayway;
	}

	public void setIsAllpayway(String isAllpayway) {
		this.isAllpayway = isAllpayway;
	}

	public String getIsAutoaccount() {
		return this.isAutoaccount;
	}

	public void setIsAutoaccount(String isAutoaccount) {
		this.isAutoaccount = isAutoaccount;
	}

	public String getIsAutointlaccount() {
		return this.isAutointlaccount;
	}

	public void setIsAutointlaccount(String isAutointlaccount) {
		this.isAutointlaccount = isAutointlaccount;
	}

	public String getIsCheckalias() {
		return this.isCheckalias;
	}

	public void setIsCheckalias(String isCheckalias) {
		this.isCheckalias = isCheckalias;
	}

	public String getIsConsign() {
		return this.isConsign;
	}

	public void setIsConsign(String isConsign) {
		this.isConsign = isConsign;
	}

	public String getIsCounter() {
		return this.isCounter;
	}

	public void setIsCounter(String isCounter) {
		this.isCounter = isCounter;
	}

	public String getIsCreatedata() {
		return this.isCreatedata;
	}

	public void setIsCreatedata(String isCreatedata) {
		this.isCreatedata = isCreatedata;
	}

	public String getIsExcstore() {
		return this.isExcstore;
	}

	public void setIsExcstore(String isExcstore) {
		this.isExcstore = isExcstore;
	}

	public String getIsIchiban() {
		return this.isIchiban;
	}

	public void setIsIchiban(String isIchiban) {
		this.isIchiban = isIchiban;
	}

	public String getIsLeqeeRead() {
		return this.isLeqeeRead;
	}

	public void setIsLeqeeRead(String isLeqeeRead) {
		this.isLeqeeRead = isLeqeeRead;
	}

	public String getIsManualint() {
		return this.isManualint;
	}

	public void setIsManualint(String isManualint) {
		this.isManualint = isManualint;
	}

	public String getIsMarketno() {
		return this.isMarketno;
	}

	public void setIsMarketno(String isMarketno) {
		this.isMarketno = isMarketno;
	}

	public String getIsModifypayamt() {
		return this.isModifypayamt;
	}

	public void setIsModifypayamt(String isModifypayamt) {
		this.isModifypayamt = isModifypayamt;
	}

	public String getIsMoresalesrep() {
		return this.isMoresalesrep;
	}

	public void setIsMoresalesrep(String isMoresalesrep) {
		this.isMoresalesrep = isMoresalesrep;
	}

/*	public BigDecimal getIsRead() {
		return this.isRead;
	}

	public void setIsRead(BigDecimal isRead) {
		this.isRead = isRead;
	}
*/
	public String getIsRet() {
		return this.isRet;
	}

	public void setIsRet(String isRet) {
		this.isRet = isRet;
	}

	public String getIsTaobao() {
		return this.isTaobao;
	}

	public void setIsTaobao(String isTaobao) {
		this.isTaobao = isTaobao;
	}

	public String getIsTest() {
		return this.isTest;
	}

	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public String getIsTowms() {
		return this.isTowms;
	}

	public void setIsTowms(String isTowms) {
		this.isTowms = isTowms;
	}

	public String getIsWmsstore() {
		return this.isWmsstore;
	}

	public void setIsWmsstore(String isWmsstore) {
		this.isWmsstore = isWmsstore;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsblock() {
		return this.isblock;
	}

	public void setIsblock(String isblock) {
		this.isblock = isblock;
	}

	public String getIscenter() {
		return this.iscenter;
	}

	public void setIscenter(String iscenter) {
		this.iscenter = iscenter;
	}

	public String getIsdiscom() {
		return this.isdiscom;
	}

	public void setIsdiscom(String isdiscom) {
		this.isdiscom = isdiscom;
	}

	public String getIsfairorig() {
		return this.isfairorig;
	}

	public void setIsfairorig(String isfairorig) {
		this.isfairorig = isfairorig;
	}

	public String getIsfictitious() {
		return this.isfictitious;
	}

	public void setIsfictitious(String isfictitious) {
		this.isfictitious = isfictitious;
	}

	public String getIsflag() {
		return this.isflag;
	}

	public void setIsflag(String isflag) {
		this.isflag = isflag;
	}

	public String getIsgift() {
		return this.isgift;
	}

	public void setIsgift(String isgift) {
		this.isgift = isgift;
	}

	public String getIsjoin() {
		return this.isjoin;
	}

	public void setIsjoin(String isjoin) {
		this.isjoin = isjoin;
	}

	public String getIsmark() {
		return this.ismark;
	}

	public void setIsmark(String ismark) {
		this.ismark = ismark;
	}

	public String getIsnegative() {
		return this.isnegative;
	}

	public void setIsnegative(String isnegative) {
		this.isnegative = isnegative;
	}

	public String getIsonlycard() {
		return this.isonlycard;
	}

	public void setIsonlycard(String isonlycard) {
		this.isonlycard = isonlycard;
	}

	public String getIsretail() {
		return this.isretail;
	}

	public void setIsretail(String isretail) {
		this.isretail = isretail;
	}

	public String getIsstop() {
		return this.isstop;
	}

	public void setIsstop(String isstop) {
		this.isstop = isstop;
	}

	public String getIstax() {
		return this.istax;
	}

	public void setIstax(String istax) {
		this.istax = istax;
	}

	public String getIsufstore() {
		return this.isufstore;
	}

	public void setIsufstore(String isufstore) {
		this.isufstore = isufstore;
	}

	public String getIsvipdis() {
		return this.isvipdis;
	}

	public void setIsvipdis(String isvipdis) {
		this.isvipdis = isvipdis;
	}

	public String getIsvipintl() {
		return this.isvipintl;
	}

	public void setIsvipintl(String isvipintl) {
		this.isvipintl = isvipintl;
	}

	public String getItEmp() {
		return this.itEmp;
	}

	public void setItEmp(String itEmp) {
		this.itEmp = itEmp;
	}

	public BigDecimal getItPhone() {
		return this.itPhone;
	}

	public void setItPhone(BigDecimal itPhone) {
		this.itPhone = itPhone;
	}

	public String getKids() {
		return this.kids;
	}

	public void setKids(String kids) {
		this.kids = kids;
	}

	public String getLadies() {
		return this.ladies;
	}

	public void setLadies(String ladies) {
		this.ladies = ladies;
	}

	public Date getLeqeeTime() {
		return this.leqeeTime;
	}

	public void setLeqeeTime(Date leqeeTime) {
		this.leqeeTime = leqeeTime;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public BigDecimal getLimitamt() {
		return this.limitamt;
	}

	public void setLimitamt(BigDecimal limitamt) {
		this.limitamt = limitamt;
	}

	public String getLimitmo() {
		return this.limitmo;
	}

	public void setLimitmo(String limitmo) {
		this.limitmo = limitmo;
	}

	public BigDecimal getLimitqty() {
		return this.limitqty;
	}

	public void setLimitqty(BigDecimal limitqty) {
		this.limitqty = limitqty;
	}

	public BigDecimal getLockcash() {
		return this.lockcash;
	}

	public void setLockcash(BigDecimal lockcash) {
		this.lockcash = lockcash;
	}

	public BigDecimal getLowerSku() {
		return this.lowerSku;
	}

	public void setLowerSku(BigDecimal lowerSku) {
		this.lowerSku = lowerSku;
	}

	public BigDecimal getLowerStorage() {
		return this.lowerStorage;
	}

	public void setLowerStorage(BigDecimal lowerStorage) {
		this.lowerStorage = lowerStorage;
	}

	public String getLowestDiscount() {
		return this.lowestDiscount;
	}

	public void setLowestDiscount(String lowestDiscount) {
		this.lowestDiscount = lowestDiscount;
	}

	public BigDecimal getMBreakeven() {
		return this.mBreakeven;
	}

	public void setMBreakeven(BigDecimal mBreakeven) {
		this.mBreakeven = mBreakeven;
	}

	public BigDecimal getMDim1Id() {
		return this.mDim1Id;
	}

	public void setMDim1Id(BigDecimal mDim1Id) {
		this.mDim1Id = mDim1Id;
	}

	public BigDecimal getMarkdis() {
		return this.markdis;
	}

	public void setMarkdis(BigDecimal markdis) {
		this.markdis = markdis;
	}

	public String getMarket() {
		return this.market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

/*	public BigDecimal getMarketdate() {
		return this.marketdate;
	}

	public void setMarketdate(BigDecimal marketdate) {
		this.marketdate = marketdate;
	}
*/
	public BigDecimal getMaxStorage() {
		return this.maxStorage;
	}

	public void setMaxStorage(BigDecimal maxStorage) {
		this.maxStorage = maxStorage;
	}

	public String getMens() {
		return this.mens;
	}

	public void setMens(String mens) {
		this.mens = mens;
	}

	public BigDecimal getMinStorage() {
		return this.minStorage;
	}

	public void setMinStorage(BigDecimal minStorage) {
		this.minStorage = minStorage;
	}

	public String getMobil() {
		return this.mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
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

	public BigDecimal getMonthfee() {
		return this.monthfee;
	}

	public void setMonthfee(BigDecimal monthfee) {
		this.monthfee = monthfee;
	}

	public BigDecimal getMovstate() {
		return this.movstate;
	}

	public void setMovstate(BigDecimal movstate) {
		this.movstate = movstate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNcAccountId() {
		return this.ncAccountId;
	}

	public void setNcAccountId(BigDecimal ncAccountId) {
		this.ncAccountId = ncAccountId;
	}

	public BigDecimal getNcAccountupId() {
		return this.ncAccountupId;
	}

	public void setNcAccountupId(BigDecimal ncAccountupId) {
		this.ncAccountupId = ncAccountupId;
	}

	public String getOldStorename() {
		return this.oldStorename;
	}

	public void setOldStorename(String oldStorename) {
		this.oldStorename = oldStorename;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getOpenremark() {
		return this.openremark;
	}

	public void setOpenremark(String openremark) {
		this.openremark = openremark;
	}

	public BigDecimal getOrderlimitdate() {
		return this.orderlimitdate;
	}

	public void setOrderlimitdate(BigDecimal orderlimitdate) {
		this.orderlimitdate = orderlimitdate;
	}

	public BigDecimal getOwnerid() {
		return this.ownerid;
	}

	public void setOwnerid(BigDecimal ownerid) {
		this.ownerid = ownerid;
	}

	public String getPerformance() {
		return this.performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getPosCnt() {
		return this.posCnt;
	}

	public void setPosCnt(BigDecimal posCnt) {
		this.posCnt = posCnt;
	}

	public String getPosprint() {
		return this.posprint;
	}

	public void setPosprint(String posprint) {
		this.posprint = posprint;
	}

	public String getPospw() {
		return this.pospw;
	}

	public void setPospw(String pospw) {
		this.pospw = pospw;
	}

	public BigDecimal getPostcal() {
		return this.postcal;
	}

	public void setPostcal(BigDecimal postcal) {
		this.postcal = postcal;
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

	public BigDecimal getProportion() {
		return this.proportion;
	}

	public void setProportion(BigDecimal proportion) {
		this.proportion = proportion;
	}

	public String getPurautostay() {
		return this.purautostay;
	}

	public void setPurautostay(String purautostay) {
		this.purautostay = purautostay;
	}

	public String getRegisteraddr() {
		return this.registeraddr;
	}

	public void setRegisteraddr(String registeraddr) {
		this.registeraddr = registeraddr;
	}

	public String getRegistername() {
		return this.registername;
	}

	public void setRegistername(String registername) {
		this.registername = registername;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getRentbegin() {
		return this.rentbegin;
	}

	public void setRentbegin(BigDecimal rentbegin) {
		this.rentbegin = rentbegin;
	}

	public BigDecimal getRentend() {
		return this.rentend;
	}

	public void setRentend(BigDecimal rentend) {
		this.rentend = rentend;
	}

	public String getRetchkorg() {
		return this.retchkorg;
	}

	public void setRetchkorg(String retchkorg) {
		this.retchkorg = retchkorg;
	}

	public BigDecimal getSaleArea() {
		return this.saleArea;
	}

	public void setSaleArea(BigDecimal saleArea) {
		this.saleArea = saleArea;
	}

	public BigDecimal getShopReceiveType() {
		return this.shopReceiveType;
	}

	public void setShopReceiveType(BigDecimal shopReceiveType) {
		this.shopReceiveType = shopReceiveType;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSrccode() {
		return this.srccode;
	}

	public void setSrccode(String srccode) {
		this.srccode = srccode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getState1() {
		return this.state1;
	}

	public void setState1(BigDecimal state1) {
		this.state1 = state1;
	}

	public BigDecimal getState2() {
		return this.state2;
	}

	public void setState2(BigDecimal state2) {
		this.state2 = state2;
	}

	public BigDecimal getState3() {
		return this.state3;
	}

	public void setState3(BigDecimal state3) {
		this.state3 = state3;
	}

	public BigDecimal getStoreArea() {
		return this.storeArea;
	}

	public void setStoreArea(BigDecimal storeArea) {
		this.storeArea = storeArea;
	}

	public BigDecimal getStoresign() {
		return this.storesign;
	}

	public void setStoresign(BigDecimal storesign) {
		this.storesign = storesign;
	}

	public String getSupervise() {
		return this.supervise;
	}

	public void setSupervise(String supervise) {
		this.supervise = supervise;
	}

	public BigDecimal getSupervisePhone() {
		return this.supervisePhone;
	}

	public void setSupervisePhone(BigDecimal supervisePhone) {
		this.supervisePhone = supervisePhone;
	}

	public BigDecimal getTaxrate() {
		return this.taxrate;
	}

	public void setTaxrate(BigDecimal taxrate) {
		this.taxrate = taxrate;
	}

	public BigDecimal getTdefdowntypeId() {
		return this.tdefdowntypeId;
	}

	public void setTdefdowntypeId(BigDecimal tdefdowntypeId) {
		this.tdefdowntypeId = tdefdowntypeId;
	}

	public BigDecimal getTotAmtBond() {
		return this.totAmtBond;
	}

	public void setTotAmtBond(BigDecimal totAmtBond) {
		this.totAmtBond = totAmtBond;
	}

	public String getUpid() {
		return this.upid;
	}

	public void setUpid(String upid) {
		this.upid = upid;
	}

	public String getUsbkey() {
		return this.usbkey;
	}

	public void setUsbkey(String usbkey) {
		this.usbkey = usbkey;
	}

	public BigDecimal getVirtualPeriodate() {
		return this.virtualPeriodate;
	}

	public void setVirtualPeriodate(BigDecimal virtualPeriodate) {
		this.virtualPeriodate = virtualPeriodate;
	}

	public String getWebposOffline() {
		return this.webposOffline;
	}

	public void setWebposOffline(String webposOffline) {
		this.webposOffline = webposOffline;
	}

	public String getWebposloginurl() {
		return this.webposloginurl;
	}

	public void setWebposloginurl(String webposloginurl) {
		this.webposloginurl = webposloginurl;
	}

	public BigDecimal getWmsContranStore() {
		return this.wmsContranStore;
	}

	public void setWmsContranStore(BigDecimal wmsContranStore) {
		this.wmsContranStore = wmsContranStore;
	}

	public String getWmsStorecode() {
		return this.wmsStorecode;
	}

	public void setWmsStorecode(String wmsStorecode) {
		this.wmsStorecode = wmsStorecode;
	}

	public CStore getCStore() {
		return this.CStore;
	}

	public void setCStore(CStore CStore) {
		this.CStore = CStore;
	}

	public List<CStore> getCStores() {
		return this.CStores;
	}

	public void setCStores(List<CStore> CStores) {
		this.CStores = CStores;
	}

	public CStore addCStore(CStore CStore) {
		getCStores().add(CStore);
		CStore.setCStore(this);

		return CStore;
	}

	public CStore removeCStore(CStore CStore) {
		getCStores().remove(CStore);
		CStore.setCStore(null);

		return CStore;
	}

}