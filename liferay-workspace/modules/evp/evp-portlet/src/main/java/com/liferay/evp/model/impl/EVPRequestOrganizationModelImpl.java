/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.evp.model.impl;

import com.liferay.evp.model.EVPRequestOrganization;
import com.liferay.evp.model.EVPRequestOrganizationModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EVPRequestOrganization service. Represents a row in the &quot;EVPRequestOrganization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.evp.model.EVPRequestOrganizationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EVPRequestOrganizationImpl}.
 * </p>
 *
 * @author Val Nagy
 * @see EVPRequestOrganizationImpl
 * @see com.liferay.evp.model.EVPRequestOrganization
 * @see com.liferay.evp.model.EVPRequestOrganizationModel
 * @generated
 */
public class EVPRequestOrganizationModelImpl extends BaseModelImpl<EVPRequestOrganization>
	implements EVPRequestOrganizationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a e v p request organization model instance should use the {@link com.liferay.evp.model.EVPRequestOrganization} interface instead.
	 */
	public static final String TABLE_NAME = "EVPRequestOrganization";
	public static final Object[][] TABLE_COLUMNS = {
			{ "evpRequestOrganizationId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "organizationId", Types.BIGINT },
			{ "subsidiaryGroupId", Types.BIGINT },
			{ "description", Types.VARCHAR },
			{ "taxIdentificationNumber", Types.VARCHAR },
			{ "nonprofitType", Types.INTEGER },
			{ "verified", Types.BOOLEAN },
			{ "shared", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table EVPRequestOrganization (evpRequestOrganizationId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(128) null,createDate DATE null,modifiedDate DATE null,organizationId LONG,subsidiaryGroupId LONG,description STRING null,taxIdentificationNumber VARCHAR(128) null,nonprofitType INTEGER,verified BOOLEAN,shared BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table EVPRequestOrganization";
	public static final String ORDER_BY_JPQL = " ORDER BY evpRequestOrganization.evpRequestOrganizationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EVPRequestOrganization.evpRequestOrganizationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.evp.model.EVPRequestOrganization"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.evp.model.EVPRequestOrganization"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.evp.model.EVPRequestOrganization"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long EVPREQUESTORGANIZATIONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.evp.model.EVPRequestOrganization"));

	public EVPRequestOrganizationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _evpRequestOrganizationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvpRequestOrganizationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evpRequestOrganizationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EVPRequestOrganization.class;
	}

	@Override
	public String getModelClassName() {
		return EVPRequestOrganization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evpRequestOrganizationId", getEvpRequestOrganizationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("subsidiaryGroupId", getSubsidiaryGroupId());
		attributes.put("description", getDescription());
		attributes.put("taxIdentificationNumber", getTaxIdentificationNumber());
		attributes.put("nonprofitType", getNonprofitType());
		attributes.put("verified", getVerified());
		attributes.put("shared", getShared());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long evpRequestOrganizationId = (Long)attributes.get(
				"evpRequestOrganizationId");

		if (evpRequestOrganizationId != null) {
			setEvpRequestOrganizationId(evpRequestOrganizationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long subsidiaryGroupId = (Long)attributes.get("subsidiaryGroupId");

		if (subsidiaryGroupId != null) {
			setSubsidiaryGroupId(subsidiaryGroupId);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String taxIdentificationNumber = (String)attributes.get(
				"taxIdentificationNumber");

		if (taxIdentificationNumber != null) {
			setTaxIdentificationNumber(taxIdentificationNumber);
		}

		Integer nonprofitType = (Integer)attributes.get("nonprofitType");

		if (nonprofitType != null) {
			setNonprofitType(nonprofitType);
		}

		Boolean verified = (Boolean)attributes.get("verified");

		if (verified != null) {
			setVerified(verified);
		}

		Boolean shared = (Boolean)attributes.get("shared");

		if (shared != null) {
			setShared(shared);
		}
	}

	@Override
	public long getEvpRequestOrganizationId() {
		return _evpRequestOrganizationId;
	}

	@Override
	public void setEvpRequestOrganizationId(long evpRequestOrganizationId) {
		_evpRequestOrganizationId = evpRequestOrganizationId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	@Override
	public long getSubsidiaryGroupId() {
		return _subsidiaryGroupId;
	}

	@Override
	public void setSubsidiaryGroupId(long subsidiaryGroupId) {
		_subsidiaryGroupId = subsidiaryGroupId;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getTaxIdentificationNumber() {
		if (_taxIdentificationNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _taxIdentificationNumber;
		}
	}

	@Override
	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		_taxIdentificationNumber = taxIdentificationNumber;
	}

	@Override
	public int getNonprofitType() {
		return _nonprofitType;
	}

	@Override
	public void setNonprofitType(int nonprofitType) {
		_nonprofitType = nonprofitType;
	}

	@Override
	public boolean getVerified() {
		return _verified;
	}

	@Override
	public boolean isVerified() {
		return _verified;
	}

	@Override
	public void setVerified(boolean verified) {
		_verified = verified;
	}

	@Override
	public boolean getShared() {
		return _shared;
	}

	@Override
	public boolean isShared() {
		return _shared;
	}

	@Override
	public void setShared(boolean shared) {
		_shared = shared;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EVPRequestOrganization.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EVPRequestOrganization toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EVPRequestOrganization)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EVPRequestOrganizationImpl evpRequestOrganizationImpl = new EVPRequestOrganizationImpl();

		evpRequestOrganizationImpl.setEvpRequestOrganizationId(getEvpRequestOrganizationId());
		evpRequestOrganizationImpl.setCompanyId(getCompanyId());
		evpRequestOrganizationImpl.setUserId(getUserId());
		evpRequestOrganizationImpl.setUserName(getUserName());
		evpRequestOrganizationImpl.setCreateDate(getCreateDate());
		evpRequestOrganizationImpl.setModifiedDate(getModifiedDate());
		evpRequestOrganizationImpl.setOrganizationId(getOrganizationId());
		evpRequestOrganizationImpl.setSubsidiaryGroupId(getSubsidiaryGroupId());
		evpRequestOrganizationImpl.setDescription(getDescription());
		evpRequestOrganizationImpl.setTaxIdentificationNumber(getTaxIdentificationNumber());
		evpRequestOrganizationImpl.setNonprofitType(getNonprofitType());
		evpRequestOrganizationImpl.setVerified(getVerified());
		evpRequestOrganizationImpl.setShared(getShared());

		evpRequestOrganizationImpl.resetOriginalValues();

		return evpRequestOrganizationImpl;
	}

	@Override
	public int compareTo(EVPRequestOrganization evpRequestOrganization) {
		long primaryKey = evpRequestOrganization.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EVPRequestOrganization)) {
			return false;
		}

		EVPRequestOrganization evpRequestOrganization = (EVPRequestOrganization)obj;

		long primaryKey = evpRequestOrganization.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		EVPRequestOrganizationModelImpl evpRequestOrganizationModelImpl = this;

		evpRequestOrganizationModelImpl._originalCompanyId = evpRequestOrganizationModelImpl._companyId;

		evpRequestOrganizationModelImpl._setOriginalCompanyId = false;

		evpRequestOrganizationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EVPRequestOrganization> toCacheModel() {
		EVPRequestOrganizationCacheModel evpRequestOrganizationCacheModel = new EVPRequestOrganizationCacheModel();

		evpRequestOrganizationCacheModel.evpRequestOrganizationId = getEvpRequestOrganizationId();

		evpRequestOrganizationCacheModel.companyId = getCompanyId();

		evpRequestOrganizationCacheModel.userId = getUserId();

		evpRequestOrganizationCacheModel.userName = getUserName();

		String userName = evpRequestOrganizationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			evpRequestOrganizationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			evpRequestOrganizationCacheModel.createDate = createDate.getTime();
		}
		else {
			evpRequestOrganizationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			evpRequestOrganizationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			evpRequestOrganizationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		evpRequestOrganizationCacheModel.organizationId = getOrganizationId();

		evpRequestOrganizationCacheModel.subsidiaryGroupId = getSubsidiaryGroupId();

		evpRequestOrganizationCacheModel.description = getDescription();

		String description = evpRequestOrganizationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			evpRequestOrganizationCacheModel.description = null;
		}

		evpRequestOrganizationCacheModel.taxIdentificationNumber = getTaxIdentificationNumber();

		String taxIdentificationNumber = evpRequestOrganizationCacheModel.taxIdentificationNumber;

		if ((taxIdentificationNumber != null) &&
				(taxIdentificationNumber.length() == 0)) {
			evpRequestOrganizationCacheModel.taxIdentificationNumber = null;
		}

		evpRequestOrganizationCacheModel.nonprofitType = getNonprofitType();

		evpRequestOrganizationCacheModel.verified = getVerified();

		evpRequestOrganizationCacheModel.shared = getShared();

		return evpRequestOrganizationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{evpRequestOrganizationId=");
		sb.append(getEvpRequestOrganizationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", organizationId=");
		sb.append(getOrganizationId());
		sb.append(", subsidiaryGroupId=");
		sb.append(getSubsidiaryGroupId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", taxIdentificationNumber=");
		sb.append(getTaxIdentificationNumber());
		sb.append(", nonprofitType=");
		sb.append(getNonprofitType());
		sb.append(", verified=");
		sb.append(getVerified());
		sb.append(", shared=");
		sb.append(getShared());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.evp.model.EVPRequestOrganization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evpRequestOrganizationId</column-name><column-value><![CDATA[");
		sb.append(getEvpRequestOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organizationId</column-name><column-value><![CDATA[");
		sb.append(getOrganizationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subsidiaryGroupId</column-name><column-value><![CDATA[");
		sb.append(getSubsidiaryGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taxIdentificationNumber</column-name><column-value><![CDATA[");
		sb.append(getTaxIdentificationNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nonprofitType</column-name><column-value><![CDATA[");
		sb.append(getNonprofitType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>verified</column-name><column-value><![CDATA[");
		sb.append(getVerified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shared</column-name><column-value><![CDATA[");
		sb.append(getShared());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EVPRequestOrganization.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EVPRequestOrganization.class
		};
	private long _evpRequestOrganizationId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _organizationId;
	private long _subsidiaryGroupId;
	private String _description;
	private String _taxIdentificationNumber;
	private int _nonprofitType;
	private boolean _verified;
	private boolean _shared;
	private long _columnBitmask;
	private EVPRequestOrganization _escapedModel;
}
