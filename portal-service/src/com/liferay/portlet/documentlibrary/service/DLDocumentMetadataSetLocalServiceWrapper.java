/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.documentlibrary.service;

/**
 * <p>
 * This class is a wrapper for {@link DLDocumentMetadataSetLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DLDocumentMetadataSetLocalService
 * @generated
 */
public class DLDocumentMetadataSetLocalServiceWrapper
	implements DLDocumentMetadataSetLocalService {
	public DLDocumentMetadataSetLocalServiceWrapper(
		DLDocumentMetadataSetLocalService dlDocumentMetadataSetLocalService) {
		_dlDocumentMetadataSetLocalService = dlDocumentMetadataSetLocalService;
	}

	/**
	* Adds the d l document metadata set to the database. Also notifies the appropriate model listeners.
	*
	* @param dlDocumentMetadataSet the d l document metadata set
	* @return the d l document metadata set that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet addDLDocumentMetadataSet(
		com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet dlDocumentMetadataSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.addDLDocumentMetadataSet(dlDocumentMetadataSet);
	}

	/**
	* Creates a new d l document metadata set with the primary key. Does not add the d l document metadata set to the database.
	*
	* @param documentMetadataSetId the primary key for the new d l document metadata set
	* @return the new d l document metadata set
	*/
	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet createDLDocumentMetadataSet(
		long documentMetadataSetId) {
		return _dlDocumentMetadataSetLocalService.createDLDocumentMetadataSet(documentMetadataSetId);
	}

	/**
	* Deletes the d l document metadata set with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param documentMetadataSetId the primary key of the d l document metadata set
	* @throws PortalException if a d l document metadata set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDLDocumentMetadataSet(long documentMetadataSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dlDocumentMetadataSetLocalService.deleteDLDocumentMetadataSet(documentMetadataSetId);
	}

	/**
	* Deletes the d l document metadata set from the database. Also notifies the appropriate model listeners.
	*
	* @param dlDocumentMetadataSet the d l document metadata set
	* @throws SystemException if a system exception occurred
	*/
	public void deleteDLDocumentMetadataSet(
		com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet dlDocumentMetadataSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		_dlDocumentMetadataSetLocalService.deleteDLDocumentMetadataSet(dlDocumentMetadataSet);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the d l document metadata set with the primary key.
	*
	* @param documentMetadataSetId the primary key of the d l document metadata set
	* @return the d l document metadata set
	* @throws PortalException if a d l document metadata set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet getDLDocumentMetadataSet(
		long documentMetadataSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.getDLDocumentMetadataSet(documentMetadataSetId);
	}

	/**
	* Returns a range of all the d l document metadata sets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d l document metadata sets
	* @param end the upper bound of the range of d l document metadata sets (not inclusive)
	* @return the range of d l document metadata sets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet> getDLDocumentMetadataSets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.getDLDocumentMetadataSets(start,
			end);
	}

	/**
	* Returns the number of d l document metadata sets.
	*
	* @return the number of d l document metadata sets
	* @throws SystemException if a system exception occurred
	*/
	public int getDLDocumentMetadataSetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.getDLDocumentMetadataSetsCount();
	}

	/**
	* Updates the d l document metadata set in the database. Also notifies the appropriate model listeners.
	*
	* @param dlDocumentMetadataSet the d l document metadata set
	* @return the d l document metadata set that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet updateDLDocumentMetadataSet(
		com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet dlDocumentMetadataSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.updateDLDocumentMetadataSet(dlDocumentMetadataSet);
	}

	/**
	* Updates the d l document metadata set in the database. Also notifies the appropriate model listeners.
	*
	* @param dlDocumentMetadataSet the d l document metadata set
	* @param merge whether to merge the d l document metadata set with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d l document metadata set that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet updateDLDocumentMetadataSet(
		com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet dlDocumentMetadataSet,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.updateDLDocumentMetadataSet(dlDocumentMetadataSet,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _dlDocumentMetadataSetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dlDocumentMetadataSetLocalService.setBeanIdentifier(beanIdentifier);
	}

	public void deleteDocumentMetadataSets(long fileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dlDocumentMetadataSetLocalService.deleteDocumentMetadataSets(fileVersionId);
	}

	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet getDocumentMetadataSet(
		long documentMetadataSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.getDocumentMetadataSet(documentMetadataSetId);
	}

	public com.liferay.portlet.documentlibrary.model.DLDocumentMetadataSet getDocumentMetadataSet(
		long ddmStructureId, long fileVersionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dlDocumentMetadataSetLocalService.getDocumentMetadataSet(ddmStructureId,
			fileVersionId);
	}

	public void updateDocumentMetadataSets(long documentTypeId,
		long fileVersionId,
		java.util.Map<java.lang.String, com.liferay.portlet.dynamicdatamapping.storage.Fields> fieldsMap,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dlDocumentMetadataSetLocalService.updateDocumentMetadataSets(documentTypeId,
			fileVersionId, fieldsMap, serviceContext);
	}

	public void updateDocumentMetadataSets(long companyId, long documentTypeId,
		long fileVersionId,
		java.util.Map<java.lang.String, com.liferay.portlet.dynamicdatamapping.storage.Fields> fieldsMap,
		java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> ddmStructures,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_dlDocumentMetadataSetLocalService.updateDocumentMetadataSets(companyId,
			documentTypeId, fileVersionId, fieldsMap, ddmStructures,
			serviceContext);
	}

	public DLDocumentMetadataSetLocalService getWrappedDLDocumentMetadataSetLocalService() {
		return _dlDocumentMetadataSetLocalService;
	}

	public void setWrappedDLDocumentMetadataSetLocalService(
		DLDocumentMetadataSetLocalService dlDocumentMetadataSetLocalService) {
		_dlDocumentMetadataSetLocalService = dlDocumentMetadataSetLocalService;
	}

	private DLDocumentMetadataSetLocalService _dlDocumentMetadataSetLocalService;
}