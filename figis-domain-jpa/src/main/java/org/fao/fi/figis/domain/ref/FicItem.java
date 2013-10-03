package org.fao.fi.figis.domain.ref;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FIC_ITEM database table.
 * 
 */
@Entity
@Table(name="FIC_ITEM")
@NamedQuery(name="FicItem.findAll", query="SELECT f FROM FicItem f")
public class FicItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FIC_ITEM")
	private long ficItem;

	private String alpha3code;

	private String author;

	@Column(name="ENTRY_STATUS")
	private String entryStatus;

	@Column(name="FAOMAP_LAYER_ID")
	private BigDecimal faomapLayerId;

	@Column(name="FIC_SYS_ITEM")
	private String ficSysItem;

	@Column(name="FULL_NAME_A")
	private String fullNameA;

	@Column(name="FULL_NAME_C")
	private String fullNameC;

	@Column(name="FULL_NAME_E")
	private String fullNameE;

	@Column(name="FULL_NAME_F")
	private String fullNameF;

	@Column(name="FULL_NAME_R")
	private String fullNameR;

	@Column(name="FULL_NAME_S")
	private String fullNameS;

	@Column(name="LONG_NAME_A")
	private String longNameA;

	@Column(name="LONG_NAME_C")
	private String longNameC;

	@Column(name="LONG_NAME_E")
	private String longNameE;

	@Column(name="LONG_NAME_F")
	private String longNameF;

	@Column(name="LONG_NAME_R")
	private String longNameR;

	@Column(name="LONG_NAME_S")
	private String longNameS;

	private BigDecimal meta;

	@Column(name="NAME_A")
	private String nameA;

	@Column(name="NAME_C")
	private String nameC;

	@Column(name="NAME_E")
	private String nameE;

	@Column(name="NAME_F")
	private String nameF;

	@Column(name="NAME_R")
	private String nameR;

	@Column(name="NAME_S")
	private String nameS;

	@Column(name="SCIENTIFIC_NAME")
	private String scientificName;

	@Column(name="SEMANTIC_ID")
	private String semanticId;

	private String unit;

	public FicItem() {
	}

	public long getFicItem() {
		return this.ficItem;
	}

	public void setFicItem(long ficItem) {
		this.ficItem = ficItem;
	}

	public String getAlpha3code() {
		return this.alpha3code;
	}

	public void setAlpha3code(String alpha3code) {
		this.alpha3code = alpha3code;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEntryStatus() {
		return this.entryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		this.entryStatus = entryStatus;
	}

	public BigDecimal getFaomapLayerId() {
		return this.faomapLayerId;
	}

	public void setFaomapLayerId(BigDecimal faomapLayerId) {
		this.faomapLayerId = faomapLayerId;
	}

	public String getFicSysItem() {
		return this.ficSysItem;
	}

	public void setFicSysItem(String ficSysItem) {
		this.ficSysItem = ficSysItem;
	}

	public String getFullNameA() {
		return this.fullNameA;
	}

	public void setFullNameA(String fullNameA) {
		this.fullNameA = fullNameA;
	}

	public String getFullNameC() {
		return this.fullNameC;
	}

	public void setFullNameC(String fullNameC) {
		this.fullNameC = fullNameC;
	}

	public String getFullNameE() {
		return this.fullNameE;
	}

	public void setFullNameE(String fullNameE) {
		this.fullNameE = fullNameE;
	}

	public String getFullNameF() {
		return this.fullNameF;
	}

	public void setFullNameF(String fullNameF) {
		this.fullNameF = fullNameF;
	}

	public String getFullNameR() {
		return this.fullNameR;
	}

	public void setFullNameR(String fullNameR) {
		this.fullNameR = fullNameR;
	}

	public String getFullNameS() {
		return this.fullNameS;
	}

	public void setFullNameS(String fullNameS) {
		this.fullNameS = fullNameS;
	}

	public String getLongNameA() {
		return this.longNameA;
	}

	public void setLongNameA(String longNameA) {
		this.longNameA = longNameA;
	}

	public String getLongNameC() {
		return this.longNameC;
	}

	public void setLongNameC(String longNameC) {
		this.longNameC = longNameC;
	}

	public String getLongNameE() {
		return this.longNameE;
	}

	public void setLongNameE(String longNameE) {
		this.longNameE = longNameE;
	}

	public String getLongNameF() {
		return this.longNameF;
	}

	public void setLongNameF(String longNameF) {
		this.longNameF = longNameF;
	}

	public String getLongNameR() {
		return this.longNameR;
	}

	public void setLongNameR(String longNameR) {
		this.longNameR = longNameR;
	}

	public String getLongNameS() {
		return this.longNameS;
	}

	public void setLongNameS(String longNameS) {
		this.longNameS = longNameS;
	}

	public BigDecimal getMeta() {
		return this.meta;
	}

	public void setMeta(BigDecimal meta) {
		this.meta = meta;
	}

	public String getNameA() {
		return this.nameA;
	}

	public void setNameA(String nameA) {
		this.nameA = nameA;
	}

	public String getNameC() {
		return this.nameC;
	}

	public void setNameC(String nameC) {
		this.nameC = nameC;
	}

	public String getNameE() {
		return this.nameE;
	}

	public void setNameE(String nameE) {
		this.nameE = nameE;
	}

	public String getNameF() {
		return this.nameF;
	}

	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	public String getNameR() {
		return this.nameR;
	}

	public void setNameR(String nameR) {
		this.nameR = nameR;
	}

	public String getNameS() {
		return this.nameS;
	}

	public void setNameS(String nameS) {
		this.nameS = nameS;
	}

	public String getScientificName() {
		return this.scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getSemanticId() {
		return this.semanticId;
	}

	public void setSemanticId(String semanticId) {
		this.semanticId = semanticId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}